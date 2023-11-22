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

package org.jpos.iso20022.seev_034_001_13;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectInstruction2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProtectInstruction2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}ProtectTransactionType2Code"/>
 *         <element name="PrtctTxSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}ProtectInstructionStatus3Code" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}Max15Text" minOccurs="0"/>
 *         <element name="PrtctSfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}Max35Text" minOccurs="0"/>
 *         <element name="PrtctDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}ISODate" minOccurs="0"/>
 *         <element name="UcvrdPrtctQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectInstruction2", propOrder = {
    "txTp",
    "prtctTxSts",
    "txId",
    "prtctSfkpgAcct",
    "prtctDt",
    "ucvrdPrtctQty"
})
public class ProtectInstruction2 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProtectTransactionType2Code txTp;
    @XmlElement(name = "PrtctTxSts")
    @XmlSchemaType(name = "string")
    protected ProtectInstructionStatus3Code prtctTxSts;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "PrtctSfkpgAcct")
    protected String prtctSfkpgAcct;
    @XmlElement(name = "PrtctDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prtctDt;
    @XmlElement(name = "UcvrdPrtctQty")
    protected FinancialInstrumentQuantity18Choice ucvrdPrtctQty;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectTransactionType2Code }
     *     
     */
    public ProtectTransactionType2Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectTransactionType2Code }
     *     
     */
    public void setTxTp(ProtectTransactionType2Code value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the prtctTxSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectInstructionStatus3Code }
     *     
     */
    public ProtectInstructionStatus3Code getPrtctTxSts() {
        return prtctTxSts;
    }

    /**
     * Sets the value of the prtctTxSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectInstructionStatus3Code }
     *     
     */
    public void setPrtctTxSts(ProtectInstructionStatus3Code value) {
        this.prtctTxSts = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the prtctSfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtctSfkpgAcct() {
        return prtctSfkpgAcct;
    }

    /**
     * Sets the value of the prtctSfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtctSfkpgAcct(String value) {
        this.prtctSfkpgAcct = value;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrtctDt(XMLGregorianCalendar value) {
        this.prtctDt = value;
    }

    /**
     * Gets the value of the ucvrdPrtctQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getUcvrdPrtctQty() {
        return ucvrdPrtctQty;
    }

    /**
     * Sets the value of the ucvrdPrtctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setUcvrdPrtctQty(FinancialInstrumentQuantity18Choice value) {
        this.ucvrdPrtctQty = value;
    }

}
