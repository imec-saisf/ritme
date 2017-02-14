//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import be.apb.standards.smoa.schema.model.v1.AbstractIncomingMedicationType;
import be.apb.standards.smoa.schema.model.v1.AbstractPharmacyType;
import be.apb.standards.smoa.schema.model.v1.IncomingMedicationType;
import be.apb.standards.smoa.schema.model.v1.ReferencePharmacyType;


/**
 * <p>Java class for RegisterExportEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterExportEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/v1}AbstractEventType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-Pharmacy"/>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="deliveries" type="{http://www.apb.be/standards/smoa/schema/v1}deliveriesType" minOccurs="0"/>
 *         &lt;element name="incoming" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-IncomingMedication" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RegisterExportEventType", propOrder = {
    "abstractPharmacy",
    "beginDate",
    "endDate",
    "deliveries",
    "incoming"
})
public class RegisterExportEventType
    extends AbstractEventType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "abstract-Pharmacy", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractPharmacyType> abstractPharmacy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected DeliveriesType deliveries;
    protected RegisterExportEventType.Incoming incoming;

    /**
     * Gets the value of the abstractPharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferencePharmacyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPharmacyType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractPharmacyType> getAbstractPharmacy() {
        return abstractPharmacy;
    }

    /**
     * Sets the value of the abstractPharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferencePharmacyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPharmacyType }{@code >}
     *     
     */
    public void setAbstractPharmacy(JAXBElement<? extends AbstractPharmacyType> value) {
        this.abstractPharmacy = ((JAXBElement<? extends AbstractPharmacyType> ) value);
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the deliveries property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveriesType }
     *     
     */
    public DeliveriesType getDeliveries() {
        return deliveries;
    }

    /**
     * Sets the value of the deliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveriesType }
     *     
     */
    public void setDeliveries(DeliveriesType value) {
        this.deliveries = value;
    }

    /**
     * Gets the value of the incoming property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterExportEventType.Incoming }
     *     
     */
    public RegisterExportEventType.Incoming getIncoming() {
        return incoming;
    }

    /**
     * Sets the value of the incoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterExportEventType.Incoming }
     *     
     */
    public void setIncoming(RegisterExportEventType.Incoming value) {
        this.incoming = value;
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
     *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-IncomingMedication" maxOccurs="unbounded" minOccurs="0"/>
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
        "abstractIncomingMedication"
    })
    public static class Incoming
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElementRef(name = "abstract-IncomingMedication", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
        protected List<JAXBElement<? extends AbstractIncomingMedicationType>> abstractIncomingMedication;

        /**
         * Gets the value of the abstractIncomingMedication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the abstractIncomingMedication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAbstractIncomingMedication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link IncomingMedicationType }{@code >}
         * {@link JAXBElement }{@code <}{@link AbstractIncomingMedicationType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends AbstractIncomingMedicationType>> getAbstractIncomingMedication() {
            if (abstractIncomingMedication == null) {
                abstractIncomingMedication = new ArrayList<JAXBElement<? extends AbstractIncomingMedicationType>>();
            }
            return this.abstractIncomingMedication;
        }

    }

}
