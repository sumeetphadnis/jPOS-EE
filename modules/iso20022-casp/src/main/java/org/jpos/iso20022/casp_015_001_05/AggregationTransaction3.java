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

package org.jpos.iso20022.casp_015_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregationTransaction3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AggregationTransaction3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrstPmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}ISODateTime" minOccurs="0"/>
 *         <element name="LastPmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}ISODateTime" minOccurs="0"/>
 *         <element name="NbOfPmts" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Number" minOccurs="0"/>
 *         <element name="IndvPmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}DetailedAmount21" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregationTransaction3", propOrder = {
    "frstPmtDtTm",
    "lastPmtDtTm",
    "nbOfPmts",
    "indvPmt"
})
public class AggregationTransaction3 {

    @XmlElement(name = "FrstPmtDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frstPmtDtTm;
    @XmlElement(name = "LastPmtDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPmtDtTm;
    @XmlElement(name = "NbOfPmts")
    protected BigDecimal nbOfPmts;
    @XmlElement(name = "IndvPmt")
    protected List<DetailedAmount21> indvPmt;

    /**
     * Gets the value of the frstPmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstPmtDtTm() {
        return frstPmtDtTm;
    }

    /**
     * Sets the value of the frstPmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstPmtDtTm(XMLGregorianCalendar value) {
        this.frstPmtDtTm = value;
    }

    /**
     * Gets the value of the lastPmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPmtDtTm() {
        return lastPmtDtTm;
    }

    /**
     * Sets the value of the lastPmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPmtDtTm(XMLGregorianCalendar value) {
        this.lastPmtDtTm = value;
    }

    /**
     * Gets the value of the nbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfPmts() {
        return nbOfPmts;
    }

    /**
     * Sets the value of the nbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfPmts(BigDecimal value) {
        this.nbOfPmts = value;
    }

    /**
     * Gets the value of the indvPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount21 }
     * 
     * 
     * @return
     *     The value of the indvPmt property.
     */
    public List<DetailedAmount21> getIndvPmt() {
        if (indvPmt == null) {
            indvPmt = new ArrayList<>();
        }
        return this.indvPmt;
    }

}
