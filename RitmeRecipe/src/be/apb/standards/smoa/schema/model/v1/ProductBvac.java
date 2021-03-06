//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.02 at 01:27:32 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for productBvac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productBvac">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identification" type="{http://www.apb.be/standards/smoa/schema/model/v1}IdentificationBvacProduct"/>
 *         &lt;element name="description" type="{http://www.apb.be/standards/smoa/schema/model/v1}DescriptionBvacProduct"/>
 *         &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.apb.be/standards/smoa/schema/v1}QuantityBvacType"/>
 *         &lt;element name="amounts" type="{http://www.apb.be/standards/smoa/schema/model/v1}AmountsBvacProduct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productBvac", propOrder = {
    "identification",
    "description",
    "prescriptionDate",
    "quantity",
    "amounts"
})
public class ProductBvac
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected IdentificationBvacProduct identification;
    @XmlElement(required = true)
    protected DescriptionBvacProduct description;
    @XmlElement(defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prescriptionDate;
    @XmlElement(required = true)
    protected String quantity;
    @XmlElement(required = true)
    protected AmountsBvacProduct amounts;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationBvacProduct }
     *     
     */
    public IdentificationBvacProduct getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationBvacProduct }
     *     
     */
    public void setIdentification(IdentificationBvacProduct value) {
        this.identification = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionBvacProduct }
     *     
     */
    public DescriptionBvacProduct getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionBvacProduct }
     *     
     */
    public void setDescription(DescriptionBvacProduct value) {
        this.description = value;
    }

    /**
     * Gets the value of the prescriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * Sets the value of the prescriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrescriptionDate(XMLGregorianCalendar value) {
        this.prescriptionDate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsBvacProduct }
     *     
     */
    public AmountsBvacProduct getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsBvacProduct }
     *     
     */
    public void setAmounts(AmountsBvacProduct value) {
        this.amounts = value;
    }

}
