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

package org.jpos.iso20022.fxtr_008_001_07;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.fxtr_008_001_07 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.07", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.fxtr_008_001_07
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
     * Create an instance of {@link AmountOrRate4Choice }
     * 
     * @return
     *     the new instance of {@link AmountOrRate4Choice }
     */
    public AmountOrRate4Choice createAmountOrRate4Choice() {
        return new AmountOrRate4Choice();
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
     * Create an instance of {@link CounterpartySideTransactionReporting2 }
     * 
     * @return
     *     the new instance of {@link CounterpartySideTransactionReporting2 }
     */
    public CounterpartySideTransactionReporting2 createCounterpartySideTransactionReporting2() {
        return new CounterpartySideTransactionReporting2();
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
     * Create an instance of {@link ForeignExchangeTradeStatusNotificationV07 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTradeStatusNotificationV07 }
     */
    public ForeignExchangeTradeStatusNotificationV07 createForeignExchangeTradeStatusNotificationV07() {
        return new ForeignExchangeTradeStatusNotificationV07();
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
     * Create an instance of {@link NameAndAddress8 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress8 }
     */
    public NameAndAddress8 createNameAndAddress8() {
        return new NameAndAddress8();
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
     * Create an instance of {@link Status27Choice }
     * 
     * @return
     *     the new instance of {@link Status27Choice }
     */
    public Status27Choice createStatus27Choice() {
        return new Status27Choice();
    }

    /**
     * Create an instance of {@link Status28Choice }
     * 
     * @return
     *     the new instance of {@link Status28Choice }
     */
    public Status28Choice createStatus28Choice() {
        return new Status28Choice();
    }

    /**
     * Create an instance of {@link StatusAndSubStatus2 }
     * 
     * @return
     *     the new instance of {@link StatusAndSubStatus2 }
     */
    public StatusAndSubStatus2 createStatusAndSubStatus2() {
        return new StatusAndSubStatus2();
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
     * Create an instance of {@link TradeData15 }
     * 
     * @return
     *     the new instance of {@link TradeData15 }
     */
    public TradeData15 createTradeData15() {
        return new TradeData15();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.07", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
