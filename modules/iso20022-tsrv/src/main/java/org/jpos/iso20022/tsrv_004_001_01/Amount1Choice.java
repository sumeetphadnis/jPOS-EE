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

package org.jpos.iso20022.tsrv_004_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="IncrAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="DcrAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}ActiveCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount1Choice", propOrder = {
    "incrAmt",
    "dcrAmt"
})
public class Amount1Choice {

    @XmlElement(name = "IncrAmt")
    protected ActiveCurrencyAndAmount incrAmt;
    @XmlElement(name = "DcrAmt")
    protected ActiveCurrencyAndAmount dcrAmt;

    /**
     * Gets the value of the incrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncrAmt() {
        return incrAmt;
    }

    /**
     * Sets the value of the incrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIncrAmt(ActiveCurrencyAndAmount value) {
        this.incrAmt = value;
    }

    /**
     * Gets the value of the dcrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDcrAmt() {
        return dcrAmt;
    }

    /**
     * Sets the value of the dcrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDcrAmt(ActiveCurrencyAndAmount value) {
        this.dcrAmt = value;
    }

}
