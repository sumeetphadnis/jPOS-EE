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

package org.jpos.iso20022.cain_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInitiation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInitiation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Environment17"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Context10"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Transaction145"/>
 *         <element name="OrgnlTx" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}OriginalTransaction2"/>
 *         <element name="AdddmData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}AddendumData3" minOccurs="0"/>
 *         <element name="PrcgRslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ProcessingResult16" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max10KHexBinaryText" minOccurs="0"/>
 *         <element name="PrtctdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ProtectedData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInitiation2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "orgnlTx",
    "adddmData",
    "prcgRslt",
    "iccRltdData",
    "prtctdData",
    "splmtryData"
})
public class FinancialInitiation2 {

    @XmlElement(name = "Envt", required = true)
    protected Environment17 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected Context10 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction145 tx;
    @XmlElement(name = "OrgnlTx", required = true)
    protected OriginalTransaction2 orgnlTx;
    @XmlElement(name = "AdddmData")
    protected AddendumData3 adddmData;
    @XmlElement(name = "PrcgRslt")
    protected ProcessingResult16 prcgRslt;
    @XmlElement(name = "ICCRltdData")
    protected String iccRltdData;
    @XmlElement(name = "PrtctdData")
    protected List<ProtectedData1> prtctdData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment17 }
     *     
     */
    public Environment17 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment17 }
     *     
     */
    public void setEnvt(Environment17 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context10 }
     *     
     */
    public Context10 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context10 }
     *     
     */
    public void setCntxt(Context10 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction145 }
     *     
     */
    public Transaction145 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction145 }
     *     
     */
    public void setTx(Transaction145 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransaction2 }
     *     
     */
    public OriginalTransaction2 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransaction2 }
     *     
     */
    public void setOrgnlTx(OriginalTransaction2 value) {
        this.orgnlTx = value;
    }

    /**
     * Gets the value of the adddmData property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumData3 }
     *     
     */
    public AddendumData3 getAdddmData() {
        return adddmData;
    }

    /**
     * Sets the value of the adddmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumData3 }
     *     
     */
    public void setAdddmData(AddendumData3 value) {
        this.adddmData = value;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult16 }
     *     
     */
    public ProcessingResult16 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult16 }
     *     
     */
    public void setPrcgRslt(ProcessingResult16 value) {
        this.prcgRslt = value;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCRltdData(String value) {
        this.iccRltdData = value;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectedData1 }
     * 
     * 
     * @return
     *     The value of the prtctdData property.
     */
    public List<ProtectedData1> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<>();
        }
        return this.prtctdData;
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
