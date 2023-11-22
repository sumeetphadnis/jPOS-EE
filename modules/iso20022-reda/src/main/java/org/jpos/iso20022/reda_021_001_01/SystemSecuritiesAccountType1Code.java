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

package org.jpos.iso20022.reda_021_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSecuritiesAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemSecuritiesAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSDP"/>
 *     <enumeration value="CSDM"/>
 *     <enumeration value="ICSA"/>
 *     <enumeration value="TOFF"/>
 *     <enumeration value="CSDO"/>
 *     <enumeration value="ISSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SystemSecuritiesAccountType1Code")
@XmlEnum
public enum SystemSecuritiesAccountType1Code {

    CSDP,
    CSDM,
    ICSA,
    TOFF,
    CSDO,
    ISSA;

    public String value() {
        return name();
    }

    public static SystemSecuritiesAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
