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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicationConsumerAnimalOwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationConsumerAnimalOwnerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractMedicationConsumerAnimalOwnerType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-Person"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationConsumerAnimalOwnerType", propOrder = {
    "abstractPerson"
})
public class MedicationConsumerAnimalOwnerType
    extends AbstractMedicationConsumerAnimalOwnerType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "abstract-Person", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractPersonType> abstractPerson;

    /**
     * Gets the value of the abstractPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaxSetPersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReferencePersonType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractPersonType> getAbstractPerson() {
        return abstractPerson;
    }

    /**
     * Sets the value of the abstractPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaxSetPersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReferencePersonType }{@code >}
     *     
     */
    public void setAbstractPerson(JAXBElement<? extends AbstractPersonType> value) {
        this.abstractPerson = ((JAXBElement<? extends AbstractPersonType> ) value);
    }

}
