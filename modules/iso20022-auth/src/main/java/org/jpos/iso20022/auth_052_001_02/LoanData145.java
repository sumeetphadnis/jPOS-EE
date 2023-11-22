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

package org.jpos.iso20022.auth_052_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanData145 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoanData145">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvryByVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TrueFalseIndicator"/>
 *         <element name="CollDlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}CollateralDeliveryMethod1Code" minOccurs="0"/>
 *         <element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ContractTerm7Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AsstTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}SecurityCommodity9"/>
 *         <element name="RbtRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}InterestRate27Choice" minOccurs="0"/>
 *         <element name="LnVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="LndgFee" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}PercentageRate" minOccurs="0"/>
 *         <element name="UnqTradIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}Max52Text"/>
 *         <element name="EvtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ISODate"/>
 *         <element name="ClrSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}Cleared16Choice"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}MICIdentifier"/>
 *         <element name="MstrAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}MasterAgreement7" minOccurs="0"/>
 *         <element name="ExctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ISODateTime"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ISODate"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ISODate" minOccurs="0"/>
 *         <element name="GnlColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}SpecialCollateral1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData145", propOrder = {
    "dlvryByVal",
    "collDlvryMtd",
    "term",
    "asstTp",
    "rbtRate",
    "lnVal",
    "lndgFee",
    "unqTradIdr",
    "evtDt",
    "clrSts",
    "tradgVn",
    "mstrAgrmt",
    "exctnDtTm",
    "valDt",
    "termntnDt",
    "gnlColl"
})
public class LoanData145 {

    @XmlElement(name = "DlvryByVal")
    protected boolean dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "Term")
    protected List<ContractTerm7Choice> term;
    @XmlElement(name = "AsstTp", required = true)
    protected SecurityCommodity9 asstTp;
    @XmlElement(name = "RbtRate")
    protected InterestRate27Choice rbtRate;
    @XmlElement(name = "LnVal", required = true)
    protected ActiveOrHistoricCurrencyAndAmount lnVal;
    @XmlElement(name = "LndgFee")
    protected BigDecimal lndgFee;
    @XmlElement(name = "UnqTradIdr", required = true)
    protected String unqTradIdr;
    @XmlElement(name = "EvtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "ClrSts", required = true)
    protected Cleared16Choice clrSts;
    @XmlElement(name = "TradgVn", required = true)
    protected String tradgVn;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement7 mstrAgrmt;
    @XmlElement(name = "ExctnDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exctnDtTm;
    @XmlElement(name = "ValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termntnDt;
    @XmlElement(name = "GnlColl")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral1Code gnlColl;

    /**
     * Gets the value of the dlvryByVal property.
     * 
     */
    public boolean isDlvryByVal() {
        return dlvryByVal;
    }

    /**
     * Sets the value of the dlvryByVal property.
     * 
     */
    public void setDlvryByVal(boolean value) {
        this.dlvryByVal = value;
    }

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public CollateralDeliveryMethod1Code getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public void setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
        this.collDlvryMtd = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractTerm7Choice }
     * 
     * 
     * @return
     *     The value of the term property.
     */
    public List<ContractTerm7Choice> getTerm() {
        if (term == null) {
            term = new ArrayList<>();
        }
        return this.term;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodity9 }
     *     
     */
    public SecurityCommodity9 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodity9 }
     *     
     */
    public void setAsstTp(SecurityCommodity9 value) {
        this.asstTp = value;
    }

    /**
     * Gets the value of the rbtRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate27Choice }
     *     
     */
    public InterestRate27Choice getRbtRate() {
        return rbtRate;
    }

    /**
     * Sets the value of the rbtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate27Choice }
     *     
     */
    public void setRbtRate(InterestRate27Choice value) {
        this.rbtRate = value;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setLnVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.lnVal = value;
    }

    /**
     * Gets the value of the lndgFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLndgFee() {
        return lndgFee;
    }

    /**
     * Sets the value of the lndgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLndgFee(BigDecimal value) {
        this.lndgFee = value;
    }

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqTradIdr(String value) {
        this.unqTradIdr = value;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link Cleared16Choice }
     *     
     */
    public Cleared16Choice getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cleared16Choice }
     *     
     */
    public void setClrSts(Cleared16Choice value) {
        this.clrSts = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement7 }
     *     
     */
    public MasterAgreement7 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement7 }
     *     
     */
    public void setMstrAgrmt(MasterAgreement7 value) {
        this.mstrAgrmt = value;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExctnDtTm(XMLGregorianCalendar value) {
        this.exctnDtTm = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public SpecialCollateral1Code getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public void setGnlColl(SpecialCollateral1Code value) {
        this.gnlColl = value;
    }

}
