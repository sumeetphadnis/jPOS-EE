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

package org.jpos.iso20022.auth_060_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentAccount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentAccount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}ActiveCurrencyCode"/>
 *         <element name="NetPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}AmountAndDirection86"/>
 *         <element name="LatePmtConf" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}Max10NumericText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAccount1", propOrder = {
    "ccy",
    "netPmt",
    "latePmtConf"
})
public class PaymentAccount1 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "NetPmt", required = true)
    protected AmountAndDirection86 netPmt;
    @XmlElement(name = "LatePmtConf", required = true)
    protected String latePmtConf;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the netPmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection86 }
     *     
     */
    public AmountAndDirection86 getNetPmt() {
        return netPmt;
    }

    /**
     * Sets the value of the netPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection86 }
     *     
     */
    public void setNetPmt(AmountAndDirection86 value) {
        this.netPmt = value;
    }

    /**
     * Gets the value of the latePmtConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatePmtConf() {
        return latePmtConf;
    }

    /**
     * Sets the value of the latePmtConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatePmtConf(String value) {
        this.latePmtConf = value;
    }

}
