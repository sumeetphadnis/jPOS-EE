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

package org.jpos.iso20022.tsmt_018_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredSubmission6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequiredSubmission6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Submitr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}BICIdentification1" maxOccurs="unbounded"/>
 *         <element name="CertTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}Exact4AlphaNumericText"/>
 *         <element name="CertTpDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}Max140Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSubmission6", propOrder = {
    "submitr",
    "certTp",
    "certTpDesc"
})
public class RequiredSubmission6 {

    @XmlElement(name = "Submitr", required = true)
    protected List<BICIdentification1> submitr;
    @XmlElement(name = "CertTp", required = true)
    protected String certTp;
    @XmlElement(name = "CertTpDesc", required = true)
    protected String certTpDesc;

    /**
     * Gets the value of the submitr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the submitr property.
     */
    public List<BICIdentification1> getSubmitr() {
        if (submitr == null) {
            submitr = new ArrayList<>();
        }
        return this.submitr;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertTp(String value) {
        this.certTp = value;
    }

    /**
     * Gets the value of the certTpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertTpDesc() {
        return certTpDesc;
    }

    /**
     * Sets the value of the certTpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertTpDesc(String value) {
        this.certTpDesc = value;
    }

}
