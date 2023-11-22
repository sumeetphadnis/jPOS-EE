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

package org.jpos.iso20022.catp_009_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommandIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCommandIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Orgn" type="{urn:iso:std:iso:20022:tech:xsd:catp.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:catp.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Prcr" type="{urn:iso:std:iso:20022:tech:xsd:catp.009.001.02}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandIdentification1", propOrder = {
    "orgn",
    "ref",
    "prcr"
})
public class ATMCommandIdentification1 {

    @XmlElement(name = "Orgn")
    protected String orgn;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Prcr")
    protected String prcr;

    /**
     * Gets the value of the orgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgn() {
        return orgn;
    }

    /**
     * Sets the value of the orgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgn(String value) {
        this.orgn = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the prcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcr() {
        return prcr;
    }

    /**
     * Sets the value of the prcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcr(String value) {
        this.prcr = value;
    }

}
