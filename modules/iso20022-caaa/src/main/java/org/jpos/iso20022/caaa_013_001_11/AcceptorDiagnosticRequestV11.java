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

package org.jpos.iso20022.caaa_013_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorDiagnosticRequestV11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorDiagnosticRequestV11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.013.001.11}Header70"/>
 *         <element name="DgnstcReq" type="{urn:iso:std:iso:20022:tech:xsd:caaa.013.001.11}AcceptorDiagnosticRequest11"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.013.001.11}ContentInformationType36" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorDiagnosticRequestV11", propOrder = {
    "hdr",
    "dgnstcReq",
    "sctyTrlr"
})
public class AcceptorDiagnosticRequestV11 {

    @XmlElement(name = "Hdr", required = true)
    protected Header70 hdr;
    @XmlElement(name = "DgnstcReq", required = true)
    protected AcceptorDiagnosticRequest11 dgnstcReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType36 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header70 }
     *     
     */
    public Header70 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header70 }
     *     
     */
    public void setHdr(Header70 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the dgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorDiagnosticRequest11 }
     *     
     */
    public AcceptorDiagnosticRequest11 getDgnstcReq() {
        return dgnstcReq;
    }

    /**
     * Sets the value of the dgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorDiagnosticRequest11 }
     *     
     */
    public void setDgnstcReq(AcceptorDiagnosticRequest11 value) {
        this.dgnstcReq = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType36 }
     *     
     */
    public ContentInformationType36 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType36 }
     *     
     */
    public void setSctyTrlr(ContentInformationType36 value) {
        this.sctyTrlr = value;
    }

}
