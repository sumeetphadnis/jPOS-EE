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

package org.jpos.iso20022.cain_001_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}CarRentalServiceType2Code" minOccurs="0"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}CreditDebit3Code" minOccurs="0"/>
 *         <element name="CstmrNtfdInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount18", propOrder = {
    "tp",
    "othrTp",
    "amt",
    "cdtDbt",
    "cstmrNtfdInd"
})
public class Amount18 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CarRentalServiceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "CstmrNtfdInd")
    protected Boolean cstmrNtfdInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalServiceType2Code }
     *     
     */
    public CarRentalServiceType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalServiceType2Code }
     *     
     */
    public void setTp(CarRentalServiceType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
    }

    /**
     * Gets the value of the cstmrNtfdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrNtfdInd() {
        return cstmrNtfdInd;
    }

    /**
     * Sets the value of the cstmrNtfdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCstmrNtfdInd(Boolean value) {
        this.cstmrNtfdInd = value;
    }

}
