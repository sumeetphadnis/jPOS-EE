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

package org.jpos.iso20022.tsrv_003_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountAndTrigger1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountAndTrigger1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Max35Text"/>
 *         <element name="AmtDtlsChc" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}AmountOrPercentage1Choice"/>
 *         <element name="Trggr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Trigger1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndTrigger1", propOrder = {
    "id",
    "amtDtlsChc",
    "trggr"
})
public class AmountAndTrigger1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AmtDtlsChc", required = true)
    protected AmountOrPercentage1Choice amtDtlsChc;
    @XmlElement(name = "Trggr", required = true)
    protected List<Trigger1> trggr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the amtDtlsChc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage1Choice }
     *     
     */
    public AmountOrPercentage1Choice getAmtDtlsChc() {
        return amtDtlsChc;
    }

    /**
     * Sets the value of the amtDtlsChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage1Choice }
     *     
     */
    public void setAmtDtlsChc(AmountOrPercentage1Choice value) {
        this.amtDtlsChc = value;
    }

    /**
     * Gets the value of the trggr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trggr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrggr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trigger1 }
     * 
     * 
     * @return
     *     The value of the trggr property.
     */
    public List<Trigger1> getTrggr() {
        if (trggr == null) {
            trggr = new ArrayList<>();
        }
        return this.trggr;
    }

}
