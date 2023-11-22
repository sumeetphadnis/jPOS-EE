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

package org.jpos.iso20022.sese_028_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyTextInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyTextInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DclrtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max350Text" minOccurs="0"/>
 *         <element name="PtyCtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max140Text" minOccurs="0"/>
 *         <element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTextInformation1", propOrder = {
    "dclrtnDtls",
    "ptyCtctDtls",
    "regnDtls"
})
public class PartyTextInformation1 {

    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;
    @XmlElement(name = "PtyCtctDtls")
    protected String ptyCtctDtls;
    @XmlElement(name = "RegnDtls")
    protected String regnDtls;

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
    }

    /**
     * Gets the value of the ptyCtctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyCtctDtls() {
        return ptyCtctDtls;
    }

    /**
     * Sets the value of the ptyCtctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyCtctDtls(String value) {
        this.ptyCtctDtls = value;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnDtls(String value) {
        this.regnDtls = value;
    }

}
