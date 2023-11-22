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

package org.jpos.iso20022.sese_025_001_11;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_025_001_11 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.025.001.11", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_025_001_11
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
     * Create an instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount createActiveOrHistoricCurrencyAnd13DecimalAmount() {
        return new ActiveOrHistoricCurrencyAnd13DecimalAmount();
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
     * Create an instance of {@link AdditionalParameters29 }
     * 
     * @return
     *     the new instance of {@link AdditionalParameters29 }
     */
    public AdditionalParameters29 createAdditionalParameters29() {
        return new AdditionalParameters29();
    }

    /**
     * Create an instance of {@link AlternatePartyIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification7 }
     */
    public AlternatePartyIdentification7 createAlternatePartyIdentification7() {
        return new AlternatePartyIdentification7();
    }

    /**
     * Create an instance of {@link AmountAndDirection44 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection44 }
     */
    public AmountAndDirection44 createAmountAndDirection44() {
        return new AmountAndDirection44();
    }

    /**
     * Create an instance of {@link AmountAndDirection52 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection52 }
     */
    public AmountAndDirection52 createAmountAndDirection52() {
        return new AmountAndDirection52();
    }

    /**
     * Create an instance of {@link AmountAndDirection94 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection94 }
     */
    public AmountAndDirection94 createAmountAndDirection94() {
        return new AmountAndDirection94();
    }

    /**
     * Create an instance of {@link AutomaticBorrowing6Choice }
     * 
     * @return
     *     the new instance of {@link AutomaticBorrowing6Choice }
     */
    public AutomaticBorrowing6Choice createAutomaticBorrowing6Choice() {
        return new AutomaticBorrowing6Choice();
    }

    /**
     * Create an instance of {@link BeneficialOwnership4Choice }
     * 
     * @return
     *     the new instance of {@link BeneficialOwnership4Choice }
     */
    public BeneficialOwnership4Choice createBeneficialOwnership4Choice() {
        return new BeneficialOwnership4Choice();
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
     * Create an instance of {@link BlockTrade4Choice }
     * 
     * @return
     *     the new instance of {@link BlockTrade4Choice }
     */
    public BlockTrade4Choice createBlockTrade4Choice() {
        return new BlockTrade4Choice();
    }

    /**
     * Create an instance of {@link CashAccountIdentification5Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountIdentification5Choice }
     */
    public CashAccountIdentification5Choice createCashAccountIdentification5Choice() {
        return new CashAccountIdentification5Choice();
    }

    /**
     * Create an instance of {@link CashParties36 }
     * 
     * @return
     *     the new instance of {@link CashParties36 }
     */
    public CashParties36 createCashParties36() {
        return new CashParties36();
    }

    /**
     * Create an instance of {@link CashSettlementSystem4Choice }
     * 
     * @return
     *     the new instance of {@link CashSettlementSystem4Choice }
     */
    public CashSettlementSystem4Choice createCashSettlementSystem4Choice() {
        return new CashSettlementSystem4Choice();
    }

    /**
     * Create an instance of {@link CentralCounterPartyEligibility4Choice }
     * 
     * @return
     *     the new instance of {@link CentralCounterPartyEligibility4Choice }
     */
    public CentralCounterPartyEligibility4Choice createCentralCounterPartyEligibility4Choice() {
        return new CentralCounterPartyEligibility4Choice();
    }

    /**
     * Create an instance of {@link ClassificationType32Choice }
     * 
     * @return
     *     the new instance of {@link ClassificationType32Choice }
     */
    public ClassificationType32Choice createClassificationType32Choice() {
        return new ClassificationType32Choice();
    }

    /**
     * Create an instance of {@link Counterparty15Choice }
     * 
     * @return
     *     the new instance of {@link Counterparty15Choice }
     */
    public Counterparty15Choice createCounterparty15Choice() {
        return new Counterparty15Choice();
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
     * Create an instance of {@link ExposureType22Choice }
     * 
     * @return
     *     the new instance of {@link ExposureType22Choice }
     */
    public ExposureType22Choice createExposureType22Choice() {
        return new ExposureType22Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrumentAttributes111 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentAttributes111 }
     */
    public FinancialInstrumentAttributes111 createFinancialInstrumentAttributes111() {
        return new FinancialInstrumentAttributes111();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity33Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity33Choice }
     */
    public FinancialInstrumentQuantity33Choice createFinancialInstrumentQuantity33Choice() {
        return new FinancialInstrumentQuantity33Choice();
    }

    /**
     * Create an instance of {@link ForeignExchangeTerms23 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms23 }
     */
    public ForeignExchangeTerms23 createForeignExchangeTerms23() {
        return new ForeignExchangeTerms23();
    }

    /**
     * Create an instance of {@link FormOfSecurity6Choice }
     * 
     * @return
     *     the new instance of {@link FormOfSecurity6Choice }
     */
    public FormOfSecurity6Choice createFormOfSecurity6Choice() {
        return new FormOfSecurity6Choice();
    }

    /**
     * Create an instance of {@link Frequency23Choice }
     * 
     * @return
     *     the new instance of {@link Frequency23Choice }
     */
    public Frequency23Choice createFrequency23Choice() {
        return new Frequency23Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification1 }
     */
    public GenericIdentification1 createGenericIdentification1() {
        return new GenericIdentification1();
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
     * Create an instance of {@link GenericIdentification37 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification37 }
     */
    public GenericIdentification37 createGenericIdentification37() {
        return new GenericIdentification37();
    }

    /**
     * Create an instance of {@link GenericIdentification78 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification78 }
     */
    public GenericIdentification78 createGenericIdentification78() {
        return new GenericIdentification78();
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
     * Create an instance of {@link IdentificationType42Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType42Choice }
     */
    public IdentificationType42Choice createIdentificationType42Choice() {
        return new IdentificationType42Choice();
    }

    /**
     * Create an instance of {@link InterestComputationMethodFormat4Choice }
     * 
     * @return
     *     the new instance of {@link InterestComputationMethodFormat4Choice }
     */
    public InterestComputationMethodFormat4Choice createInterestComputationMethodFormat4Choice() {
        return new InterestComputationMethodFormat4Choice();
    }

    /**
     * Create an instance of {@link InvestorCapacity4Choice }
     * 
     * @return
     *     the new instance of {@link InvestorCapacity4Choice }
     */
    public InvestorCapacity4Choice createInvestorCapacity4Choice() {
        return new InvestorCapacity4Choice();
    }

    /**
     * Create an instance of {@link LetterOfGuarantee4Choice }
     * 
     * @return
     *     the new instance of {@link LetterOfGuarantee4Choice }
     */
    public LetterOfGuarantee4Choice createLetterOfGuarantee4Choice() {
        return new LetterOfGuarantee4Choice();
    }

    /**
     * Create an instance of {@link Linkages41 }
     * 
     * @return
     *     the new instance of {@link Linkages41 }
     */
    public Linkages41 createLinkages41() {
        return new Linkages41();
    }

    /**
     * Create an instance of {@link MarketClientSide6Choice }
     * 
     * @return
     *     the new instance of {@link MarketClientSide6Choice }
     */
    public MarketClientSide6Choice createMarketClientSide6Choice() {
        return new MarketClientSide6Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification1Choice }
     */
    public MarketIdentification1Choice createMarketIdentification1Choice() {
        return new MarketIdentification1Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification3Choice }
     */
    public MarketIdentification3Choice createMarketIdentification3Choice() {
        return new MarketIdentification3Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification84 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification84 }
     */
    public MarketIdentification84 createMarketIdentification84() {
        return new MarketIdentification84();
    }

    /**
     * Create an instance of {@link MarketType8Choice }
     * 
     * @return
     *     the new instance of {@link MarketType8Choice }
     */
    public MarketType8Choice createMarketType8Choice() {
        return new MarketType8Choice();
    }

    /**
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
    }

    /**
     * Create an instance of {@link NettingEligibility4Choice }
     * 
     * @return
     *     the new instance of {@link NettingEligibility4Choice }
     */
    public NettingEligibility4Choice createNettingEligibility4Choice() {
        return new NettingEligibility4Choice();
    }

    /**
     * Create an instance of {@link Number22Choice }
     * 
     * @return
     *     the new instance of {@link Number22Choice }
     */
    public Number22Choice createNumber22Choice() {
        return new Number22Choice();
    }

    /**
     * Create an instance of {@link OpeningClosing3Choice }
     * 
     * @return
     *     the new instance of {@link OpeningClosing3Choice }
     */
    public OpeningClosing3Choice createOpeningClosing3Choice() {
        return new OpeningClosing3Choice();
    }

    /**
     * Create an instance of {@link OptionStyle8Choice }
     * 
     * @return
     *     the new instance of {@link OptionStyle8Choice }
     */
    public OptionStyle8Choice createOptionStyle8Choice() {
        return new OptionStyle8Choice();
    }

    /**
     * Create an instance of {@link OptionType6Choice }
     * 
     * @return
     *     the new instance of {@link OptionType6Choice }
     */
    public OptionType6Choice createOptionType6Choice() {
        return new OptionType6Choice();
    }

    /**
     * Create an instance of {@link OriginalAndCurrentQuantities1 }
     * 
     * @return
     *     the new instance of {@link OriginalAndCurrentQuantities1 }
     */
    public OriginalAndCurrentQuantities1 createOriginalAndCurrentQuantities1() {
        return new OriginalAndCurrentQuantities1();
    }

    /**
     * Create an instance of {@link OtherAmounts40 }
     * 
     * @return
     *     the new instance of {@link OtherAmounts40 }
     */
    public OtherAmounts40 createOtherAmounts40() {
        return new OtherAmounts40();
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
     * Create an instance of {@link OtherParties43 }
     * 
     * @return
     *     the new instance of {@link OtherParties43 }
     */
    public OtherParties43 createOtherParties43() {
        return new OtherParties43();
    }

    /**
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification122Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification122Choice }
     */
    public PartyIdentification122Choice createPartyIdentification122Choice() {
        return new PartyIdentification122Choice();
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
     * Create an instance of {@link PartyIdentification133Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification133Choice }
     */
    public PartyIdentification133Choice createPartyIdentification133Choice() {
        return new PartyIdentification133Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification136 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136 }
     */
    public PartyIdentification136 createPartyIdentification136() {
        return new PartyIdentification136();
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
     * Create an instance of {@link PartyIdentification146 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification146 }
     */
    public PartyIdentification146 createPartyIdentification146() {
        return new PartyIdentification146();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount164 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount164 }
     */
    public PartyIdentificationAndAccount164 createPartyIdentificationAndAccount164() {
        return new PartyIdentificationAndAccount164();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount165 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount165 }
     */
    public PartyIdentificationAndAccount165 createPartyIdentificationAndAccount165() {
        return new PartyIdentificationAndAccount165();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount171 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount171 }
     */
    public PartyIdentificationAndAccount171 createPartyIdentificationAndAccount171() {
        return new PartyIdentificationAndAccount171();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount196 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount196 }
     */
    public PartyIdentificationAndAccount196 createPartyIdentificationAndAccount196() {
        return new PartyIdentificationAndAccount196();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount197 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount197 }
     */
    public PartyIdentificationAndAccount197 createPartyIdentificationAndAccount197() {
        return new PartyIdentificationAndAccount197();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount198 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount198 }
     */
    public PartyIdentificationAndAccount198 createPartyIdentificationAndAccount198() {
        return new PartyIdentificationAndAccount198();
    }

    /**
     * Create an instance of {@link PartyTextInformation1 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation1 }
     */
    public PartyTextInformation1 createPartyTextInformation1() {
        return new PartyTextInformation1();
    }

    /**
     * Create an instance of {@link PartyTextInformation2 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation2 }
     */
    public PartyTextInformation2 createPartyTextInformation2() {
        return new PartyTextInformation2();
    }

    /**
     * Create an instance of {@link PlaceOfClearingIdentification2 }
     * 
     * @return
     *     the new instance of {@link PlaceOfClearingIdentification2 }
     */
    public PlaceOfClearingIdentification2 createPlaceOfClearingIdentification2() {
        return new PlaceOfClearingIdentification2();
    }

    /**
     * Create an instance of {@link PlaceOfTradeIdentification1 }
     * 
     * @return
     *     the new instance of {@link PlaceOfTradeIdentification1 }
     */
    public PlaceOfTradeIdentification1 createPlaceOfTradeIdentification1() {
        return new PlaceOfTradeIdentification1();
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
     * Create an instance of {@link Price10 }
     * 
     * @return
     *     the new instance of {@link Price10 }
     */
    public Price10 createPrice10() {
        return new Price10();
    }

    /**
     * Create an instance of {@link Price7 }
     * 
     * @return
     *     the new instance of {@link Price7 }
     */
    public Price7 createPrice7() {
        return new Price7();
    }

    /**
     * Create an instance of {@link PriceRateOrAmount3Choice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmount3Choice }
     */
    public PriceRateOrAmount3Choice createPriceRateOrAmount3Choice() {
        return new PriceRateOrAmount3Choice();
    }

    /**
     * Create an instance of {@link PriceType4Choice }
     * 
     * @return
     *     the new instance of {@link PriceType4Choice }
     */
    public PriceType4Choice createPriceType4Choice() {
        return new PriceType4Choice();
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
     * Create an instance of {@link ProcessingPosition9Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingPosition9Choice }
     */
    public ProcessingPosition9Choice createProcessingPosition9Choice() {
        return new ProcessingPosition9Choice();
    }

    /**
     * Create an instance of {@link Quantity51Choice }
     * 
     * @return
     *     the new instance of {@link Quantity51Choice }
     */
    public Quantity51Choice createQuantity51Choice() {
        return new Quantity51Choice();
    }

    /**
     * Create an instance of {@link QuantityAndAccount96 }
     * 
     * @return
     *     the new instance of {@link QuantityAndAccount96 }
     */
    public QuantityAndAccount96 createQuantityAndAccount96() {
        return new QuantityAndAccount96();
    }

    /**
     * Create an instance of {@link QuantityBreakdown63 }
     * 
     * @return
     *     the new instance of {@link QuantityBreakdown63 }
     */
    public QuantityBreakdown63 createQuantityBreakdown63() {
        return new QuantityBreakdown63();
    }

    /**
     * Create an instance of {@link Registration9Choice }
     * 
     * @return
     *     the new instance of {@link Registration9Choice }
     */
    public Registration9Choice createRegistration9Choice() {
        return new Registration9Choice();
    }

    /**
     * Create an instance of {@link RegistrationParameters6 }
     * 
     * @return
     *     the new instance of {@link RegistrationParameters6 }
     */
    public RegistrationParameters6 createRegistrationParameters6() {
        return new RegistrationParameters6();
    }

    /**
     * Create an instance of {@link Reporting6Choice }
     * 
     * @return
     *     the new instance of {@link Reporting6Choice }
     */
    public Reporting6Choice createReporting6Choice() {
        return new Reporting6Choice();
    }

    /**
     * Create an instance of {@link RepurchaseType22Choice }
     * 
     * @return
     *     the new instance of {@link RepurchaseType22Choice }
     */
    public RepurchaseType22Choice createRepurchaseType22Choice() {
        return new RepurchaseType22Choice();
    }

    /**
     * Create an instance of {@link Restriction5Choice }
     * 
     * @return
     *     the new instance of {@link Restriction5Choice }
     */
    public Restriction5Choice createRestriction5Choice() {
        return new Restriction5Choice();
    }

    /**
     * Create an instance of {@link SafeKeepingPlace3 }
     * 
     * @return
     *     the new instance of {@link SafeKeepingPlace3 }
     */
    public SafeKeepingPlace3 createSafeKeepingPlace3() {
        return new SafeKeepingPlace3();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat29Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat29Choice }
     */
    public SafekeepingPlaceFormat29Choice createSafekeepingPlaceFormat29Choice() {
        return new SafekeepingPlaceFormat29Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     */
    public SafekeepingPlaceTypeAndIdentification1 createSafekeepingPlaceTypeAndIdentification1() {
        return new SafekeepingPlaceTypeAndIdentification1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndText8 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText8 }
     */
    public SafekeepingPlaceTypeAndText8 createSafekeepingPlaceTypeAndText8() {
        return new SafekeepingPlaceTypeAndText8();
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
     * Create an instance of {@link SecuritiesCertificate4 }
     * 
     * @return
     *     the new instance of {@link SecuritiesCertificate4 }
     */
    public SecuritiesCertificate4 createSecuritiesCertificate4() {
        return new SecuritiesCertificate4();
    }

    /**
     * Create an instance of {@link SecuritiesPaymentStatus5Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesPaymentStatus5Choice }
     */
    public SecuritiesPaymentStatus5Choice createSecuritiesPaymentStatus5Choice() {
        return new SecuritiesPaymentStatus5Choice();
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
     * Create an instance of {@link SecuritiesSettlementTransactionConfirmationV11 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementTransactionConfirmationV11 }
     */
    public SecuritiesSettlementTransactionConfirmationV11 createSecuritiesSettlementTransactionConfirmationV11() {
        return new SecuritiesSettlementTransactionConfirmationV11();
    }

    /**
     * Create an instance of {@link SecuritiesTradeDetails118 }
     * 
     * @return
     *     the new instance of {@link SecuritiesTradeDetails118 }
     */
    public SecuritiesTradeDetails118 createSecuritiesTradeDetails118() {
        return new SecuritiesTradeDetails118();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionType43Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionType43Choice }
     */
    public SecuritiesTransactionType43Choice createSecuritiesTransactionType43Choice() {
        return new SecuritiesTransactionType43Choice();
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
     * Create an instance of {@link SettlementDate17Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDate17Choice }
     */
    public SettlementDate17Choice createSettlementDate17Choice() {
        return new SettlementDate17Choice();
    }

    /**
     * Create an instance of {@link SettlementDate18Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDate18Choice }
     */
    public SettlementDate18Choice createSettlementDate18Choice() {
        return new SettlementDate18Choice();
    }

    /**
     * Create an instance of {@link SettlementDateCode7Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDateCode7Choice }
     */
    public SettlementDateCode7Choice createSettlementDateCode7Choice() {
        return new SettlementDateCode7Choice();
    }

    /**
     * Create an instance of {@link SettlementDetails203 }
     * 
     * @return
     *     the new instance of {@link SettlementDetails203 }
     */
    public SettlementDetails203 createSettlementDetails203() {
        return new SettlementDetails203();
    }

    /**
     * Create an instance of {@link SettlementParties100 }
     * 
     * @return
     *     the new instance of {@link SettlementParties100 }
     */
    public SettlementParties100 createSettlementParties100() {
        return new SettlementParties100();
    }

    /**
     * Create an instance of {@link SettlementStandingInstructionDatabase4Choice }
     * 
     * @return
     *     the new instance of {@link SettlementStandingInstructionDatabase4Choice }
     */
    public SettlementStandingInstructionDatabase4Choice createSettlementStandingInstructionDatabase4Choice() {
        return new SettlementStandingInstructionDatabase4Choice();
    }

    /**
     * Create an instance of {@link SettlementSystemMethod4Choice }
     * 
     * @return
     *     the new instance of {@link SettlementSystemMethod4Choice }
     */
    public SettlementSystemMethod4Choice createSettlementSystemMethod4Choice() {
        return new SettlementSystemMethod4Choice();
    }

    /**
     * Create an instance of {@link SettlementTransactionCondition34Choice }
     * 
     * @return
     *     the new instance of {@link SettlementTransactionCondition34Choice }
     */
    public SettlementTransactionCondition34Choice createSettlementTransactionCondition34Choice() {
        return new SettlementTransactionCondition34Choice();
    }

    /**
     * Create an instance of {@link SettlementTypeAndIdentification27 }
     * 
     * @return
     *     the new instance of {@link SettlementTypeAndIdentification27 }
     */
    public SettlementTypeAndIdentification27 createSettlementTypeAndIdentification27() {
        return new SettlementTypeAndIdentification27();
    }

    /**
     * Create an instance of {@link SettlingCapacity7Choice }
     * 
     * @return
     *     the new instance of {@link SettlingCapacity7Choice }
     */
    public SettlingCapacity7Choice createSettlingCapacity7Choice() {
        return new SettlingCapacity7Choice();
    }

    /**
     * Create an instance of {@link StandingSettlementInstruction18 }
     * 
     * @return
     *     the new instance of {@link StandingSettlementInstruction18 }
     */
    public StandingSettlementInstruction18 createStandingSettlementInstruction18() {
        return new StandingSettlementInstruction18();
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
     * Create an instance of {@link TaxCapacityParty4Choice }
     * 
     * @return
     *     the new instance of {@link TaxCapacityParty4Choice }
     */
    public TaxCapacityParty4Choice createTaxCapacityParty4Choice() {
        return new TaxCapacityParty4Choice();
    }

    /**
     * Create an instance of {@link TradeDate8Choice }
     * 
     * @return
     *     the new instance of {@link TradeDate8Choice }
     */
    public TradeDate8Choice createTradeDate8Choice() {
        return new TradeDate8Choice();
    }

    /**
     * Create an instance of {@link TradeDateCode3Choice }
     * 
     * @return
     *     the new instance of {@link TradeDateCode3Choice }
     */
    public TradeDateCode3Choice createTradeDateCode3Choice() {
        return new TradeDateCode3Choice();
    }

    /**
     * Create an instance of {@link TradeOriginator3Choice }
     * 
     * @return
     *     the new instance of {@link TradeOriginator3Choice }
     */
    public TradeOriginator3Choice createTradeOriginator3Choice() {
        return new TradeOriginator3Choice();
    }

    /**
     * Create an instance of {@link TradeTransactionCondition5Choice }
     * 
     * @return
     *     the new instance of {@link TradeTransactionCondition5Choice }
     */
    public TradeTransactionCondition5Choice createTradeTransactionCondition5Choice() {
        return new TradeTransactionCondition5Choice();
    }

    /**
     * Create an instance of {@link TypeOfPrice29Choice }
     * 
     * @return
     *     the new instance of {@link TypeOfPrice29Choice }
     */
    public TypeOfPrice29Choice createTypeOfPrice29Choice() {
        return new TypeOfPrice29Choice();
    }

    /**
     * Create an instance of {@link YieldedOrValueType1Choice }
     * 
     * @return
     *     the new instance of {@link YieldedOrValueType1Choice }
     */
    public YieldedOrValueType1Choice createYieldedOrValueType1Choice() {
        return new YieldedOrValueType1Choice();
    }

    /**
     * Create an instance of {@link YieldedOrValueType2Choice }
     * 
     * @return
     *     the new instance of {@link YieldedOrValueType2Choice }
     */
    public YieldedOrValueType2Choice createYieldedOrValueType2Choice() {
        return new YieldedOrValueType2Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.025.001.11", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
