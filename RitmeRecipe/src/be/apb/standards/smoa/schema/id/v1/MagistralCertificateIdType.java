//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.id.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagistralCertificateIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MagistralCertificateIdType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/id/v1}Abstract-MagistralCertificateIdType">
 *       &lt;sequence>
 *         &lt;element name="attestNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MagistralCertificateIdType", propOrder = {
    "attestNumber"
})
public class MagistralCertificateIdType
    extends AbstractMagistralCertificateIdType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String attestNumber;

    /**
     * Gets the value of the attestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestNumber() {
        return attestNumber;
    }

    /**
     * Sets the value of the attestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestNumber(String value) {
        this.attestNumber = value;
    }

}
