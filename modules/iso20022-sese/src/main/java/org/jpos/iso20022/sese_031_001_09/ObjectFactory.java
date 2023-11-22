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

package org.jpos.iso20022.sese_031_001_09;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_031_001_09 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.031.001.09", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_031_001_09
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
     * Create an instance of {@link AcknowledgedAcceptedStatus21Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus21Choice }
     */
    public AcknowledgedAcceptedStatus21Choice createAcknowledgedAcceptedStatus21Choice() {
        return new AcknowledgedAcceptedStatus21Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason12Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason12Choice }
     */
    public AcknowledgementReason12Choice createAcknowledgementReason12Choice() {
        return new AcknowledgementReason12Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason9 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason9 }
     */
    public AcknowledgementReason9 createAcknowledgementReason9() {
        return new AcknowledgementReason9();
    }

    /**
     * Create an instance of {@link AutomaticBorrowing7Choice }
     * 
     * @return
     *     the new instance of {@link AutomaticBorrowing7Choice }
     */
    public AutomaticBorrowing7Choice createAutomaticBorrowing7Choice() {
        return new AutomaticBorrowing7Choice();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet3 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet3 }
     */
    public BlockChainAddressWallet3 createBlockChainAddressWallet3() {
        return new BlockChainAddressWallet3();
    }

    /**
     * Create an instance of {@link DeniedReason10 }
     * 
     * @return
     *     the new instance of {@link DeniedReason10 }
     */
    public DeniedReason10 createDeniedReason10() {
        return new DeniedReason10();
    }

    /**
     * Create an instance of {@link DeniedReason15Choice }
     * 
     * @return
     *     the new instance of {@link DeniedReason15Choice }
     */
    public DeniedReason15Choice createDeniedReason15Choice() {
        return new DeniedReason15Choice();
    }

    /**
     * Create an instance of {@link DeniedStatus15Choice }
     * 
     * @return
     *     the new instance of {@link DeniedStatus15Choice }
     */
    public DeniedStatus15Choice createDeniedStatus15Choice() {
        return new DeniedStatus15Choice();
    }

    /**
     * Create an instance of {@link DocumentNumber5Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber5Choice }
     */
    public DocumentNumber5Choice createDocumentNumber5Choice() {
        return new DocumentNumber5Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
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
     * Create an instance of {@link HoldIndicator6 }
     * 
     * @return
     *     the new instance of {@link HoldIndicator6 }
     */
    public HoldIndicator6 createHoldIndicator6() {
        return new HoldIndicator6();
    }

    /**
     * Create an instance of {@link LinkageType3Choice }
     * 
     * @return
     *     the new instance of {@link LinkageType3Choice }
     */
    public LinkageType3Choice createLinkageType3Choice() {
        return new LinkageType3Choice();
    }

    /**
     * Create an instance of {@link Linkages62 }
     * 
     * @return
     *     the new instance of {@link Linkages62 }
     */
    public Linkages62 createLinkages62() {
        return new Linkages62();
    }

    /**
     * Create an instance of {@link MatchingDenied3Choice }
     * 
     * @return
     *     the new instance of {@link MatchingDenied3Choice }
     */
    public MatchingDenied3Choice createMatchingDenied3Choice() {
        return new MatchingDenied3Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification127Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification127Choice }
     */
    public PartyIdentification127Choice createPartyIdentification127Choice() {
        return new PartyIdentification127Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification144 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification144 }
     */
    public PartyIdentification144 createPartyIdentification144() {
        return new PartyIdentification144();
    }

    /**
     * Create an instance of {@link PendingReason16 }
     * 
     * @return
     *     the new instance of {@link PendingReason16 }
     */
    public PendingReason16 createPendingReason16() {
        return new PendingReason16();
    }

    /**
     * Create an instance of {@link PendingReason28Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason28Choice }
     */
    public PendingReason28Choice createPendingReason28Choice() {
        return new PendingReason28Choice();
    }

    /**
     * Create an instance of {@link PendingStatus38Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus38Choice }
     */
    public PendingStatus38Choice createPendingStatus38Choice() {
        return new PendingStatus38Choice();
    }

    /**
     * Create an instance of {@link PriorityNumeric4Choice }
     * 
     * @return
     *     the new instance of {@link PriorityNumeric4Choice }
     */
    public PriorityNumeric4Choice createPriorityNumeric4Choice() {
        return new PriorityNumeric4Choice();
    }

    /**
     * Create an instance of {@link ProcessingPosition8Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingPosition8Choice }
     */
    public ProcessingPosition8Choice createProcessingPosition8Choice() {
        return new ProcessingPosition8Choice();
    }

    /**
     * Create an instance of {@link ProcessingStatus85Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus85Choice }
     */
    public ProcessingStatus85Choice createProcessingStatus85Choice() {
        return new ProcessingStatus85Choice();
    }

    /**
     * Create an instance of {@link ProprietaryReason4 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason4 }
     */
    public ProprietaryReason4 createProprietaryReason4() {
        return new ProprietaryReason4();
    }

    /**
     * Create an instance of {@link ProprietaryStatusAndReason6 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusAndReason6 }
     */
    public ProprietaryStatusAndReason6 createProprietaryStatusAndReason6() {
        return new ProprietaryStatusAndReason6();
    }

    /**
     * Create an instance of {@link References27 }
     * 
     * @return
     *     the new instance of {@link References27 }
     */
    public References27 createReferences27() {
        return new References27();
    }

    /**
     * Create an instance of {@link References74Choice }
     * 
     * @return
     *     the new instance of {@link References74Choice }
     */
    public References74Choice createReferences74Choice() {
        return new References74Choice();
    }

    /**
     * Create an instance of {@link Registration10Choice }
     * 
     * @return
     *     the new instance of {@link Registration10Choice }
     */
    public Registration10Choice createRegistration10Choice() {
        return new Registration10Choice();
    }

    /**
     * Create an instance of {@link RegistrationReason5 }
     * 
     * @return
     *     the new instance of {@link RegistrationReason5 }
     */
    public RegistrationReason5 createRegistrationReason5() {
        return new RegistrationReason5();
    }

    /**
     * Create an instance of {@link RejectionAndRepairReason37Choice }
     * 
     * @return
     *     the new instance of {@link RejectionAndRepairReason37Choice }
     */
    public RejectionAndRepairReason37Choice createRejectionAndRepairReason37Choice() {
        return new RejectionAndRepairReason37Choice();
    }

    /**
     * Create an instance of {@link RejectionOrRepairReason37 }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairReason37 }
     */
    public RejectionOrRepairReason37 createRejectionOrRepairReason37() {
        return new RejectionOrRepairReason37();
    }

    /**
     * Create an instance of {@link RejectionOrRepairStatus42Choice }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairStatus42Choice }
     */
    public RejectionOrRepairStatus42Choice createRejectionOrRepairStatus42Choice() {
        return new RejectionOrRepairStatus42Choice();
    }

    /**
     * Create an instance of {@link RequestDetails27 }
     * 
     * @return
     *     the new instance of {@link RequestDetails27 }
     */
    public RequestDetails27 createRequestDetails27() {
        return new RequestDetails27();
    }

    /**
     * Create an instance of {@link RestrictionIdentification1 }
     * 
     * @return
     *     the new instance of {@link RestrictionIdentification1 }
     */
    public RestrictionIdentification1 createRestrictionIdentification1() {
        return new RestrictionIdentification1();
    }

    /**
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount19 }
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
    }

    /**
     * Create an instance of {@link SecuritiesRTGS4Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesRTGS4Choice }
     */
    public SecuritiesRTGS4Choice createSecuritiesRTGS4Choice() {
        return new SecuritiesRTGS4Choice();
    }

    /**
     * Create an instance of {@link SecuritiesSettlementConditionModificationStatusAdviceV09 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementConditionModificationStatusAdviceV09 }
     */
    public SecuritiesSettlementConditionModificationStatusAdviceV09 createSecuritiesSettlementConditionModificationStatusAdviceV09() {
        return new SecuritiesSettlementConditionModificationStatusAdviceV09();
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
     * Create an instance of {@link UnilateralSplit3Choice }
     * 
     * @return
     *     the new instance of {@link UnilateralSplit3Choice }
     */
    public UnilateralSplit3Choice createUnilateralSplit3Choice() {
        return new UnilateralSplit3Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.001.09", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
