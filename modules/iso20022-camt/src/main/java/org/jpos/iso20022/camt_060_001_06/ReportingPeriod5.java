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

package org.jpos.iso20022.camt_060_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingPeriod5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportingPeriod5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}DatePeriod3"/>
 *         <element name="FrToTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}TimePeriodDetails1" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}QueryType3Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingPeriod5", propOrder = {
    "frToDt",
    "frToTm",
    "tp"
})
public class ReportingPeriod5 {

    @XmlElement(name = "FrToDt", required = true)
    protected DatePeriod3 frToDt;
    @XmlElement(name = "FrToTm")
    protected TimePeriodDetails1 frToTm;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected QueryType3Code tp;

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod3 }
     *     
     */
    public DatePeriod3 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod3 }
     *     
     */
    public void setFrToDt(DatePeriod3 value) {
        this.frToDt = value;
    }

    /**
     * Gets the value of the frToTm property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodDetails1 }
     *     
     */
    public TimePeriodDetails1 getFrToTm() {
        return frToTm;
    }

    /**
     * Sets the value of the frToTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodDetails1 }
     *     
     */
    public void setFrToTm(TimePeriodDetails1 value) {
        this.frToTm = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType3Code }
     *     
     */
    public QueryType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType3Code }
     *     
     */
    public void setTp(QueryType3Code value) {
        this.tp = value;
    }

}
