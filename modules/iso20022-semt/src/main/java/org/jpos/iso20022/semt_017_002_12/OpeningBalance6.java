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

package org.jpos.iso20022.semt_017_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpeningBalance6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OpeningBalance6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ShrtLngInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}ShortLong1Code"/>
 *         <element name="OpngBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}OpeningBalance7Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningBalance6", propOrder = {
    "shrtLngInd",
    "opngBal"
})
public class OpeningBalance6 {

    @XmlElement(name = "ShrtLngInd", required = true)
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngInd;
    @XmlElement(name = "OpngBal", required = true)
    protected OpeningBalance7Choice opngBal;

    /**
     * Gets the value of the shrtLngInd property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getShrtLngInd() {
        return shrtLngInd;
    }

    /**
     * Sets the value of the shrtLngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public void setShrtLngInd(ShortLong1Code value) {
        this.shrtLngInd = value;
    }

    /**
     * Gets the value of the opngBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningBalance7Choice }
     *     
     */
    public OpeningBalance7Choice getOpngBal() {
        return opngBal;
    }

    /**
     * Sets the value of the opngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningBalance7Choice }
     *     
     */
    public void setOpngBal(OpeningBalance7Choice value) {
        this.opngBal = value;
    }

}
