//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD-TIMEUNIT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-TIMEUNIT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="mo"/>
 *     &lt;enumeration value="wk"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="us"/>
 *     &lt;enumeration value="ns"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-TIMEUNIT")
@XmlEnum
public enum CDTIMEUNIT {

    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("mo")
    MO("mo"),
    @XmlEnumValue("wk")
    WK("wk"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("s")
    S("s"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("us")
    US("us"),
    @XmlEnumValue("ns")
    NS("ns");
    private final String value;

    CDTIMEUNIT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDTIMEUNIT fromValue(String v) {
        for (CDTIMEUNIT c: CDTIMEUNIT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
