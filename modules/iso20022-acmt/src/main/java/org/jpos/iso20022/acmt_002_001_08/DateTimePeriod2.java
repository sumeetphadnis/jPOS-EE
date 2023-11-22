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

package org.jpos.iso20022.acmt_002_001_08;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimePeriod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateTimePeriod2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ISODateTime"/>
 *         <element name="ToDtTm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePeriod2", propOrder = {
    "frDtTm",
    "toDtTm"
})
public class DateTimePeriod2 {

    @XmlElement(name = "FrDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frDtTm;
    @XmlElement(name = "ToDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDtTm;

    /**
     * Gets the value of the frDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrDtTm() {
        return frDtTm;
    }

    /**
     * Sets the value of the frDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrDtTm(XMLGregorianCalendar value) {
        this.frDtTm = value;
    }

    /**
     * Gets the value of the toDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDtTm() {
        return toDtTm;
    }

    /**
     * Sets the value of the toDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDtTm(XMLGregorianCalendar value) {
        this.toDtTm = value;
    }

}
