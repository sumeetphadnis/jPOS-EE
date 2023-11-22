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

package org.jpos.iso20022.cain_014_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recipient6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Recipient6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="KeyTrnsprt" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}KeyTransport5"/>
 *         <element name="KEK" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}KEK5"/>
 *         <element name="KeyIdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}KEKIdentifier2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient6Choice", propOrder = {
    "keyTrnsprt",
    "kek",
    "keyIdr"
})
public class Recipient6Choice {

    @XmlElement(name = "KeyTrnsprt")
    protected KeyTransport5 keyTrnsprt;
    @XmlElement(name = "KEK")
    protected KEK5 kek;
    @XmlElement(name = "KeyIdr")
    protected KEKIdentifier2 keyIdr;

    /**
     * Gets the value of the keyTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTransport5 }
     *     
     */
    public KeyTransport5 getKeyTrnsprt() {
        return keyTrnsprt;
    }

    /**
     * Sets the value of the keyTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTransport5 }
     *     
     */
    public void setKeyTrnsprt(KeyTransport5 value) {
        this.keyTrnsprt = value;
    }

    /**
     * Gets the value of the kek property.
     * 
     * @return
     *     possible object is
     *     {@link KEK5 }
     *     
     */
    public KEK5 getKEK() {
        return kek;
    }

    /**
     * Sets the value of the kek property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEK5 }
     *     
     */
    public void setKEK(KEK5 value) {
        this.kek = value;
    }

    /**
     * Gets the value of the keyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public KEKIdentifier2 getKeyIdr() {
        return keyIdr;
    }

    /**
     * Sets the value of the keyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public void setKeyIdr(KEKIdentifier2 value) {
        this.keyIdr = value;
    }

}
