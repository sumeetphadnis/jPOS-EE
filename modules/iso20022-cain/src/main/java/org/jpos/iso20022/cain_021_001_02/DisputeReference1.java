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

package org.jpos.iso20022.cain_021_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeReference1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisputeReference1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssgnrNtty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}PartyType32Code" minOccurs="0"/>
 *         <element name="OthrAssgnrNtty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max35Text" minOccurs="0"/>
 *         <element name="DsptId" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}DisputeIdentification1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeReference1", propOrder = {
    "assgnrNtty",
    "othrAssgnrNtty",
    "dsptId"
})
public class DisputeReference1 {

    @XmlElement(name = "AssgnrNtty")
    @XmlSchemaType(name = "string")
    protected PartyType32Code assgnrNtty;
    @XmlElement(name = "OthrAssgnrNtty")
    protected String othrAssgnrNtty;
    @XmlElement(name = "DsptId", required = true)
    protected List<DisputeIdentification1> dsptId;

    /**
     * Gets the value of the assgnrNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType32Code }
     *     
     */
    public PartyType32Code getAssgnrNtty() {
        return assgnrNtty;
    }

    /**
     * Sets the value of the assgnrNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType32Code }
     *     
     */
    public void setAssgnrNtty(PartyType32Code value) {
        this.assgnrNtty = value;
    }

    /**
     * Gets the value of the othrAssgnrNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAssgnrNtty() {
        return othrAssgnrNtty;
    }

    /**
     * Sets the value of the othrAssgnrNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAssgnrNtty(String value) {
        this.othrAssgnrNtty = value;
    }

    /**
     * Gets the value of the dsptId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeIdentification1 }
     * 
     * 
     * @return
     *     The value of the dsptId property.
     */
    public List<DisputeIdentification1> getDsptId() {
        if (dsptId == null) {
            dsptId = new ArrayList<>();
        }
        return this.dsptId;
    }

}
