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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPersonIdentification3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualPersonIdentification3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="IdNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}GenericIdentification81"/>
 *         <element name="PrsnNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}IndividualPerson35"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPersonIdentification3Choice", propOrder = {
    "idNb",
    "prsnNm"
})
public class IndividualPersonIdentification3Choice {

    @XmlElement(name = "IdNb")
    protected GenericIdentification81 idNb;
    @XmlElement(name = "PrsnNm")
    protected IndividualPerson35 prsnNm;

    /**
     * Gets the value of the idNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification81 }
     *     
     */
    public GenericIdentification81 getIdNb() {
        return idNb;
    }

    /**
     * Sets the value of the idNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification81 }
     *     
     */
    public void setIdNb(GenericIdentification81 value) {
        this.idNb = value;
    }

    /**
     * Gets the value of the prsnNm property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson35 }
     *     
     */
    public IndividualPerson35 getPrsnNm() {
        return prsnNm;
    }

    /**
     * Sets the value of the prsnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson35 }
     *     
     */
    public void setPrsnNm(IndividualPerson35 value) {
        this.prsnNm = value;
    }

}
