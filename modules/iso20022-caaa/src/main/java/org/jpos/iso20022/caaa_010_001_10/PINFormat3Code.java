/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.iso20022.caaa_010_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINFormat3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PINFormat3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ISO0"/>
 *     <enumeration value="ISO1"/>
 *     <enumeration value="ISO2"/>
 *     <enumeration value="ISO3"/>
 *     <enumeration value="ISO4"/>
 *     <enumeration value="ISO5"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PINFormat3Code")
@XmlEnum
public enum PINFormat3Code {

    @XmlEnumValue("ISO0")
    ISO_0("ISO0"),
    @XmlEnumValue("ISO1")
    ISO_1("ISO1"),
    @XmlEnumValue("ISO2")
    ISO_2("ISO2"),
    @XmlEnumValue("ISO3")
    ISO_3("ISO3"),
    @XmlEnumValue("ISO4")
    ISO_4("ISO4"),
    @XmlEnumValue("ISO5")
    ISO_5("ISO5");
    private final String value;

    PINFormat3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINFormat3Code fromValue(String v) {
        for (PINFormat3Code c: PINFormat3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
