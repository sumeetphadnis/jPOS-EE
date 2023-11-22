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

package org.jpos.iso20022.auth_040_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentReportingEquityTradingActivityReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentReportingEquityTradingActivityReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptHdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}SecuritiesMarketReportHeader1"/>
 *         <element name="EqtyTrnsprncyData" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}TransparencyDataReport13" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentReportingEquityTradingActivityReportV01", propOrder = {
    "rptHdr",
    "eqtyTrnsprncyData",
    "splmtryData"
})
public class FinancialInstrumentReportingEquityTradingActivityReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SecuritiesMarketReportHeader1 rptHdr;
    @XmlElement(name = "EqtyTrnsprncyData", required = true)
    protected List<TransparencyDataReport13> eqtyTrnsprncyData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMarketReportHeader1 }
     *     
     */
    public SecuritiesMarketReportHeader1 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMarketReportHeader1 }
     *     
     */
    public void setRptHdr(SecuritiesMarketReportHeader1 value) {
        this.rptHdr = value;
    }

    /**
     * Gets the value of the eqtyTrnsprncyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the eqtyTrnsprncyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqtyTrnsprncyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransparencyDataReport13 }
     * 
     * 
     * @return
     *     The value of the eqtyTrnsprncyData property.
     */
    public List<TransparencyDataReport13> getEqtyTrnsprncyData() {
        if (eqtyTrnsprncyData == null) {
            eqtyTrnsprncyData = new ArrayList<>();
        }
        return this.eqtyTrnsprncyData;
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
