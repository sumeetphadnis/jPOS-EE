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

package org.jpos.iso20022.auth_027_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyControlStatusAdviceV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyControlStatusAdviceV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}CurrencyControlHeader6"/>
 *         <element name="GrpSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}CurrencyControlGroupStatus2" maxOccurs="unbounded"/>
 *         <element name="PackgSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}CurrencyControlPackageStatus2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlStatusAdviceV03", propOrder = {
    "grpHdr",
    "grpSts",
    "packgSts",
    "splmtryData"
})
public class CurrencyControlStatusAdviceV03 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader6 grpHdr;
    @XmlElement(name = "GrpSts", required = true)
    protected List<CurrencyControlGroupStatus2> grpSts;
    @XmlElement(name = "PackgSts")
    protected List<CurrencyControlPackageStatus2> packgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader6 }
     *     
     */
    public CurrencyControlHeader6 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader6 }
     *     
     */
    public void setGrpHdr(CurrencyControlHeader6 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the grpSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grpSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrpSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyControlGroupStatus2 }
     * 
     * 
     * @return
     *     The value of the grpSts property.
     */
    public List<CurrencyControlGroupStatus2> getGrpSts() {
        if (grpSts == null) {
            grpSts = new ArrayList<>();
        }
        return this.grpSts;
    }

    /**
     * Gets the value of the packgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyControlPackageStatus2 }
     * 
     * 
     * @return
     *     The value of the packgSts property.
     */
    public List<CurrencyControlPackageStatus2> getPackgSts() {
        if (packgSts == null) {
            packgSts = new ArrayList<>();
        }
        return this.packgSts;
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
