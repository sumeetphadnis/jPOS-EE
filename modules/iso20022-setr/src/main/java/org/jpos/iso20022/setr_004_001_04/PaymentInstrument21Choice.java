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

package org.jpos.iso20022.setr_004_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument21Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstrument21Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CdtTrfDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.004.001.04}CreditTransfer8"/>
 *         <element name="ChqDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.004.001.04}Cheque9"/>
 *         <element name="BkrsDrftDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.004.001.04}Cheque9"/>
 *         <element name="CshAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.004.001.04}InvestmentAccount60"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument21Choice", propOrder = {
    "cdtTrfDtls",
    "chqDtls",
    "bkrsDrftDtls",
    "cshAcctDtls"
})
public class PaymentInstrument21Choice {

    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer8 cdtTrfDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque9 chqDtls;
    @XmlElement(name = "BkrsDrftDtls")
    protected Cheque9 bkrsDrftDtls;
    @XmlElement(name = "CshAcctDtls")
    protected InvestmentAccount60 cshAcctDtls;

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer8 }
     *     
     */
    public CreditTransfer8 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer8 }
     *     
     */
    public void setCdtTrfDtls(CreditTransfer8 value) {
        this.cdtTrfDtls = value;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque9 }
     *     
     */
    public Cheque9 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque9 }
     *     
     */
    public void setChqDtls(Cheque9 value) {
        this.chqDtls = value;
    }

    /**
     * Gets the value of the bkrsDrftDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque9 }
     *     
     */
    public Cheque9 getBkrsDrftDtls() {
        return bkrsDrftDtls;
    }

    /**
     * Sets the value of the bkrsDrftDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque9 }
     *     
     */
    public void setBkrsDrftDtls(Cheque9 value) {
        this.bkrsDrftDtls = value;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount60 }
     *     
     */
    public InvestmentAccount60 getCshAcctDtls() {
        return cshAcctDtls;
    }

    /**
     * Sets the value of the cshAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount60 }
     *     
     */
    public void setCshAcctDtls(InvestmentAccount60 value) {
        this.cshAcctDtls = value;
    }

}
