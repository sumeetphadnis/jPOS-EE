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

package org.jpos.iso20022.setr_027_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTerms18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTerms18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnitCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyCode"/>
 *         <element name="QtdCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyCode"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BaseOneRate"/>
 *         <element name="ConvtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTerms18", propOrder = {
    "unitCcy",
    "qtdCcy",
    "xchgRate",
    "convtdAmt"
})
public class ForeignExchangeTerms18 {

    @XmlElement(name = "UnitCcy", required = true)
    protected String unitCcy;
    @XmlElement(name = "QtdCcy", required = true)
    protected String qtdCcy;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "ConvtdAmt", required = true)
    protected ActiveCurrencyAndAmount convtdAmt;

    /**
     * Gets the value of the unitCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCcy() {
        return unitCcy;
    }

    /**
     * Sets the value of the unitCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCcy(String value) {
        this.unitCcy = value;
    }

    /**
     * Gets the value of the qtdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdCcy() {
        return qtdCcy;
    }

    /**
     * Sets the value of the qtdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdCcy(String value) {
        this.qtdCcy = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the convtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getConvtdAmt() {
        return convtdAmt;
    }

    /**
     * Sets the value of the convtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setConvtdAmt(ActiveCurrencyAndAmount value) {
        this.convtdAmt = value;
    }

}
