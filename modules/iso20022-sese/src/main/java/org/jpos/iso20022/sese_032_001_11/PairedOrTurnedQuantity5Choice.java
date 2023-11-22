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

package org.jpos.iso20022.sese_032_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairedOrTurnedQuantity5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PairedOrTurnedQuantity5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PairdOffQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="TrndQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairedOrTurnedQuantity5Choice", propOrder = {
    "pairdOffQty",
    "trndQty"
})
public class PairedOrTurnedQuantity5Choice {

    @XmlElement(name = "PairdOffQty")
    protected FinancialInstrumentQuantity33Choice pairdOffQty;
    @XmlElement(name = "TrndQty")
    protected FinancialInstrumentQuantity33Choice trndQty;

    /**
     * Gets the value of the pairdOffQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getPairdOffQty() {
        return pairdOffQty;
    }

    /**
     * Sets the value of the pairdOffQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setPairdOffQty(FinancialInstrumentQuantity33Choice value) {
        this.pairdOffQty = value;
    }

    /**
     * Gets the value of the trndQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getTrndQty() {
        return trndQty;
    }

    /**
     * Sets the value of the trndQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setTrndQty(FinancialInstrumentQuantity33Choice value) {
        this.trndQty = value;
    }

}
