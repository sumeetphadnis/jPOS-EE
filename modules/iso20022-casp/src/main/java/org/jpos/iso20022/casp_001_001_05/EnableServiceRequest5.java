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

package org.jpos.iso20022.casp_001_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnableServiceRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EnableServiceRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxActn" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TransactionAction1Code"/>
 *         <element name="SvcsNbld" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}RetailerService2Code" minOccurs="0"/>
 *         <element name="DispOutpt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ActionMessage10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnableServiceRequest5", propOrder = {
    "txActn",
    "svcsNbld",
    "dispOutpt"
})
public class EnableServiceRequest5 {

    @XmlElement(name = "TxActn", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionAction1Code txActn;
    @XmlElement(name = "SvcsNbld")
    @XmlSchemaType(name = "string")
    protected RetailerService2Code svcsNbld;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage10 dispOutpt;

    /**
     * Gets the value of the txActn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAction1Code }
     *     
     */
    public TransactionAction1Code getTxActn() {
        return txActn;
    }

    /**
     * Sets the value of the txActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAction1Code }
     *     
     */
    public void setTxActn(TransactionAction1Code value) {
        this.txActn = value;
    }

    /**
     * Gets the value of the svcsNbld property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService2Code }
     *     
     */
    public RetailerService2Code getSvcsNbld() {
        return svcsNbld;
    }

    /**
     * Sets the value of the svcsNbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService2Code }
     *     
     */
    public void setSvcsNbld(RetailerService2Code value) {
        this.svcsNbld = value;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setDispOutpt(ActionMessage10 value) {
        this.dispOutpt = value;
    }

}
