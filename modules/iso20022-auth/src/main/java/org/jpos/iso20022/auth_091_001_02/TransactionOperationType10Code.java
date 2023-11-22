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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionOperationType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="CORR"/>
 *     <enumeration value="EROR"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="NEWT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="POSC"/>
 *     <enumeration value="REVI"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="MARU"/>
 *     <enumeration value="PRTO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionOperationType10Code")
@XmlEnum
public enum TransactionOperationType10Code {

    COMP,
    CORR,
    EROR,
    MODI,
    NEWT,
    OTHR,
    POSC,
    REVI,
    TERM,
    VALU,
    MARU,
    PRTO;

    public String value() {
        return name();
    }

    public static TransactionOperationType10Code fromValue(String v) {
        return valueOf(v);
    }

}
