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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartyClassification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialPartyClassification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}FinancialPartySectorType3Code"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}GenericIdentification175"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialPartyClassification2Choice", propOrder = {
    "cd",
    "prtry"
})
public class FinancialPartyClassification2Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected FinancialPartySectorType3Code cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification175 prtry;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialPartySectorType3Code }
     *     
     */
    public FinancialPartySectorType3Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialPartySectorType3Code }
     *     
     */
    public void setCd(FinancialPartySectorType3Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification175 }
     *     
     */
    public GenericIdentification175 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification175 }
     *     
     */
    public void setPrtry(GenericIdentification175 value) {
        this.prtry = value;
    }

}
