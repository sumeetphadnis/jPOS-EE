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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeToMaturity2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TimeToMaturity2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TimeToMaturityPeriod2"/>
 *         <element name="Spcl" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}SpecialPurpose2Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeToMaturity2Choice", propOrder = {
    "prd",
    "spcl"
})
public class TimeToMaturity2Choice {

    @XmlElement(name = "Prd")
    protected TimeToMaturityPeriod2 prd;
    @XmlElement(name = "Spcl")
    @XmlSchemaType(name = "string")
    protected SpecialPurpose2Code spcl;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToMaturityPeriod2 }
     *     
     */
    public TimeToMaturityPeriod2 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToMaturityPeriod2 }
     *     
     */
    public void setPrd(TimeToMaturityPeriod2 value) {
        this.prd = value;
    }

    /**
     * Gets the value of the spcl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialPurpose2Code }
     *     
     */
    public SpecialPurpose2Code getSpcl() {
        return spcl;
    }

    /**
     * Sets the value of the spcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialPurpose2Code }
     *     
     */
    public void setSpcl(SpecialPurpose2Code value) {
        this.spcl = value;
    }

}
