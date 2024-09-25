package cl.iplacex.jam;

import org.json.JSONObject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("monto-maximo")
public class MontoMaximo {

    @GET
    @Path("{renta}/{meses}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response send(
            @PathParam("renta") long renta,
            @PathParam("meses") int meses) {
        try {
            long montoMaximo = (long) (renta * meses * 0.25);

            JSONObject obj = new JSONObject();
            obj.put("monto_maximo", montoMaximo);

            return Response.status(200).entity(obj.toString()).build();
            
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }

}
