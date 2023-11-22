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

package org.jpos.iso20022.auth_090_001_02;

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
 *         <element name="DerivsTradPosSetRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}DerivativesTradePositionSetReportV02"/>
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
    "derivsTradPosSetRpt"
})
public class Document {

    @XmlElement(name = "DerivsTradPosSetRpt", required = true)
    protected DerivativesTradePositionSetReportV02 derivsTradPosSetRpt;

    /**
     * Gets the value of the derivsTradPosSetRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradePositionSetReportV02 }
     *     
     */
    public DerivativesTradePositionSetReportV02 getDerivsTradPosSetRpt() {
        return derivsTradPosSetRpt;
    }

    /**
     * Sets the value of the derivsTradPosSetRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradePositionSetReportV02 }
     *     
     */
    public void setDerivsTradPosSetRpt(DerivativesTradePositionSetReportV02 value) {
        this.derivsTradPosSetRpt = value;
    }

}
