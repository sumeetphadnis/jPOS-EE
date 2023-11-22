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

package org.jpos.iso20022.auth_013_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsecuredMarketReport4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnsecuredMarketReport4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DataSetActn" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}ReportPeriodActivity3Code"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}UnsecuredMarketTransaction4" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsecuredMarketReport4Choice", propOrder = {
    "dataSetActn",
    "tx"
})
public class UnsecuredMarketReport4Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity3Code dataSetActn;
    @XmlElement(name = "Tx")
    protected List<UnsecuredMarketTransaction4> tx;

    /**
     * Gets the value of the dataSetActn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPeriodActivity3Code }
     *     
     */
    public ReportPeriodActivity3Code getDataSetActn() {
        return dataSetActn;
    }

    /**
     * Sets the value of the dataSetActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPeriodActivity3Code }
     *     
     */
    public void setDataSetActn(ReportPeriodActivity3Code value) {
        this.dataSetActn = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnsecuredMarketTransaction4 }
     * 
     * 
     * @return
     *     The value of the tx property.
     */
    public List<UnsecuredMarketTransaction4> getTx() {
        if (tx == null) {
            tx = new ArrayList<>();
        }
        return this.tx;
    }

}
