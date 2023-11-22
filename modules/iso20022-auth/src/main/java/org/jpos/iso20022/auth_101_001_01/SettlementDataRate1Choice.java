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

package org.jpos.iso20022.auth_101_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDataRate1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDataRate1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NbOfInstrs" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}PercentageRate"/>
 *         <element name="ValOfInstrs" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}PercentageRate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDataRate1Choice", propOrder = {
    "nbOfInstrs",
    "valOfInstrs"
})
public class SettlementDataRate1Choice {

    @XmlElement(name = "NbOfInstrs")
    protected BigDecimal nbOfInstrs;
    @XmlElement(name = "ValOfInstrs")
    protected BigDecimal valOfInstrs;

    /**
     * Gets the value of the nbOfInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfInstrs() {
        return nbOfInstrs;
    }

    /**
     * Sets the value of the nbOfInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfInstrs(BigDecimal value) {
        this.nbOfInstrs = value;
    }

    /**
     * Gets the value of the valOfInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValOfInstrs() {
        return valOfInstrs;
    }

    /**
     * Sets the value of the valOfInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValOfInstrs(BigDecimal value) {
        this.valOfInstrs = value;
    }

}
