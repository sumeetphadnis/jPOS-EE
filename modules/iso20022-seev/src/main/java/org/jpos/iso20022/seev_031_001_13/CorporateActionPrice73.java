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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice73 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice73">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshInLieuOfShrPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat45Choice" minOccurs="0"/>
 *         <element name="OverSbcptDpstPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat45Choice" minOccurs="0"/>
 *         <element name="MaxCshToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat61Choice" minOccurs="0"/>
 *         <element name="MinCshToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat61Choice" minOccurs="0"/>
 *         <element name="MinMltplCshToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat61Choice" minOccurs="0"/>
 *         <element name="MaxPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat44Choice" minOccurs="0"/>
 *         <element name="MinPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat44Choice" minOccurs="0"/>
 *         <element name="FrstBidIncrmtPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat44Choice" minOccurs="0"/>
 *         <element name="LastBidIncrmtPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat44Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice73", propOrder = {
    "cshInLieuOfShrPric",
    "overSbcptDpstPric",
    "maxCshToInst",
    "minCshToInst",
    "minMltplCshToInst",
    "maxPric",
    "minPric",
    "frstBidIncrmtPric",
    "lastBidIncrmtPric"
})
public class CorporateActionPrice73 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat45Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat45Choice overSbcptDpstPric;
    @XmlElement(name = "MaxCshToInst")
    protected PriceFormat61Choice maxCshToInst;
    @XmlElement(name = "MinCshToInst")
    protected PriceFormat61Choice minCshToInst;
    @XmlElement(name = "MinMltplCshToInst")
    protected PriceFormat61Choice minMltplCshToInst;
    @XmlElement(name = "MaxPric")
    protected PriceFormat44Choice maxPric;
    @XmlElement(name = "MinPric")
    protected PriceFormat44Choice minPric;
    @XmlElement(name = "FrstBidIncrmtPric")
    protected PriceFormat44Choice frstBidIncrmtPric;
    @XmlElement(name = "LastBidIncrmtPric")
    protected PriceFormat44Choice lastBidIncrmtPric;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public PriceFormat45Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public void setCshInLieuOfShrPric(PriceFormat45Choice value) {
        this.cshInLieuOfShrPric = value;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public PriceFormat45Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public void setOverSbcptDpstPric(PriceFormat45Choice value) {
        this.overSbcptDpstPric = value;
    }

    /**
     * Gets the value of the maxCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMaxCshToInst() {
        return maxCshToInst;
    }

    /**
     * Sets the value of the maxCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public void setMaxCshToInst(PriceFormat61Choice value) {
        this.maxCshToInst = value;
    }

    /**
     * Gets the value of the minCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMinCshToInst() {
        return minCshToInst;
    }

    /**
     * Sets the value of the minCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public void setMinCshToInst(PriceFormat61Choice value) {
        this.minCshToInst = value;
    }

    /**
     * Gets the value of the minMltplCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMinMltplCshToInst() {
        return minMltplCshToInst;
    }

    /**
     * Sets the value of the minMltplCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public void setMinMltplCshToInst(PriceFormat61Choice value) {
        this.minMltplCshToInst = value;
    }

    /**
     * Gets the value of the maxPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getMaxPric() {
        return maxPric;
    }

    /**
     * Sets the value of the maxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public void setMaxPric(PriceFormat44Choice value) {
        this.maxPric = value;
    }

    /**
     * Gets the value of the minPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getMinPric() {
        return minPric;
    }

    /**
     * Sets the value of the minPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public void setMinPric(PriceFormat44Choice value) {
        this.minPric = value;
    }

    /**
     * Gets the value of the frstBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getFrstBidIncrmtPric() {
        return frstBidIncrmtPric;
    }

    /**
     * Sets the value of the frstBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public void setFrstBidIncrmtPric(PriceFormat44Choice value) {
        this.frstBidIncrmtPric = value;
    }

    /**
     * Gets the value of the lastBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getLastBidIncrmtPric() {
        return lastBidIncrmtPric;
    }

    /**
     * Sets the value of the lastBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public void setLastBidIncrmtPric(PriceFormat44Choice value) {
        this.lastBidIncrmtPric = value;
    }

}
