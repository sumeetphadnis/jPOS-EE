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

package org.jpos.iso20022.sese_037_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceType4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceType4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Mkt" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}Price7"/>
 *         <element name="Indctv" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}Price7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType4Choice", propOrder = {
    "mkt",
    "indctv"
})
public class PriceType4Choice {

    @XmlElement(name = "Mkt")
    protected Price7 mkt;
    @XmlElement(name = "Indctv")
    protected Price7 indctv;

    /**
     * Gets the value of the mkt property.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getMkt() {
        return mkt;
    }

    /**
     * Sets the value of the mkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setMkt(Price7 value) {
        this.mkt = value;
    }

    /**
     * Gets the value of the indctv property.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getIndctv() {
        return indctv;
    }

    /**
     * Sets the value of the indctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setIndctv(Price7 value) {
        this.indctv = value;
    }

}
