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

package org.jpos.iso20022.colr_006_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.colr_006_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:colr.006.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.colr_006_001_05
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
     * Create an instance of {@link BlockChainAddressWallet5 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet5 }
     */
    public BlockChainAddressWallet5 createBlockChainAddressWallet5() {
        return new BlockChainAddressWallet5();
    }

    /**
     * Create an instance of {@link CollateralAccount3 }
     * 
     * @return
     *     the new instance of {@link CollateralAccount3 }
     */
    public CollateralAccount3 createCollateralAccount3() {
        return new CollateralAccount3();
    }

    /**
     * Create an instance of {@link CollateralAccountIdentificationType3Choice }
     * 
     * @return
     *     the new instance of {@link CollateralAccountIdentificationType3Choice }
     */
    public CollateralAccountIdentificationType3Choice createCollateralAccountIdentificationType3Choice() {
        return new CollateralAccountIdentificationType3Choice();
    }

    /**
     * Create an instance of {@link CollateralCancellationStatus2 }
     * 
     * @return
     *     the new instance of {@link CollateralCancellationStatus2 }
     */
    public CollateralCancellationStatus2 createCollateralCancellationStatus2() {
        return new CollateralCancellationStatus2();
    }

    /**
     * Create an instance of {@link CollateralManagementCancellationStatusV05 }
     * 
     * @return
     *     the new instance of {@link CollateralManagementCancellationStatusV05 }
     */
    public CollateralManagementCancellationStatusV05 createCollateralManagementCancellationStatusV05() {
        return new CollateralManagementCancellationStatusV05();
    }

    /**
     * Create an instance of {@link DateAndDateTime2Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTime2Choice }
     */
    public DateAndDateTime2Choice createDateAndDateTime2Choice() {
        return new DateAndDateTime2Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification36 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification36 }
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
    }

    /**
     * Create an instance of {@link NameAndAddress6 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress6 }
     */
    public NameAndAddress6 createNameAndAddress6() {
        return new NameAndAddress6();
    }

    /**
     * Create an instance of {@link Obligation9 }
     * 
     * @return
     *     the new instance of {@link Obligation9 }
     */
    public Obligation9 createObligation9() {
        return new Obligation9();
    }

    /**
     * Create an instance of {@link PartyIdentification178Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification178Choice }
     */
    public PartyIdentification178Choice createPartyIdentification178Choice() {
        return new PartyIdentification178Choice();
    }

    /**
     * Create an instance of {@link PostalAddress2 }
     * 
     * @return
     *     the new instance of {@link PostalAddress2 }
     */
    public PostalAddress2 createPostalAddress2() {
        return new PostalAddress2();
    }

    /**
     * Create an instance of {@link Reference16 }
     * 
     * @return
     *     the new instance of {@link Reference16 }
     */
    public Reference16 createReference16() {
        return new Reference16();
    }

    /**
     * Create an instance of {@link RejectionStatus3 }
     * 
     * @return
     *     the new instance of {@link RejectionStatus3 }
     */
    public RejectionStatus3 createRejectionStatus3() {
        return new RejectionStatus3();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.006.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
