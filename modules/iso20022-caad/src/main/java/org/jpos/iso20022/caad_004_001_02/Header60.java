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

package org.jpos.iso20022.caad_004_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header60 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Header60">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgFctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}MessageFunction17Code"/>
 *         <element name="PrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2048Text"/>
 *         <element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ReTrnsmssnCntr" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max3NumericText" minOccurs="0"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}ISODateTime"/>
 *         <element name="BtchMgmtInf" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}BatchManagementInformation1" minOccurs="0"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}GenericIdentification183"/>
 *         <element name="RcptPty" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}GenericIdentification183" minOccurs="0"/>
 *         <element name="TracData" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Tracblt" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Traceability9" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header60", propOrder = {
    "msgFctn",
    "prtcolVrsn",
    "xchgId",
    "reTrnsmssnCntr",
    "creDtTm",
    "btchMgmtInf",
    "initgPty",
    "rcptPty",
    "tracData",
    "tracblt"
})
public class Header60 {

    @XmlElement(name = "MsgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction17Code msgFctn;
    @XmlElement(name = "PrtcolVrsn", required = true)
    protected String prtcolVrsn;
    @XmlElement(name = "XchgId")
    protected String xchgId;
    @XmlElement(name = "ReTrnsmssnCntr")
    protected String reTrnsmssnCntr;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "BtchMgmtInf")
    protected BatchManagementInformation1 btchMgmtInf;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification183 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification183 rcptPty;
    @XmlElement(name = "TracData")
    protected List<AdditionalData1> tracData;
    @XmlElement(name = "Tracblt")
    protected List<Traceability9> tracblt;

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction17Code }
     *     
     */
    public MessageFunction17Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction17Code }
     *     
     */
    public void setMsgFctn(MessageFunction17Code value) {
        this.msgFctn = value;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
    }

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgId(String value) {
        this.xchgId = value;
    }

    /**
     * Gets the value of the reTrnsmssnCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReTrnsmssnCntr() {
        return reTrnsmssnCntr;
    }

    /**
     * Sets the value of the reTrnsmssnCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReTrnsmssnCntr(String value) {
        this.reTrnsmssnCntr = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the btchMgmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementInformation1 }
     *     
     */
    public BatchManagementInformation1 getBtchMgmtInf() {
        return btchMgmtInf;
    }

    /**
     * Sets the value of the btchMgmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementInformation1 }
     *     
     */
    public void setBtchMgmtInf(BatchManagementInformation1 value) {
        this.btchMgmtInf = value;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public void setInitgPty(GenericIdentification183 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the rcptPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getRcptPty() {
        return rcptPty;
    }

    /**
     * Sets the value of the rcptPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public void setRcptPty(GenericIdentification183 value) {
        this.rcptPty = value;
    }

    /**
     * Gets the value of the tracData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tracData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the tracData property.
     */
    public List<AdditionalData1> getTracData() {
        if (tracData == null) {
            tracData = new ArrayList<>();
        }
        return this.tracData;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability9 }
     * 
     * 
     * @return
     *     The value of the tracblt property.
     */
    public List<Traceability9> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<>();
        }
        return this.tracblt;
    }

}
