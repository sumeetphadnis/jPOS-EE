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

package org.jpos.iso20022.semt_002_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubBalanceInformation20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubBalanceInformation20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}SubBalanceType11Choice"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Balance21"/>
 *         <element name="SubBalAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Max140Text" minOccurs="0"/>
 *         <element name="QtyBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}QuantityBreakdown57" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlBalBrkdwnDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}AdditionalBalanceInformation20" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceInformation20", propOrder = {
    "subBalTp",
    "qty",
    "subBalAddtlDtls",
    "qtyBrkdwn",
    "addtlBalBrkdwnDtls"
})
public class SubBalanceInformation20 {

    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType11Choice subBalTp;
    @XmlElement(name = "Qty", required = true)
    protected Balance21 qty;
    @XmlElement(name = "SubBalAddtlDtls")
    protected String subBalAddtlDtls;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown57> qtyBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwnDtls")
    protected List<AdditionalBalanceInformation20> addtlBalBrkdwnDtls;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType11Choice }
     *     
     */
    public SubBalanceType11Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType11Choice }
     *     
     */
    public void setSubBalTp(SubBalanceType11Choice value) {
        this.subBalTp = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Balance21 }
     *     
     */
    public Balance21 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance21 }
     *     
     */
    public void setQty(Balance21 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the subBalAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBalAddtlDtls() {
        return subBalAddtlDtls;
    }

    /**
     * Sets the value of the subBalAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBalAddtlDtls(String value) {
        this.subBalAddtlDtls = value;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown57 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown57> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation20 }
     * 
     * 
     * @return
     *     The value of the addtlBalBrkdwnDtls property.
     */
    public List<AdditionalBalanceInformation20> getAddtlBalBrkdwnDtls() {
        if (addtlBalBrkdwnDtls == null) {
            addtlBalBrkdwnDtls = new ArrayList<>();
        }
        return this.addtlBalBrkdwnDtls;
    }

}
