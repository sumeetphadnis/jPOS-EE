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

package org.jpos.iso20022.cain_003_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAmenity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LocationAmenity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AADA"/>
 *     <enumeration value="AFLA"/>
 *     <enumeration value="AVLA"/>
 *     <enumeration value="CRWA"/>
 *     <enumeration value="CVSA"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="EWAA"/>
 *     <enumeration value="MRLA"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PAPA"/>
 *     <enumeration value="TSHA"/>
 *     <enumeration value="TSRA"/>
 *     <enumeration value="TSSA"/>
 *     <enumeration value="TFHA"/>
 *     <enumeration value="VSWA"/>
 *     <enumeration value="VHPA"/>
 *     <enumeration value="VMRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LocationAmenity1Code")
@XmlEnum
public enum LocationAmenity1Code {

    AADA,
    AFLA,
    AVLA,
    CRWA,
    CVSA,
    DISA,
    EWAA,
    MRLA,
    OTHN,
    OTHP,
    PAPA,
    TSHA,
    TSRA,
    TSSA,
    TFHA,
    VSWA,
    VHPA,
    VMRA;

    public String value() {
        return name();
    }

    public static LocationAmenity1Code fromValue(String v) {
        return valueOf(v);
    }

}
