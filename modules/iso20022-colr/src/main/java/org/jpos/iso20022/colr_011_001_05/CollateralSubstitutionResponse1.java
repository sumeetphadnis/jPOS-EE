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

package org.jpos.iso20022.colr_011_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionResponse1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralSubstitutionResponse1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollSbstitnReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}Max35Text"/>
 *         <element name="AccptdAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionResponse1", propOrder = {
    "collSbstitnReqId",
    "accptdAmt"
})
public class CollateralSubstitutionResponse1 {

    @XmlElement(name = "CollSbstitnReqId", required = true)
    protected String collSbstitnReqId;
    @XmlElement(name = "AccptdAmt")
    protected ActiveCurrencyAndAmount accptdAmt;

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
    }

    /**
     * Gets the value of the accptdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAccptdAmt() {
        return accptdAmt;
    }

    /**
     * Sets the value of the accptdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAccptdAmt(ActiveCurrencyAndAmount value) {
        this.accptdAmt = value;
    }

}
