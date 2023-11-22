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

package org.jpos.iso20022.camt_083_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus69Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus69Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}PendingStatus39Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}RejectionOrRepairStatus39Choice"/>
 *         <element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}RejectionOrRepairStatus39Choice"/>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}AcknowledgedAcceptedStatus24Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}ProprietaryStatusAndReason6"/>
 *         <element name="Dnd" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}DeniedStatus16Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}CancellationStatus15Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus69Choice", propOrder = {
    "pdgCxl",
    "rjctd",
    "rpr",
    "ackdAccptd",
    "prtry",
    "dnd",
    "canc"
})
public class ProcessingStatus69Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus39Choice pdgCxl;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus39Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus39Choice rpr;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus24Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;
    @XmlElement(name = "Dnd")
    protected DeniedStatus16Choice dnd;
    @XmlElement(name = "Canc")
    protected CancellationStatus15Choice canc;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus39Choice }
     *     
     */
    public PendingStatus39Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus39Choice }
     *     
     */
    public void setPdgCxl(PendingStatus39Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus39Choice }
     *     
     */
    public RejectionOrRepairStatus39Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus39Choice }
     *     
     */
    public void setRjctd(RejectionOrRepairStatus39Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus39Choice }
     *     
     */
    public RejectionOrRepairStatus39Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus39Choice }
     *     
     */
    public void setRpr(RejectionOrRepairStatus39Choice value) {
        this.rpr = value;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus24Choice }
     *     
     */
    public AcknowledgedAcceptedStatus24Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus24Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus24Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus16Choice }
     *     
     */
    public DeniedStatus16Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus16Choice }
     *     
     */
    public void setDnd(DeniedStatus16Choice value) {
        this.dnd = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus15Choice }
     *     
     */
    public CancellationStatus15Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus15Choice }
     *     
     */
    public void setCanc(CancellationStatus15Choice value) {
        this.canc = value;
    }

}
