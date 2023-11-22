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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountToAmountRatio2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountToAmountRatio2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt1" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="Amt2" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAnd13DecimalAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountToAmountRatio2", propOrder = {
    "amt1",
    "amt2"
})
public class AmountToAmountRatio2 {

    @XmlElement(name = "Amt1", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt1;
    @XmlElement(name = "Amt2", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt2;

    /**
     * Gets the value of the amt1 property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt1() {
        return amt1;
    }

    /**
     * Sets the value of the amt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt1(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt1 = value;
    }

    /**
     * Gets the value of the amt2 property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt2() {
        return amt2;
    }

    /**
     * Sets the value of the amt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt2(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt2 = value;
    }

}
