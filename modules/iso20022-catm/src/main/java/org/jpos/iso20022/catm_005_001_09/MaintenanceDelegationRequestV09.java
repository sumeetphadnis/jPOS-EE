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

package org.jpos.iso20022.catm_005_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceDelegationRequestV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MaintenanceDelegationRequestV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TMSHeader1" minOccurs="0"/>
 *         <element name="MntncDlgtnReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}MaintenanceDelegationRequest9"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ContentInformationType33"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegationRequestV09", propOrder = {
    "hdr",
    "mntncDlgtnReq",
    "sctyTrlr"
})
public class MaintenanceDelegationRequestV09 {

    @XmlElement(name = "Hdr")
    protected TMSHeader1 hdr;
    @XmlElement(name = "MntncDlgtnReq", required = true)
    protected MaintenanceDelegationRequest9 mntncDlgtnReq;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType33 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link TMSHeader1 }
     *     
     */
    public TMSHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSHeader1 }
     *     
     */
    public void setHdr(TMSHeader1 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the mntncDlgtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegationRequest9 }
     *     
     */
    public MaintenanceDelegationRequest9 getMntncDlgtnReq() {
        return mntncDlgtnReq;
    }

    /**
     * Sets the value of the mntncDlgtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegationRequest9 }
     *     
     */
    public void setMntncDlgtnReq(MaintenanceDelegationRequest9 value) {
        this.mntncDlgtnReq = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType33 }
     *     
     */
    public ContentInformationType33 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType33 }
     *     
     */
    public void setSctyTrlr(ContentInformationType33 value) {
        this.sctyTrlr = value;
    }

}
