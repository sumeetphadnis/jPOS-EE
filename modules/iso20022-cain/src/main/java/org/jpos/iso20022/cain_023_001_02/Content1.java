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

package org.jpos.iso20022.cain_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Content1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Content1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max20KText"/>
 *         <element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max140Binary" minOccurs="0"/>
 *         <element name="CertId" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content1", propOrder = {
    "val",
    "sgntr",
    "certId"
})
public class Content1 {

    @XmlElement(name = "Val", required = true)
    protected String val;
    @XmlElement(name = "Sgntr")
    protected byte[] sgntr;
    @XmlElement(name = "CertId")
    protected String certId;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal(String value) {
        this.val = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSgntr(byte[] value) {
        this.sgntr = value;
    }

    /**
     * Gets the value of the certId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * Sets the value of the certId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

}
