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

package org.jpos.iso20022.camt_073_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentNumber5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentNumber5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ShrtNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.073.001.01}Exact3NumericText"/>
 *         <element name="LngNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.073.001.01}ISO20022MessageIdentificationText"/>
 *         <element name="PrtryNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.073.001.01}GenericIdentification36"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentNumber5Choice", propOrder = {
    "shrtNb",
    "lngNb",
    "prtryNb"
})
public class DocumentNumber5Choice {

    @XmlElement(name = "ShrtNb")
    protected String shrtNb;
    @XmlElement(name = "LngNb")
    protected String lngNb;
    @XmlElement(name = "PrtryNb")
    protected GenericIdentification36 prtryNb;

    /**
     * Gets the value of the shrtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNb() {
        return shrtNb;
    }

    /**
     * Sets the value of the shrtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNb(String value) {
        this.shrtNb = value;
    }

    /**
     * Gets the value of the lngNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngNb() {
        return lngNb;
    }

    /**
     * Sets the value of the lngNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngNb(String value) {
        this.lngNb = value;
    }

    /**
     * Gets the value of the prtryNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPrtryNb() {
        return prtryNb;
    }

    /**
     * Sets the value of the prtryNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setPrtryNb(GenericIdentification36 value) {
        this.prtryNb = value;
    }

}
