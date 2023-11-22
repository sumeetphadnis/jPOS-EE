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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfIdentification4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfIdentification4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ARNU"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="DRLC"/>
 *     <enumeration value="IDCD"/>
 *     <enumeration value="NRIN"/>
 *     <enumeration value="CCPT"/>
 *     <enumeration value="SOCS"/>
 *     <enumeration value="TXID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfIdentification4Code")
@XmlEnum
public enum TypeOfIdentification4Code {

    ARNU,
    CUST,
    CORP,
    DRLC,
    IDCD,
    NRIN,
    CCPT,
    SOCS,
    TXID;

    public String value() {
        return name();
    }

    public static TypeOfIdentification4Code fromValue(String v) {
        return valueOf(v);
    }

}
