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

package org.jpos.iso20022.semt_041_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateHoldingBalance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AggregateHoldingBalance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SecurityIdentification19"/>
 *         <element name="HldgForm" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}FormOfSecurity1Code" minOccurs="0"/>
 *         <element name="HldgPhysTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PhysicalTransferType1Code" minOccurs="0"/>
 *         <element name="BalForFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}FinancialInstrumentAggregateBalance1" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateHoldingBalance1", propOrder = {
    "finInstrmId",
    "hldgForm",
    "hldgPhysTp",
    "balForFinInstrm",
    "splmtryData"
})
public class AggregateHoldingBalance1 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "HldgForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code hldgForm;
    @XmlElement(name = "HldgPhysTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType1Code hldgPhysTp;
    @XmlElement(name = "BalForFinInstrm", required = true)
    protected List<FinancialInstrumentAggregateBalance1> balForFinInstrm;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the hldgForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getHldgForm() {
        return hldgForm;
    }

    /**
     * Sets the value of the hldgForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public void setHldgForm(FormOfSecurity1Code value) {
        this.hldgForm = value;
    }

    /**
     * Gets the value of the hldgPhysTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public PhysicalTransferType1Code getHldgPhysTp() {
        return hldgPhysTp;
    }

    /**
     * Sets the value of the hldgPhysTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public void setHldgPhysTp(PhysicalTransferType1Code value) {
        this.hldgPhysTp = value;
    }

    /**
     * Gets the value of the balForFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balForFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAggregateBalance1 }
     * 
     * 
     * @return
     *     The value of the balForFinInstrm property.
     */
    public List<FinancialInstrumentAggregateBalance1> getBalForFinInstrm() {
        if (balForFinInstrm == null) {
            balForFinInstrm = new ArrayList<>();
        }
        return this.balForFinInstrm;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
