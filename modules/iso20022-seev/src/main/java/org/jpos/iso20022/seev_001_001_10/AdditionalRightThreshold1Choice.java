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

package org.jpos.iso20022.seev_001_001_10;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalRightThreshold1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalRightThreshold1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AddtlRghtThrshld" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max35Text"/>
 *         <element name="AddtlRghtThrshldPctg" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PercentageRate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalRightThreshold1Choice", propOrder = {
    "addtlRghtThrshld",
    "addtlRghtThrshldPctg"
})
public class AdditionalRightThreshold1Choice {

    @XmlElement(name = "AddtlRghtThrshld")
    protected String addtlRghtThrshld;
    @XmlElement(name = "AddtlRghtThrshldPctg")
    protected BigDecimal addtlRghtThrshldPctg;

    /**
     * Gets the value of the addtlRghtThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRghtThrshld() {
        return addtlRghtThrshld;
    }

    /**
     * Sets the value of the addtlRghtThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRghtThrshld(String value) {
        this.addtlRghtThrshld = value;
    }

    /**
     * Gets the value of the addtlRghtThrshldPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddtlRghtThrshldPctg() {
        return addtlRghtThrshldPctg;
    }

    /**
     * Sets the value of the addtlRghtThrshldPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddtlRghtThrshldPctg(BigDecimal value) {
        this.addtlRghtThrshldPctg = value;
    }

}
