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

package org.jpos.iso20022.sese_026_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityAndAccount96 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityAndAccount96">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttldQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}Quantity51Choice"/>
 *         <element name="PrevslySttldQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="RmngToBeSttldQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="PrevslySttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}AmountAndDirection52" minOccurs="0"/>
 *         <element name="RmngToBeSttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}AmountAndDirection52" minOccurs="0"/>
 *         <element name="DnmtnChc" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}Max210Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}PartyIdentification144" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="QtyBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}QuantityBreakdown63" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SafeKeepingPlace3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndAccount96", propOrder = {
    "sttldQty",
    "prevslySttldQty",
    "rmngToBeSttldQty",
    "prevslySttldAmt",
    "rmngToBeSttldAmt",
    "dnmtnChc",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "cshAcct",
    "qtyBrkdwn",
    "sfkpgPlc"
})
public class QuantityAndAccount96 {

    @XmlElement(name = "SttldQty", required = true)
    protected Quantity51Choice sttldQty;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity33Choice prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity33Choice rmngToBeSttldQty;
    @XmlElement(name = "PrevslySttldAmt")
    protected AmountAndDirection52 prevslySttldAmt;
    @XmlElement(name = "RmngToBeSttldAmt")
    protected AmountAndDirection52 rmngToBeSttldAmt;
    @XmlElement(name = "DnmtnChc")
    protected String dnmtnChc;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown63> qtyBrkdwn;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public void setSttldQty(Quantity51Choice value) {
        this.sttldQty = value;
    }

    /**
     * Gets the value of the prevslySttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Sets the value of the prevslySttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setPrevslySttldQty(FinancialInstrumentQuantity33Choice value) {
        this.prevslySttldQty = value;
    }

    /**
     * Gets the value of the rmngToBeSttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Sets the value of the rmngToBeSttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setRmngToBeSttldQty(FinancialInstrumentQuantity33Choice value) {
        this.rmngToBeSttldQty = value;
    }

    /**
     * Gets the value of the prevslySttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getPrevslySttldAmt() {
        return prevslySttldAmt;
    }

    /**
     * Sets the value of the prevslySttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public void setPrevslySttldAmt(AmountAndDirection52 value) {
        this.prevslySttldAmt = value;
    }

    /**
     * Gets the value of the rmngToBeSttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getRmngToBeSttldAmt() {
        return rmngToBeSttldAmt;
    }

    /**
     * Sets the value of the rmngToBeSttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public void setRmngToBeSttldAmt(AmountAndDirection52 value) {
        this.rmngToBeSttldAmt = value;
    }

    /**
     * Gets the value of the dnmtnChc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnChc() {
        return dnmtnChc;
    }

    /**
     * Sets the value of the dnmtnChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnmtnChc(String value) {
        this.dnmtnChc = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public void setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown63 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown63> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
    }

}
