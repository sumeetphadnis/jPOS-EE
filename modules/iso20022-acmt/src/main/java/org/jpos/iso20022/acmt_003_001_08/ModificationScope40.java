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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationScope40 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModificationScope40">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModScpIndctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}DataModification1Code"/>
 *         <element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Intermediary46"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationScope40", propOrder = {
    "modScpIndctn",
    "intrmy"
})
public class ModificationScope40 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "Intrmy", required = true)
    protected Intermediary46 intrmy;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification1Code }
     *     
     */
    public DataModification1Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification1Code }
     *     
     */
    public void setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link Intermediary46 }
     *     
     */
    public Intermediary46 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intermediary46 }
     *     
     */
    public void setIntrmy(Intermediary46 value) {
        this.intrmy = value;
    }

}
