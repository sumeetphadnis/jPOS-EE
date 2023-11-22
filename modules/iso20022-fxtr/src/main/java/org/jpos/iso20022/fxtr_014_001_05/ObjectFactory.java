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

package org.jpos.iso20022.fxtr_014_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.fxtr_014_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.fxtr_014_001_05
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
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmount }
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAndAmount }
     */
    public ActiveOrHistoricCurrencyAndAmount createActiveOrHistoricCurrencyAndAmount() {
        return new ActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link AgreedRate3 }
     * 
     * @return
     *     the new instance of {@link AgreedRate3 }
     */
    public AgreedRate3 createAgreedRate3() {
        return new AgreedRate3();
    }

    /**
     * Create an instance of {@link AgreementConditions1 }
     * 
     * @return
     *     the new instance of {@link AgreementConditions1 }
     */
    public AgreementConditions1 createAgreementConditions1() {
        return new AgreementConditions1();
    }

    /**
     * Create an instance of {@link AmountOrRate4Choice }
     * 
     * @return
     *     the new instance of {@link AmountOrRate4Choice }
     */
    public AmountOrRate4Choice createAmountOrRate4Choice() {
        return new AmountOrRate4Choice();
    }

    /**
     * Create an instance of {@link AmountsAndValueDate6 }
     * 
     * @return
     *     the new instance of {@link AmountsAndValueDate6 }
     */
    public AmountsAndValueDate6 createAmountsAndValueDate6() {
        return new AmountsAndValueDate6();
    }

    /**
     * Create an instance of {@link ClearingBrokerIdentification1 }
     * 
     * @return
     *     the new instance of {@link ClearingBrokerIdentification1 }
     */
    public ClearingBrokerIdentification1 createClearingBrokerIdentification1() {
        return new ClearingBrokerIdentification1();
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
     * Create an instance of {@link ContactInformation1 }
     * 
     * @return
     *     the new instance of {@link ContactInformation1 }
     */
    public ContactInformation1 createContactInformation1() {
        return new ContactInformation1();
    }

    /**
     * Create an instance of {@link CounterpartySideTransactionReporting2 }
     * 
     * @return
     *     the new instance of {@link CounterpartySideTransactionReporting2 }
     */
    public CounterpartySideTransactionReporting2 createCounterpartySideTransactionReporting2() {
        return new CounterpartySideTransactionReporting2();
    }

    /**
     * Create an instance of {@link CurrencyOrDigitalTokenAmount1Choice }
     * 
     * @return
     *     the new instance of {@link CurrencyOrDigitalTokenAmount1Choice }
     */
    public CurrencyOrDigitalTokenAmount1Choice createCurrencyOrDigitalTokenAmount1Choice() {
        return new CurrencyOrDigitalTokenAmount1Choice();
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
     * Create an instance of {@link DigitalTokenAmount1 }
     * 
     * @return
     *     the new instance of {@link DigitalTokenAmount1 }
     */
    public DigitalTokenAmount1 createDigitalTokenAmount1() {
        return new DigitalTokenAmount1();
    }

    /**
     * Create an instance of {@link FXAmountType1Choice }
     * 
     * @return
     *     the new instance of {@link FXAmountType1Choice }
     */
    public FXAmountType1Choice createFXAmountType1Choice() {
        return new FXAmountType1Choice();
    }

    /**
     * Create an instance of {@link FXCommissionOrFee1 }
     * 
     * @return
     *     the new instance of {@link FXCommissionOrFee1 }
     */
    public FXCommissionOrFee1 createFXCommissionOrFee1() {
        return new FXCommissionOrFee1();
    }

    /**
     * Create an instance of {@link ForeignExchangeTradeInstructionV05 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTradeInstructionV05 }
     */
    public ForeignExchangeTradeInstructionV05 createForeignExchangeTradeInstructionV05() {
        return new ForeignExchangeTradeInstructionV05();
    }

    /**
     * Create an instance of {@link FundIdentification5 }
     * 
     * @return
     *     the new instance of {@link FundIdentification5 }
     */
    public FundIdentification5 createFundIdentification5() {
        return new FundIdentification5();
    }

    /**
     * Create an instance of {@link GeneralInformation8 }
     * 
     * @return
     *     the new instance of {@link GeneralInformation8 }
     */
    public GeneralInformation8 createGeneralInformation8() {
        return new GeneralInformation8();
    }

    /**
     * Create an instance of {@link IdentificationSource3Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource3Choice }
     */
    public IdentificationSource3Choice createIdentificationSource3Choice() {
        return new IdentificationSource3Choice();
    }

    /**
     * Create an instance of {@link NDFOpeningFixing1Choice }
     * 
     * @return
     *     the new instance of {@link NDFOpeningFixing1Choice }
     */
    public NDFOpeningFixing1Choice createNDFOpeningFixing1Choice() {
        return new NDFOpeningFixing1Choice();
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
     * Create an instance of {@link NonDeliverableForwardConditions1 }
     * 
     * @return
     *     the new instance of {@link NonDeliverableForwardConditions1 }
     */
    public NonDeliverableForwardConditions1 createNonDeliverableForwardConditions1() {
        return new NonDeliverableForwardConditions1();
    }

    /**
     * Create an instance of {@link OpeningConditions1 }
     * 
     * @return
     *     the new instance of {@link OpeningConditions1 }
     */
    public OpeningConditions1 createOpeningConditions1() {
        return new OpeningConditions1();
    }

    /**
     * Create an instance of {@link OtherIdentification1 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification1 }
     */
    public OtherIdentification1 createOtherIdentification1() {
        return new OtherIdentification1();
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
     * Create an instance of {@link PartyIdentification60 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification60 }
     */
    public PartyIdentification60 createPartyIdentification60() {
        return new PartyIdentification60();
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
     * Create an instance of {@link RegulatoryReporting7 }
     * 
     * @return
     *     the new instance of {@link RegulatoryReporting7 }
     */
    public RegulatoryReporting7 createRegulatoryReporting7() {
        return new RegulatoryReporting7();
    }

    /**
     * Create an instance of {@link SecurityIdentification19 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification19 }
     */
    public SecurityIdentification19 createSecurityIdentification19() {
        return new SecurityIdentification19();
    }

    /**
     * Create an instance of {@link SettlementParties120 }
     * 
     * @return
     *     the new instance of {@link SettlementParties120 }
     */
    public SettlementParties120 createSettlementParties120() {
        return new SettlementParties120();
    }

    /**
     * Create an instance of {@link SettlementRateSource1 }
     * 
     * @return
     *     the new instance of {@link SettlementRateSource1 }
     */
    public SettlementRateSource1 createSettlementRateSource1() {
        return new SettlementRateSource1();
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
     * Create an instance of {@link TradeAgreement14 }
     * 
     * @return
     *     the new instance of {@link TradeAgreement14 }
     */
    public TradeAgreement14 createTradeAgreement14() {
        return new TradeAgreement14();
    }

    /**
     * Create an instance of {@link TradePartyIdentification8 }
     * 
     * @return
     *     the new instance of {@link TradePartyIdentification8 }
     */
    public TradePartyIdentification8 createTradePartyIdentification8() {
        return new TradePartyIdentification8();
    }

    /**
     * Create an instance of {@link TradingSideTransactionReporting2 }
     * 
     * @return
     *     the new instance of {@link TradingSideTransactionReporting2 }
     */
    public TradingSideTransactionReporting2 createTradingSideTransactionReporting2() {
        return new TradingSideTransactionReporting2();
    }

    /**
     * Create an instance of {@link UniqueTransactionIdentifier2 }
     * 
     * @return
     *     the new instance of {@link UniqueTransactionIdentifier2 }
     */
    public UniqueTransactionIdentifier2 createUniqueTransactionIdentifier2() {
        return new UniqueTransactionIdentifier2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
