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
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.code.v1.AbstractPeriodicityType;
import be.apb.standards.smoa.schema.v1.DurationType;


/**
 * <p>Java class for AdministrationInstructionsFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrationInstructionsFrequencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nominator" type="{http://www.apb.be/standards/smoa/schema/v1}DurationType" minOccurs="0"/>
 *         &lt;element name="denominator" type="{http://www.apb.be/standards/smoa/schema/v1}DurationType" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodicity" type="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-PeriodicityType" minOccurs="0"/>
 *         &lt;element name="administrationMoment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrationInstructionsFrequencyType", propOrder = {
    "nominator",
    "denominator",
    "text",
    "periodicity",
    "administrationMoment"
})
public class AdministrationInstructionsFrequencyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected DurationType nominator;
    protected DurationType denominator;
    protected String text;
    protected AbstractPeriodicityType periodicity;
    protected String administrationMoment;

    /**
     * Gets the value of the nominator property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getNominator() {
        return nominator;
    }

    /**
     * Sets the value of the nominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setNominator(DurationType value) {
        this.nominator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDenominator(DurationType value) {
        this.denominator = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPeriodicityType }
     *     
     */
    public AbstractPeriodicityType getPeriodicity() {
        return periodicity;
    }

    /**
     * Sets the value of the periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPeriodicityType }
     *     
     */
    public void setPeriodicity(AbstractPeriodicityType value) {
        this.periodicity = value;
    }

    /**
     * Gets the value of the administrationMoment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationMoment() {
        return administrationMoment;
    }

    /**
     * Sets the value of the administrationMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationMoment(String value) {
        this.administrationMoment = value;
    }

}
