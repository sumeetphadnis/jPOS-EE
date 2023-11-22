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

package org.jpos.iso20022.acmt_018_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAndAuthorisation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyAndAuthorisation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Modification1Code" minOccurs="0"/>
 *         <element name="PtyOrGrp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}PartyOrGroup2Choice"/>
 *         <element name="SgntrOrdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Max15PlusSignedNumericText" minOccurs="0"/>
 *         <element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Authorisation2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAndAuthorisation5", propOrder = {
    "modCd",
    "ptyOrGrp",
    "sgntrOrdr",
    "authstn"
})
public class PartyAndAuthorisation5 {

    @XmlElement(name = "ModCd")
    @XmlSchemaType(name = "string")
    protected Modification1Code modCd;
    @XmlElement(name = "PtyOrGrp", required = true)
    protected PartyOrGroup2Choice ptyOrGrp;
    @XmlElement(name = "SgntrOrdr")
    protected String sgntrOrdr;
    @XmlElement(name = "Authstn", required = true)
    protected Authorisation2 authstn;

    /**
     * Gets the value of the modCd property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getModCd() {
        return modCd;
    }

    /**
     * Sets the value of the modCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public void setModCd(Modification1Code value) {
        this.modCd = value;
    }

    /**
     * Gets the value of the ptyOrGrp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrGroup2Choice }
     *     
     */
    public PartyOrGroup2Choice getPtyOrGrp() {
        return ptyOrGrp;
    }

    /**
     * Sets the value of the ptyOrGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrGroup2Choice }
     *     
     */
    public void setPtyOrGrp(PartyOrGroup2Choice value) {
        this.ptyOrGrp = value;
    }

    /**
     * Gets the value of the sgntrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgntrOrdr() {
        return sgntrOrdr;
    }

    /**
     * Sets the value of the sgntrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgntrOrdr(String value) {
        this.sgntrOrdr = value;
    }

    /**
     * Gets the value of the authstn property.
     * 
     * @return
     *     possible object is
     *     {@link Authorisation2 }
     *     
     */
    public Authorisation2 getAuthstn() {
        return authstn;
    }

    /**
     * Sets the value of the authstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorisation2 }
     *     
     */
    public void setAuthstn(Authorisation2 value) {
        this.authstn = value;
    }

}
