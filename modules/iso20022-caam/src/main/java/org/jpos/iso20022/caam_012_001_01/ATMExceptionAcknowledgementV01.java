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

package org.jpos.iso20022.caam_012_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMExceptionAcknowledgementV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMExceptionAcknowledgementV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Header32"/>
 *         <element name="PrtctdATMXcptnAck" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="ATMXcptnAck" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMExceptionAcknowledgement1" minOccurs="0"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ContentInformationType15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMExceptionAcknowledgementV01", propOrder = {
    "hdr",
    "prtctdATMXcptnAck",
    "atmXcptnAck",
    "sctyTrlr"
})
public class ATMExceptionAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMXcptnAck")
    protected ContentInformationType10 prtctdATMXcptnAck;
    @XmlElement(name = "ATMXcptnAck")
    protected ATMExceptionAcknowledgement1 atmXcptnAck;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header32 }
     *     
     */
    public Header32 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header32 }
     *     
     */
    public void setHdr(Header32 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the prtctdATMXcptnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMXcptnAck() {
        return prtctdATMXcptnAck;
    }

    /**
     * Sets the value of the prtctdATMXcptnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdATMXcptnAck(ContentInformationType10 value) {
        this.prtctdATMXcptnAck = value;
    }

    /**
     * Gets the value of the atmXcptnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMExceptionAcknowledgement1 }
     *     
     */
    public ATMExceptionAcknowledgement1 getATMXcptnAck() {
        return atmXcptnAck;
    }

    /**
     * Sets the value of the atmXcptnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMExceptionAcknowledgement1 }
     *     
     */
    public void setATMXcptnAck(ATMExceptionAcknowledgement1 value) {
        this.atmXcptnAck = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public void setSctyTrlr(ContentInformationType15 value) {
        this.sctyTrlr = value;
    }

}
