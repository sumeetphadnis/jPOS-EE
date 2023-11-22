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

package org.jpos.iso20022.camt_025_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestType4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PmtCtrl" type="{urn:iso:std:iso:20022:tech:xsd:camt.025.001.06}ExternalPaymentControlRequestType1Code"/>
 *         <element name="Enqry" type="{urn:iso:std:iso:20022:tech:xsd:camt.025.001.06}ExternalEnquiryRequestType1Code"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.025.001.06}GenericIdentification1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType4Choice", propOrder = {
    "pmtCtrl",
    "enqry",
    "prtry"
})
public class RequestType4Choice {

    @XmlElement(name = "PmtCtrl")
    protected String pmtCtrl;
    @XmlElement(name = "Enqry")
    protected String enqry;
    @XmlElement(name = "Prtry")
    protected GenericIdentification1 prtry;

    /**
     * Gets the value of the pmtCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCtrl() {
        return pmtCtrl;
    }

    /**
     * Sets the value of the pmtCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtCtrl(String value) {
        this.pmtCtrl = value;
    }

    /**
     * Gets the value of the enqry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnqry() {
        return enqry;
    }

    /**
     * Sets the value of the enqry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnqry(String value) {
        this.enqry = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setPrtry(GenericIdentification1 value) {
        this.prtry = value;
    }

}
