//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.id.v1.AbstractPrescriptionIdType;


/**
 * <p>Java class for deferredPrescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deferredPrescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractDeferredPrescriptionType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.apb.be/standards/smoa/schema/id/v1}Abstract-PrescriptionIdType"/>
 *         &lt;element name="recipeLines" type="{http://www.apb.be/standards/smoa/schema/model/v1}recipeLinesComplexType" minOccurs="0"/>
 *         &lt;element name="originalPrescription">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-Prescription"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deferredPrescriptionType", propOrder = {
    "id",
    "recipeLines",
    "originalPrescription"
})
public class DeferredPrescriptionType
    extends AbstractDeferredPrescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AbstractPrescriptionIdType id;
    protected RecipeLinesComplexType recipeLines;
    @XmlElement(required = true)
    protected DeferredPrescriptionType.OriginalPrescription originalPrescription;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPrescriptionIdType }
     *     
     */
    public AbstractPrescriptionIdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPrescriptionIdType }
     *     
     */
    public void setId(AbstractPrescriptionIdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the recipeLines property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeLinesComplexType }
     *     
     */
    public RecipeLinesComplexType getRecipeLines() {
        return recipeLines;
    }

    /**
     * Sets the value of the recipeLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeLinesComplexType }
     *     
     */
    public void setRecipeLines(RecipeLinesComplexType value) {
        this.recipeLines = value;
    }

    /**
     * Gets the value of the originalPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link DeferredPrescriptionType.OriginalPrescription }
     *     
     */
    public DeferredPrescriptionType.OriginalPrescription getOriginalPrescription() {
        return originalPrescription;
    }

    /**
     * Sets the value of the originalPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeferredPrescriptionType.OriginalPrescription }
     *     
     */
    public void setOriginalPrescription(DeferredPrescriptionType.OriginalPrescription value) {
        this.originalPrescription = value;
    }


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
     *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-Prescription"/>
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
        "abstractPrescription"
    })
    public static class OriginalPrescription
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElementRef(name = "abstract-Prescription", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractPrescriptionType> abstractPrescription;

        /**
         * Gets the value of the abstractPrescription property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ReferencePrescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link KmehrPrescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractPrescriptionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractPrescriptionType> getAbstractPrescription() {
            return abstractPrescription;
        }

        /**
         * Sets the value of the abstractPrescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ReferencePrescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link KmehrPrescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractPrescriptionType }{@code >}
         *     
         */
        public void setAbstractPrescription(JAXBElement<? extends AbstractPrescriptionType> value) {
            this.abstractPrescription = ((JAXBElement<? extends AbstractPrescriptionType> ) value);
        }

    }

}
