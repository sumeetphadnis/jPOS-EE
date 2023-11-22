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

package org.jpos.iso20022.reda_060_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NettingIdentification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NettingIdentification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TradPty" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}PartyIdentification242Choice"/>
 *         <element name="NetgGrpId" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettingIdentification2Choice", propOrder = {
    "tradPty",
    "netgGrpId"
})
public class NettingIdentification2Choice {

    @XmlElement(name = "TradPty")
    protected PartyIdentification242Choice tradPty;
    @XmlElement(name = "NetgGrpId")
    protected String netgGrpId;

    /**
     * Gets the value of the tradPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getTradPty() {
        return tradPty;
    }

    /**
     * Sets the value of the tradPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setTradPty(PartyIdentification242Choice value) {
        this.tradPty = value;
    }

    /**
     * Gets the value of the netgGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetgGrpId() {
        return netgGrpId;
    }

    /**
     * Sets the value of the netgGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetgGrpId(String value) {
        this.netgGrpId = value;
    }

}
