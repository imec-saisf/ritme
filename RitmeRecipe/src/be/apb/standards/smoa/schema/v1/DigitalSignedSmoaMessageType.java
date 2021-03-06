//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigitalSignedSmoaMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalSignedSmoaMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.apb.be/standards/smoa/schema/v1}SmoaMessageType"/>
 *         &lt;element name="signature" type="{http://www.apb.be/standards/smoa/schema/v1}DigitalSignatureType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalSignedSmoaMessageType", propOrder = {
    "message",
    "signature"
})
public class DigitalSignedSmoaMessageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected SmoaMessageType message;
    @XmlElement(required = true)
    protected DigitalSignatureType signature;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link SmoaMessageType }
     *     
     */
    public SmoaMessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmoaMessageType }
     *     
     */
    public void setMessage(SmoaMessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalSignatureType }
     *     
     */
    public DigitalSignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalSignatureType }
     *     
     */
    public void setSignature(DigitalSignatureType value) {
        this.signature = value;
    }

}
