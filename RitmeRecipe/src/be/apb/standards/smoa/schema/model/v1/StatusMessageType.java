//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.13 at 02:31:44 PM CET 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractStatusMessageType">
 *       &lt;sequence>
 *         &lt;element name="originator" type="{http://www.apb.be/standards/smoa/schema/model/v1}OriginatorType"/>
 *         &lt;element name="target" type="{http://www.apb.be/standards/smoa/schema/model/v1}TargetType"/>
 *         &lt;element name="subjectReference" type="{http://www.apb.be/standards/smoa/schema/model/v1}SubjectReferenceType" minOccurs="0"/>
 *         &lt;element name="messageInformation" type="{http://www.apb.be/standards/smoa/schema/model/v1}MessageInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusMessageType", propOrder = {
    "originator",
    "target",
    "subjectReference",
    "messageInformation"
})
public class StatusMessageType
    extends AbstractStatusMessageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected OriginatorType originator;
    @XmlElement(required = true)
    protected TargetType target;
    protected SubjectReferenceType subjectReference;
    protected MessageInformation messageInformation;

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorType }
     *     
     */
    public OriginatorType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorType }
     *     
     */
    public void setOriginator(OriginatorType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link TargetType }
     *     
     */
    public TargetType getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetType }
     *     
     */
    public void setTarget(TargetType value) {
        this.target = value;
    }

    /**
     * Gets the value of the subjectReference property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectReferenceType }
     *     
     */
    public SubjectReferenceType getSubjectReference() {
        return subjectReference;
    }

    /**
     * Sets the value of the subjectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectReferenceType }
     *     
     */
    public void setSubjectReference(SubjectReferenceType value) {
        this.subjectReference = value;
    }

    /**
     * Gets the value of the messageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MessageInformation }
     *     
     */
    public MessageInformation getMessageInformation() {
        return messageInformation;
    }

    /**
     * Sets the value of the messageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInformation }
     *     
     */
    public void setMessageInformation(MessageInformation value) {
        this.messageInformation = value;
    }

}
