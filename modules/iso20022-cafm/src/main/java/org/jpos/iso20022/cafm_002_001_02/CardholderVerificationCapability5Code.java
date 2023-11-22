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

package org.jpos.iso20022.cafm_002_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderVerificationCapability5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APKI"/>
 *     <enumeration value="NOVF"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="FDSG"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="FEPN"/>
 *     <enumeration value="NBIO"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SIGN"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="VORN"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="NOPN"/>
 *     <enumeration value="NOOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability5Code")
@XmlEnum
public enum CardholderVerificationCapability5Code {

    APKI,
    NOVF,
    FBIG,
    FBIO,
    FDSG,
    FCPN,
    FEPN,
    NBIO,
    NPIN,
    OTHN,
    OTHP,
    SIGN,
    UNSP,
    VORN,
    PKIS,
    NOPN,
    NOOP;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability5Code fromValue(String v) {
        return valueOf(v);
    }

}
