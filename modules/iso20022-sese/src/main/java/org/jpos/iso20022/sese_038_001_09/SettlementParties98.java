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

package org.jpos.iso20022.sese_038_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementParties98 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementParties98">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pty2" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}PartyIdentificationAndAccount196" minOccurs="0"/>
 *         <element name="Pty3" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}PartyIdentificationAndAccount196" minOccurs="0"/>
 *         <element name="Pty4" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}PartyIdentificationAndAccount196" minOccurs="0"/>
 *         <element name="Pty5" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}PartyIdentificationAndAccount196" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties98", propOrder = {
    "pty2",
    "pty3",
    "pty4",
    "pty5"
})
public class SettlementParties98 {

    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount196 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount196 pty3;
    @XmlElement(name = "Pty4")
    protected PartyIdentificationAndAccount196 pty4;
    @XmlElement(name = "Pty5")
    protected PartyIdentificationAndAccount196 pty5;

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public PartyIdentificationAndAccount196 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public void setPty2(PartyIdentificationAndAccount196 value) {
        this.pty2 = value;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public PartyIdentificationAndAccount196 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public void setPty3(PartyIdentificationAndAccount196 value) {
        this.pty3 = value;
    }

    /**
     * Gets the value of the pty4 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public PartyIdentificationAndAccount196 getPty4() {
        return pty4;
    }

    /**
     * Sets the value of the pty4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public void setPty4(PartyIdentificationAndAccount196 value) {
        this.pty4 = value;
    }

    /**
     * Gets the value of the pty5 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public PartyIdentificationAndAccount196 getPty5() {
        return pty5;
    }

    /**
     * Sets the value of the pty5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public void setPty5(PartyIdentificationAndAccount196 value) {
        this.pty5 = value;
    }

}
