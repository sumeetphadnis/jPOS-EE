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

package org.jpos.iso20022.tsmt_040_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TmOutNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.040.001.03}TimeOutNotificationV03"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tmOutNtfctn"
})
public class Document {

    @XmlElement(name = "TmOutNtfctn", required = true)
    protected TimeOutNotificationV03 tmOutNtfctn;

    /**
     * Gets the value of the tmOutNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOutNotificationV03 }
     *     
     */
    public TimeOutNotificationV03 getTmOutNtfctn() {
        return tmOutNtfctn;
    }

    /**
     * Sets the value of the tmOutNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOutNotificationV03 }
     *     
     */
    public void setTmOutNtfctn(TimeOutNotificationV03 value) {
        this.tmOutNtfctn = value;
    }

}
