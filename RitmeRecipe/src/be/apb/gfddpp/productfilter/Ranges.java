//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.08 at 04:15:31 PM CEST 
//


package be.apb.gfddpp.productfilter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ranges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ranges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}abstractRange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ranges", propOrder = {
    "abstractRange"
})
public class Ranges {

    @XmlElementRef(name = "abstractRange", type = JAXBElement.class)
    protected List<JAXBElement<? extends RangesType>> abstractRange;

    /**
     * Gets the value of the abstractRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RangesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PreparationsRanges }{@code >}
     * {@link JAXBElement }{@code <}{@link MedicinesRanges }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends RangesType>> getAbstractRange() {
        if (abstractRange == null) {
            abstractRange = new ArrayList<JAXBElement<? extends RangesType>>();
        }
        return this.abstractRange;
    }

}
