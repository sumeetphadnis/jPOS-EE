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

package org.jpos.iso20022.auth_014_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchange1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchange1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrgnCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.014.001.02}ActiveOrHistoricCurrencyCode"/>
 *         <element name="XchgSpotRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.014.001.02}BaseOneRate"/>
 *         <element name="XchgFwdPt" type="{urn:iso:std:iso:20022:tech:xsd:auth.014.001.02}DecimalNumber"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchange1", propOrder = {
    "frgnCcy",
    "xchgSpotRate",
    "xchgFwdPt"
})
public class ForeignExchange1 {

    @XmlElement(name = "FrgnCcy", required = true)
    protected String frgnCcy;
    @XmlElement(name = "XchgSpotRate", required = true)
    protected BigDecimal xchgSpotRate;
    @XmlElement(name = "XchgFwdPt", required = true)
    protected BigDecimal xchgFwdPt;

    /**
     * Gets the value of the frgnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrgnCcy() {
        return frgnCcy;
    }

    /**
     * Sets the value of the frgnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrgnCcy(String value) {
        this.frgnCcy = value;
    }

    /**
     * Gets the value of the xchgSpotRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgSpotRate() {
        return xchgSpotRate;
    }

    /**
     * Sets the value of the xchgSpotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgSpotRate(BigDecimal value) {
        this.xchgSpotRate = value;
    }

    /**
     * Gets the value of the xchgFwdPt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgFwdPt() {
        return xchgFwdPt;
    }

    /**
     * Sets the value of the xchgFwdPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgFwdPt(BigDecimal value) {
        this.xchgFwdPt = value;
    }

}
