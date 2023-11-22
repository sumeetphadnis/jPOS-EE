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

package org.jpos.iso20022.auth_105_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetMetrics11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetMetrics11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VolMtrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}VolumeMetrics4" minOccurs="0"/>
 *         <element name="CshRinvstmtRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetMetrics11", propOrder = {
    "volMtrcs",
    "cshRinvstmtRate"
})
public class PositionSetMetrics11 {

    @XmlElement(name = "VolMtrcs")
    protected VolumeMetrics4 volMtrcs;
    @XmlElement(name = "CshRinvstmtRate")
    protected BigDecimal cshRinvstmtRate;

    /**
     * Gets the value of the volMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMetrics4 }
     *     
     */
    public VolumeMetrics4 getVolMtrcs() {
        return volMtrcs;
    }

    /**
     * Sets the value of the volMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMetrics4 }
     *     
     */
    public void setVolMtrcs(VolumeMetrics4 value) {
        this.volMtrcs = value;
    }

    /**
     * Gets the value of the cshRinvstmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshRinvstmtRate() {
        return cshRinvstmtRate;
    }

    /**
     * Sets the value of the cshRinvstmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshRinvstmtRate(BigDecimal value) {
        this.cshRinvstmtRate = value;
    }

}
