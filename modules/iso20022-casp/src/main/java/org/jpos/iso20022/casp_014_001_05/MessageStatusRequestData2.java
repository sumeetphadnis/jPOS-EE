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

package org.jpos.iso20022.casp_014_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageStatusRequestData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MessageStatusRequestData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:casp.014.001.05}Max35Text"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:casp.014.001.05}GenericIdentification177"/>
 *         <element name="RctRprntFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.014.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DocQlfr" type="{urn:iso:std:iso:20022:tech:xsd:casp.014.001.05}DocumentType7Code" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageStatusRequestData2", propOrder = {
    "xchgId",
    "initgPty",
    "rctRprntFlg",
    "docQlfr"
})
public class MessageStatusRequestData2 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification177 initgPty;
    @XmlElement(name = "RctRprntFlg")
    protected Boolean rctRprntFlg;
    @XmlElement(name = "DocQlfr")
    @XmlSchemaType(name = "string")
    protected List<DocumentType7Code> docQlfr;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgId(String value) {
        this.xchgId = value;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setInitgPty(GenericIdentification177 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the rctRprntFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctRprntFlg() {
        return rctRprntFlg;
    }

    /**
     * Sets the value of the rctRprntFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRctRprntFlg(Boolean value) {
        this.rctRprntFlg = value;
    }

    /**
     * Gets the value of the docQlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the docQlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType7Code }
     * 
     * 
     * @return
     *     The value of the docQlfr property.
     */
    public List<DocumentType7Code> getDocQlfr() {
        if (docQlfr == null) {
            docQlfr = new ArrayList<>();
        }
        return this.docQlfr;
    }

}
