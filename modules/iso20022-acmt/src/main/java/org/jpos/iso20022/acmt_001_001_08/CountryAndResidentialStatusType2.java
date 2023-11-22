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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryAndResidentialStatusType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CountryAndResidentialStatusType2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CountryCode"/>
 *         <element name="ResdtlSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ResidentialStatus1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryAndResidentialStatusType2", propOrder = {
    "ctry",
    "resdtlSts"
})
public class CountryAndResidentialStatusType2 {

    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "ResdtlSts", required = true)
    @XmlSchemaType(name = "string")
    protected ResidentialStatus1Code resdtlSts;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the resdtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialStatus1Code }
     *     
     */
    public ResidentialStatus1Code getResdtlSts() {
        return resdtlSts;
    }

    /**
     * Sets the value of the resdtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialStatus1Code }
     *     
     */
    public void setResdtlSts(ResidentialStatus1Code value) {
        this.resdtlSts = value;
    }

}
