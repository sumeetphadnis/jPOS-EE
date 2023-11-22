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

package org.jpos.iso20022.semt_006_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateSecurityIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AlternateSecurityIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:semt.006.001.03}Max35Text"/>
 *         <choice>
 *           <element name="DmstIdSrc" type="{urn:swift:xsd:semt.006.001.03}CountryCode"/>
 *           <element name="PrtryIdSrc" type="{urn:swift:xsd:semt.006.001.03}Max35Text"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateSecurityIdentification1", propOrder = {
    "id",
    "dmstIdSrc",
    "prtryIdSrc"
})
public class AlternateSecurityIdentification1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "DmstIdSrc")
    protected String dmstIdSrc;
    @XmlElement(name = "PrtryIdSrc")
    protected String prtryIdSrc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dmstIdSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmstIdSrc() {
        return dmstIdSrc;
    }

    /**
     * Sets the value of the dmstIdSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmstIdSrc(String value) {
        this.dmstIdSrc = value;
    }

    /**
     * Gets the value of the prtryIdSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryIdSrc() {
        return prtryIdSrc;
    }

    /**
     * Sets the value of the prtryIdSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryIdSrc(String value) {
        this.prtryIdSrc = value;
    }

}
