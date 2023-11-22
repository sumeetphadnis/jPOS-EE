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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompareUnitPrice7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CompareUnitPrice7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Val1" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}SecuritiesTransactionPrice14Choice" minOccurs="0"/>
 *         <element name="Val2" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}SecuritiesTransactionPrice14Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareUnitPrice7", propOrder = {
    "val1",
    "val2"
})
public class CompareUnitPrice7 {

    @XmlElement(name = "Val1")
    protected SecuritiesTransactionPrice14Choice val1;
    @XmlElement(name = "Val2")
    protected SecuritiesTransactionPrice14Choice val2;

    /**
     * Gets the value of the val1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public SecuritiesTransactionPrice14Choice getVal1() {
        return val1;
    }

    /**
     * Sets the value of the val1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public void setVal1(SecuritiesTransactionPrice14Choice value) {
        this.val1 = value;
    }

    /**
     * Gets the value of the val2 property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public SecuritiesTransactionPrice14Choice getVal2() {
        return val2;
    }

    /**
     * Sets the value of the val2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public void setVal2(SecuritiesTransactionPrice14Choice value) {
        this.val2 = value;
    }

}
