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

package org.jpos.iso20022.catm_001_001_12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSHeader1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TMSHeader1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DwnldTrf" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}TrueFalseIndicator"/>
 *         <element name="FrmtVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max6Text"/>
 *         <element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Number"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ISODateTime"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}GenericIdentification176"/>
 *         <element name="RcptPty" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}GenericIdentification177" minOccurs="0"/>
 *         <element name="Tracblt" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Traceability8" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSHeader1", propOrder = {
    "dwnldTrf",
    "frmtVrsn",
    "xchgId",
    "creDtTm",
    "initgPty",
    "rcptPty",
    "tracblt"
})
public class TMSHeader1 {

    @XmlElement(name = "DwnldTrf")
    protected boolean dwnldTrf;
    @XmlElement(name = "FrmtVrsn", required = true)
    protected String frmtVrsn;
    @XmlElement(name = "XchgId", required = true)
    protected BigDecimal xchgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification176 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification177 rcptPty;
    @XmlElement(name = "Tracblt")
    protected List<Traceability8> tracblt;

    /**
     * Gets the value of the dwnldTrf property.
     * 
     */
    public boolean isDwnldTrf() {
        return dwnldTrf;
    }

    /**
     * Sets the value of the dwnldTrf property.
     * 
     */
    public void setDwnldTrf(boolean value) {
        this.dwnldTrf = value;
    }

    /**
     * Gets the value of the frmtVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmtVrsn() {
        return frmtVrsn;
    }

    /**
     * Sets the value of the frmtVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmtVrsn(String value) {
        this.frmtVrsn = value;
    }

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgId(BigDecimal value) {
        this.xchgId = value;
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
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setInitgPty(GenericIdentification176 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the rcptPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getRcptPty() {
        return rcptPty;
    }

    /**
     * Sets the value of the rcptPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setRcptPty(GenericIdentification177 value) {
        this.rcptPty = value;
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
     * {@link Traceability8 }
     * 
     * 
     * @return
     *     The value of the tracblt property.
     */
    public List<Traceability8> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<>();
        }
        return this.tracblt;
    }

}
