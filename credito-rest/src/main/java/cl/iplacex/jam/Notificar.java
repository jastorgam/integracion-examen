package cl.iplacex.jam;

import com.mailgun.api.v3.MailgunMessagesApi;
import com.mailgun.client.MailgunClient;
import com.mailgun.model.message.Message;
import com.mailgun.model.message.MessageResponse;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.json.JSONObject;

/**
 * Root resource (exposed at "notificador" path)
 */
@Path("notificar")
public class Notificar {

    private String mailgunKey = System.getenv("mailgunKey");
    private String from = System.getenv("mailgunFrom");
    private String domain = System.getenv("mailgunDomain");
    private MailgunMessagesApi mailgunMessagesApi;

    public Notificar() {
        mailgunMessagesApi = MailgunClient.config(mailgunKey).createApi(MailgunMessagesApi.class);
        System.out.println("Inicializacion de servicio");
    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("{to}/{subject}/{message}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response send(
            @PathParam("to") String to,
            @PathParam("subject") String subject,
            @PathParam("message") String messageText) {
        try {
            Message message = Message.builder()
                    .from(from)
                    .to(to)
                    .subject(subject)
                    .text(messageText)
                    .build();

            MessageResponse messageResponse = mailgunMessagesApi.sendMessage(domain, message);

            JSONObject obj = new JSONObject();
            obj.put("to", to);
            obj.put("subject", subject);
            obj.put("message", messageText);
            obj.put("response", messageResponse.getMessage());

            return Response.status(200).entity(obj.toString()).build();

        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }
}
