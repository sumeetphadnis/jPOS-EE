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

package org.jpos.iso20022.reda_037_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesAcctAudtTrlRpt" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}SecuritiesAccountAuditTrailReportV01"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctAudtTrlRpt"
})
public class Document {

    @XmlElement(name = "SctiesAcctAudtTrlRpt", required = true)
    protected SecuritiesAccountAuditTrailReportV01 sctiesAcctAudtTrlRpt;

    /**
     * Gets the value of the sctiesAcctAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountAuditTrailReportV01 }
     *     
     */
    public SecuritiesAccountAuditTrailReportV01 getSctiesAcctAudtTrlRpt() {
        return sctiesAcctAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesAcctAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountAuditTrailReportV01 }
     *     
     */
    public void setSctiesAcctAudtTrlRpt(SecuritiesAccountAuditTrailReportV01 value) {
        this.sctiesAcctAudtTrlRpt = value;
    }

}
