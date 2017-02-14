//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.24 at 03:38:07 PM CEST 
//


package be.fgov.ehealth.standards.kmehr.schema.v1;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * a magistral preparation can be prescribed as a (coded)
 * reference to a preparation in a reference book (formularyreference), or as a
 * (coded) list of individual compounds (compoundlist), or as free text
 * (magistraltext)
 * <p/>
 * <p/>
 * <p>Java class for compoundprescriptionType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="compoundprescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="compound" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}compoundType" maxOccurs="unbounded"/>
 *           &lt;element name="formularyreference" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}formularyreferenceType"/>
 *           &lt;element name="magistraltext" type="{http://www.ehealth.fgov.be/standards/kmehr/dt/v1}textType"/>
 *         &lt;/choice>
 *         &lt;element name="galenicform" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}galenicformType" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}quantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="L" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compoundprescriptionType", propOrder = {
        "content"
})
public class CompoundprescriptionType {

    /*
    @XmlElementRefs({
            @XmlElementRef(name = "magistraltext", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class),
            @XmlElementRef(name = "galenicform", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class),
            @XmlElementRef(name = "quantity", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class),
            @XmlElementRef(name = "formularyreference", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class),
            @XmlElementRef(name = "compound", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class)
    })
    */
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "L")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String l;

    /**
     * a magistral preparation can be prescribed as a (coded)
     * reference to a preparation in a reference book (formularyreference), or as a
     * (coded) list of individual compounds (compoundlist), or as free text
     * (magistraltext)
     * Gets the value of the content property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link GalenicformType }{@code >}
     * {@link JAXBElement }{@code <}{@link FormularyreferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityType }{@code >}
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the l property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setL(String value) {
        this.l = value;
    }

}
