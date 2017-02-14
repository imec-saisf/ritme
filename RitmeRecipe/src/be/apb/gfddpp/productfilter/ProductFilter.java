//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.08 at 04:15:31 PM CEST 
//


package be.apb.gfddpp.productfilter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="precedence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productList" type="{}productList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "precedence",
    "productList"
})
@XmlRootElement(name = "product-filter")
public class ProductFilter {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar version;
    @XmlElement(required = true)
    protected String precedence;
    protected ProductList productList;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersion(XMLGregorianCalendar value) {
        this.version = value;
    }

    /**
     * Gets the value of the precedence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedence() {
        return precedence;
    }

    /**
     * Sets the value of the precedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedence(String value) {
        this.precedence = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductList }
     *     
     */
    public ProductList getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductList }
     *     
     */
    public void setProductList(ProductList value) {
        this.productList = value;
    }

}
