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

package org.jpos.iso20022.setr_009_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitPrice22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnitPrice22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}TypeOfPrice46Choice"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PriceValue1"/>
 *         <element name="PricMtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PriceMethod1Code" minOccurs="0"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Number" minOccurs="0"/>
 *         <element name="TaxblIncmPerShr" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="TaxblIncmPerShrClctd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}TaxableIncomePerShareCalculated2Choice" minOccurs="0"/>
 *         <element name="PricDiffRsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPrice22", propOrder = {
    "tp",
    "val",
    "pricMtd",
    "nbOfDaysAcrd",
    "taxblIncmPerShr",
    "taxblIncmPerShrClctd",
    "pricDiffRsn"
})
public class UnitPrice22 {

    @XmlElement(name = "Tp", required = true)
    protected TypeOfPrice46Choice tp;
    @XmlElement(name = "Val", required = true)
    protected PriceValue1 val;
    @XmlElement(name = "PricMtd")
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "TaxblIncmPerShr")
    protected ActiveCurrencyAnd13DecimalAmount taxblIncmPerShr;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    protected TaxableIncomePerShareCalculated2Choice taxblIncmPerShrClctd;
    @XmlElement(name = "PricDiffRsn")
    protected String pricDiffRsn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice46Choice }
     *     
     */
    public TypeOfPrice46Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice46Choice }
     *     
     */
    public void setTp(TypeOfPrice46Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public void setVal(PriceValue1 value) {
        this.val = value;
    }

    /**
     * Gets the value of the pricMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMethod1Code }
     *     
     */
    public PriceMethod1Code getPricMtd() {
        return pricMtd;
    }

    /**
     * Sets the value of the pricMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMethod1Code }
     *     
     */
    public void setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the taxblIncmPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTaxblIncmPerShr() {
        return taxblIncmPerShr;
    }

    /**
     * Sets the value of the taxblIncmPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setTaxblIncmPerShr(ActiveCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerShr = value;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated2Choice }
     *     
     */
    public TaxableIncomePerShareCalculated2Choice getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated2Choice }
     *     
     */
    public void setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated2Choice value) {
        this.taxblIncmPerShrClctd = value;
    }

    /**
     * Gets the value of the pricDiffRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricDiffRsn() {
        return pricDiffRsn;
    }

    /**
     * Sets the value of the pricDiffRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricDiffRsn(String value) {
        this.pricDiffRsn = value;
    }

}
