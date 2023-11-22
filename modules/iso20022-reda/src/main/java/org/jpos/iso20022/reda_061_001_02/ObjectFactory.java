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

package org.jpos.iso20022.reda_061_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_061_001_02 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:reda.061.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_061_001_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     * @return
     *     the new instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemIdentification2Choice }
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link CutOff1 }
     * 
     * @return
     *     the new instance of {@link CutOff1 }
     */
    public CutOff1 createCutOff1() {
        return new CutOff1();
    }

    /**
     * Create an instance of {@link CutOffData2 }
     * 
     * @return
     *     the new instance of {@link CutOffData2 }
     */
    public CutOffData2 createCutOffData2() {
        return new CutOffData2();
    }

    /**
     * Create an instance of {@link NameAndAddress8 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress8 }
     */
    public NameAndAddress8 createNameAndAddress8() {
        return new NameAndAddress8();
    }

    /**
     * Create an instance of {@link NettingCutOff2 }
     * 
     * @return
     *     the new instance of {@link NettingCutOff2 }
     */
    public NettingCutOff2 createNettingCutOff2() {
        return new NettingCutOff2();
    }

    /**
     * Create an instance of {@link NettingCutOffReferenceDataReportV02 }
     * 
     * @return
     *     the new instance of {@link NettingCutOffReferenceDataReportV02 }
     */
    public NettingCutOffReferenceDataReportV02 createNettingCutOffReferenceDataReportV02() {
        return new NettingCutOffReferenceDataReportV02();
    }

    /**
     * Create an instance of {@link NettingCutOffReportData2 }
     * 
     * @return
     *     the new instance of {@link NettingCutOffReportData2 }
     */
    public NettingCutOffReportData2 createNettingCutOffReportData2() {
        return new NettingCutOffReportData2();
    }

    /**
     * Create an instance of {@link NettingIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link NettingIdentification2Choice }
     */
    public NettingIdentification2Choice createNettingIdentification2Choice() {
        return new NettingIdentification2Choice();
    }

    /**
     * Create an instance of {@link Pagination1 }
     * 
     * @return
     *     the new instance of {@link Pagination1 }
     */
    public Pagination1 createPagination1() {
        return new Pagination1();
    }

    /**
     * Create an instance of {@link PartyIdentification242Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification242Choice }
     */
    public PartyIdentification242Choice createPartyIdentification242Choice() {
        return new PartyIdentification242Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification265 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification265 }
     */
    public PartyIdentification265 createPartyIdentification265() {
        return new PartyIdentification265();
    }

    /**
     * Create an instance of {@link PartyIdentification266 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification266 }
     */
    public PartyIdentification266 createPartyIdentification266() {
        return new PartyIdentification266();
    }

    /**
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
    }

    /**
     * Create an instance of {@link SupplementaryData1 }
     * 
     * @return
     *     the new instance of {@link SupplementaryData1 }
     */
    public SupplementaryData1 createSupplementaryData1() {
        return new SupplementaryData1();
    }

    /**
     * Create an instance of {@link SupplementaryDataEnvelope1 }
     * 
     * @return
     *     the new instance of {@link SupplementaryDataEnvelope1 }
     */
    public SupplementaryDataEnvelope1 createSupplementaryDataEnvelope1() {
        return new SupplementaryDataEnvelope1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.061.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
