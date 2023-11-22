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

package org.jpos.iso20022.tsmt_055_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxParty3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxParty3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TaxTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RegnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TaxXmptnRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}TaxExemptionReasonFormatChoice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxParty3", propOrder = {
    "taxId",
    "taxTp",
    "regnId",
    "taxXmptnRsn"
})
public class TaxParty3 {

    @XmlElement(name = "TaxId")
    protected String taxId;
    @XmlElement(name = "TaxTp")
    protected String taxTp;
    @XmlElement(name = "RegnId")
    protected String regnId;
    @XmlElement(name = "TaxXmptnRsn")
    protected List<TaxExemptionReasonFormatChoice> taxXmptnRsn;

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTp(String value) {
        this.taxTp = value;
    }

    /**
     * Gets the value of the regnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnId() {
        return regnId;
    }

    /**
     * Sets the value of the regnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnId(String value) {
        this.regnId = value;
    }

    /**
     * Gets the value of the taxXmptnRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxXmptnRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxXmptnRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionReasonFormatChoice }
     * 
     * 
     * @return
     *     The value of the taxXmptnRsn property.
     */
    public List<TaxExemptionReasonFormatChoice> getTaxXmptnRsn() {
        if (taxXmptnRsn == null) {
            taxXmptnRsn = new ArrayList<>();
        }
        return this.taxXmptnRsn;
    }

}
