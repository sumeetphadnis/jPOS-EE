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

package org.jpos.iso20022.reda_012_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalAddress1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PostalAddress1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}AddressType2Code" minOccurs="0"/>
 *         <element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max70Text" maxOccurs="5" minOccurs="0"/>
 *         <element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max70Text" minOccurs="0"/>
 *         <element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max16Text" minOccurs="0"/>
 *         <element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max16Text" minOccurs="0"/>
 *         <element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}CountryCode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress1", propOrder = {
    "adrTp",
    "adrLine",
    "strtNm",
    "bldgNb",
    "pstCd",
    "twnNm",
    "ctrySubDvsn",
    "ctry"
})
public class PostalAddress1 {

    @XmlElement(name = "AdrTp")
    @XmlSchemaType(name = "string")
    protected AddressType2Code adrTp;
    @XmlElement(name = "AdrLine")
    protected List<String> adrLine;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "PstCd")
    protected String pstCd;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsn")
    protected String ctrySubDvsn;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Code }
     *     
     */
    public AddressType2Code getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Code }
     *     
     */
    public void setAdrTp(AddressType2Code value) {
        this.adrTp = value;
    }

    /**
     * Gets the value of the adrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the adrLine property.
     */
    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<>();
        }
        return this.adrLine;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Sets the value of the ctrySubDvsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

}
