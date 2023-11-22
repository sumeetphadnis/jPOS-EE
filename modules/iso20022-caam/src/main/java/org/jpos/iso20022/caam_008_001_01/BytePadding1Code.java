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

package org.jpos.iso20022.caam_008_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BytePadding1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BytePadding1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LNGT"/>
 *     <enumeration value="NUL8"/>
 *     <enumeration value="NULG"/>
 *     <enumeration value="NULL"/>
 *     <enumeration value="RAND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BytePadding1Code")
@XmlEnum
public enum BytePadding1Code {


    /**
     * Message to encrypt is completed by a byte value containing the total number of added bytes.
     * 
     */
    LNGT("LNGT"),

    /**
     * Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.
     * 
     */
    @XmlEnumValue("NUL8")
    NUL_8("NUL8"),

    /**
     * Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.
     * 
     */
    NULG("NULG"),

    /**
     * Message to encrypt is completed by null bytes.
     * 
     */
    NULL("NULL"),

    /**
     * Message to encrypt is completed by random value, the last byte containing the total number of added bytes.
     * 
     */
    RAND("RAND");
    private final String value;

    BytePadding1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BytePadding1Code fromValue(String v) {
        for (BytePadding1Code c: BytePadding1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
