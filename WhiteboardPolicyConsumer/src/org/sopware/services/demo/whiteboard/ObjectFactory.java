
package org.sopware.services.demo.whiteboard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sopware.services.demo.whiteboard package. 
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

    private final static QName _ElementNotFoundFault_QNAME = new QName("http://services.sopware.org/demo/Whiteboard", "ElementNotFoundFault");
    private final static QName _Echo_QNAME = new QName("http://services.sopware.org/demo/Whiteboard", "echo");
    private final static QName _EchoResponse_QNAME = new QName("http://services.sopware.org/demo/Whiteboard", "echoResponse");
    private final static QName _ReadResponse_QNAME = new QName("http://services.sopware.org/demo/Whiteboard", "readResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sopware.services.demo.whiteboard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadFault }
     * 
     */
    public ReadFault createReadFault() {
        return new ReadFault();
    }

    /**
     * Create an instance of {@link WriteResponse }
     * 
     */
    public WriteResponse createWriteResponse() {
        return new WriteResponse();
    }

    /**
     * Create an instance of {@link Read }
     * 
     */
    public Read createRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link Write }
     * 
     */
    public Write createWrite() {
        return new Write();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sopware.org/demo/Whiteboard", name = "ElementNotFoundFault")
    public JAXBElement<String> createElementNotFoundFault(String value) {
        return new JAXBElement<String>(_ElementNotFoundFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sopware.org/demo/Whiteboard", name = "echo")
    public JAXBElement<AnyType> createEcho(AnyType value) {
        return new JAXBElement<AnyType>(_Echo_QNAME, AnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sopware.org/demo/Whiteboard", name = "echoResponse")
    public JAXBElement<AnyType> createEchoResponse(AnyType value) {
        return new JAXBElement<AnyType>(_EchoResponse_QNAME, AnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sopware.org/demo/Whiteboard", name = "readResponse")
    public JAXBElement<AnyType> createReadResponse(AnyType value) {
        return new JAXBElement<AnyType>(_ReadResponse_QNAME, AnyType.class, null, value);
    }

}
