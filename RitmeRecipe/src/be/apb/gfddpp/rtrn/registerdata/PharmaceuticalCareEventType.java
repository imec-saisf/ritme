//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.28 at 09:11:54 PM CEST 
//


package be.apb.gfddpp.rtrn.registerdata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pharmaceuticalCareEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pharmaceuticalCareEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sguid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dispensation" type="{http://services.gfddpp.be}dispensation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pharmaceuticalCareEventType", propOrder = {
    "sguid",
    "dispensation"
})
public class PharmaceuticalCareEventType {

    @XmlElement(required = true)
    protected String sguid;
    @XmlElement(required = true)
    protected List<Dispensation> dispensation;

    /**
     * Gets the value of the sguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSguid() {
        return sguid;
    }

    /**
     * Sets the value of the sguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSguid(String value) {
        this.sguid = value;
    }

    /**
     * Gets the value of the dispensation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispensation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispensation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dispensation }
     * 
     * 
     */
    public List<Dispensation> getDispensation() {
        if (dispensation == null) {
            dispensation = new ArrayList<Dispensation>();
        }
        return this.dispensation;
    }

}
