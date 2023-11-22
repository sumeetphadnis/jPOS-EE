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

package org.jpos.iso20022.caaa_022_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentEnvironment78 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentEnvironment78">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Acquirer10" minOccurs="0"/>
 *         <element name="Mrchnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Organisation41" minOccurs="0"/>
 *         <element name="POI" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}PointOfInteraction12" minOccurs="0"/>
 *         <element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}PaymentCard32" minOccurs="0"/>
 *         <element name="Chck" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Check1" minOccurs="0"/>
 *         <element name="StordValAcct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}StoredValueAccount2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LltyAcct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}LoyaltyAccount3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CstmrDvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}CustomerDevice3" minOccurs="0"/>
 *         <element name="Wllt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}CustomerDevice3" minOccurs="0"/>
 *         <element name="PmtTkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Token1" minOccurs="0"/>
 *         <element name="MrchntTkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}MerchantToken2" minOccurs="0"/>
 *         <element name="Crdhldr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Cardholder18" minOccurs="0"/>
 *         <element name="PrtctdCrdhldrData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}ContentInformationType32" minOccurs="0"/>
 *         <element name="SaleEnvt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}RetailerSaleEnvironment2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment78", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card",
    "chck",
    "stordValAcct",
    "lltyAcct",
    "cstmrDvc",
    "wllt",
    "pmtTkn",
    "mrchntTkn",
    "crdhldr",
    "prtctdCrdhldrData",
    "saleEnvt"
})
public class CardPaymentEnvironment78 {

    @XmlElement(name = "Acqrr")
    protected Acquirer10 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation41 mrchnt;
    @XmlElement(name = "POI")
    protected PointOfInteraction12 poi;
    @XmlElement(name = "Card")
    protected PaymentCard32 card;
    @XmlElement(name = "Chck")
    protected Check1 chck;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "LltyAcct")
    protected List<LoyaltyAccount3> lltyAcct;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice3 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice3 wllt;
    @XmlElement(name = "PmtTkn")
    protected Token1 pmtTkn;
    @XmlElement(name = "MrchntTkn")
    protected MerchantToken2 mrchntTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder18 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType32 prtctdCrdhldrData;
    @XmlElement(name = "SaleEnvt")
    protected RetailerSaleEnvironment2 saleEnvt;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public void setAcqrr(Acquirer10 value) {
        this.acqrr = value;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation41 }
     *     
     */
    public Organisation41 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation41 }
     *     
     */
    public void setMrchnt(Organisation41 value) {
        this.mrchnt = value;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction12 }
     *     
     */
    public PointOfInteraction12 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction12 }
     *     
     */
    public void setPOI(PointOfInteraction12 value) {
        this.poi = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard32 }
     *     
     */
    public PaymentCard32 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard32 }
     *     
     */
    public void setCard(PaymentCard32 value) {
        this.card = value;
    }

    /**
     * Gets the value of the chck property.
     * 
     * @return
     *     possible object is
     *     {@link Check1 }
     *     
     */
    public Check1 getChck() {
        return chck;
    }

    /**
     * Sets the value of the chck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check1 }
     *     
     */
    public void setChck(Check1 value) {
        this.chck = value;
    }

    /**
     * Gets the value of the stordValAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stordValAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordValAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueAccount2 }
     * 
     * 
     * @return
     *     The value of the stordValAcct property.
     */
    public List<StoredValueAccount2> getStordValAcct() {
        if (stordValAcct == null) {
            stordValAcct = new ArrayList<>();
        }
        return this.stordValAcct;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccount3 }
     * 
     * 
     * @return
     *     The value of the lltyAcct property.
     */
    public List<LoyaltyAccount3> getLltyAcct() {
        if (lltyAcct == null) {
            lltyAcct = new ArrayList<>();
        }
        return this.lltyAcct;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public void setCstmrDvc(CustomerDevice3 value) {
        this.cstmrDvc = value;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public void setWllt(CustomerDevice3 value) {
        this.wllt = value;
    }

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token1 }
     *     
     */
    public Token1 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token1 }
     *     
     */
    public void setPmtTkn(Token1 value) {
        this.pmtTkn = value;
    }

    /**
     * Gets the value of the mrchntTkn property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantToken2 }
     *     
     */
    public MerchantToken2 getMrchntTkn() {
        return mrchntTkn;
    }

    /**
     * Sets the value of the mrchntTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantToken2 }
     *     
     */
    public void setMrchntTkn(MerchantToken2 value) {
        this.mrchntTkn = value;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder18 }
     *     
     */
    public Cardholder18 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder18 }
     *     
     */
    public void setCrdhldr(Cardholder18 value) {
        this.crdhldr = value;
    }

    /**
     * Gets the value of the prtctdCrdhldrData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType32 }
     *     
     */
    public ContentInformationType32 getPrtctdCrdhldrData() {
        return prtctdCrdhldrData;
    }

    /**
     * Sets the value of the prtctdCrdhldrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType32 }
     *     
     */
    public void setPrtctdCrdhldrData(ContentInformationType32 value) {
        this.prtctdCrdhldrData = value;
    }

    /**
     * Gets the value of the saleEnvt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public RetailerSaleEnvironment2 getSaleEnvt() {
        return saleEnvt;
    }

    /**
     * Sets the value of the saleEnvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public void setSaleEnvt(RetailerSaleEnvironment2 value) {
        this.saleEnvt = value;
    }

}
