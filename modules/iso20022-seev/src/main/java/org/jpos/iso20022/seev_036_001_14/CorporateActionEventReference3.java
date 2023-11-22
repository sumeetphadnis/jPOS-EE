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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventReference3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionEventReference3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionEventReference3Choice"/>
 *         <element name="LkgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ProcessingPosition7Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventReference3", propOrder = {
    "evtId",
    "lkgTp"
})
public class CorporateActionEventReference3 {

    @XmlElement(name = "EvtId", required = true)
    protected CorporateActionEventReference3Choice evtId;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition7Choice lkgTp;

    /**
     * Gets the value of the evtId property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventReference3Choice }
     *     
     */
    public CorporateActionEventReference3Choice getEvtId() {
        return evtId;
    }

    /**
     * Sets the value of the evtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventReference3Choice }
     *     
     */
    public void setEvtId(CorporateActionEventReference3Choice value) {
        this.evtId = value;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public ProcessingPosition7Choice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public void setLkgTp(ProcessingPosition7Choice value) {
        this.lkgTp = value;
    }

}
