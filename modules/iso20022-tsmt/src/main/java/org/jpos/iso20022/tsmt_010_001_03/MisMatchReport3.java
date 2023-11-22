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

package org.jpos.iso20022.tsmt_010_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MisMatchReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MisMatchReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfMisMtchs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.010.001.03}Number"/>
 *         <element name="MisMtchInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.010.001.03}ValidationResult5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MisMatchReport3", propOrder = {
    "nbOfMisMtchs",
    "misMtchInf"
})
public class MisMatchReport3 {

    @XmlElement(name = "NbOfMisMtchs", required = true)
    protected BigDecimal nbOfMisMtchs;
    @XmlElement(name = "MisMtchInf")
    protected List<ValidationResult5> misMtchInf;

    /**
     * Gets the value of the nbOfMisMtchs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMisMtchs() {
        return nbOfMisMtchs;
    }

    /**
     * Sets the value of the nbOfMisMtchs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfMisMtchs(BigDecimal value) {
        this.nbOfMisMtchs = value;
    }

    /**
     * Gets the value of the misMtchInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the misMtchInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisMtchInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResult5 }
     * 
     * 
     * @return
     *     The value of the misMtchInf property.
     */
    public List<ValidationResult5> getMisMtchInf() {
        if (misMtchInf == null) {
            misMtchInf = new ArrayList<>();
        }
        return this.misMtchInf;
    }

}
