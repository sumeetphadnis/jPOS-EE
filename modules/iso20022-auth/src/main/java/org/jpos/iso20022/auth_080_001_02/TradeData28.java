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

package org.jpos.iso20022.auth_080_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeData28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeData28">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PairgRcncltnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}NumberOfReportsPerStatus4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RcncltnRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ReconciliationReport8" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData28", propOrder = {
    "pairgRcncltnSts",
    "rcncltnRpt",
    "splmtryData"
})
public class TradeData28 {

    @XmlElement(name = "PairgRcncltnSts")
    protected List<NumberOfReportsPerStatus4> pairgRcncltnSts;
    @XmlElement(name = "RcncltnRpt", required = true)
    protected List<ReconciliationReport8> rcncltnRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pairgRcncltnSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pairgRcncltnSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairgRcncltnSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfReportsPerStatus4 }
     * 
     * 
     * @return
     *     The value of the pairgRcncltnSts property.
     */
    public List<NumberOfReportsPerStatus4> getPairgRcncltnSts() {
        if (pairgRcncltnSts == null) {
            pairgRcncltnSts = new ArrayList<>();
        }
        return this.pairgRcncltnSts;
    }

    /**
     * Gets the value of the rcncltnRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcncltnRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcncltnRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationReport8 }
     * 
     * 
     * @return
     *     The value of the rcncltnRpt property.
     */
    public List<ReconciliationReport8> getRcncltnRpt() {
        if (rcncltnRpt == null) {
            rcncltnRpt = new ArrayList<>();
        }
        return this.rcncltnRpt;
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
