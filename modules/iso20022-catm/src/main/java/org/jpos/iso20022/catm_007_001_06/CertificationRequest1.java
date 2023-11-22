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

package org.jpos.iso20022.catm_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificationRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CertificationRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertReqInf" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}CertificationRequest2"/>
 *         <element name="KeyId" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max140Text" minOccurs="0"/>
 *         <element name="KeyVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationRequest1", propOrder = {
    "certReqInf",
    "keyId",
    "keyVrsn"
})
public class CertificationRequest1 {

    @XmlElement(name = "CertReqInf", required = true)
    protected CertificationRequest2 certReqInf;
    @XmlElement(name = "KeyId")
    protected String keyId;
    @XmlElement(name = "KeyVrsn")
    protected String keyVrsn;

    /**
     * Gets the value of the certReqInf property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationRequest2 }
     *     
     */
    public CertificationRequest2 getCertReqInf() {
        return certReqInf;
    }

    /**
     * Sets the value of the certReqInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationRequest2 }
     *     
     */
    public void setCertReqInf(CertificationRequest2 value) {
        this.certReqInf = value;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the keyVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVrsn() {
        return keyVrsn;
    }

    /**
     * Sets the value of the keyVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyVrsn(String value) {
        this.keyVrsn = value;
    }

}
