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

package org.jpos.iso20022.tsrv_006_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Undertaking11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Undertaking11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NewUdrtkgAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}UndertakingAmount2" minOccurs="0"/>
 *         <element name="NewXpryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}ExpiryDetails1" minOccurs="0"/>
 *         <element name="NewBnfcry" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="NewUdrtkgTermsAndConds" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}Narrative1" minOccurs="0"/>
 *         <element name="DlvryChanl" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}CommunicationChannel1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking11", propOrder = {
    "newUdrtkgAmt",
    "newXpryDtls",
    "newBnfcry",
    "newUdrtkgTermsAndConds",
    "dlvryChanl"
})
public class Undertaking11 {

    @XmlElement(name = "NewUdrtkgAmt")
    protected UndertakingAmount2 newUdrtkgAmt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails1 newXpryDtls;
    @XmlElement(name = "NewBnfcry")
    protected PartyIdentification43 newBnfcry;
    @XmlElement(name = "NewUdrtkgTermsAndConds")
    protected Narrative1 newUdrtkgTermsAndConds;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;

    /**
     * Gets the value of the newUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getNewUdrtkgAmt() {
        return newUdrtkgAmt;
    }

    /**
     * Sets the value of the newUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public void setNewUdrtkgAmt(UndertakingAmount2 value) {
        this.newUdrtkgAmt = value;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public void setNewXpryDtls(ExpiryDetails1 value) {
        this.newXpryDtls = value;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setNewBnfcry(PartyIdentification43 value) {
        this.newBnfcry = value;
    }

    /**
     * Gets the value of the newUdrtkgTermsAndConds property.
     * 
     * @return
     *     possible object is
     *     {@link Narrative1 }
     *     
     */
    public Narrative1 getNewUdrtkgTermsAndConds() {
        return newUdrtkgTermsAndConds;
    }

    /**
     * Sets the value of the newUdrtkgTermsAndConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Narrative1 }
     *     
     */
    public void setNewUdrtkgTermsAndConds(Narrative1 value) {
        this.newUdrtkgTermsAndConds = value;
    }

    /**
     * Gets the value of the dlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public CommunicationChannel1 getDlvryChanl() {
        return dlvryChanl;
    }

    /**
     * Sets the value of the dlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public void setDlvryChanl(CommunicationChannel1 value) {
        this.dlvryChanl = value;
    }

}
