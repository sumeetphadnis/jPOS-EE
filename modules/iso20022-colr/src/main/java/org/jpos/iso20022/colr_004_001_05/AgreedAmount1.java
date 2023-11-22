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

package org.jpos.iso20022.colr_004_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreedAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgreedAmount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VartnMrgnAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Amount1"/>
 *         <element name="SgrtdIndpdntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Amount1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreedAmount1", propOrder = {
    "vartnMrgnAmt",
    "sgrtdIndpdntAmt"
})
public class AgreedAmount1 {

    @XmlElement(name = "VartnMrgnAmt", required = true)
    protected Amount1 vartnMrgnAmt;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected Amount1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the vartnMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount1 }
     *     
     */
    public Amount1 getVartnMrgnAmt() {
        return vartnMrgnAmt;
    }

    /**
     * Sets the value of the vartnMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount1 }
     *     
     */
    public void setVartnMrgnAmt(Amount1 value) {
        this.vartnMrgnAmt = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount1 }
     *     
     */
    public Amount1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount1 }
     *     
     */
    public void setSgrtdIndpdntAmt(Amount1 value) {
        this.sgrtdIndpdntAmt = value;
    }

}
