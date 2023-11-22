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

package org.jpos.iso20022.semt_017_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityClassificationType3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityClassificationType3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CFI" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}CFIOct2015Identifier"/>
 *         <element name="AltrnClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}GenericIdentification39"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityClassificationType3Choice", propOrder = {
    "cfi",
    "altrnClssfctn"
})
public class SecurityClassificationType3Choice {

    @XmlElement(name = "CFI")
    protected String cfi;
    @XmlElement(name = "AltrnClssfctn")
    protected GenericIdentification39 altrnClssfctn;

    /**
     * Gets the value of the cfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFI() {
        return cfi;
    }

    /**
     * Sets the value of the cfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFI(String value) {
        this.cfi = value;
    }

    /**
     * Gets the value of the altrnClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification39 }
     *     
     */
    public GenericIdentification39 getAltrnClssfctn() {
        return altrnClssfctn;
    }

    /**
     * Sets the value of the altrnClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification39 }
     *     
     */
    public void setAltrnClssfctn(GenericIdentification39 value) {
        this.altrnClssfctn = value;
    }

}
