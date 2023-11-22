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

package org.jpos.iso20022.auth_086_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashReuseData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashReuseData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RinvstdCsh" type="{urn:iso:std:iso:20022:tech:xsd:auth.086.001.02}ReinvestedCashTypeAndAmount1" maxOccurs="unbounded"/>
 *         <element name="CshRinvstmtRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.086.001.02}PercentageRate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashReuseData1", propOrder = {
    "rinvstdCsh",
    "cshRinvstmtRate"
})
public class CashReuseData1 {

    @XmlElement(name = "RinvstdCsh", required = true)
    protected List<ReinvestedCashTypeAndAmount1> rinvstdCsh;
    @XmlElement(name = "CshRinvstmtRate", required = true)
    protected BigDecimal cshRinvstmtRate;

    /**
     * Gets the value of the rinvstdCsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rinvstdCsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRinvstdCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReinvestedCashTypeAndAmount1 }
     * 
     * 
     * @return
     *     The value of the rinvstdCsh property.
     */
    public List<ReinvestedCashTypeAndAmount1> getRinvstdCsh() {
        if (rinvstdCsh == null) {
            rinvstdCsh = new ArrayList<>();
        }
        return this.rinvstdCsh;
    }

    /**
     * Gets the value of the cshRinvstmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshRinvstmtRate() {
        return cshRinvstmtRate;
    }

    /**
     * Sets the value of the cshRinvstmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshRinvstmtRate(BigDecimal value) {
        this.cshRinvstmtRate = value;
    }

}
