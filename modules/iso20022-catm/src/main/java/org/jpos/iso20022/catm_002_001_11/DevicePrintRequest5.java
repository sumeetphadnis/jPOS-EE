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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevicePrintRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DevicePrintRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocQlfr" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DocumentType7Code"/>
 *         <element name="RspnMd" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ResponseMode2Code"/>
 *         <element name="IntgrtdPrtFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReqrdSgntrFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="OutptCntt" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ActionMessage10"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePrintRequest5", propOrder = {
    "docQlfr",
    "rspnMd",
    "intgrtdPrtFlg",
    "reqrdSgntrFlg",
    "outptCntt"
})
public class DevicePrintRequest5 {

    @XmlElement(name = "DocQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentType7Code docQlfr;
    @XmlElement(name = "RspnMd", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseMode2Code rspnMd;
    @XmlElement(name = "IntgrtdPrtFlg")
    protected Boolean intgrtdPrtFlg;
    @XmlElement(name = "ReqrdSgntrFlg")
    protected Boolean reqrdSgntrFlg;
    @XmlElement(name = "OutptCntt", required = true)
    protected ActionMessage10 outptCntt;

    /**
     * Gets the value of the docQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType7Code }
     *     
     */
    public DocumentType7Code getDocQlfr() {
        return docQlfr;
    }

    /**
     * Sets the value of the docQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType7Code }
     *     
     */
    public void setDocQlfr(DocumentType7Code value) {
        this.docQlfr = value;
    }

    /**
     * Gets the value of the rspnMd property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMode2Code }
     *     
     */
    public ResponseMode2Code getRspnMd() {
        return rspnMd;
    }

    /**
     * Sets the value of the rspnMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMode2Code }
     *     
     */
    public void setRspnMd(ResponseMode2Code value) {
        this.rspnMd = value;
    }

    /**
     * Gets the value of the intgrtdPrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntgrtdPrtFlg() {
        return intgrtdPrtFlg;
    }

    /**
     * Sets the value of the intgrtdPrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntgrtdPrtFlg(Boolean value) {
        this.intgrtdPrtFlg = value;
    }

    /**
     * Gets the value of the reqrdSgntrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqrdSgntrFlg() {
        return reqrdSgntrFlg;
    }

    /**
     * Sets the value of the reqrdSgntrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqrdSgntrFlg(Boolean value) {
        this.reqrdSgntrFlg = value;
    }

    /**
     * Gets the value of the outptCntt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getOutptCntt() {
        return outptCntt;
    }

    /**
     * Sets the value of the outptCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setOutptCntt(ActionMessage10 value) {
        this.outptCntt = value;
    }

}
