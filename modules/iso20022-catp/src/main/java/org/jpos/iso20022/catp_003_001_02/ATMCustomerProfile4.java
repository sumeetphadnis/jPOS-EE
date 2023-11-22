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

package org.jpos.iso20022.catp_003_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCustomerProfile4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCustomerProfile4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RtrvlMd" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ATMCustomerProfile1Code"/>
 *         <element name="PrflRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CstmrId" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomerProfile4", propOrder = {
    "rtrvlMd",
    "prflRef",
    "cstmrId"
})
public class ATMCustomerProfile4 {

    @XmlElement(name = "RtrvlMd", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCustomerProfile1Code rtrvlMd;
    @XmlElement(name = "PrflRef")
    protected String prflRef;
    @XmlElement(name = "CstmrId")
    protected String cstmrId;

    /**
     * Gets the value of the rtrvlMd property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile1Code }
     *     
     */
    public ATMCustomerProfile1Code getRtrvlMd() {
        return rtrvlMd;
    }

    /**
     * Sets the value of the rtrvlMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile1Code }
     *     
     */
    public void setRtrvlMd(ATMCustomerProfile1Code value) {
        this.rtrvlMd = value;
    }

    /**
     * Gets the value of the prflRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrflRef() {
        return prflRef;
    }

    /**
     * Sets the value of the prflRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrflRef(String value) {
        this.prflRef = value;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrId(String value) {
        this.cstmrId = value;
    }

}
