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

package org.jpos.iso20022.auth_018_001_03;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentDateRange2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShipmentDateRange2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubQtyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}DecimalNumber"/>
 *         <element name="EarlstShipmntDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="LatstShipmntDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDateRange2", propOrder = {
    "subQtyVal",
    "earlstShipmntDt",
    "latstShipmntDt"
})
public class ShipmentDateRange2 {

    @XmlElement(name = "SubQtyVal", required = true)
    protected BigDecimal subQtyVal;
    @XmlElement(name = "EarlstShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlstShipmntDt;
    @XmlElement(name = "LatstShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latstShipmntDt;

    /**
     * Gets the value of the subQtyVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubQtyVal() {
        return subQtyVal;
    }

    /**
     * Sets the value of the subQtyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubQtyVal(BigDecimal value) {
        this.subQtyVal = value;
    }

    /**
     * Gets the value of the earlstShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlstShipmntDt() {
        return earlstShipmntDt;
    }

    /**
     * Sets the value of the earlstShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarlstShipmntDt(XMLGregorianCalendar value) {
        this.earlstShipmntDt = value;
    }

    /**
     * Gets the value of the latstShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatstShipmntDt() {
        return latstShipmntDt;
    }

    /**
     * Sets the value of the latstShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatstShipmntDt(XMLGregorianCalendar value) {
        this.latstShipmntDt = value;
    }

}
