//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recipeLinesComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recipeLinesComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-RecipeLine" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipeLinesComplexType", propOrder = {
    "abstractRecipeLine"
})
public class RecipeLinesComplexType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "abstract-RecipeLine", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractRecipeLineType>> abstractRecipeLine;

    /**
     * Gets the value of the abstractRecipeLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractRecipeLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractRecipeLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractRecipeLineType }{@code >}
     * {@link JAXBElement }{@code <}{@link RecipeLineType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractRecipeLineType>> getAbstractRecipeLine() {
        if (abstractRecipeLine == null) {
            abstractRecipeLine = new ArrayList<JAXBElement<? extends AbstractRecipeLineType>>();
        }
        return this.abstractRecipeLine;
    }

}
