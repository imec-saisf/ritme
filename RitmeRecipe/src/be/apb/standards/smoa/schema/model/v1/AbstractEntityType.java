//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.id.v1.AbstractEntityIdType;


/**
 * <p>Java class for AbstractEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.apb.be/standards/smoa/schema/id/v1}Abstract-EntityIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEntityType", propOrder = {
    "entityId"
})
@XmlSeeAlso({
    AbstractPharmacistType.class,
    AbstractPreparationType.class,
    AbstractStatusMessageType.class,
    AbstractRecipeLineType.class,
    AbstractSubstanceProductType.class,
    AbstractDataLocationType.class,
    AbstractPharmacyType.class,
    AbstractRawMaterialType.class,
    AbstractPosologyType.class,
    AbstractCareProviderType.class,
    AbstractCareServiceType.class,
    AbstractIncomingMedicationType.class,
    AbstractAttestType.class,
    AbstractSupplierType.class,
    AbstractMedicinalProductType.class,
    AbstractRegimenType.class,
    AbstractPatientType.class,
    AbstractPersonType.class,
    AbstractAddressType.class,
    AbstractMagistralCertificateType.class,
    AbstractTelecomType.class,
    AbstractMedicationConsumerType.class,
    AbstractDeliveredMedicationType.class,
    AbstractPrescriptionType.class
})
public abstract class AbstractEntityType implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AbstractEntityIdType entityId;

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractEntityIdType }
     *     
     */
    public AbstractEntityIdType getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractEntityIdType }
     *     
     */
    public void setEntityId(AbstractEntityIdType value) {
        this.entityId = value;
    }

}
