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
import be.apb.standards.smoa.schema.v1.CDADDRESS;


/**
 * <p>Java class for AddressKindCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressKindCodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-AddressKindCodeType">
 *       &lt;sequence>
 *         &lt;element name="usage" type="{http://www.apb.be/standards/smoa/schema/v1}CD-ADDRESS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressKindCodeType", propOrder = {
    "usage"
})
public class AddressKindCodeType
    extends AbstractAddressKindCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected CDADDRESS usage;

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link CDADDRESS }
     *     
     */
    public CDADDRESS getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDADDRESS }
     *     
     */
    public void setUsage(CDADDRESS value) {
        this.usage = value;
    }

}