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

package org.jpos.iso20022.casp_007_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteractionComponentCharacteristics9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteractionComponentCharacteristics9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mmry" type="{urn:iso:std:iso:20022:tech:xsd:casp.007.001.05}MemoryCharacteristics1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Com" type="{urn:iso:std:iso:20022:tech:xsd:casp.007.001.05}CommunicationCharacteristics5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctyAccsMdls" type="{urn:iso:std:iso:20022:tech:xsd:casp.007.001.05}Number" minOccurs="0"/>
 *         <element name="SbcbrIdntyMdls" type="{urn:iso:std:iso:20022:tech:xsd:casp.007.001.05}Number" minOccurs="0"/>
 *         <element name="SctyElmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.007.001.05}CryptographicKey17" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentCharacteristics9", propOrder = {
    "mmry",
    "com",
    "sctyAccsMdls",
    "sbcbrIdntyMdls",
    "sctyElmt"
})
public class PointOfInteractionComponentCharacteristics9 {

    @XmlElement(name = "Mmry")
    protected List<MemoryCharacteristics1> mmry;
    @XmlElement(name = "Com")
    protected List<CommunicationCharacteristics5> com;
    @XmlElement(name = "SctyAccsMdls")
    protected BigDecimal sctyAccsMdls;
    @XmlElement(name = "SbcbrIdntyMdls")
    protected BigDecimal sbcbrIdntyMdls;
    @XmlElement(name = "SctyElmt")
    protected List<CryptographicKey17> sctyElmt;

    /**
     * Gets the value of the mmry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mmry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemoryCharacteristics1 }
     * 
     * 
     * @return
     *     The value of the mmry property.
     */
    public List<MemoryCharacteristics1> getMmry() {
        if (mmry == null) {
            mmry = new ArrayList<>();
        }
        return this.mmry;
    }

    /**
     * Gets the value of the com property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the com property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationCharacteristics5 }
     * 
     * 
     * @return
     *     The value of the com property.
     */
    public List<CommunicationCharacteristics5> getCom() {
        if (com == null) {
            com = new ArrayList<>();
        }
        return this.com;
    }

    /**
     * Gets the value of the sctyAccsMdls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSctyAccsMdls() {
        return sctyAccsMdls;
    }

    /**
     * Sets the value of the sctyAccsMdls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSctyAccsMdls(BigDecimal value) {
        this.sctyAccsMdls = value;
    }

    /**
     * Gets the value of the sbcbrIdntyMdls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbcbrIdntyMdls() {
        return sbcbrIdntyMdls;
    }

    /**
     * Sets the value of the sbcbrIdntyMdls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSbcbrIdntyMdls(BigDecimal value) {
        this.sbcbrIdntyMdls = value;
    }

    /**
     * Gets the value of the sctyElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey17 }
     * 
     * 
     * @return
     *     The value of the sctyElmt property.
     */
    public List<CryptographicKey17> getSctyElmt() {
        if (sctyElmt == null) {
            sctyElmt = new ArrayList<>();
        }
        return this.sctyElmt;
    }

}
