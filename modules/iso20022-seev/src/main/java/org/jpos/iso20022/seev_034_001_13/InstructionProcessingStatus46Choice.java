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

package org.jpos.iso20022.seev_034_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionProcessingStatus46Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionProcessingStatus46Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}CancelledStatus12Choice"/>
 *         <element name="AccptdForFrthrPrcg" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}AcceptedStatus8Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}RejectedStatus41Choice"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}PendingStatus66Choice"/>
 *         <element name="DfltActn" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}NoSpecifiedReason1"/>
 *         <element name="StgInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}NoSpecifiedReason1"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.001.13}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus46Choice", propOrder = {
    "canc",
    "accptdForFrthrPrcg",
    "rjctd",
    "pdg",
    "dfltActn",
    "stgInstr",
    "prtrySts"
})
public class InstructionProcessingStatus46Choice {

    @XmlElement(name = "Canc")
    protected CancelledStatus12Choice canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected AcceptedStatus8Choice accptdForFrthrPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus41Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus66Choice pdg;
    @XmlElement(name = "DfltActn")
    protected NoSpecifiedReason1 dfltActn;
    @XmlElement(name = "StgInstr")
    protected NoSpecifiedReason1 stgInstr;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public CancelledStatus12Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public void setCanc(CancelledStatus12Choice value) {
        this.canc = value;
    }

    /**
     * Gets the value of the accptdForFrthrPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus8Choice }
     *     
     */
    public AcceptedStatus8Choice getAccptdForFrthrPrcg() {
        return accptdForFrthrPrcg;
    }

    /**
     * Sets the value of the accptdForFrthrPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus8Choice }
     *     
     */
    public void setAccptdForFrthrPrcg(AcceptedStatus8Choice value) {
        this.accptdForFrthrPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus41Choice }
     *     
     */
    public RejectedStatus41Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus41Choice }
     *     
     */
    public void setRjctd(RejectedStatus41Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus66Choice }
     *     
     */
    public PendingStatus66Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus66Choice }
     *     
     */
    public void setPdg(PendingStatus66Choice value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setDfltActn(NoSpecifiedReason1 value) {
        this.dfltActn = value;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setStgInstr(NoSpecifiedReason1 value) {
        this.stgInstr = value;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
    }

}
