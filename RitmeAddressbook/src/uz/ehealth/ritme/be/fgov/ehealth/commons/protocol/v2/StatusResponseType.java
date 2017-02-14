//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.13 at 03:52:20 PM CEST 
//


package uz.ehealth.ritme.be.fgov.ehealth.commons.protocol.v2;

import uz.ehealth.ritme.be.fgov.ehealth.addressbook.protocol.v1.GetOrganizationContactInfoResponseType;
import uz.ehealth.ritme.be.fgov.ehealth.addressbook.protocol.v1.GetProfessionalContactInfoResponseType;
import uz.ehealth.ritme.be.fgov.ehealth.commons.core.v2.StatusType;

import javax.xml.bind.annotation.*;


/**
 * eHealth SOA Response Type for Services that require a Status as output.
 * 
 * <p>Java class for StatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:commons:protocol:v2}ResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:be:fgov:ehealth:commons:core:v2}Status"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("ALL") //Generated file
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusResponseType", propOrder = {
    "status"
})
@XmlSeeAlso({
    GetOrganizationContactInfoResponseType.class,
    GetProfessionalContactInfoResponseType.class,
    PaginationStatusResponseType.class
})
public class StatusResponseType
    extends ResponseType
{

    @XmlElement(name = "Status", namespace = "urn:be:fgov:ehealth:commons:core:v2", required = true)
    protected StatusType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
