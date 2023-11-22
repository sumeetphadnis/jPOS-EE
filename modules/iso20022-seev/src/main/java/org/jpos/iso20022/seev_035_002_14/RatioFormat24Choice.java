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

package org.jpos.iso20022.seev_035_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatioFormat24Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RatioFormat24Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="QtyToQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}QuantityToQuantityRatio2"/>
 *         <element name="NotSpcfdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateValueType7Code"/>
 *         <element name="AmtToAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}AmountToAmountRatio3"/>
 *         <element name="AmtToQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}AmountAndQuantityRatio5"/>
 *         <element name="QtyToAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}AmountAndQuantityRatio5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatioFormat24Choice", propOrder = {
    "qtyToQty",
    "notSpcfdRate",
    "amtToAmt",
    "amtToQty",
    "qtyToAmt"
})
public class RatioFormat24Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio2 qtyToQty;
    @XmlElement(name = "NotSpcfdRate")
    @XmlSchemaType(name = "string")
    protected RateValueType7Code notSpcfdRate;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio3 amtToAmt;
    @XmlElement(name = "AmtToQty")
    protected AmountAndQuantityRatio5 amtToQty;
    @XmlElement(name = "QtyToAmt")
    protected AmountAndQuantityRatio5 qtyToAmt;

    /**
     * Gets the value of the qtyToQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public QuantityToQuantityRatio2 getQtyToQty() {
        return qtyToQty;
    }

    /**
     * Sets the value of the qtyToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public void setQtyToQty(QuantityToQuantityRatio2 value) {
        this.qtyToQty = value;
    }

    /**
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateValueType7Code }
     *     
     */
    public RateValueType7Code getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueType7Code }
     *     
     */
    public void setNotSpcfdRate(RateValueType7Code value) {
        this.notSpcfdRate = value;
    }

    /**
     * Gets the value of the amtToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountToAmountRatio3 }
     *     
     */
    public AmountToAmountRatio3 getAmtToAmt() {
        return amtToAmt;
    }

    /**
     * Sets the value of the amtToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountToAmountRatio3 }
     *     
     */
    public void setAmtToAmt(AmountToAmountRatio3 value) {
        this.amtToAmt = value;
    }

    /**
     * Gets the value of the amtToQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio5 }
     *     
     */
    public AmountAndQuantityRatio5 getAmtToQty() {
        return amtToQty;
    }

    /**
     * Sets the value of the amtToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio5 }
     *     
     */
    public void setAmtToQty(AmountAndQuantityRatio5 value) {
        this.amtToQty = value;
    }

    /**
     * Gets the value of the qtyToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio5 }
     *     
     */
    public AmountAndQuantityRatio5 getQtyToAmt() {
        return qtyToAmt;
    }

    /**
     * Sets the value of the qtyToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio5 }
     *     
     */
    public void setQtyToAmt(AmountAndQuantityRatio5 value) {
        this.qtyToAmt = value;
    }

}
