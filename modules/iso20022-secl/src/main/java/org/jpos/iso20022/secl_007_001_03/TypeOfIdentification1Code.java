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

package org.jpos.iso20022.secl_007_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfIdentification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ARNU"/>
 *     <enumeration value="CCPT"/>
 *     <enumeration value="CHTY"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="DRLC"/>
 *     <enumeration value="FIIN"/>
 *     <enumeration value="TXID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfIdentification1Code")
@XmlEnum
public enum TypeOfIdentification1Code {

    ARNU,
    CCPT,
    CHTY,
    CORP,
    DRLC,
    FIIN,
    TXID;

    public String value() {
        return name();
    }

    public static TypeOfIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
