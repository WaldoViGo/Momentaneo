
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _RetirarResponse_QNAME = new QName("http://WS/", "retirarResponse");
    private final static QName _Retirar_QNAME = new QName("http://WS/", "retirar");
    private final static QName _Abonar_QNAME = new QName("http://WS/", "abonar");
    private final static QName _AbonarResponse_QNAME = new QName("http://WS/", "abonarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetirarResponse }
     * 
     */
    public RetirarResponse createRetirarResponse() {
        return new RetirarResponse();
    }

    /**
     * Create an instance of {@link Retirar }
     * 
     */
    public Retirar createRetirar() {
        return new Retirar();
    }

    /**
     * Create an instance of {@link Abonar }
     * 
     */
    public Abonar createAbonar() {
        return new Abonar();
    }

    /**
     * Create an instance of {@link AbonarResponse }
     * 
     */
    public AbonarResponse createAbonarResponse() {
        return new AbonarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "retirarResponse")
    public JAXBElement<RetirarResponse> createRetirarResponse(RetirarResponse value) {
        return new JAXBElement<RetirarResponse>(_RetirarResponse_QNAME, RetirarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "retirar")
    public JAXBElement<Retirar> createRetirar(Retirar value) {
        return new JAXBElement<Retirar>(_Retirar_QNAME, Retirar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Abonar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "abonar")
    public JAXBElement<Abonar> createAbonar(Abonar value) {
        return new JAXBElement<Abonar>(_Abonar_QNAME, Abonar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbonarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "abonarResponse")
    public JAXBElement<AbonarResponse> createAbonarResponse(AbonarResponse value) {
        return new JAXBElement<AbonarResponse>(_AbonarResponse_QNAME, AbonarResponse.class, null, value);
    }

}
