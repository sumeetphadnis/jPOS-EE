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

package org.jpos.iso20022.camt_017_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_017_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.017.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_017_001_05
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
     * Create an instance of {@link CurrencyExchange20 }
     * 
     * @return
     *     the new instance of {@link CurrencyExchange20 }
     */
    public CurrencyExchange20 createCurrencyExchange20() {
        return new CurrencyExchange20();
    }

    /**
     * Create an instance of {@link CurrencyExchangeReport4 }
     * 
     * @return
     *     the new instance of {@link CurrencyExchangeReport4 }
     */
    public CurrencyExchangeReport4 createCurrencyExchangeReport4() {
        return new CurrencyExchangeReport4();
    }

    /**
     * Create an instance of {@link CurrencySourceTarget1 }
     * 
     * @return
     *     the new instance of {@link CurrencySourceTarget1 }
     */
    public CurrencySourceTarget1 createCurrencySourceTarget1() {
        return new CurrencySourceTarget1();
    }

    /**
     * Create an instance of {@link ErrorHandling1Choice }
     * 
     * @return
     *     the new instance of {@link ErrorHandling1Choice }
     */
    public ErrorHandling1Choice createErrorHandling1Choice() {
        return new ErrorHandling1Choice();
    }

    /**
     * Create an instance of {@link ErrorHandling3 }
     * 
     * @return
     *     the new instance of {@link ErrorHandling3 }
     */
    public ErrorHandling3 createErrorHandling3() {
        return new ErrorHandling3();
    }

    /**
     * Create an instance of {@link ExchangeRateOrPercentage1Choice }
     * 
     * @return
     *     the new instance of {@link ExchangeRateOrPercentage1Choice }
     */
    public ExchangeRateOrPercentage1Choice createExchangeRateOrPercentage1Choice() {
        return new ExchangeRateOrPercentage1Choice();
    }

    /**
     * Create an instance of {@link ExchangeRateReportOrError3Choice }
     * 
     * @return
     *     the new instance of {@link ExchangeRateReportOrError3Choice }
     */
    public ExchangeRateReportOrError3Choice createExchangeRateReportOrError3Choice() {
        return new ExchangeRateReportOrError3Choice();
    }

    /**
     * Create an instance of {@link ExchangeRateReportOrError4Choice }
     * 
     * @return
     *     the new instance of {@link ExchangeRateReportOrError4Choice }
     */
    public ExchangeRateReportOrError4Choice createExchangeRateReportOrError4Choice() {
        return new ExchangeRateReportOrError4Choice();
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
     * Create an instance of {@link MessageHeader7 }
     * 
     * @return
     *     the new instance of {@link MessageHeader7 }
     */
    public MessageHeader7 createMessageHeader7() {
        return new MessageHeader7();
    }

    /**
     * Create an instance of {@link OriginalBusinessQuery1 }
     * 
     * @return
     *     the new instance of {@link OriginalBusinessQuery1 }
     */
    public OriginalBusinessQuery1 createOriginalBusinessQuery1() {
        return new OriginalBusinessQuery1();
    }

    /**
     * Create an instance of {@link RequestType4Choice }
     * 
     * @return
     *     the new instance of {@link RequestType4Choice }
     */
    public RequestType4Choice createRequestType4Choice() {
        return new RequestType4Choice();
    }

    /**
     * Create an instance of {@link ReturnCurrencyExchangeRateV05 }
     * 
     * @return
     *     the new instance of {@link ReturnCurrencyExchangeRateV05 }
     */
    public ReturnCurrencyExchangeRateV05 createReturnCurrencyExchangeRateV05() {
        return new ReturnCurrencyExchangeRateV05();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.017.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
