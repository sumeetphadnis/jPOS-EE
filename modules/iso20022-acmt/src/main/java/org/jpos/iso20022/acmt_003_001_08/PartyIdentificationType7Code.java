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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyIdentificationType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATIN"/>
 *     <enumeration value="IDCD"/>
 *     <enumeration value="NRIN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="POCD"/>
 *     <enumeration value="SOCS"/>
 *     <enumeration value="SRSA"/>
 *     <enumeration value="GUNL"/>
 *     <enumeration value="GTIN"/>
 *     <enumeration value="ITIN"/>
 *     <enumeration value="CPFA"/>
 *     <enumeration value="AREG"/>
 *     <enumeration value="DRLC"/>
 *     <enumeration value="EMID"/>
 *     <enumeration value="NINV"/>
 *     <enumeration value="INCL"/>
 *     <enumeration value="GIIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyIdentificationType7Code")
@XmlEnum
public enum PartyIdentificationType7Code {

    ATIN,
    IDCD,
    NRIN,
    OTHR,
    PASS,
    POCD,
    SOCS,
    SRSA,
    GUNL,
    GTIN,
    ITIN,
    CPFA,
    AREG,
    DRLC,
    EMID,
    NINV,
    INCL,
    GIIN;

    public String value() {
        return name();
    }

    public static PartyIdentificationType7Code fromValue(String v) {
        return valueOf(v);
    }

}
