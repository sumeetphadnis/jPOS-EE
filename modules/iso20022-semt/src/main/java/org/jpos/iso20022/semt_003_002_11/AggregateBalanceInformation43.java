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

package org.jpos.iso20022.semt_003_002_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateBalanceInformation43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AggregateBalanceInformation43">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}SecurityIdentification20"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}FinancialInstrumentAttributes122" minOccurs="0"/>
 *         <element name="InvstmtFndsFinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}FinancialInstrument22" minOccurs="0"/>
 *         <element name="AddtlDerivAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}DerivativeBasicAttributes2" minOccurs="0"/>
 *         <element name="AggtBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}Balance22"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}SafeKeepingPlace4" minOccurs="0"/>
 *         <element name="CorpActnOptnTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}CorporateActionOption5Code" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}PriceInformation22" maxOccurs="unbounded"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}ForeignExchangeTerms35" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}Number" minOccurs="0"/>
 *         <element name="AcctBaseCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}BalanceAmounts5"/>
 *         <element name="InstrmCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}BalanceAmounts5" minOccurs="0"/>
 *         <element name="AltrnRptgCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}BalanceAmounts5" minOccurs="0"/>
 *         <element name="QtyBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}QuantityBreakdown70" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BalBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}SubBalanceInformation23" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlBalBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}AdditionalBalanceInformation23" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BalAtSfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}AggregateBalancePerSafekeepingPlace40" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HldgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}RestrictedFINXMax350Text" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalanceInformation43", propOrder = {
    "finInstrmId",
    "finInstrmAttrbts",
    "invstmtFndsFinInstrmAttrbts",
    "addtlDerivAttrbts",
    "aggtBal",
    "sfkpgPlc",
    "corpActnOptnTp",
    "pricDtls",
    "fxDtls",
    "daysAcrd",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "altrnRptgCcyAmts",
    "qtyBrkdwn",
    "balBrkdwn",
    "addtlBalBrkdwn",
    "balAtSfkpgPlc",
    "hldgAddtlDtls",
    "splmtryData"
})
public class AggregateBalanceInformation43 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes122 finInstrmAttrbts;
    @XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
    protected FinancialInstrument22 invstmtFndsFinInstrmAttrbts;
    @XmlElement(name = "AddtlDerivAttrbts")
    protected DerivativeBasicAttributes2 addtlDerivAttrbts;
    @XmlElement(name = "AggtBal", required = true)
    protected Balance22 aggtBal;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace4 sfkpgPlc;
    @XmlElement(name = "CorpActnOptnTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionOption5Code corpActnOptnTp;
    @XmlElement(name = "PricDtls", required = true)
    protected List<PriceInformation22> pricDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms35> fxDtls;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "AcctBaseCcyAmts", required = true)
    protected BalanceAmounts5 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts5 instrmCcyAmts;
    @XmlElement(name = "AltrnRptgCcyAmts")
    protected BalanceAmounts5 altrnRptgCcyAmts;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown70> qtyBrkdwn;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation23> balBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwn")
    protected List<AdditionalBalanceInformation23> addtlBalBrkdwn;
    @XmlElement(name = "BalAtSfkpgPlc")
    protected List<AggregateBalancePerSafekeepingPlace40> balAtSfkpgPlc;
    @XmlElement(name = "HldgAddtlDtls")
    protected String hldgAddtlDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes122 }
     *     
     */
    public FinancialInstrumentAttributes122 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes122 }
     *     
     */
    public void setFinInstrmAttrbts(FinancialInstrumentAttributes122 value) {
        this.finInstrmAttrbts = value;
    }

    /**
     * Gets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument22 }
     *     
     */
    public FinancialInstrument22 getInvstmtFndsFinInstrmAttrbts() {
        return invstmtFndsFinInstrmAttrbts;
    }

    /**
     * Sets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument22 }
     *     
     */
    public void setInvstmtFndsFinInstrmAttrbts(FinancialInstrument22 value) {
        this.invstmtFndsFinInstrmAttrbts = value;
    }

    /**
     * Gets the value of the addtlDerivAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeBasicAttributes2 }
     *     
     */
    public DerivativeBasicAttributes2 getAddtlDerivAttrbts() {
        return addtlDerivAttrbts;
    }

    /**
     * Sets the value of the addtlDerivAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeBasicAttributes2 }
     *     
     */
    public void setAddtlDerivAttrbts(DerivativeBasicAttributes2 value) {
        this.addtlDerivAttrbts = value;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance22 }
     *     
     */
    public Balance22 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance22 }
     *     
     */
    public void setAggtBal(Balance22 value) {
        this.aggtBal = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public SafeKeepingPlace4 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace4 value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the corpActnOptnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption5Code }
     *     
     */
    public CorporateActionOption5Code getCorpActnOptnTp() {
        return corpActnOptnTp;
    }

    /**
     * Sets the value of the corpActnOptnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption5Code }
     *     
     */
    public void setCorpActnOptnTp(CorporateActionOption5Code value) {
        this.corpActnOptnTp = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceInformation22 }
     * 
     * 
     * @return
     *     The value of the pricDtls property.
     */
    public List<PriceInformation22> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms35 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms35> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the daysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAcrd() {
        return daysAcrd;
    }

    /**
     * Sets the value of the daysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public BalanceAmounts5 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public void setAcctBaseCcyAmts(BalanceAmounts5 value) {
        this.acctBaseCcyAmts = value;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public BalanceAmounts5 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public void setInstrmCcyAmts(BalanceAmounts5 value) {
        this.instrmCcyAmts = value;
    }

    /**
     * Gets the value of the altrnRptgCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public BalanceAmounts5 getAltrnRptgCcyAmts() {
        return altrnRptgCcyAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public void setAltrnRptgCcyAmts(BalanceAmounts5 value) {
        this.altrnRptgCcyAmts = value;
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
     * {@link QuantityBreakdown70 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown70> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation23 }
     * 
     * 
     * @return
     *     The value of the balBrkdwn property.
     */
    public List<SubBalanceInformation23> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<>();
        }
        return this.balBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBalBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation23 }
     * 
     * 
     * @return
     *     The value of the addtlBalBrkdwn property.
     */
    public List<AdditionalBalanceInformation23> getAddtlBalBrkdwn() {
        if (addtlBalBrkdwn == null) {
            addtlBalBrkdwn = new ArrayList<>();
        }
        return this.addtlBalBrkdwn;
    }

    /**
     * Gets the value of the balAtSfkpgPlc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balAtSfkpgPlc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalAtSfkpgPlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalancePerSafekeepingPlace40 }
     * 
     * 
     * @return
     *     The value of the balAtSfkpgPlc property.
     */
    public List<AggregateBalancePerSafekeepingPlace40> getBalAtSfkpgPlc() {
        if (balAtSfkpgPlc == null) {
            balAtSfkpgPlc = new ArrayList<>();
        }
        return this.balAtSfkpgPlc;
    }

    /**
     * Gets the value of the hldgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgAddtlDtls() {
        return hldgAddtlDtls;
    }

    /**
     * Sets the value of the hldgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldgAddtlDtls(String value) {
        this.hldgAddtlDtls = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
