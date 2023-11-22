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

package org.jpos.iso20022.reda_037_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditTrail1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuditTrail1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FldNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}Max35Text"/>
 *         <element name="OdFldVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}Max350Text"/>
 *         <element name="NewFldVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}Max350Text"/>
 *         <element name="OprTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}ISODateTime"/>
 *         <element name="InstgUsr" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}Max256Text"/>
 *         <element name="ApprvgUsr" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrail1", propOrder = {
    "fldNm",
    "odFldVal",
    "newFldVal",
    "oprTmStmp",
    "instgUsr",
    "apprvgUsr"
})
public class AuditTrail1 {

    @XmlElement(name = "FldNm", required = true)
    protected String fldNm;
    @XmlElement(name = "OdFldVal", required = true)
    protected String odFldVal;
    @XmlElement(name = "NewFldVal", required = true)
    protected String newFldVal;
    @XmlElement(name = "OprTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oprTmStmp;
    @XmlElement(name = "InstgUsr", required = true)
    protected String instgUsr;
    @XmlElement(name = "ApprvgUsr")
    protected String apprvgUsr;

    /**
     * Gets the value of the fldNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFldNm() {
        return fldNm;
    }

    /**
     * Sets the value of the fldNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFldNm(String value) {
        this.fldNm = value;
    }

    /**
     * Gets the value of the odFldVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdFldVal() {
        return odFldVal;
    }

    /**
     * Sets the value of the odFldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdFldVal(String value) {
        this.odFldVal = value;
    }

    /**
     * Gets the value of the newFldVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFldVal() {
        return newFldVal;
    }

    /**
     * Sets the value of the newFldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFldVal(String value) {
        this.newFldVal = value;
    }

    /**
     * Gets the value of the oprTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOprTmStmp() {
        return oprTmStmp;
    }

    /**
     * Sets the value of the oprTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOprTmStmp(XMLGregorianCalendar value) {
        this.oprTmStmp = value;
    }

    /**
     * Gets the value of the instgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgUsr() {
        return instgUsr;
    }

    /**
     * Sets the value of the instgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgUsr(String value) {
        this.instgUsr = value;
    }

    /**
     * Gets the value of the apprvgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvgUsr() {
        return apprvgUsr;
    }

    /**
     * Sets the value of the apprvgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprvgUsr(String value) {
        this.apprvgUsr = value;
    }

}
