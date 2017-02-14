//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.id.v1.AbstractPrescriptionIdType;
import be.fgov.ehealth.standards.kmehr.schema.v1.Kmehrmessage;


/**
 * <p>Java class for KmehrPrescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KmehrPrescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractPrescriptionType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.apb.be/standards/smoa/schema/id/v1}Abstract-PrescriptionIdType"/>
 *         &lt;element name="kmehrPrescription" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}kmehrmessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmehrPrescriptionType", propOrder = {
    "id",
    "kmehrPrescription"
})
public class KmehrPrescriptionType
    extends AbstractPrescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AbstractPrescriptionIdType id;
    protected Kmehrmessage kmehrPrescription;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPrescriptionIdType }
     *     
     */
    public AbstractPrescriptionIdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPrescriptionIdType }
     *     
     */
    public void setId(AbstractPrescriptionIdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the kmehrPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link KmehrmessageType }
     *     
     */
    public Kmehrmessage getKmehrPrescription() {
        return kmehrPrescription;
    }

    /**
     * Sets the value of the kmehrPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link KmehrmessageType }
     *     
     */
    public void setKmehrPrescription(Kmehrmessage value) {
        this.kmehrPrescription = value;
    }

}
