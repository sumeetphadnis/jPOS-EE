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

package org.jpos.iso20022.auth_094_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateOrBlankQuery2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateOrBlankQuery2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rg" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}DatePeriod1"/>
 *         <element name="NotRptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}NotReported1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrBlankQuery2Choice", propOrder = {
    "rg",
    "notRptd"
})
public class DateOrBlankQuery2Choice {

    @XmlElement(name = "Rg")
    protected DatePeriod1 rg;
    @XmlElement(name = "NotRptd")
    @XmlSchemaType(name = "string")
    protected NotReported1Code notRptd;

    /**
     * Gets the value of the rg property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getRg() {
        return rg;
    }

    /**
     * Sets the value of the rg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public void setRg(DatePeriod1 value) {
        this.rg = value;
    }

    /**
     * Gets the value of the notRptd property.
     * 
     * @return
     *     possible object is
     *     {@link NotReported1Code }
     *     
     */
    public NotReported1Code getNotRptd() {
        return notRptd;
    }

    /**
     * Sets the value of the notRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotReported1Code }
     *     
     */
    public void setNotRptd(NotReported1Code value) {
        this.notRptd = value;
    }

}
