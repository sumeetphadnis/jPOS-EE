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

package org.jpos.iso20022.cain_022_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievalDeliveryMethod1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetrievalDeliveryMethod1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ReqdMtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EstblishdMtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ActlDlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}Max35Text" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalDeliveryMethod1Choice", propOrder = {
    "reqdMtd",
    "estblishdMtd",
    "actlDlvryMtd"
})
public class RetrievalDeliveryMethod1Choice {

    @XmlElement(name = "ReqdMtd")
    protected List<String> reqdMtd;
    @XmlElement(name = "EstblishdMtd")
    protected List<String> estblishdMtd;
    @XmlElement(name = "ActlDlvryMtd")
    protected String actlDlvryMtd;

    /**
     * Gets the value of the reqdMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the reqdMtd property.
     */
    public List<String> getReqdMtd() {
        if (reqdMtd == null) {
            reqdMtd = new ArrayList<>();
        }
        return this.reqdMtd;
    }

    /**
     * Gets the value of the estblishdMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estblishdMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstblishdMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the estblishdMtd property.
     */
    public List<String> getEstblishdMtd() {
        if (estblishdMtd == null) {
            estblishdMtd = new ArrayList<>();
        }
        return this.estblishdMtd;
    }

    /**
     * Gets the value of the actlDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActlDlvryMtd() {
        return actlDlvryMtd;
    }

    /**
     * Sets the value of the actlDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActlDlvryMtd(String value) {
        this.actlDlvryMtd = value;
    }

}
