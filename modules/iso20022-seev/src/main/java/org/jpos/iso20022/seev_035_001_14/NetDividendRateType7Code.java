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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetDividendRateType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NetDividendRateType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAPO"/>
 *     <enumeration value="CDFI"/>
 *     <enumeration value="FUPU"/>
 *     <enumeration value="FLFR"/>
 *     <enumeration value="INCO"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="SOIC"/>
 *     <enumeration value="TXBL"/>
 *     <enumeration value="TXDF"/>
 *     <enumeration value="TXFR"/>
 *     <enumeration value="UNFR"/>
 *     <enumeration value="PAPU"/>
 *     <enumeration value="REES"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetDividendRateType7Code")
@XmlEnum
public enum NetDividendRateType7Code {

    CAPO,
    CDFI,
    FUPU,
    FLFR,
    INCO,
    INTR,
    SOIC,
    TXBL,
    TXDF,
    TXFR,
    UNFR,
    PAPU,
    REES;

    public String value() {
        return name();
    }

    public static NetDividendRateType7Code fromValue(String v) {
        return valueOf(v);
    }

}
