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

package org.jpos.iso20022.auth_031_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalReportStatistics3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalReportStatistics3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlNbOfRcrds" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}Max15NumericText"/>
 *         <element name="NbOfRcrdsPerSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}NumberOfRecordsPerStatus1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalReportStatistics3", propOrder = {
    "ttlNbOfRcrds",
    "nbOfRcrdsPerSts"
})
public class OriginalReportStatistics3 {

    @XmlElement(name = "TtlNbOfRcrds", required = true)
    protected String ttlNbOfRcrds;
    @XmlElement(name = "NbOfRcrdsPerSts", required = true)
    protected List<NumberOfRecordsPerStatus1> nbOfRcrdsPerSts;

    /**
     * Gets the value of the ttlNbOfRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRcrds() {
        return ttlNbOfRcrds;
    }

    /**
     * Sets the value of the ttlNbOfRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfRcrds(String value) {
        this.ttlNbOfRcrds = value;
    }

    /**
     * Gets the value of the nbOfRcrdsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nbOfRcrdsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfRcrdsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfRecordsPerStatus1 }
     * 
     * 
     * @return
     *     The value of the nbOfRcrdsPerSts property.
     */
    public List<NumberOfRecordsPerStatus1> getNbOfRcrdsPerSts() {
        if (nbOfRcrdsPerSts == null) {
            nbOfRcrdsPerSts = new ArrayList<>();
        }
        return this.nbOfRcrdsPerSts;
    }

}
