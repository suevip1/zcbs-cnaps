//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.06 at 04:33:33 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.RealTimePaymentByAgency;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChckFlgCode1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChckFlgCode1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CE01"/>
 *     &lt;enumeration value="CE02"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChckFlgCode1")
@XmlEnum
public enum ChckFlgCode1 {

    @XmlEnumValue("CE01")
    CE_01("CE01"),
    @XmlEnumValue("CE02")
    CE_02("CE02");
    private final String value;

    ChckFlgCode1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChckFlgCode1 fromValue(String v) {
        for (ChckFlgCode1 c: ChckFlgCode1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
