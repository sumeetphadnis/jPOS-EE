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

package org.jpos.iso20022.cain_025_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sale2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Sale2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Summry" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}SaleSummary1" minOccurs="0"/>
 *         <element name="LineItm" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}SaleItem3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sale2", propOrder = {
    "summry",
    "lineItm"
})
public class Sale2 {

    @XmlElement(name = "Summry")
    protected SaleSummary1 summry;
    @XmlElement(name = "LineItm")
    protected List<SaleItem3> lineItm;

    /**
     * Gets the value of the summry property.
     * 
     * @return
     *     possible object is
     *     {@link SaleSummary1 }
     *     
     */
    public SaleSummary1 getSummry() {
        return summry;
    }

    /**
     * Sets the value of the summry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleSummary1 }
     *     
     */
    public void setSummry(SaleSummary1 value) {
        this.summry = value;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleItem3 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<SaleItem3> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<>();
        }
        return this.lineItm;
    }

}
