//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.v1.CDCONTACTPERSON;


/**
 * <p>Java class for MaxSetContactPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxSetContactPersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractPersonType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.apb.be/standards/smoa/schema/model/v1}personName"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="relationshipType" type="{http://www.apb.be/standards/smoa/schema/v1}CD-CONTACT-PERSON"/>
 *           &lt;element name="relationshipDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="telecom" type="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractTelecomType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxSetContactPersonType", propOrder = {
    "name",
    "familyName",
    "relationshipType",
    "relationshipDescription",
    "telecom"
})
public class MaxSetContactPersonType
    extends AbstractPersonType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<String> name;
    @XmlElement(required = true)
    protected String familyName;
    protected CDCONTACTPERSON relationshipType;
    protected String relationshipDescription;
    protected List<AbstractTelecomType> telecom;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link CDCONTACTPERSON }
     *     
     */
    public CDCONTACTPERSON getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDCONTACTPERSON }
     *     
     */
    public void setRelationshipType(CDCONTACTPERSON value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the relationshipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    /**
     * Sets the value of the relationshipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipDescription(String value) {
        this.relationshipDescription = value;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractTelecomType }
     * 
     * 
     */
    public List<AbstractTelecomType> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<AbstractTelecomType>();
        }
        return this.telecom;
    }

}
