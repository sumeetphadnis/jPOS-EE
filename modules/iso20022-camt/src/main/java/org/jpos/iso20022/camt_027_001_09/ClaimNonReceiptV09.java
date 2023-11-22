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

package org.jpos.iso20022.camt_027_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimNonReceiptV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClaimNonReceiptV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.09}CaseAssignment5"/>
 *         <element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.09}Case5" minOccurs="0"/>
 *         <element name="Undrlyg" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.09}UnderlyingTransaction7Choice"/>
 *         <element name="CoverDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.09}MissingCover5" minOccurs="0"/>
 *         <element name="InstrForAssgne" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.09}InstructionForAssignee1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimNonReceiptV09", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "coverDtls",
    "instrForAssgne",
    "splmtryData"
})
public class ClaimNonReceiptV09 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction7Choice undrlyg;
    @XmlElement(name = "CoverDtls")
    protected MissingCover5 coverDtls;
    @XmlElement(name = "InstrForAssgne")
    protected InstructionForAssignee1 instrForAssgne;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public void setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public void setCase(Case5 value) {
        this._case = value;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction7Choice }
     *     
     */
    public UnderlyingTransaction7Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction7Choice }
     *     
     */
    public void setUndrlyg(UnderlyingTransaction7Choice value) {
        this.undrlyg = value;
    }

    /**
     * Gets the value of the coverDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MissingCover5 }
     *     
     */
    public MissingCover5 getCoverDtls() {
        return coverDtls;
    }

    /**
     * Sets the value of the coverDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingCover5 }
     *     
     */
    public void setCoverDtls(MissingCover5 value) {
        this.coverDtls = value;
    }

    /**
     * Gets the value of the instrForAssgne property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForAssignee1 }
     *     
     */
    public InstructionForAssignee1 getInstrForAssgne() {
        return instrForAssgne;
    }

    /**
     * Sets the value of the instrForAssgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForAssignee1 }
     *     
     */
    public void setInstrForAssgne(InstructionForAssignee1 value) {
        this.instrForAssgne = value;
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
