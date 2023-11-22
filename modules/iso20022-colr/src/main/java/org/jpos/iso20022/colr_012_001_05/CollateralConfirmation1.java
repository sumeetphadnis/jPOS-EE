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

package org.jpos.iso20022.colr_012_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralConfirmation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralConfirmation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollSbstitnReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.012.001.05}Max35Text"/>
 *         <element name="CollSbstitnRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.012.001.05}Max35Text" minOccurs="0"/>
 *         <element name="ConfTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.012.001.05}CollateralSubstitutionConfirmation1Code"/>
 *         <element name="Cmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.012.001.05}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralConfirmation1", propOrder = {
    "collSbstitnReqId",
    "collSbstitnRspnId",
    "confTp",
    "cmnt"
})
public class CollateralConfirmation1 {

    @XmlElement(name = "CollSbstitnReqId", required = true)
    protected String collSbstitnReqId;
    @XmlElement(name = "CollSbstitnRspnId")
    protected String collSbstitnRspnId;
    @XmlElement(name = "ConfTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralSubstitutionConfirmation1Code confTp;
    @XmlElement(name = "Cmnt")
    protected String cmnt;

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
    }

    /**
     * Gets the value of the collSbstitnRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnRspnId() {
        return collSbstitnRspnId;
    }

    /**
     * Sets the value of the collSbstitnRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollSbstitnRspnId(String value) {
        this.collSbstitnRspnId = value;
    }

    /**
     * Gets the value of the confTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionConfirmation1Code }
     *     
     */
    public CollateralSubstitutionConfirmation1Code getConfTp() {
        return confTp;
    }

    /**
     * Sets the value of the confTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionConfirmation1Code }
     *     
     */
    public void setConfTp(CollateralSubstitutionConfirmation1Code value) {
        this.confTp = value;
    }

    /**
     * Gets the value of the cmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnt() {
        return cmnt;
    }

    /**
     * Sets the value of the cmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmnt(String value) {
        this.cmnt = value;
    }

}
