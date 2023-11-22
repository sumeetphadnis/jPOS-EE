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

package org.jpos.iso20022.camt_040_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashInForecast6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashInForecast6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshSttlmDt" type="{urn:swift:xsd:camt.040.001.04}ISODate"/>
 *         <element name="SubTtlAmt" type="{urn:swift:xsd:camt.040.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SubTtlUnitsNb" type="{urn:swift:xsd:camt.040.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="XcptnlCshFlowInd" type="{urn:swift:xsd:camt.040.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlBal" type="{urn:swift:xsd:camt.040.001.04}FundBalance1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashInForecast6", propOrder = {
    "cshSttlmDt",
    "subTtlAmt",
    "subTtlUnitsNb",
    "xcptnlCshFlowInd",
    "addtlBal"
})
public class CashInForecast6 {

    @XmlElement(name = "CshSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "SubTtlAmt")
    protected ActiveOrHistoricCurrencyAndAmount subTtlAmt;
    @XmlElement(name = "SubTtlUnitsNb")
    protected FinancialInstrumentQuantity1 subTtlUnitsNb;
    @XmlElement(name = "XcptnlCshFlowInd")
    protected Boolean xcptnlCshFlowInd;
    @XmlElement(name = "AddtlBal")
    protected FundBalance1 addtlBal;

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
    }

    /**
     * Gets the value of the subTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getSubTtlAmt() {
        return subTtlAmt;
    }

    /**
     * Sets the value of the subTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setSubTtlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.subTtlAmt = value;
    }

    /**
     * Gets the value of the subTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getSubTtlUnitsNb() {
        return subTtlUnitsNb;
    }

    /**
     * Sets the value of the subTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setSubTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.subTtlUnitsNb = value;
    }

    /**
     * Gets the value of the xcptnlCshFlowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXcptnlCshFlowInd() {
        return xcptnlCshFlowInd;
    }

    /**
     * Sets the value of the xcptnlCshFlowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXcptnlCshFlowInd(Boolean value) {
        this.xcptnlCshFlowInd = value;
    }

    /**
     * Gets the value of the addtlBal property.
     * 
     * @return
     *     possible object is
     *     {@link FundBalance1 }
     *     
     */
    public FundBalance1 getAddtlBal() {
        return addtlBal;
    }

    /**
     * Sets the value of the addtlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundBalance1 }
     *     
     */
    public void setAddtlBal(FundBalance1 value) {
        this.addtlBal = value;
    }

}
