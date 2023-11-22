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

package org.jpos.iso20022.seev_033_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice77 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice77">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndctvOrMktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}IndicativeOrMarketPrice9Choice" minOccurs="0"/>
 *         <element name="IssePric" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PriceFormat52Choice" minOccurs="0"/>
 *         <element name="GncCshPricRcvdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PriceFormat67Choice" minOccurs="0"/>
 *         <element name="GncCshPricPdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PriceFormat52Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice77", propOrder = {
    "indctvOrMktPric",
    "issePric",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct"
})
public class CorporateActionPrice77 {

    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice9Choice indctvOrMktPric;
    @XmlElement(name = "IssePric")
    protected PriceFormat52Choice issePric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat67Choice gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat52Choice gncCshPricPdPerPdct;

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice9Choice }
     *     
     */
    public IndicativeOrMarketPrice9Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice9Choice }
     *     
     */
    public void setIndctvOrMktPric(IndicativeOrMarketPrice9Choice value) {
        this.indctvOrMktPric = value;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public PriceFormat52Choice getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public void setIssePric(PriceFormat52Choice value) {
        this.issePric = value;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat67Choice }
     *     
     */
    public PriceFormat67Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat67Choice }
     *     
     */
    public void setGncCshPricRcvdPerPdct(PriceFormat67Choice value) {
        this.gncCshPricRcvdPerPdct = value;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public PriceFormat52Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public void setGncCshPricPdPerPdct(PriceFormat52Choice value) {
        this.gncCshPricPdPerPdct = value;
    }

}
