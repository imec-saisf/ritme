//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.code.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.v1.CDCOUNTRY;


/**
 * <p>Java class for CountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-CountryCodeType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.apb.be/standards/smoa/schema/v1}CD-COUNTRY"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "code"
})
public class CountryType
    extends AbstractCountryCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected CDCOUNTRY code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CDCOUNTRY }
     *     
     */
    public CDCOUNTRY getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDCOUNTRY }
     *     
     */
    public void setCode(CDCOUNTRY value) {
        this.code = value;
    }

}
