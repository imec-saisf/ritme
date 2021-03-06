//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.13 at 03:52:20 PM CEST 
//


package uz.ehealth.ritme.be.fgov.ehealth.addressbook.protocol.v1;

import uz.ehealth.ritme.be.fgov.ehealth.commons.protocol.v2.PaginationRequestType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search healthcare organizations based on one or more search criteria
 * 
 * <p>Java class for SearchOrganizationsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrganizationsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:commons:protocol:v2}PaginationRequestType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="NIHII" type="{urn:be:fgov:ehealth:addressbook:core:v1}NIHIIType"/>
 *           &lt;element name="CBE" type="{urn:be:fgov:ehealth:addressbook:core:v1}EnterpriseType"/>
 *           &lt;element name="EHP" type="{urn:be:fgov:ehealth:addressbook:core:v1}EnterpriseType"/>
 *         &lt;/choice>
 *         &lt;element name="InstitutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstitutionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SearchOrganizationsRequestType", propOrder = {
    "nihii",
    "cbe",
    "ehp",
    "institutionName",
    "institutionType",
    "city",
    "zipCode",
    "eMail"
})
public class SearchOrganizationsRequestType
    extends PaginationRequestType
{

    @XmlElement(name = "NIHII")
    protected String nihii;
    @XmlElement(name = "CBE")
    protected String cbe;
    @XmlElement(name = "EHP")
    protected String ehp;
    @XmlElement(name = "InstitutionName")
    protected String institutionName;
    @XmlElement(name = "InstitutionType")
    protected String institutionType;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "EMail")
    protected String eMail;

    /**
     * Gets the value of the nihii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIHII() {
        return nihii;
    }

    /**
     * Sets the value of the nihii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIHII(String value) {
        this.nihii = value;
    }

    /**
     * Gets the value of the cbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBE() {
        return cbe;
    }

    /**
     * Sets the value of the cbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBE(String value) {
        this.cbe = value;
    }

    /**
     * Gets the value of the ehp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHP() {
        return ehp;
    }

    /**
     * Sets the value of the ehp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHP(String value) {
        this.ehp = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the institutionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionType() {
        return institutionType;
    }

    /**
     * Sets the value of the institutionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionType(String value) {
        this.institutionType = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}
