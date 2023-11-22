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

package org.jpos.iso20022.sese_035_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationType33Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClassificationType33Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ClssfctnFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}CFIOct2015Identifier"/>
 *         <element name="AltrnClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}GenericIdentification86"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType33Choice", propOrder = {
    "clssfctnFinInstrm",
    "altrnClssfctn"
})
public class ClassificationType33Choice {

    @XmlElement(name = "ClssfctnFinInstrm")
    protected String clssfctnFinInstrm;
    @XmlElement(name = "AltrnClssfctn")
    protected GenericIdentification86 altrnClssfctn;

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnFinInstrm(String value) {
        this.clssfctnFinInstrm = value;
    }

    /**
     * Gets the value of the altrnClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification86 }
     *     
     */
    public GenericIdentification86 getAltrnClssfctn() {
        return altrnClssfctn;
    }

    /**
     * Sets the value of the altrnClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification86 }
     *     
     */
    public void setAltrnClssfctn(GenericIdentification86 value) {
        this.altrnClssfctn = value;
    }

}
