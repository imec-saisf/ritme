//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.13 at 03:52:20 PM CEST 
//


package uz.ehealth.ritme.be.fgov.ehealth.aa.complextype.v1;

import uz.ehealth.ritme.oasis.names.tc.saml._2_0.assertion.AttributeStatementType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Info on administrator of entity known in CLC.
 * 
 * <p>Java class for GIAMIAdminType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GIAMIAdminType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AttributeStatement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("ALL") //Generated file
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GIAMIAdminType", propOrder = {
    "attributeStatement"
})
public class GIAMIAdminType {

    @XmlElement(name = "AttributeStatement", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", required = true)
    protected AttributeStatementType attributeStatement;

    /**
     * Gets the value of the attributeStatement property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeStatementType }
     *     
     */
    public AttributeStatementType getAttributeStatement() {
        return attributeStatement;
    }

    /**
     * Sets the value of the attributeStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeStatementType }
     *     
     */
    public void setAttributeStatement(AttributeStatementType value) {
        this.attributeStatement = value;
    }

}
