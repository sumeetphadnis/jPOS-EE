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
 * <p>Java class for TimeToMaturityPeriod1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TimeToMaturityPeriod1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Start" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}MaturityTerm2" minOccurs="0"/>
 *         <element name="End" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}MaturityTerm2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeToMaturityPeriod1", propOrder = {
    "start",
    "end"
})
public class TimeToMaturityPeriod1 {

    @XmlElement(name = "Start")
    protected MaturityTerm2 start;
    @XmlElement(name = "End")
    protected MaturityTerm2 end;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityTerm2 }
     *     
     */
    public MaturityTerm2 getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityTerm2 }
     *     
     */
    public void setStart(MaturityTerm2 value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityTerm2 }
     *     
     */
    public MaturityTerm2 getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityTerm2 }
     *     
     */
    public void setEnd(MaturityTerm2 value) {
        this.end = value;
    }

}
