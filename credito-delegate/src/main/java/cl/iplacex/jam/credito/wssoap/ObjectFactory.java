
package cl.iplacex.jam.credito.wssoap;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.iplacex.jam.credito.wssoap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CalcularRiesgo_QNAME = new QName("http://jam.iplacex.cl/", "calcularRiesgo");
    private static final QName _CalcularRiesgoResponse_QNAME = new QName("http://jam.iplacex.cl/", "calcularRiesgoResponse");
    private static final QName _ListarSolicitantes_QNAME = new QName("http://jam.iplacex.cl/", "listarSolicitantes");
    private static final QName _ListarSolicitantesResponse_QNAME = new QName("http://jam.iplacex.cl/", "listarSolicitantesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.iplacex.jam.credito.wssoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularRiesgo }
     * 
     * @return
     *     the new instance of {@link CalcularRiesgo }
     */
    public CalcularRiesgo createCalcularRiesgo() {
        return new CalcularRiesgo();
    }

    /**
     * Create an instance of {@link CalcularRiesgoResponse }
     * 
     * @return
     *     the new instance of {@link CalcularRiesgoResponse }
     */
    public CalcularRiesgoResponse createCalcularRiesgoResponse() {
        return new CalcularRiesgoResponse();
    }

    /**
     * Create an instance of {@link ListarSolicitantes }
     * 
     * @return
     *     the new instance of {@link ListarSolicitantes }
     */
    public ListarSolicitantes createListarSolicitantes() {
        return new ListarSolicitantes();
    }

    /**
     * Create an instance of {@link ListarSolicitantesResponse }
     * 
     * @return
     *     the new instance of {@link ListarSolicitantesResponse }
     */
    public ListarSolicitantesResponse createListarSolicitantesResponse() {
        return new ListarSolicitantesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularRiesgo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularRiesgo }{@code >}
     */
    @XmlElementDecl(namespace = "http://jam.iplacex.cl/", name = "calcularRiesgo")
    public JAXBElement<CalcularRiesgo> createCalcularRiesgo(CalcularRiesgo value) {
        return new JAXBElement<>(_CalcularRiesgo_QNAME, CalcularRiesgo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularRiesgoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularRiesgoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://jam.iplacex.cl/", name = "calcularRiesgoResponse")
    public JAXBElement<CalcularRiesgoResponse> createCalcularRiesgoResponse(CalcularRiesgoResponse value) {
        return new JAXBElement<>(_CalcularRiesgoResponse_QNAME, CalcularRiesgoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitantes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarSolicitantes }{@code >}
     */
    @XmlElementDecl(namespace = "http://jam.iplacex.cl/", name = "listarSolicitantes")
    public JAXBElement<ListarSolicitantes> createListarSolicitantes(ListarSolicitantes value) {
        return new JAXBElement<>(_ListarSolicitantes_QNAME, ListarSolicitantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitantesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarSolicitantesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://jam.iplacex.cl/", name = "listarSolicitantesResponse")
    public JAXBElement<ListarSolicitantesResponse> createListarSolicitantesResponse(ListarSolicitantesResponse value) {
        return new JAXBElement<>(_ListarSolicitantesResponse_QNAME, ListarSolicitantesResponse.class, null, value);
    }

}
