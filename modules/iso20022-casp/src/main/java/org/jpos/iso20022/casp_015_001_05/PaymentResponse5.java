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

package org.jpos.iso20022.casp_015_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentResponse5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentResponse5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleTxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}TransactionIdentifier1"/>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="POITxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}TransactionIdentifier1"/>
 *         <element name="POIRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="IssrRefData" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Max140Text" minOccurs="0"/>
 *         <element name="RtlrPmtRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}RetailerPaymentResult5"/>
 *         <element name="PmtRct" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}PaymentReceipt5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LltyRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}LoyaltyResult3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CstmrOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CustomerOrder1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponse5", propOrder = {
    "saleTxId",
    "saleRefId",
    "poiTxId",
    "poiRcncltnId",
    "issrRefData",
    "rtlrPmtRslt",
    "pmtRct",
    "lltyRslt",
    "cstmrOrdr"
})
public class PaymentResponse5 {

    @XmlElement(name = "SaleTxId", required = true)
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "POITxId", required = true)
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;
    @XmlElement(name = "IssrRefData")
    protected String issrRefData;
    @XmlElement(name = "RtlrPmtRslt", required = true)
    protected RetailerPaymentResult5 rtlrPmtRslt;
    @XmlElement(name = "PmtRct")
    protected List<PaymentReceipt5> pmtRct;
    @XmlElement(name = "LltyRslt")
    protected List<LoyaltyResult3> lltyRslt;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;

    /**
     * Gets the value of the saleTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleTxId() {
        return saleTxId;
    }

    /**
     * Sets the value of the saleTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
    }

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefId(String value) {
        this.saleRefId = value;
    }

    /**
     * Gets the value of the poiTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOITxId() {
        return poiTxId;
    }

    /**
     * Sets the value of the poiTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
    }

    /**
     * Gets the value of the poiRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIRcncltnId() {
        return poiRcncltnId;
    }

    /**
     * Sets the value of the poiRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
    }

    /**
     * Gets the value of the issrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrRefData() {
        return issrRefData;
    }

    /**
     * Sets the value of the issrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrRefData(String value) {
        this.issrRefData = value;
    }

    /**
     * Gets the value of the rtlrPmtRslt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerPaymentResult5 }
     *     
     */
    public RetailerPaymentResult5 getRtlrPmtRslt() {
        return rtlrPmtRslt;
    }

    /**
     * Sets the value of the rtlrPmtRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerPaymentResult5 }
     *     
     */
    public void setRtlrPmtRslt(RetailerPaymentResult5 value) {
        this.rtlrPmtRslt = value;
    }

    /**
     * Gets the value of the pmtRct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtRct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt5 }
     * 
     * 
     * @return
     *     The value of the pmtRct property.
     */
    public List<PaymentReceipt5> getPmtRct() {
        if (pmtRct == null) {
            pmtRct = new ArrayList<>();
        }
        return this.pmtRct;
    }

    /**
     * Gets the value of the lltyRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyResult3 }
     * 
     * 
     * @return
     *     The value of the lltyRslt property.
     */
    public List<LoyaltyResult3> getLltyRslt() {
        if (lltyRslt == null) {
            lltyRslt = new ArrayList<>();
        }
        return this.lltyRslt;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder1 }
     * 
     * 
     * @return
     *     The value of the cstmrOrdr property.
     */
    public List<CustomerOrder1> getCstmrOrdr() {
        if (cstmrOrdr == null) {
            cstmrOrdr = new ArrayList<>();
        }
        return this.cstmrOrdr;
    }

}
