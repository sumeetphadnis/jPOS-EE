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

package org.jpos.iso20022.catm_002_001_11;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessTiming5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessTiming5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WtgTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}Max9NumericText" minOccurs="0"/>
 *         <element name="StartTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ISODateTime" minOccurs="0"/>
 *         <element name="EndTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ISODateTime" minOccurs="0"/>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}Max9NumericText" minOccurs="0"/>
 *         <element name="MaxNb" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}Number" minOccurs="0"/>
 *         <element name="UnitOfTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TimeUnit1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessTiming5", propOrder = {
    "wtgTm",
    "startTm",
    "endTm",
    "prd",
    "maxNb",
    "unitOfTm"
})
public class ProcessTiming5 {

    @XmlElement(name = "WtgTm")
    protected String wtgTm;
    @XmlElement(name = "StartTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTm;
    @XmlElement(name = "EndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTm;
    @XmlElement(name = "Prd")
    protected String prd;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;
    @XmlElement(name = "UnitOfTm")
    @XmlSchemaType(name = "string")
    protected TimeUnit1Code unitOfTm;

    /**
     * Gets the value of the wtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtgTm() {
        return wtgTm;
    }

    /**
     * Sets the value of the wtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtgTm(String value) {
        this.wtgTm = value;
    }

    /**
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTm(XMLGregorianCalendar value) {
        this.startTm = value;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTm(XMLGregorianCalendar value) {
        this.endTm = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrd(String value) {
        this.prd = value;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxNb(BigDecimal value) {
        this.maxNb = value;
    }

    /**
     * Gets the value of the unitOfTm property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit1Code }
     *     
     */
    public TimeUnit1Code getUnitOfTm() {
        return unitOfTm;
    }

    /**
     * Sets the value of the unitOfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit1Code }
     *     
     */
    public void setUnitOfTm(TimeUnit1Code value) {
        this.unitOfTm = value;
    }

}
