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

package org.jpos.iso20022.acmt_001_001_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeMinimusApplicable1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeMinimusApplicable1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NewIssePrmssn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator"/>
 *         <element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeMinimusApplicable1", propOrder = {
    "newIssePrmssn",
    "pctg"
})
public class DeMinimusApplicable1 {

    @XmlElement(name = "NewIssePrmssn")
    protected boolean newIssePrmssn;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;

    /**
     * Gets the value of the newIssePrmssn property.
     * 
     */
    public boolean isNewIssePrmssn() {
        return newIssePrmssn;
    }

    /**
     * Sets the value of the newIssePrmssn property.
     * 
     */
    public void setNewIssePrmssn(boolean value) {
        this.newIssePrmssn = value;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

}
