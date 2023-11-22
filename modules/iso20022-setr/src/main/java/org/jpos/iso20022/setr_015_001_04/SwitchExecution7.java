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

package org.jpos.iso20022.setr_015_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchExecution7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SwitchExecution7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmdmntInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Max35Text" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}PlaceOfTradeIdentification1Choice" minOccurs="0"/>
 *         <element name="OrdrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="RcvdDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="DealRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Max35Text"/>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Max35Text" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}InvestmentAccount58" minOccurs="0"/>
 *         <element name="RltdPtyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Intermediary39" maxOccurs="10" minOccurs="0"/>
 *         <element name="CxlRght" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}CancellationRight1Choice" minOccurs="0"/>
 *         <element name="ReqdFutrTradDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ISODate" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ISODate" minOccurs="0"/>
 *         <element name="SttlmMtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}DeliveryReceiptType2Code" minOccurs="0"/>
 *         <element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}AdditionalAmount1Choice" minOccurs="0"/>
 *         <element name="BestExctn" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}BestExecution1Code" minOccurs="0"/>
 *         <element name="RedLegDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}SwitchRedemptionLegExecution4" maxOccurs="unbounded"/>
 *         <element name="SbcptLegDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}SwitchSubscriptionLegExecution4" maxOccurs="unbounded"/>
 *         <element name="CshSttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}PaymentTransaction71" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ForeignExchangeTerms33" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinAdvc" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}FinancialAdvice1Code" minOccurs="0"/>
 *         <element name="NgtdTrad" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}NegotiatedTrade1Code" minOccurs="0"/>
 *         <element name="LateRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}LateReport1Code" minOccurs="0"/>
 *         <element name="CstmrCndctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}CustomerConductClassification1Choice" minOccurs="0"/>
 *         <element name="TxChanlTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}TransactionChannelType1Choice" minOccurs="0"/>
 *         <element name="SgntrTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}SignatureType1Choice" minOccurs="0"/>
 *         <element name="OrdrWvrDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}OrderWaiver1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchExecution7", propOrder = {
    "amdmntInd",
    "mstrRef",
    "plcOfTrad",
    "ordrDtTm",
    "rcvdDtTm",
    "dealRef",
    "ordrRef",
    "clntRef",
    "invstmtAcctDtls",
    "rltdPtyDtls",
    "cxlRght",
    "reqdFutrTradDt",
    "sttlmAmt",
    "cshSttlmDt",
    "sttlmMtd",
    "addtlAmt",
    "bestExctn",
    "redLegDtls",
    "sbcptLegDtls",
    "cshSttlmDtls",
    "fxDtls",
    "finAdvc",
    "ngtdTrad",
    "lateRpt",
    "cstmrCndctClssfctn",
    "txChanlTp",
    "sgntrTp",
    "ordrWvrDtls"
})
public class SwitchExecution7 {

    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1Choice plcOfTrad;
    @XmlElement(name = "OrdrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordrDtTm;
    @XmlElement(name = "RcvdDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcvdDtTm;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary39> rltdPtyDtls;
    @XmlElement(name = "CxlRght")
    protected CancellationRight1Choice cxlRght;
    @XmlElement(name = "ReqdFutrTradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdFutrTradDt;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "CshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "SttlmMtd")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code sttlmMtd;
    @XmlElement(name = "AddtlAmt")
    protected AdditionalAmount1Choice addtlAmt;
    @XmlElement(name = "BestExctn")
    @XmlSchemaType(name = "string")
    protected BestExecution1Code bestExctn;
    @XmlElement(name = "RedLegDtls", required = true)
    protected List<SwitchRedemptionLegExecution4> redLegDtls;
    @XmlElement(name = "SbcptLegDtls", required = true)
    protected List<SwitchSubscriptionLegExecution4> sbcptLegDtls;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction71 cshSttlmDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms33> fxDtls;
    @XmlElement(name = "FinAdvc")
    @XmlSchemaType(name = "string")
    protected FinancialAdvice1Code finAdvc;
    @XmlElement(name = "NgtdTrad")
    @XmlSchemaType(name = "string")
    protected NegotiatedTrade1Code ngtdTrad;
    @XmlElement(name = "LateRpt")
    @XmlSchemaType(name = "string")
    protected LateReport1Code lateRpt;
    @XmlElement(name = "CstmrCndctClssfctn")
    protected CustomerConductClassification1Choice cstmrCndctClssfctn;
    @XmlElement(name = "TxChanlTp")
    protected TransactionChannelType1Choice txChanlTp;
    @XmlElement(name = "SgntrTp")
    protected SignatureType1Choice sgntrTp;
    @XmlElement(name = "OrdrWvrDtls")
    protected OrderWaiver1 ordrWvrDtls;

    /**
     * Gets the value of the amdmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public PlaceOfTradeIdentification1Choice getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification1Choice value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdrDtTm(XMLGregorianCalendar value) {
        this.ordrDtTm = value;
    }

    /**
     * Gets the value of the rcvdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcvdDtTm() {
        return rcvdDtTm;
    }

    /**
     * Sets the value of the rcvdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcvdDtTm(XMLGregorianCalendar value) {
        this.rcvdDtTm = value;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealRef(String value) {
        this.dealRef = value;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrRef(String value) {
        this.ordrRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntRef(String value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public void setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary39 }
     * 
     * 
     * @return
     *     The value of the rltdPtyDtls property.
     */
    public List<Intermediary39> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<>();
        }
        return this.rltdPtyDtls;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1Choice }
     *     
     */
    public CancellationRight1Choice getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1Choice }
     *     
     */
    public void setCxlRght(CancellationRight1Choice value) {
        this.cxlRght = value;
    }

    /**
     * Gets the value of the reqdFutrTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdFutrTradDt() {
        return reqdFutrTradDt;
    }

    /**
     * Sets the value of the reqdFutrTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdFutrTradDt(XMLGregorianCalendar value) {
        this.reqdFutrTradDt = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
    }

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setSttlmMtd(DeliveryReceiptType2Code value) {
        this.sttlmMtd = value;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalAmount1Choice }
     *     
     */
    public AdditionalAmount1Choice getAddtlAmt() {
        return addtlAmt;
    }

    /**
     * Sets the value of the addtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalAmount1Choice }
     *     
     */
    public void setAddtlAmt(AdditionalAmount1Choice value) {
        this.addtlAmt = value;
    }

    /**
     * Gets the value of the bestExctn property.
     * 
     * @return
     *     possible object is
     *     {@link BestExecution1Code }
     *     
     */
    public BestExecution1Code getBestExctn() {
        return bestExctn;
    }

    /**
     * Sets the value of the bestExctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestExecution1Code }
     *     
     */
    public void setBestExctn(BestExecution1Code value) {
        this.bestExctn = value;
    }

    /**
     * Gets the value of the redLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the redLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchRedemptionLegExecution4 }
     * 
     * 
     * @return
     *     The value of the redLegDtls property.
     */
    public List<SwitchRedemptionLegExecution4> getRedLegDtls() {
        if (redLegDtls == null) {
            redLegDtls = new ArrayList<>();
        }
        return this.redLegDtls;
    }

    /**
     * Gets the value of the sbcptLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sbcptLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbcptLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchSubscriptionLegExecution4 }
     * 
     * 
     * @return
     *     The value of the sbcptLegDtls property.
     */
    public List<SwitchSubscriptionLegExecution4> getSbcptLegDtls() {
        if (sbcptLegDtls == null) {
            sbcptLegDtls = new ArrayList<>();
        }
        return this.sbcptLegDtls;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction71 }
     *     
     */
    public PaymentTransaction71 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction71 }
     *     
     */
    public void setCshSttlmDtls(PaymentTransaction71 value) {
        this.cshSttlmDtls = value;
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
     * {@link ForeignExchangeTerms33 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms33> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the finAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public FinancialAdvice1Code getFinAdvc() {
        return finAdvc;
    }

    /**
     * Sets the value of the finAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public void setFinAdvc(FinancialAdvice1Code value) {
        this.finAdvc = value;
    }

    /**
     * Gets the value of the ngtdTrad property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public NegotiatedTrade1Code getNgtdTrad() {
        return ngtdTrad;
    }

    /**
     * Sets the value of the ngtdTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public void setNgtdTrad(NegotiatedTrade1Code value) {
        this.ngtdTrad = value;
    }

    /**
     * Gets the value of the lateRpt property.
     * 
     * @return
     *     possible object is
     *     {@link LateReport1Code }
     *     
     */
    public LateReport1Code getLateRpt() {
        return lateRpt;
    }

    /**
     * Sets the value of the lateRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateReport1Code }
     *     
     */
    public void setLateRpt(LateReport1Code value) {
        this.lateRpt = value;
    }

    /**
     * Gets the value of the cstmrCndctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public CustomerConductClassification1Choice getCstmrCndctClssfctn() {
        return cstmrCndctClssfctn;
    }

    /**
     * Sets the value of the cstmrCndctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public void setCstmrCndctClssfctn(CustomerConductClassification1Choice value) {
        this.cstmrCndctClssfctn = value;
    }

    /**
     * Gets the value of the txChanlTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public TransactionChannelType1Choice getTxChanlTp() {
        return txChanlTp;
    }

    /**
     * Sets the value of the txChanlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public void setTxChanlTp(TransactionChannelType1Choice value) {
        this.txChanlTp = value;
    }

    /**
     * Gets the value of the sgntrTp property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType1Choice }
     *     
     */
    public SignatureType1Choice getSgntrTp() {
        return sgntrTp;
    }

    /**
     * Sets the value of the sgntrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType1Choice }
     *     
     */
    public void setSgntrTp(SignatureType1Choice value) {
        this.sgntrTp = value;
    }

    /**
     * Gets the value of the ordrWvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderWaiver1 }
     *     
     */
    public OrderWaiver1 getOrdrWvrDtls() {
        return ordrWvrDtls;
    }

    /**
     * Sets the value of the ordrWvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderWaiver1 }
     *     
     */
    public void setOrdrWvrDtls(OrderWaiver1 value) {
        this.ordrWvrDtls = value;
    }

}
