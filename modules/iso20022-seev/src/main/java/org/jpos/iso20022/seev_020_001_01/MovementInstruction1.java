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

package org.jpos.iso20022.seev_020_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementInstruction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MovementInstruction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MvmntGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}CorporateActionMovement1"/>
 *         <element name="UndrlygSctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}UnderlyingSecurityMovement1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UndrlygCshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}CashMovement2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrcdsMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ProceedsMovement1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementInstruction1", propOrder = {
    "mvmntGnlInf",
    "undrlygSctiesMvmntDtls",
    "undrlygCshMvmntDtls",
    "prcdsMvmntDtls"
})
public class MovementInstruction1 {

    @XmlElement(name = "MvmntGnlInf", required = true)
    protected CorporateActionMovement1 mvmntGnlInf;
    @XmlElement(name = "UndrlygSctiesMvmntDtls")
    protected List<UnderlyingSecurityMovement1> undrlygSctiesMvmntDtls;
    @XmlElement(name = "UndrlygCshMvmntDtls")
    protected List<CashMovement2> undrlygCshMvmntDtls;
    @XmlElement(name = "PrcdsMvmntDtls")
    protected List<ProceedsMovement1> prcdsMvmntDtls;

    /**
     * Gets the value of the mvmntGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public CorporateActionMovement1 getMvmntGnlInf() {
        return mvmntGnlInf;
    }

    /**
     * Sets the value of the mvmntGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public void setMvmntGnlInf(CorporateActionMovement1 value) {
        this.mvmntGnlInf = value;
    }

    /**
     * Gets the value of the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingSecurityMovement1 }
     * 
     * 
     * @return
     *     The value of the undrlygSctiesMvmntDtls property.
     */
    public List<UnderlyingSecurityMovement1> getUndrlygSctiesMvmntDtls() {
        if (undrlygSctiesMvmntDtls == null) {
            undrlygSctiesMvmntDtls = new ArrayList<>();
        }
        return this.undrlygSctiesMvmntDtls;
    }

    /**
     * Gets the value of the undrlygCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement2 }
     * 
     * 
     * @return
     *     The value of the undrlygCshMvmntDtls property.
     */
    public List<CashMovement2> getUndrlygCshMvmntDtls() {
        if (undrlygCshMvmntDtls == null) {
            undrlygCshMvmntDtls = new ArrayList<>();
        }
        return this.undrlygCshMvmntDtls;
    }

    /**
     * Gets the value of the prcdsMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcdsMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcdsMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceedsMovement1 }
     * 
     * 
     * @return
     *     The value of the prcdsMvmntDtls property.
     */
    public List<ProceedsMovement1> getPrcdsMvmntDtls() {
        if (prcdsMvmntDtls == null) {
            prcdsMvmntDtls = new ArrayList<>();
        }
        return this.prcdsMvmntDtls;
    }

}
