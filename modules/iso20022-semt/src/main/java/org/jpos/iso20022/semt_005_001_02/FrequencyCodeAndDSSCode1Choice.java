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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyCodeAndDSSCode1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FrequencyCodeAndDSSCode1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="FrqcyAsCd" type="{urn:swift:xsd:semt.005.001.02}EventFrequency1Code"/>
 *           <element name="FrqcyAsDSS" type="{urn:swift:xsd:semt.005.001.02}GenericIdentification7"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyCodeAndDSSCode1Choice", propOrder = {
    "frqcyAsCd",
    "frqcyAsDSS"
})
public class FrequencyCodeAndDSSCode1Choice {

    @XmlElement(name = "FrqcyAsCd")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code frqcyAsCd;
    @XmlElement(name = "FrqcyAsDSS")
    protected GenericIdentification7 frqcyAsDSS;

    /**
     * Gets the value of the frqcyAsCd property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getFrqcyAsCd() {
        return frqcyAsCd;
    }

    /**
     * Sets the value of the frqcyAsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public void setFrqcyAsCd(EventFrequency1Code value) {
        this.frqcyAsCd = value;
    }

    /**
     * Gets the value of the frqcyAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification7 }
     *     
     */
    public GenericIdentification7 getFrqcyAsDSS() {
        return frqcyAsDSS;
    }

    /**
     * Sets the value of the frqcyAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification7 }
     *     
     */
    public void setFrqcyAsDSS(GenericIdentification7 value) {
        this.frqcyAsDSS = value;
    }

}
