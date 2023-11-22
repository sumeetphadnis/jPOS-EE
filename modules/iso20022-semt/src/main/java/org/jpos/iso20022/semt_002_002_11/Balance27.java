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

package org.jpos.iso20022.semt_002_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Balance27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Balance27">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ShrtLngInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}ShortLong1Code" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}SubBalanceQuantity9Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Balance27", propOrder = {
    "shrtLngInd",
    "qty"
})
public class Balance27 {

    @XmlElement(name = "ShrtLngInd")
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngInd;
    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity9Choice qty;

    /**
     * Gets the value of the shrtLngInd property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getShrtLngInd() {
        return shrtLngInd;
    }

    /**
     * Sets the value of the shrtLngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public void setShrtLngInd(ShortLong1Code value) {
        this.shrtLngInd = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity9Choice }
     *     
     */
    public SubBalanceQuantity9Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity9Choice }
     *     
     */
    public void setQty(SubBalanceQuantity9Choice value) {
        this.qty = value;
    }

}
