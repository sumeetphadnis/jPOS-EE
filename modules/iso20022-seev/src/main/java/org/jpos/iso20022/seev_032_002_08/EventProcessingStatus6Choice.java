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

package org.jpos.iso20022.seev_032_002_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventProcessingStatus6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EventProcessingStatus6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cmplt" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.002.08}NoSpecifiedReason1"/>
 *         <element name="Rcncld" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.002.08}NoSpecifiedReason1"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.002.08}PendingStatus59Choice"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.002.08}ProprietaryStatusAndReason7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventProcessingStatus6Choice", propOrder = {
    "cmplt",
    "rcncld",
    "pdg",
    "prtrySts"
})
public class EventProcessingStatus6Choice {

    @XmlElement(name = "Cmplt")
    protected NoSpecifiedReason1 cmplt;
    @XmlElement(name = "Rcncld")
    protected NoSpecifiedReason1 rcncld;
    @XmlElement(name = "Pdg")
    protected PendingStatus59Choice pdg;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason7 prtrySts;

    /**
     * Gets the value of the cmplt property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getCmplt() {
        return cmplt;
    }

    /**
     * Sets the value of the cmplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setCmplt(NoSpecifiedReason1 value) {
        this.cmplt = value;
    }

    /**
     * Gets the value of the rcncld property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getRcncld() {
        return rcncld;
    }

    /**
     * Sets the value of the rcncld property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setRcncld(NoSpecifiedReason1 value) {
        this.rcncld = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus59Choice }
     *     
     */
    public PendingStatus59Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus59Choice }
     *     
     */
    public void setPdg(PendingStatus59Choice value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason7 value) {
        this.prtrySts = value;
    }

}
