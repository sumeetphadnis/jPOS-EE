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

package org.jpos.iso20022.semt_014_002_07;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailingReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailingReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWMO"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CANR"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="OBJT"/>
 *     <enumeration value="AWSH"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="STCD"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="MLAT"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CHAS"/>
 *     <enumeration value="NEWI"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="DEPO"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="INCA"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="REFS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="CPEC"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="IAAD"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PHCK"/>
 *     <enumeration value="BENO"/>
 *     <enumeration value="BOTH"/>
 *     <enumeration value="CLHT"/>
 *     <enumeration value="DENO"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="DKNY"/>
 *     <enumeration value="FROZ"/>
 *     <enumeration value="LAAW"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="PRCY"/>
 *     <enumeration value="REGT"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="PRSY"/>
 *     <enumeration value="INBC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailingReason3Code")
@XmlEnum
public enum FailingReason3Code {

    AWMO,
    BYIY,
    CLAT,
    ADEA,
    CANR,
    CAIS,
    OBJT,
    AWSH,
    PHSE,
    STCD,
    DOCY,
    MLAT,
    DOCC,
    BLOC,
    CHAS,
    NEWI,
    CLAC,
    MUNO,
    GLOB,
    PREA,
    PART,
    NOFX,
    CMON,
    YCOL,
    COLL,
    DEPO,
    FLIM,
    INCA,
    LINK,
    LACK,
    LALO,
    MONY,
    NCON,
    REFS,
    SDUT,
    BATC,
    CYCL,
    SBLO,
    CPEC,
    MINO,
    IAAD,
    OTHR,
    PHCK,
    BENO,
    BOTH,
    CLHT,
    DENO,
    DISA,
    DKNY,
    FROZ,
    LAAW,
    LATE,
    LIQU,
    PRCY,
    REGT,
    SETS,
    CERT,
    PRSY,
    INBC;

    public String value() {
        return name();
    }

    public static FailingReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
