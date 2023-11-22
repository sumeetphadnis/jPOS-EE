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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyQuantityUnit2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EnergyQuantityUnit2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BTUD"/>
 *     <enumeration value="CMPD"/>
 *     <enumeration value="GJDD"/>
 *     <enumeration value="GWAT"/>
 *     <enumeration value="GWHD"/>
 *     <enumeration value="GWHH"/>
 *     <enumeration value="HMJD"/>
 *     <enumeration value="KTMD"/>
 *     <enumeration value="KWAT"/>
 *     <enumeration value="KWHD"/>
 *     <enumeration value="KWHH"/>
 *     <enumeration value="MCMD"/>
 *     <enumeration value="MJDD"/>
 *     <enumeration value="MBTD"/>
 *     <enumeration value="MMJD"/>
 *     <enumeration value="MTMD"/>
 *     <enumeration value="MWAT"/>
 *     <enumeration value="MWHD"/>
 *     <enumeration value="MWHH"/>
 *     <enumeration value="THMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergyQuantityUnit2Code")
@XmlEnum
public enum EnergyQuantityUnit2Code {

    BTUD,
    CMPD,
    GJDD,
    GWAT,
    GWHD,
    GWHH,
    HMJD,
    KTMD,
    KWAT,
    KWHD,
    KWHH,
    MCMD,
    MJDD,
    MBTD,
    MMJD,
    MTMD,
    MWAT,
    MWHD,
    MWHH,
    THMD;

    public String value() {
        return name();
    }

    public static EnergyQuantityUnit2Code fromValue(String v) {
        return valueOf(v);
    }

}
