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

package org.jpos.iso20022.casp_001_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversion27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyConversion27">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccptdByCrdhldr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Convs" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CurrencyConversion26" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion27", propOrder = {
    "accptdByCrdhldr",
    "convs"
})
public class CurrencyConversion27 {

    @XmlElement(name = "AccptdByCrdhldr")
    protected Boolean accptdByCrdhldr;
    @XmlElement(name = "Convs")
    protected CurrencyConversion26 convs;

    /**
     * Gets the value of the accptdByCrdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccptdByCrdhldr() {
        return accptdByCrdhldr;
    }

    /**
     * Sets the value of the accptdByCrdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccptdByCrdhldr(Boolean value) {
        this.accptdByCrdhldr = value;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion26 }
     *     
     */
    public CurrencyConversion26 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion26 }
     *     
     */
    public void setConvs(CurrencyConversion26 value) {
        this.convs = value;
    }

}
