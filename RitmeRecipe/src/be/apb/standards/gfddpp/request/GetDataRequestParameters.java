//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.20 at 04:01:32 PM CET 
//


package be.apb.standards.gfddpp.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="patient" type="{http://services.gfddpp.be}patientType" minOccurs="0"/>
 *         &lt;element name="requestor" type="{http://services.gfddpp.be}requestorType"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="dataSpecificParametersGetData" type="{http://services.gfddpp.be}dataSpecificParametersGetData"/>
 *           &lt;element name="dataSpecificParametersGetDataTypes" type="{http://services.gfddpp.be}dataSpecificParametersGetDataTypes"/>
 *           &lt;element name="dataSpecificParametersPharmacyDetails" type="{http://services.gfddpp.be}dataSpecificParametersPharmacyDetails"/>
 *           &lt;element name="dataSpecificParametersGetStatus" type="{http://services.gfddpp.be}dataSpecificParametersGetStatus"/>
 *         &lt;/choice>
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
    "patient",
    "requestor",
    "dataType",
    "version",
    "dataSpecificParametersGetData",
    "dataSpecificParametersGetDataTypes",
    "dataSpecificParametersPharmacyDetails",
    "dataSpecificParametersGetStatus"
})
@XmlRootElement(name = "getDataRequestParameters")
public class GetDataRequestParameters {

    protected PatientType patient;
    @XmlElement(required = true)
    protected RequestorType requestor;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataType;
    protected String version;
    protected DataSpecificParametersGetData dataSpecificParametersGetData;
    protected DataSpecificParametersGetDataTypes dataSpecificParametersGetDataTypes;
    protected DataSpecificParametersPharmacyDetails dataSpecificParametersPharmacyDetails;
    protected DataSpecificParametersGetStatus dataSpecificParametersGetStatus;

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link PatientType }
     *     
     */
    public PatientType getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientType }
     *     
     */
    public void setPatient(PatientType value) {
        this.patient = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorType }
     *     
     */
    public RequestorType getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorType }
     *     
     */
    public void setRequestor(RequestorType value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the dataSpecificParametersGetData property.
     * 
     * @return
     *     possible object is
     *     {@link DataSpecificParametersGetData }
     *     
     */
    public DataSpecificParametersGetData getDataSpecificParametersGetData() {
        return dataSpecificParametersGetData;
    }

    /**
     * Sets the value of the dataSpecificParametersGetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSpecificParametersGetData }
     *     
     */
    public void setDataSpecificParametersGetData(DataSpecificParametersGetData value) {
        this.dataSpecificParametersGetData = value;
    }

    /**
     * Gets the value of the dataSpecificParametersGetDataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link DataSpecificParametersGetDataTypes }
     *     
     */
    public DataSpecificParametersGetDataTypes getDataSpecificParametersGetDataTypes() {
        return dataSpecificParametersGetDataTypes;
    }

    /**
     * Sets the value of the dataSpecificParametersGetDataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSpecificParametersGetDataTypes }
     *     
     */
    public void setDataSpecificParametersGetDataTypes(DataSpecificParametersGetDataTypes value) {
        this.dataSpecificParametersGetDataTypes = value;
    }

    /**
     * Gets the value of the dataSpecificParametersPharmacyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DataSpecificParametersPharmacyDetails }
     *     
     */
    public DataSpecificParametersPharmacyDetails getDataSpecificParametersPharmacyDetails() {
        return dataSpecificParametersPharmacyDetails;
    }

    /**
     * Sets the value of the dataSpecificParametersPharmacyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSpecificParametersPharmacyDetails }
     *     
     */
    public void setDataSpecificParametersPharmacyDetails(DataSpecificParametersPharmacyDetails value) {
        this.dataSpecificParametersPharmacyDetails = value;
    }

    /**
     * Gets the value of the dataSpecificParametersGetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DataSpecificParametersGetStatus }
     *     
     */
    public DataSpecificParametersGetStatus getDataSpecificParametersGetStatus() {
        return dataSpecificParametersGetStatus;
    }

    /**
     * Sets the value of the dataSpecificParametersGetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSpecificParametersGetStatus }
     *     
     */
    public void setDataSpecificParametersGetStatus(DataSpecificParametersGetStatus value) {
        this.dataSpecificParametersGetStatus = value;
    }

}
