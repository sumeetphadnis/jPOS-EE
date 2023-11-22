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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRate27Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestRate27Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Fxd" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FixedRate11"/>
 *         <element name="Fltg" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FloatingInterestRate22"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRate27Choice", propOrder = {
    "fxd",
    "fltg"
})
public class InterestRate27Choice {

    @XmlElement(name = "Fxd")
    protected FixedRate11 fxd;
    @XmlElement(name = "Fltg")
    protected FloatingInterestRate22 fltg;

    /**
     * Gets the value of the fxd property.
     * 
     * @return
     *     possible object is
     *     {@link FixedRate11 }
     *     
     */
    public FixedRate11 getFxd() {
        return fxd;
    }

    /**
     * Sets the value of the fxd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedRate11 }
     *     
     */
    public void setFxd(FixedRate11 value) {
        this.fxd = value;
    }

    /**
     * Gets the value of the fltg property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate22 }
     *     
     */
    public FloatingInterestRate22 getFltg() {
        return fltg;
    }

    /**
     * Sets the value of the fltg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate22 }
     *     
     */
    public void setFltg(FloatingInterestRate22 value) {
        this.fltg = value;
    }

}
