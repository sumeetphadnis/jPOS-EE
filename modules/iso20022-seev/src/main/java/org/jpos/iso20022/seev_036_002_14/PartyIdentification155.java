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

package org.jpos.iso20022.seev_036_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification155 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification155">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentification145Choice"/>
 *         <element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}AlternatePartyIdentification9" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification155", propOrder = {
    "id",
    "prcgId",
    "altrnId"
})
public class PartyIdentification155 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification145Choice id;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AltrnId")
    protected List<AlternatePartyIdentification9> altrnId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification145Choice }
     *     
     */
    public PartyIdentification145Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification145Choice }
     *     
     */
    public void setId(PartyIdentification145Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the prcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgId() {
        return prcgId;
    }

    /**
     * Sets the value of the prcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcgId(String value) {
        this.prcgId = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternatePartyIdentification9 }
     * 
     * 
     * @return
     *     The value of the altrnId property.
     */
    public List<AlternatePartyIdentification9> getAltrnId() {
        if (altrnId == null) {
            altrnId = new ArrayList<>();
        }
        return this.altrnId;
    }

}
