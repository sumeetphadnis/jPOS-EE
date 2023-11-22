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

package org.jpos.iso20022.caam_009_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMEquipment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMEquipment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Manfctr" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Mdl" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ApplPrvdr" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ApplNm" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ApplVrsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ApprvlNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CfgtnParam" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMConfigurationParameter1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEquipment1", propOrder = {
    "manfctr",
    "mdl",
    "srlNb",
    "applPrvdr",
    "applNm",
    "applVrsn",
    "apprvlNb",
    "cfgtnParam"
})
public class ATMEquipment1 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "ApplPrvdr")
    protected String applPrvdr;
    @XmlElement(name = "ApplNm")
    protected String applNm;
    @XmlElement(name = "ApplVrsn")
    protected String applVrsn;
    @XmlElement(name = "ApprvlNb")
    protected String apprvlNb;
    @XmlElement(name = "CfgtnParam")
    protected List<ATMConfigurationParameter1> cfgtnParam;

    /**
     * Gets the value of the manfctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctr() {
        return manfctr;
    }

    /**
     * Sets the value of the manfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctr(String value) {
        this.manfctr = value;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdl(String value) {
        this.mdl = value;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

    /**
     * Gets the value of the applPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplPrvdr() {
        return applPrvdr;
    }

    /**
     * Sets the value of the applPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplPrvdr(String value) {
        this.applPrvdr = value;
    }

    /**
     * Gets the value of the applNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplNm() {
        return applNm;
    }

    /**
     * Sets the value of the applNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplNm(String value) {
        this.applNm = value;
    }

    /**
     * Gets the value of the applVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplVrsn() {
        return applVrsn;
    }

    /**
     * Sets the value of the applVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplVrsn(String value) {
        this.applVrsn = value;
    }

    /**
     * Gets the value of the apprvlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlNb() {
        return apprvlNb;
    }

    /**
     * Sets the value of the apprvlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprvlNb(String value) {
        this.apprvlNb = value;
    }

    /**
     * Gets the value of the cfgtnParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cfgtnParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfgtnParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMConfigurationParameter1 }
     * 
     * 
     * @return
     *     The value of the cfgtnParam property.
     */
    public List<ATMConfigurationParameter1> getCfgtnParam() {
        if (cfgtnParam == null) {
            cfgtnParam = new ArrayList<>();
        }
        return this.cfgtnParam;
    }

}
