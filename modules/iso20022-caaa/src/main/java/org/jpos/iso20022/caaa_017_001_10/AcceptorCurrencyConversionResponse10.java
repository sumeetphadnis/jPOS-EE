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

package org.jpos.iso20022.caaa_017_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorCurrencyConversionResponse10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorCurrencyConversionResponse10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.017.001.10}CardPaymentEnvironment79"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.017.001.10}CardPaymentTransaction129"/>
 *         <element name="CcyConvsRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.017.001.10}CurrencyConversion28"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionResponse10", propOrder = {
    "envt",
    "tx",
    "ccyConvsRslt"
})
public class AcceptorCurrencyConversionResponse10 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction129 tx;
    @XmlElement(name = "CcyConvsRslt", required = true)
    protected CurrencyConversion28 ccyConvsRslt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public CardPaymentEnvironment79 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public void setEnvt(CardPaymentEnvironment79 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction129 }
     *     
     */
    public CardPaymentTransaction129 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction129 }
     *     
     */
    public void setTx(CardPaymentTransaction129 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion28 }
     *     
     */
    public CurrencyConversion28 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion28 }
     *     
     */
    public void setCcyConvsRslt(CurrencyConversion28 value) {
        this.ccyConvsRslt = value;
    }

}
