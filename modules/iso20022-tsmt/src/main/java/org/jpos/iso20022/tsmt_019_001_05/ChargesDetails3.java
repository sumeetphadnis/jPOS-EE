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

package org.jpos.iso20022.tsmt_019_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesDetails3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ChargesDetails3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}ChargesType1Choice"/>
 *         <element name="AmtOrPctg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}AmountOrPercentage2Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesDetails3", propOrder = {
    "tp",
    "amtOrPctg"
})
public class ChargesDetails3 {

    @XmlElement(name = "Tp", required = true)
    protected ChargesType1Choice tp;
    @XmlElement(name = "AmtOrPctg", required = true)
    protected AmountOrPercentage2Choice amtOrPctg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType1Choice }
     *     
     */
    public ChargesType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType1Choice }
     *     
     */
    public void setTp(ChargesType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the amtOrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public AmountOrPercentage2Choice getAmtOrPctg() {
        return amtOrPctg;
    }

    /**
     * Sets the value of the amtOrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public void setAmtOrPctg(AmountOrPercentage2Choice value) {
        this.amtOrPctg = value;
    }

}
