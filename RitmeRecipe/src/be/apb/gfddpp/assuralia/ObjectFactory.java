//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.20 at 08:24:00 PM CEST 
//


package be.apb.gfddpp.assuralia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.apb.gfddpp.assuralia package. 
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

    private final static QName _SingleMessageMap_QNAME = new QName("https://gfddpp.services.be/", "SingleMessageMap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.apb.gfddpp.assuralia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SingleMessageMap }
     * 
     */
    public SingleMessageMap createSingleMessageMap() {
        return new SingleMessageMap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleMessageMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://gfddpp.services.be/", name = "SingleMessageMap")
    public JAXBElement<SingleMessageMap> createSingleMessageMap(SingleMessageMap value) {
        return new JAXBElement<SingleMessageMap>(_SingleMessageMap_QNAME, SingleMessageMap.class, null, value);
    }

}
