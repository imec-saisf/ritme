//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.20 at 08:23:43 PM CEST 
//


package be.apb.gfddpp.assuralia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssuraliaRequestParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssuraliaRequestParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BVACDocumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CBFA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignatureType" type="{https://gfddpp.services.be/}SignatureType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssuraliaRequestParameters", propOrder = {
    "bvacDocumentID",
    "cbfa",
    "requestorId",
    "signatureType"
})
public class AssuraliaRequestParameters {

    @XmlElement(name = "BVACDocumentID")
    protected String bvacDocumentID;
    @XmlElement(name = "CBFA", required = true)
    protected String cbfa;
    @XmlElement(name = "RequestorId", required = true)
    protected String requestorId;
    @XmlElement(name = "SignatureType", required = true)
    protected SignatureType signatureType;

    /**
     * Gets the value of the bvacDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVACDocumentID() {
        return bvacDocumentID;
    }

    /**
     * Sets the value of the bvacDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVACDocumentID(String value) {
        this.bvacDocumentID = value;
    }

    /**
     * Gets the value of the cbfa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBFA() {
        return cbfa;
    }

    /**
     * Sets the value of the cbfa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBFA(String value) {
        this.cbfa = value;
    }

    /**
     * Gets the value of the requestorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorId() {
        return requestorId;
    }

    /**
     * Sets the value of the requestorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorId(String value) {
        this.requestorId = value;
    }

    /**
     * Gets the value of the signatureType property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignatureType() {
        return signatureType;
    }

    /**
     * Sets the value of the signatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignatureType(SignatureType value) {
        this.signatureType = value;
    }

}