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

package org.jpos.iso20022.sese_026_002_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalParameters32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalParameters32">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PreConf" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PreConfirmation1Code" minOccurs="0"/>
 *         <element name="PrtlSttlm" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartialSettlement2Code" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="ClntTrptyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}RestrictedFINXMax16Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalParameters32", propOrder = {
    "preConf",
    "prtlSttlm",
    "trptyAgtSvcPrvdrCollTxId",
    "clntTrptyCollTxId"
})
public class AdditionalParameters32 {

    @XmlElement(name = "PreConf")
    @XmlSchemaType(name = "string")
    protected PreConfirmation1Code preConf;
    @XmlElement(name = "PrtlSttlm")
    @XmlSchemaType(name = "string")
    protected PartialSettlement2Code prtlSttlm;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;

    /**
     * Gets the value of the preConf property.
     * 
     * @return
     *     possible object is
     *     {@link PreConfirmation1Code }
     *     
     */
    public PreConfirmation1Code getPreConf() {
        return preConf;
    }

    /**
     * Sets the value of the preConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreConfirmation1Code }
     *     
     */
    public void setPreConf(PreConfirmation1Code value) {
        this.preConf = value;
    }

    /**
     * Gets the value of the prtlSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public PartialSettlement2Code getPrtlSttlm() {
        return prtlSttlm;
    }

    /**
     * Sets the value of the prtlSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public void setPrtlSttlm(PartialSettlement2Code value) {
        this.prtlSttlm = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
    }

    /**
     * Gets the value of the clntTrptyCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntTrptyCollTxId() {
        return clntTrptyCollTxId;
    }

    /**
     * Sets the value of the clntTrptyCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
    }

}
