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

package org.jpos.iso20022.caaa_017_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StoredValueAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BNKA"/>
 *     <enumeration value="CWVC"/>
 *     <enumeration value="CPYA"/>
 *     <enumeration value="ELMY"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="GCER"/>
 *     <enumeration value="MLVC"/>
 *     <enumeration value="OLVC"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="CARD"/>
 *     <enumeration value="TRVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StoredValueAccountType1Code")
@XmlEnum
public enum StoredValueAccountType1Code {

    BNKA,
    CWVC,
    CPYA,
    ELMY,
    GIFT,
    GCER,
    MLVC,
    OLVC,
    MERC,
    OTHR,
    PHON,
    CARD,
    TRVL;

    public String value() {
        return name();
    }

    public static StoredValueAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
