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

package org.jpos.iso20022.auth_091_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionMatchingCriteria6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionMatchingCriteria6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptTrckgNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareText2" minOccurs="0"/>
 *         <element name="UnqTxIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUniqueTransactionIdentifier2" minOccurs="0"/>
 *         <element name="PrrUnqTxIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUniqueTransactionIdentifier2" minOccurs="0"/>
 *         <element name="SbsqntPosUnqTxIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUniqueTransactionIdentifier2" minOccurs="0"/>
 *         <element name="Dlta" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareLongFraction19DecimalNumber1" minOccurs="0"/>
 *         <element name="TradConf" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareTradeConfirmation2" minOccurs="0"/>
 *         <element name="TradClrOblgtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareTradeClearingObligation1" minOccurs="0"/>
 *         <element name="TradClrSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareTradeClearingStatus3" minOccurs="0"/>
 *         <element name="MstrAgrmtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareMasterAgreementType1" minOccurs="0"/>
 *         <element name="MstrAgrmtVrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareMax50Text1" minOccurs="0"/>
 *         <element name="IntraGrp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="PstTradRskRdctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ComparePostTradeRiskReduction2" minOccurs="0"/>
 *         <element name="DerivEvt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDerivativeEvent1" minOccurs="0"/>
 *         <element name="PltfmIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareMICIdentifier3" minOccurs="0"/>
 *         <element name="ExctnTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDateTime3" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="EarlyTermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDeliveryType1" minOccurs="0"/>
 *         <element name="TxPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice5" minOccurs="0"/>
 *         <element name="PricSchdlUadjstdFctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PricSchdlUadjstdEndDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxSchdlPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PackgPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice5" minOccurs="0"/>
 *         <element name="NtnlAmtFrstLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareAmountAndDirection3" minOccurs="0"/>
 *         <element name="NtnlAmtFrstLegUadjstdFctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlAmtFrstLegUadjstdEndDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlAmtFrstLegSchdlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareAmountAndDirection3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlQtyFrstLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareLongFraction19DecimalNumber1" minOccurs="0"/>
 *         <element name="NtnlQtyFrstLegUadjstdFctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlQtyFrstLegUadjstdEndDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlQtyFrstLegSchdlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareLongFraction19DecimalNumber1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlAmtScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNotionalAmount1" minOccurs="0"/>
 *         <element name="NtnlAmtScndLegUadjstdFctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlAmtScndLegUadjstdEndDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlAmtScndLegSchdlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareAmountAndDirection3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlQtyScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareLongFraction19DecimalNumber1" minOccurs="0"/>
 *         <element name="NtnlQtyScndLegUadjstdFctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlQtyScndLegUadjstdEndDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtnlQtyScndLegSchdlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareLongFraction19DecimalNumber1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareOtherPayment1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrstFxdRateFrstLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice7" minOccurs="0"/>
 *         <element name="IntrstFxdRateFrstLegDayCnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDayCount1" minOccurs="0"/>
 *         <element name="IntrstFxdRateFrstLegPmtFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFxdRateFrstLegPmtFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegId" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareISINIdentifier4" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareBenchmarkCode1" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareMax350Text1" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegDayCnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDayCount1" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegPmtFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegPmtFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegRefPrdUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegRefPrdVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegRstFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegRstFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateFrstLegSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice8" minOccurs="0"/>
 *         <element name="IntrstRateFxdScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice7" minOccurs="0"/>
 *         <element name="IntrstFxdRateScndLegDayCnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDayCount1" minOccurs="0"/>
 *         <element name="IntrstFxdRateScndLegPmtFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFxdRateScndLegPmtFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegId" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareISINIdentifier4" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareBenchmarkCode1" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareMax350Text1" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegDayCnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDayCount1" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegPmtFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegPmtFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegRefPrdUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegRefPrdVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegRstFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFrequencyUnit1" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegRstFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="IntrstFltgRateScndLegSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice8" minOccurs="0"/>
 *         <element name="PackgSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice8" minOccurs="0"/>
 *         <element name="CcyXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareExchangeRate1" minOccurs="0"/>
 *         <element name="CcyFwdXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareExchangeRate1" minOccurs="0"/>
 *         <element name="CcyXchgRateBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareExchangeRateBasis1" minOccurs="0"/>
 *         <element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareCommodityAssetClass4" minOccurs="0"/>
 *         <element name="NrgyDlvryPtOrZone" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDeliveryInterconnectionPoint1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NrgyIntrCnnctnPt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDeliveryInterconnectionPoint1" minOccurs="0"/>
 *         <element name="NrgyLdTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareEnergyLoadType1" minOccurs="0"/>
 *         <element name="DlvryAttr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareEnergyDeliveryAttribute1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareOptionType1" minOccurs="0"/>
 *         <element name="OptnExrcStyle" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareOptionStyle1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OptnStrkPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice4" minOccurs="0"/>
 *         <element name="OptnStrkPricSchdlUadjstdFctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OptnStrkPricSchdlUadjstdEndDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OptnStrkPricSchdlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnitPrice4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OptnPrmAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareActiveOrHistoricCurrencyAndAmount4" minOccurs="0"/>
 *         <element name="OptnPrmPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="OptnMtrtyDtOfUndrlyg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="CdtSnrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareSeniorityType1" minOccurs="0"/>
 *         <element name="CdtRefPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareReferenceParty1" minOccurs="0"/>
 *         <element name="CdtSrs" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber7" minOccurs="0"/>
 *         <element name="CdtVrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareNumber7" minOccurs="0"/>
 *         <element name="CdtIndxFctr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ComparePercentageRate3" minOccurs="0"/>
 *         <element name="CdtTrch" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareTrancheIndicator1" minOccurs="0"/>
 *         <element name="Lvl" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareReportingLevelType2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionMatchingCriteria6", propOrder = {
    "rptTrckgNb",
    "unqTxIdr",
    "prrUnqTxIdr",
    "sbsqntPosUnqTxIdr",
    "dlta",
    "tradConf",
    "tradClrOblgtn",
    "tradClrSts",
    "mstrAgrmtTp",
    "mstrAgrmtVrsn",
    "intraGrp",
    "pstTradRskRdctn",
    "derivEvt",
    "pltfmIdr",
    "exctnTmStmp",
    "fctvDt",
    "xprtnDt",
    "earlyTermntnDt",
    "sttlmDt",
    "dlvryTp",
    "txPric",
    "pricSchdlUadjstdFctvDt",
    "pricSchdlUadjstdEndDt",
    "txSchdlPric",
    "packgPric",
    "ntnlAmtFrstLeg",
    "ntnlAmtFrstLegUadjstdFctvDt",
    "ntnlAmtFrstLegUadjstdEndDt",
    "ntnlAmtFrstLegSchdlAmt",
    "ntnlQtyFrstLeg",
    "ntnlQtyFrstLegUadjstdFctvDt",
    "ntnlQtyFrstLegUadjstdEndDt",
    "ntnlQtyFrstLegSchdlQty",
    "ntnlAmtScndLeg",
    "ntnlAmtScndLegUadjstdFctvDt",
    "ntnlAmtScndLegUadjstdEndDt",
    "ntnlAmtScndLegSchdlAmt",
    "ntnlQtyScndLeg",
    "ntnlQtyScndLegUadjstdFctvDt",
    "ntnlQtyScndLegUadjstdEndDt",
    "ntnlQtyScndLegSchdlQty",
    "othrPmt",
    "intrstFxdRateFrstLeg",
    "intrstFxdRateFrstLegDayCnt",
    "intrstFxdRateFrstLegPmtFrqcyUnit",
    "intrstFxdRateFrstLegPmtFrqcyVal",
    "intrstFltgRateFrstLegId",
    "intrstFltgRateFrstLegCd",
    "intrstFltgRateFrstLegNm",
    "intrstFltgRateFrstLegDayCnt",
    "intrstFltgRateFrstLegPmtFrqcyUnit",
    "intrstFltgRateFrstLegPmtFrqcyVal",
    "intrstFltgRateFrstLegRefPrdUnit",
    "intrstFltgRateFrstLegRefPrdVal",
    "intrstFltgRateFrstLegRstFrqcyUnit",
    "intrstFltgRateFrstLegRstFrqcyVal",
    "intrstFltgRateFrstLegSprd",
    "intrstRateFxdScndLeg",
    "intrstFxdRateScndLegDayCnt",
    "intrstFxdRateScndLegPmtFrqcyUnit",
    "intrstFxdRateScndLegPmtFrqcyVal",
    "intrstFltgRateScndLegId",
    "intrstFltgRateScndLegCd",
    "intrstFltgRateScndLegNm",
    "intrstFltgRateScndLegDayCnt",
    "intrstFltgRateScndLegPmtFrqcyUnit",
    "intrstFltgRateScndLegPmtFrqcyVal",
    "intrstFltgRateScndLegRefPrdUnit",
    "intrstFltgRateScndLegRefPrdVal",
    "intrstFltgRateScndLegRstFrqcyUnit",
    "intrstFltgRateScndLegRstFrqcyVal",
    "intrstFltgRateScndLegSprd",
    "packgSprd",
    "ccyXchgRate",
    "ccyFwdXchgRate",
    "ccyXchgRateBsis",
    "cmmdty",
    "nrgyDlvryPtOrZone",
    "nrgyIntrCnnctnPt",
    "nrgyLdTp",
    "dlvryAttr",
    "optnTp",
    "optnExrcStyle",
    "optnStrkPric",
    "optnStrkPricSchdlUadjstdFctvDt",
    "optnStrkPricSchdlUadjstdEndDt",
    "optnStrkPricSchdlAmt",
    "optnPrmAmt",
    "optnPrmPmtDt",
    "optnMtrtyDtOfUndrlyg",
    "cdtSnrty",
    "cdtRefPty",
    "cdtSrs",
    "cdtVrsn",
    "cdtIndxFctr",
    "cdtTrch",
    "lvl"
})
public class TransactionMatchingCriteria6 {

    @XmlElement(name = "RptTrckgNb")
    protected CompareText2 rptTrckgNb;
    @XmlElement(name = "UnqTxIdr")
    protected CompareUniqueTransactionIdentifier2 unqTxIdr;
    @XmlElement(name = "PrrUnqTxIdr")
    protected CompareUniqueTransactionIdentifier2 prrUnqTxIdr;
    @XmlElement(name = "SbsqntPosUnqTxIdr")
    protected CompareUniqueTransactionIdentifier2 sbsqntPosUnqTxIdr;
    @XmlElement(name = "Dlta")
    protected CompareLongFraction19DecimalNumber1 dlta;
    @XmlElement(name = "TradConf")
    protected CompareTradeConfirmation2 tradConf;
    @XmlElement(name = "TradClrOblgtn")
    protected CompareTradeClearingObligation1 tradClrOblgtn;
    @XmlElement(name = "TradClrSts")
    protected CompareTradeClearingStatus3 tradClrSts;
    @XmlElement(name = "MstrAgrmtTp")
    protected CompareMasterAgreementType1 mstrAgrmtTp;
    @XmlElement(name = "MstrAgrmtVrsn")
    protected CompareMax50Text1 mstrAgrmtVrsn;
    @XmlElement(name = "IntraGrp")
    protected CompareTrueFalseIndicator3 intraGrp;
    @XmlElement(name = "PstTradRskRdctn")
    protected ComparePostTradeRiskReduction2 pstTradRskRdctn;
    @XmlElement(name = "DerivEvt")
    protected CompareDerivativeEvent1 derivEvt;
    @XmlElement(name = "PltfmIdr")
    protected CompareMICIdentifier3 pltfmIdr;
    @XmlElement(name = "ExctnTmStmp")
    protected CompareDateTime3 exctnTmStmp;
    @XmlElement(name = "FctvDt")
    protected CompareDate3 fctvDt;
    @XmlElement(name = "XprtnDt")
    protected CompareDate3 xprtnDt;
    @XmlElement(name = "EarlyTermntnDt")
    protected CompareDate3 earlyTermntnDt;
    @XmlElement(name = "SttlmDt")
    protected List<CompareDate3> sttlmDt;
    @XmlElement(name = "DlvryTp")
    protected CompareDeliveryType1 dlvryTp;
    @XmlElement(name = "TxPric")
    protected CompareUnitPrice5 txPric;
    @XmlElement(name = "PricSchdlUadjstdFctvDt")
    protected List<CompareDate3> pricSchdlUadjstdFctvDt;
    @XmlElement(name = "PricSchdlUadjstdEndDt")
    protected List<CompareDate3> pricSchdlUadjstdEndDt;
    @XmlElement(name = "TxSchdlPric")
    protected List<CompareUnitPrice5> txSchdlPric;
    @XmlElement(name = "PackgPric")
    protected CompareUnitPrice5 packgPric;
    @XmlElement(name = "NtnlAmtFrstLeg")
    protected CompareAmountAndDirection3 ntnlAmtFrstLeg;
    @XmlElement(name = "NtnlAmtFrstLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlAmtFrstLegUadjstdFctvDt;
    @XmlElement(name = "NtnlAmtFrstLegUadjstdEndDt")
    protected List<CompareDate3> ntnlAmtFrstLegUadjstdEndDt;
    @XmlElement(name = "NtnlAmtFrstLegSchdlAmt")
    protected List<CompareAmountAndDirection3> ntnlAmtFrstLegSchdlAmt;
    @XmlElement(name = "NtnlQtyFrstLeg")
    protected CompareLongFraction19DecimalNumber1 ntnlQtyFrstLeg;
    @XmlElement(name = "NtnlQtyFrstLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlQtyFrstLegUadjstdFctvDt;
    @XmlElement(name = "NtnlQtyFrstLegUadjstdEndDt")
    protected List<CompareDate3> ntnlQtyFrstLegUadjstdEndDt;
    @XmlElement(name = "NtnlQtyFrstLegSchdlQty")
    protected List<CompareLongFraction19DecimalNumber1> ntnlQtyFrstLegSchdlQty;
    @XmlElement(name = "NtnlAmtScndLeg")
    protected CompareNotionalAmount1 ntnlAmtScndLeg;
    @XmlElement(name = "NtnlAmtScndLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlAmtScndLegUadjstdFctvDt;
    @XmlElement(name = "NtnlAmtScndLegUadjstdEndDt")
    protected List<CompareDate3> ntnlAmtScndLegUadjstdEndDt;
    @XmlElement(name = "NtnlAmtScndLegSchdlAmt")
    protected List<CompareAmountAndDirection3> ntnlAmtScndLegSchdlAmt;
    @XmlElement(name = "NtnlQtyScndLeg")
    protected CompareLongFraction19DecimalNumber1 ntnlQtyScndLeg;
    @XmlElement(name = "NtnlQtyScndLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlQtyScndLegUadjstdFctvDt;
    @XmlElement(name = "NtnlQtyScndLegUadjstdEndDt")
    protected List<CompareDate3> ntnlQtyScndLegUadjstdEndDt;
    @XmlElement(name = "NtnlQtyScndLegSchdlQty")
    protected List<CompareLongFraction19DecimalNumber1> ntnlQtyScndLegSchdlQty;
    @XmlElement(name = "OthrPmt")
    protected List<CompareOtherPayment1> othrPmt;
    @XmlElement(name = "IntrstFxdRateFrstLeg")
    protected CompareUnitPrice7 intrstFxdRateFrstLeg;
    @XmlElement(name = "IntrstFxdRateFrstLegDayCnt")
    protected CompareDayCount1 intrstFxdRateFrstLegDayCnt;
    @XmlElement(name = "IntrstFxdRateFrstLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFxdRateFrstLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFxdRateFrstLegPmtFrqcyVal")
    protected CompareNumber5 intrstFxdRateFrstLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateFrstLegId")
    protected CompareISINIdentifier4 intrstFltgRateFrstLegId;
    @XmlElement(name = "IntrstFltgRateFrstLegCd")
    protected CompareBenchmarkCode1 intrstFltgRateFrstLegCd;
    @XmlElement(name = "IntrstFltgRateFrstLegNm")
    protected CompareMax350Text1 intrstFltgRateFrstLegNm;
    @XmlElement(name = "IntrstFltgRateFrstLegDayCnt")
    protected CompareDayCount1 intrstFltgRateFrstLegDayCnt;
    @XmlElement(name = "IntrstFltgRateFrstLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateFrstLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateFrstLegPmtFrqcyVal")
    protected CompareNumber5 intrstFltgRateFrstLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateFrstLegRefPrdUnit")
    protected CompareFrequencyUnit1 intrstFltgRateFrstLegRefPrdUnit;
    @XmlElement(name = "IntrstFltgRateFrstLegRefPrdVal")
    protected CompareNumber5 intrstFltgRateFrstLegRefPrdVal;
    @XmlElement(name = "IntrstFltgRateFrstLegRstFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateFrstLegRstFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateFrstLegRstFrqcyVal")
    protected CompareNumber5 intrstFltgRateFrstLegRstFrqcyVal;
    @XmlElement(name = "IntrstFltgRateFrstLegSprd")
    protected CompareUnitPrice8 intrstFltgRateFrstLegSprd;
    @XmlElement(name = "IntrstRateFxdScndLeg")
    protected CompareUnitPrice7 intrstRateFxdScndLeg;
    @XmlElement(name = "IntrstFxdRateScndLegDayCnt")
    protected CompareDayCount1 intrstFxdRateScndLegDayCnt;
    @XmlElement(name = "IntrstFxdRateScndLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFxdRateScndLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFxdRateScndLegPmtFrqcyVal")
    protected CompareNumber5 intrstFxdRateScndLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateScndLegId")
    protected CompareISINIdentifier4 intrstFltgRateScndLegId;
    @XmlElement(name = "IntrstFltgRateScndLegCd")
    protected CompareBenchmarkCode1 intrstFltgRateScndLegCd;
    @XmlElement(name = "IntrstFltgRateScndLegNm")
    protected CompareMax350Text1 intrstFltgRateScndLegNm;
    @XmlElement(name = "IntrstFltgRateScndLegDayCnt")
    protected CompareDayCount1 intrstFltgRateScndLegDayCnt;
    @XmlElement(name = "IntrstFltgRateScndLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateScndLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateScndLegPmtFrqcyVal")
    protected CompareNumber5 intrstFltgRateScndLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateScndLegRefPrdUnit")
    protected CompareFrequencyUnit1 intrstFltgRateScndLegRefPrdUnit;
    @XmlElement(name = "IntrstFltgRateScndLegRefPrdVal")
    protected CompareNumber5 intrstFltgRateScndLegRefPrdVal;
    @XmlElement(name = "IntrstFltgRateScndLegRstFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateScndLegRstFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateScndLegRstFrqcyVal")
    protected CompareNumber5 intrstFltgRateScndLegRstFrqcyVal;
    @XmlElement(name = "IntrstFltgRateScndLegSprd")
    protected CompareUnitPrice8 intrstFltgRateScndLegSprd;
    @XmlElement(name = "PackgSprd")
    protected CompareUnitPrice8 packgSprd;
    @XmlElement(name = "CcyXchgRate")
    protected CompareExchangeRate1 ccyXchgRate;
    @XmlElement(name = "CcyFwdXchgRate")
    protected CompareExchangeRate1 ccyFwdXchgRate;
    @XmlElement(name = "CcyXchgRateBsis")
    protected CompareExchangeRateBasis1 ccyXchgRateBsis;
    @XmlElement(name = "Cmmdty")
    protected CompareCommodityAssetClass4 cmmdty;
    @XmlElement(name = "NrgyDlvryPtOrZone")
    protected List<CompareDeliveryInterconnectionPoint1> nrgyDlvryPtOrZone;
    @XmlElement(name = "NrgyIntrCnnctnPt")
    protected CompareDeliveryInterconnectionPoint1 nrgyIntrCnnctnPt;
    @XmlElement(name = "NrgyLdTp")
    protected CompareEnergyLoadType1 nrgyLdTp;
    @XmlElement(name = "DlvryAttr")
    protected List<CompareEnergyDeliveryAttribute1> dlvryAttr;
    @XmlElement(name = "OptnTp")
    protected CompareOptionType1 optnTp;
    @XmlElement(name = "OptnExrcStyle")
    protected List<CompareOptionStyle1> optnExrcStyle;
    @XmlElement(name = "OptnStrkPric")
    protected CompareUnitPrice4 optnStrkPric;
    @XmlElement(name = "OptnStrkPricSchdlUadjstdFctvDt")
    protected List<CompareDate3> optnStrkPricSchdlUadjstdFctvDt;
    @XmlElement(name = "OptnStrkPricSchdlUadjstdEndDt")
    protected List<CompareDate3> optnStrkPricSchdlUadjstdEndDt;
    @XmlElement(name = "OptnStrkPricSchdlAmt")
    protected List<CompareUnitPrice4> optnStrkPricSchdlAmt;
    @XmlElement(name = "OptnPrmAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount4 optnPrmAmt;
    @XmlElement(name = "OptnPrmPmtDt")
    protected CompareDate3 optnPrmPmtDt;
    @XmlElement(name = "OptnMtrtyDtOfUndrlyg")
    protected CompareDate3 optnMtrtyDtOfUndrlyg;
    @XmlElement(name = "CdtSnrty")
    protected CompareSeniorityType1 cdtSnrty;
    @XmlElement(name = "CdtRefPty")
    protected CompareReferenceParty1 cdtRefPty;
    @XmlElement(name = "CdtSrs")
    protected CompareNumber7 cdtSrs;
    @XmlElement(name = "CdtVrsn")
    protected CompareNumber7 cdtVrsn;
    @XmlElement(name = "CdtIndxFctr")
    protected ComparePercentageRate3 cdtIndxFctr;
    @XmlElement(name = "CdtTrch")
    protected CompareTrancheIndicator1 cdtTrch;
    @XmlElement(name = "Lvl")
    protected CompareReportingLevelType2 lvl;

    /**
     * Gets the value of the rptTrckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link CompareText2 }
     *     
     */
    public CompareText2 getRptTrckgNb() {
        return rptTrckgNb;
    }

    /**
     * Sets the value of the rptTrckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareText2 }
     *     
     */
    public void setRptTrckgNb(CompareText2 value) {
        this.rptTrckgNb = value;
    }

    /**
     * Gets the value of the unqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public CompareUniqueTransactionIdentifier2 getUnqTxIdr() {
        return unqTxIdr;
    }

    /**
     * Sets the value of the unqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public void setUnqTxIdr(CompareUniqueTransactionIdentifier2 value) {
        this.unqTxIdr = value;
    }

    /**
     * Gets the value of the prrUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public CompareUniqueTransactionIdentifier2 getPrrUnqTxIdr() {
        return prrUnqTxIdr;
    }

    /**
     * Sets the value of the prrUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public void setPrrUnqTxIdr(CompareUniqueTransactionIdentifier2 value) {
        this.prrUnqTxIdr = value;
    }

    /**
     * Gets the value of the sbsqntPosUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public CompareUniqueTransactionIdentifier2 getSbsqntPosUnqTxIdr() {
        return sbsqntPosUnqTxIdr;
    }

    /**
     * Sets the value of the sbsqntPosUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public void setSbsqntPosUnqTxIdr(CompareUniqueTransactionIdentifier2 value) {
        this.sbsqntPosUnqTxIdr = value;
    }

    /**
     * Gets the value of the dlta property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getDlta() {
        return dlta;
    }

    /**
     * Sets the value of the dlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public void setDlta(CompareLongFraction19DecimalNumber1 value) {
        this.dlta = value;
    }

    /**
     * Gets the value of the tradConf property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTradeConfirmation2 }
     *     
     */
    public CompareTradeConfirmation2 getTradConf() {
        return tradConf;
    }

    /**
     * Sets the value of the tradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTradeConfirmation2 }
     *     
     */
    public void setTradConf(CompareTradeConfirmation2 value) {
        this.tradConf = value;
    }

    /**
     * Gets the value of the tradClrOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTradeClearingObligation1 }
     *     
     */
    public CompareTradeClearingObligation1 getTradClrOblgtn() {
        return tradClrOblgtn;
    }

    /**
     * Sets the value of the tradClrOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTradeClearingObligation1 }
     *     
     */
    public void setTradClrOblgtn(CompareTradeClearingObligation1 value) {
        this.tradClrOblgtn = value;
    }

    /**
     * Gets the value of the tradClrSts property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTradeClearingStatus3 }
     *     
     */
    public CompareTradeClearingStatus3 getTradClrSts() {
        return tradClrSts;
    }

    /**
     * Sets the value of the tradClrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTradeClearingStatus3 }
     *     
     */
    public void setTradClrSts(CompareTradeClearingStatus3 value) {
        this.tradClrSts = value;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMasterAgreementType1 }
     *     
     */
    public CompareMasterAgreementType1 getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMasterAgreementType1 }
     *     
     */
    public void setMstrAgrmtTp(CompareMasterAgreementType1 value) {
        this.mstrAgrmtTp = value;
    }

    /**
     * Gets the value of the mstrAgrmtVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMax50Text1 }
     *     
     */
    public CompareMax50Text1 getMstrAgrmtVrsn() {
        return mstrAgrmtVrsn;
    }

    /**
     * Sets the value of the mstrAgrmtVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMax50Text1 }
     *     
     */
    public void setMstrAgrmtVrsn(CompareMax50Text1 value) {
        this.mstrAgrmtVrsn = value;
    }

    /**
     * Gets the value of the intraGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getIntraGrp() {
        return intraGrp;
    }

    /**
     * Sets the value of the intraGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setIntraGrp(CompareTrueFalseIndicator3 value) {
        this.intraGrp = value;
    }

    /**
     * Gets the value of the pstTradRskRdctn property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePostTradeRiskReduction2 }
     *     
     */
    public ComparePostTradeRiskReduction2 getPstTradRskRdctn() {
        return pstTradRskRdctn;
    }

    /**
     * Sets the value of the pstTradRskRdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePostTradeRiskReduction2 }
     *     
     */
    public void setPstTradRskRdctn(ComparePostTradeRiskReduction2 value) {
        this.pstTradRskRdctn = value;
    }

    /**
     * Gets the value of the derivEvt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDerivativeEvent1 }
     *     
     */
    public CompareDerivativeEvent1 getDerivEvt() {
        return derivEvt;
    }

    /**
     * Sets the value of the derivEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDerivativeEvent1 }
     *     
     */
    public void setDerivEvt(CompareDerivativeEvent1 value) {
        this.derivEvt = value;
    }

    /**
     * Gets the value of the pltfmIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public CompareMICIdentifier3 getPltfmIdr() {
        return pltfmIdr;
    }

    /**
     * Sets the value of the pltfmIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public void setPltfmIdr(CompareMICIdentifier3 value) {
        this.pltfmIdr = value;
    }

    /**
     * Gets the value of the exctnTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime3 }
     *     
     */
    public CompareDateTime3 getExctnTmStmp() {
        return exctnTmStmp;
    }

    /**
     * Sets the value of the exctnTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime3 }
     *     
     */
    public void setExctnTmStmp(CompareDateTime3 value) {
        this.exctnTmStmp = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setFctvDt(CompareDate3 value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setXprtnDt(CompareDate3 value) {
        this.xprtnDt = value;
    }

    /**
     * Gets the value of the earlyTermntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getEarlyTermntnDt() {
        return earlyTermntnDt;
    }

    /**
     * Sets the value of the earlyTermntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setEarlyTermntnDt(CompareDate3 value) {
        this.earlyTermntnDt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the sttlmDt property.
     */
    public List<CompareDate3> getSttlmDt() {
        if (sttlmDt == null) {
            sttlmDt = new ArrayList<>();
        }
        return this.sttlmDt;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryType1 }
     *     
     */
    public CompareDeliveryType1 getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryType1 }
     *     
     */
    public void setDlvryTp(CompareDeliveryType1 value) {
        this.dlvryTp = value;
    }

    /**
     * Gets the value of the txPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public CompareUnitPrice5 getTxPric() {
        return txPric;
    }

    /**
     * Sets the value of the txPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public void setTxPric(CompareUnitPrice5 value) {
        this.txPric = value;
    }

    /**
     * Gets the value of the pricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricSchdlUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the pricSchdlUadjstdFctvDt property.
     */
    public List<CompareDate3> getPricSchdlUadjstdFctvDt() {
        if (pricSchdlUadjstdFctvDt == null) {
            pricSchdlUadjstdFctvDt = new ArrayList<>();
        }
        return this.pricSchdlUadjstdFctvDt;
    }

    /**
     * Gets the value of the pricSchdlUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricSchdlUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricSchdlUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the pricSchdlUadjstdEndDt property.
     */
    public List<CompareDate3> getPricSchdlUadjstdEndDt() {
        if (pricSchdlUadjstdEndDt == null) {
            pricSchdlUadjstdEndDt = new ArrayList<>();
        }
        return this.pricSchdlUadjstdEndDt;
    }

    /**
     * Gets the value of the txSchdlPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSchdlPric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSchdlPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareUnitPrice5 }
     * 
     * 
     * @return
     *     The value of the txSchdlPric property.
     */
    public List<CompareUnitPrice5> getTxSchdlPric() {
        if (txSchdlPric == null) {
            txSchdlPric = new ArrayList<>();
        }
        return this.txSchdlPric;
    }

    /**
     * Gets the value of the packgPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public CompareUnitPrice5 getPackgPric() {
        return packgPric;
    }

    /**
     * Sets the value of the packgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public void setPackgPric(CompareUnitPrice5 value) {
        this.packgPric = value;
    }

    /**
     * Gets the value of the ntnlAmtFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getNtnlAmtFrstLeg() {
        return ntnlAmtFrstLeg;
    }

    /**
     * Sets the value of the ntnlAmtFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public void setNtnlAmtFrstLeg(CompareAmountAndDirection3 value) {
        this.ntnlAmtFrstLeg = value;
    }

    /**
     * Gets the value of the ntnlAmtFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtFrstLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtFrstLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlAmtFrstLegUadjstdFctvDt() {
        if (ntnlAmtFrstLegUadjstdFctvDt == null) {
            ntnlAmtFrstLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlAmtFrstLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlAmtFrstLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtFrstLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtFrstLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtFrstLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlAmtFrstLegUadjstdEndDt() {
        if (ntnlAmtFrstLegUadjstdEndDt == null) {
            ntnlAmtFrstLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlAmtFrstLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlAmtFrstLegSchdlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtFrstLegSchdlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtFrstLegSchdlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareAmountAndDirection3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtFrstLegSchdlAmt property.
     */
    public List<CompareAmountAndDirection3> getNtnlAmtFrstLegSchdlAmt() {
        if (ntnlAmtFrstLegSchdlAmt == null) {
            ntnlAmtFrstLegSchdlAmt = new ArrayList<>();
        }
        return this.ntnlAmtFrstLegSchdlAmt;
    }

    /**
     * Gets the value of the ntnlQtyFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getNtnlQtyFrstLeg() {
        return ntnlQtyFrstLeg;
    }

    /**
     * Sets the value of the ntnlQtyFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public void setNtnlQtyFrstLeg(CompareLongFraction19DecimalNumber1 value) {
        this.ntnlQtyFrstLeg = value;
    }

    /**
     * Gets the value of the ntnlQtyFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyFrstLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyFrstLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlQtyFrstLegUadjstdFctvDt() {
        if (ntnlQtyFrstLegUadjstdFctvDt == null) {
            ntnlQtyFrstLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlQtyFrstLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlQtyFrstLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyFrstLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyFrstLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyFrstLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlQtyFrstLegUadjstdEndDt() {
        if (ntnlQtyFrstLegUadjstdEndDt == null) {
            ntnlQtyFrstLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlQtyFrstLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlQtyFrstLegSchdlQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyFrstLegSchdlQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyFrstLegSchdlQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareLongFraction19DecimalNumber1 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyFrstLegSchdlQty property.
     */
    public List<CompareLongFraction19DecimalNumber1> getNtnlQtyFrstLegSchdlQty() {
        if (ntnlQtyFrstLegSchdlQty == null) {
            ntnlQtyFrstLegSchdlQty = new ArrayList<>();
        }
        return this.ntnlQtyFrstLegSchdlQty;
    }

    /**
     * Gets the value of the ntnlAmtScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNotionalAmount1 }
     *     
     */
    public CompareNotionalAmount1 getNtnlAmtScndLeg() {
        return ntnlAmtScndLeg;
    }

    /**
     * Sets the value of the ntnlAmtScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNotionalAmount1 }
     *     
     */
    public void setNtnlAmtScndLeg(CompareNotionalAmount1 value) {
        this.ntnlAmtScndLeg = value;
    }

    /**
     * Gets the value of the ntnlAmtScndLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtScndLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtScndLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtScndLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlAmtScndLegUadjstdFctvDt() {
        if (ntnlAmtScndLegUadjstdFctvDt == null) {
            ntnlAmtScndLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlAmtScndLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlAmtScndLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtScndLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtScndLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtScndLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlAmtScndLegUadjstdEndDt() {
        if (ntnlAmtScndLegUadjstdEndDt == null) {
            ntnlAmtScndLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlAmtScndLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlAmtScndLegSchdlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtScndLegSchdlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtScndLegSchdlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareAmountAndDirection3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtScndLegSchdlAmt property.
     */
    public List<CompareAmountAndDirection3> getNtnlAmtScndLegSchdlAmt() {
        if (ntnlAmtScndLegSchdlAmt == null) {
            ntnlAmtScndLegSchdlAmt = new ArrayList<>();
        }
        return this.ntnlAmtScndLegSchdlAmt;
    }

    /**
     * Gets the value of the ntnlQtyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getNtnlQtyScndLeg() {
        return ntnlQtyScndLeg;
    }

    /**
     * Sets the value of the ntnlQtyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public void setNtnlQtyScndLeg(CompareLongFraction19DecimalNumber1 value) {
        this.ntnlQtyScndLeg = value;
    }

    /**
     * Gets the value of the ntnlQtyScndLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyScndLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyScndLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyScndLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlQtyScndLegUadjstdFctvDt() {
        if (ntnlQtyScndLegUadjstdFctvDt == null) {
            ntnlQtyScndLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlQtyScndLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlQtyScndLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyScndLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyScndLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyScndLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlQtyScndLegUadjstdEndDt() {
        if (ntnlQtyScndLegUadjstdEndDt == null) {
            ntnlQtyScndLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlQtyScndLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlQtyScndLegSchdlQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyScndLegSchdlQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyScndLegSchdlQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareLongFraction19DecimalNumber1 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyScndLegSchdlQty property.
     */
    public List<CompareLongFraction19DecimalNumber1> getNtnlQtyScndLegSchdlQty() {
        if (ntnlQtyScndLegSchdlQty == null) {
            ntnlQtyScndLegSchdlQty = new ArrayList<>();
        }
        return this.ntnlQtyScndLegSchdlQty;
    }

    /**
     * Gets the value of the othrPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareOtherPayment1 }
     * 
     * 
     * @return
     *     The value of the othrPmt property.
     */
    public List<CompareOtherPayment1> getOthrPmt() {
        if (othrPmt == null) {
            othrPmt = new ArrayList<>();
        }
        return this.othrPmt;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public CompareUnitPrice7 getIntrstFxdRateFrstLeg() {
        return intrstFxdRateFrstLeg;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public void setIntrstFxdRateFrstLeg(CompareUnitPrice7 value) {
        this.intrstFxdRateFrstLeg = value;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFxdRateFrstLegDayCnt() {
        return intrstFxdRateFrstLegDayCnt;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public void setIntrstFxdRateFrstLegDayCnt(CompareDayCount1 value) {
        this.intrstFxdRateFrstLegDayCnt = value;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFxdRateFrstLegPmtFrqcyUnit() {
        return intrstFxdRateFrstLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFxdRateFrstLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFxdRateFrstLegPmtFrqcyUnit = value;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFxdRateFrstLegPmtFrqcyVal() {
        return intrstFxdRateFrstLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFxdRateFrstLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFxdRateFrstLegPmtFrqcyVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public CompareISINIdentifier4 getIntrstFltgRateFrstLegId() {
        return intrstFltgRateFrstLegId;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public void setIntrstFltgRateFrstLegId(CompareISINIdentifier4 value) {
        this.intrstFltgRateFrstLegId = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegCd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public CompareBenchmarkCode1 getIntrstFltgRateFrstLegCd() {
        return intrstFltgRateFrstLegCd;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public void setIntrstFltgRateFrstLegCd(CompareBenchmarkCode1 value) {
        this.intrstFltgRateFrstLegCd = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegNm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public CompareMax350Text1 getIntrstFltgRateFrstLegNm() {
        return intrstFltgRateFrstLegNm;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public void setIntrstFltgRateFrstLegNm(CompareMax350Text1 value) {
        this.intrstFltgRateFrstLegNm = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFltgRateFrstLegDayCnt() {
        return intrstFltgRateFrstLegDayCnt;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public void setIntrstFltgRateFrstLegDayCnt(CompareDayCount1 value) {
        this.intrstFltgRateFrstLegDayCnt = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateFrstLegPmtFrqcyUnit() {
        return intrstFltgRateFrstLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFltgRateFrstLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateFrstLegPmtFrqcyUnit = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateFrstLegPmtFrqcyVal() {
        return intrstFltgRateFrstLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFltgRateFrstLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateFrstLegPmtFrqcyVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRefPrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateFrstLegRefPrdUnit() {
        return intrstFltgRateFrstLegRefPrdUnit;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRefPrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFltgRateFrstLegRefPrdUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateFrstLegRefPrdUnit = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRefPrdVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateFrstLegRefPrdVal() {
        return intrstFltgRateFrstLegRefPrdVal;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRefPrdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFltgRateFrstLegRefPrdVal(CompareNumber5 value) {
        this.intrstFltgRateFrstLegRefPrdVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateFrstLegRstFrqcyUnit() {
        return intrstFltgRateFrstLegRstFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFltgRateFrstLegRstFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateFrstLegRstFrqcyUnit = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateFrstLegRstFrqcyVal() {
        return intrstFltgRateFrstLegRstFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFltgRateFrstLegRstFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateFrstLegRstFrqcyVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public CompareUnitPrice8 getIntrstFltgRateFrstLegSprd() {
        return intrstFltgRateFrstLegSprd;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public void setIntrstFltgRateFrstLegSprd(CompareUnitPrice8 value) {
        this.intrstFltgRateFrstLegSprd = value;
    }

    /**
     * Gets the value of the intrstRateFxdScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public CompareUnitPrice7 getIntrstRateFxdScndLeg() {
        return intrstRateFxdScndLeg;
    }

    /**
     * Sets the value of the intrstRateFxdScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public void setIntrstRateFxdScndLeg(CompareUnitPrice7 value) {
        this.intrstRateFxdScndLeg = value;
    }

    /**
     * Gets the value of the intrstFxdRateScndLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFxdRateScndLegDayCnt() {
        return intrstFxdRateScndLegDayCnt;
    }

    /**
     * Sets the value of the intrstFxdRateScndLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public void setIntrstFxdRateScndLegDayCnt(CompareDayCount1 value) {
        this.intrstFxdRateScndLegDayCnt = value;
    }

    /**
     * Gets the value of the intrstFxdRateScndLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFxdRateScndLegPmtFrqcyUnit() {
        return intrstFxdRateScndLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFxdRateScndLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFxdRateScndLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFxdRateScndLegPmtFrqcyUnit = value;
    }

    /**
     * Gets the value of the intrstFxdRateScndLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFxdRateScndLegPmtFrqcyVal() {
        return intrstFxdRateScndLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFxdRateScndLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFxdRateScndLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFxdRateScndLegPmtFrqcyVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public CompareISINIdentifier4 getIntrstFltgRateScndLegId() {
        return intrstFltgRateScndLegId;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public void setIntrstFltgRateScndLegId(CompareISINIdentifier4 value) {
        this.intrstFltgRateScndLegId = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegCd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public CompareBenchmarkCode1 getIntrstFltgRateScndLegCd() {
        return intrstFltgRateScndLegCd;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public void setIntrstFltgRateScndLegCd(CompareBenchmarkCode1 value) {
        this.intrstFltgRateScndLegCd = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegNm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public CompareMax350Text1 getIntrstFltgRateScndLegNm() {
        return intrstFltgRateScndLegNm;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public void setIntrstFltgRateScndLegNm(CompareMax350Text1 value) {
        this.intrstFltgRateScndLegNm = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFltgRateScndLegDayCnt() {
        return intrstFltgRateScndLegDayCnt;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public void setIntrstFltgRateScndLegDayCnt(CompareDayCount1 value) {
        this.intrstFltgRateScndLegDayCnt = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateScndLegPmtFrqcyUnit() {
        return intrstFltgRateScndLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFltgRateScndLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateScndLegPmtFrqcyUnit = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateScndLegPmtFrqcyVal() {
        return intrstFltgRateScndLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFltgRateScndLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateScndLegPmtFrqcyVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRefPrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateScndLegRefPrdUnit() {
        return intrstFltgRateScndLegRefPrdUnit;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRefPrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFltgRateScndLegRefPrdUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateScndLegRefPrdUnit = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRefPrdVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateScndLegRefPrdVal() {
        return intrstFltgRateScndLegRefPrdVal;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRefPrdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFltgRateScndLegRefPrdVal(CompareNumber5 value) {
        this.intrstFltgRateScndLegRefPrdVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateScndLegRstFrqcyUnit() {
        return intrstFltgRateScndLegRstFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public void setIntrstFltgRateScndLegRstFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateScndLegRstFrqcyUnit = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateScndLegRstFrqcyVal() {
        return intrstFltgRateScndLegRstFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setIntrstFltgRateScndLegRstFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateScndLegRstFrqcyVal = value;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public CompareUnitPrice8 getIntrstFltgRateScndLegSprd() {
        return intrstFltgRateScndLegSprd;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public void setIntrstFltgRateScndLegSprd(CompareUnitPrice8 value) {
        this.intrstFltgRateScndLegSprd = value;
    }

    /**
     * Gets the value of the packgSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public CompareUnitPrice8 getPackgSprd() {
        return packgSprd;
    }

    /**
     * Sets the value of the packgSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public void setPackgSprd(CompareUnitPrice8 value) {
        this.packgSprd = value;
    }

    /**
     * Gets the value of the ccyXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public CompareExchangeRate1 getCcyXchgRate() {
        return ccyXchgRate;
    }

    /**
     * Sets the value of the ccyXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public void setCcyXchgRate(CompareExchangeRate1 value) {
        this.ccyXchgRate = value;
    }

    /**
     * Gets the value of the ccyFwdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public CompareExchangeRate1 getCcyFwdXchgRate() {
        return ccyFwdXchgRate;
    }

    /**
     * Sets the value of the ccyFwdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public void setCcyFwdXchgRate(CompareExchangeRate1 value) {
        this.ccyFwdXchgRate = value;
    }

    /**
     * Gets the value of the ccyXchgRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExchangeRateBasis1 }
     *     
     */
    public CompareExchangeRateBasis1 getCcyXchgRateBsis() {
        return ccyXchgRateBsis;
    }

    /**
     * Sets the value of the ccyXchgRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExchangeRateBasis1 }
     *     
     */
    public void setCcyXchgRateBsis(CompareExchangeRateBasis1 value) {
        this.ccyXchgRateBsis = value;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCommodityAssetClass4 }
     *     
     */
    public CompareCommodityAssetClass4 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCommodityAssetClass4 }
     *     
     */
    public void setCmmdty(CompareCommodityAssetClass4 value) {
        this.cmmdty = value;
    }

    /**
     * Gets the value of the nrgyDlvryPtOrZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrgyDlvryPtOrZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrgyDlvryPtOrZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDeliveryInterconnectionPoint1 }
     * 
     * 
     * @return
     *     The value of the nrgyDlvryPtOrZone property.
     */
    public List<CompareDeliveryInterconnectionPoint1> getNrgyDlvryPtOrZone() {
        if (nrgyDlvryPtOrZone == null) {
            nrgyDlvryPtOrZone = new ArrayList<>();
        }
        return this.nrgyDlvryPtOrZone;
    }

    /**
     * Gets the value of the nrgyIntrCnnctnPt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryInterconnectionPoint1 }
     *     
     */
    public CompareDeliveryInterconnectionPoint1 getNrgyIntrCnnctnPt() {
        return nrgyIntrCnnctnPt;
    }

    /**
     * Sets the value of the nrgyIntrCnnctnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryInterconnectionPoint1 }
     *     
     */
    public void setNrgyIntrCnnctnPt(CompareDeliveryInterconnectionPoint1 value) {
        this.nrgyIntrCnnctnPt = value;
    }

    /**
     * Gets the value of the nrgyLdTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareEnergyLoadType1 }
     *     
     */
    public CompareEnergyLoadType1 getNrgyLdTp() {
        return nrgyLdTp;
    }

    /**
     * Sets the value of the nrgyLdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareEnergyLoadType1 }
     *     
     */
    public void setNrgyLdTp(CompareEnergyLoadType1 value) {
        this.nrgyLdTp = value;
    }

    /**
     * Gets the value of the dlvryAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareEnergyDeliveryAttribute1 }
     * 
     * 
     * @return
     *     The value of the dlvryAttr property.
     */
    public List<CompareEnergyDeliveryAttribute1> getDlvryAttr() {
        if (dlvryAttr == null) {
            dlvryAttr = new ArrayList<>();
        }
        return this.dlvryAttr;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOptionType1 }
     *     
     */
    public CompareOptionType1 getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOptionType1 }
     *     
     */
    public void setOptnTp(CompareOptionType1 value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnExrcStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnExrcStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnExrcStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareOptionStyle1 }
     * 
     * 
     * @return
     *     The value of the optnExrcStyle property.
     */
    public List<CompareOptionStyle1> getOptnExrcStyle() {
        if (optnExrcStyle == null) {
            optnExrcStyle = new ArrayList<>();
        }
        return this.optnExrcStyle;
    }

    /**
     * Gets the value of the optnStrkPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice4 }
     *     
     */
    public CompareUnitPrice4 getOptnStrkPric() {
        return optnStrkPric;
    }

    /**
     * Sets the value of the optnStrkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice4 }
     *     
     */
    public void setOptnStrkPric(CompareUnitPrice4 value) {
        this.optnStrkPric = value;
    }

    /**
     * Gets the value of the optnStrkPricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnStrkPricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnStrkPricSchdlUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the optnStrkPricSchdlUadjstdFctvDt property.
     */
    public List<CompareDate3> getOptnStrkPricSchdlUadjstdFctvDt() {
        if (optnStrkPricSchdlUadjstdFctvDt == null) {
            optnStrkPricSchdlUadjstdFctvDt = new ArrayList<>();
        }
        return this.optnStrkPricSchdlUadjstdFctvDt;
    }

    /**
     * Gets the value of the optnStrkPricSchdlUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnStrkPricSchdlUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnStrkPricSchdlUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the optnStrkPricSchdlUadjstdEndDt property.
     */
    public List<CompareDate3> getOptnStrkPricSchdlUadjstdEndDt() {
        if (optnStrkPricSchdlUadjstdEndDt == null) {
            optnStrkPricSchdlUadjstdEndDt = new ArrayList<>();
        }
        return this.optnStrkPricSchdlUadjstdEndDt;
    }

    /**
     * Gets the value of the optnStrkPricSchdlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnStrkPricSchdlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnStrkPricSchdlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareUnitPrice4 }
     * 
     * 
     * @return
     *     The value of the optnStrkPricSchdlAmt property.
     */
    public List<CompareUnitPrice4> getOptnStrkPricSchdlAmt() {
        if (optnStrkPricSchdlAmt == null) {
            optnStrkPricSchdlAmt = new ArrayList<>();
        }
        return this.optnStrkPricSchdlAmt;
    }

    /**
     * Gets the value of the optnPrmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount4 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount4 getOptnPrmAmt() {
        return optnPrmAmt;
    }

    /**
     * Sets the value of the optnPrmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount4 }
     *     
     */
    public void setOptnPrmAmt(CompareActiveOrHistoricCurrencyAndAmount4 value) {
        this.optnPrmAmt = value;
    }

    /**
     * Gets the value of the optnPrmPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getOptnPrmPmtDt() {
        return optnPrmPmtDt;
    }

    /**
     * Sets the value of the optnPrmPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setOptnPrmPmtDt(CompareDate3 value) {
        this.optnPrmPmtDt = value;
    }

    /**
     * Gets the value of the optnMtrtyDtOfUndrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getOptnMtrtyDtOfUndrlyg() {
        return optnMtrtyDtOfUndrlyg;
    }

    /**
     * Sets the value of the optnMtrtyDtOfUndrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setOptnMtrtyDtOfUndrlyg(CompareDate3 value) {
        this.optnMtrtyDtOfUndrlyg = value;
    }

    /**
     * Gets the value of the cdtSnrty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSeniorityType1 }
     *     
     */
    public CompareSeniorityType1 getCdtSnrty() {
        return cdtSnrty;
    }

    /**
     * Sets the value of the cdtSnrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSeniorityType1 }
     *     
     */
    public void setCdtSnrty(CompareSeniorityType1 value) {
        this.cdtSnrty = value;
    }

    /**
     * Gets the value of the cdtRefPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReferenceParty1 }
     *     
     */
    public CompareReferenceParty1 getCdtRefPty() {
        return cdtRefPty;
    }

    /**
     * Sets the value of the cdtRefPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReferenceParty1 }
     *     
     */
    public void setCdtRefPty(CompareReferenceParty1 value) {
        this.cdtRefPty = value;
    }

    /**
     * Gets the value of the cdtSrs property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber7 }
     *     
     */
    public CompareNumber7 getCdtSrs() {
        return cdtSrs;
    }

    /**
     * Sets the value of the cdtSrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber7 }
     *     
     */
    public void setCdtSrs(CompareNumber7 value) {
        this.cdtSrs = value;
    }

    /**
     * Gets the value of the cdtVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber7 }
     *     
     */
    public CompareNumber7 getCdtVrsn() {
        return cdtVrsn;
    }

    /**
     * Sets the value of the cdtVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber7 }
     *     
     */
    public void setCdtVrsn(CompareNumber7 value) {
        this.cdtVrsn = value;
    }

    /**
     * Gets the value of the cdtIndxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getCdtIndxFctr() {
        return cdtIndxFctr;
    }

    /**
     * Sets the value of the cdtIndxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public void setCdtIndxFctr(ComparePercentageRate3 value) {
        this.cdtIndxFctr = value;
    }

    /**
     * Gets the value of the cdtTrch property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrancheIndicator1 }
     *     
     */
    public CompareTrancheIndicator1 getCdtTrch() {
        return cdtTrch;
    }

    /**
     * Sets the value of the cdtTrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrancheIndicator1 }
     *     
     */
    public void setCdtTrch(CompareTrancheIndicator1 value) {
        this.cdtTrch = value;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReportingLevelType2 }
     *     
     */
    public CompareReportingLevelType2 getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReportingLevelType2 }
     *     
     */
    public void setLvl(CompareReportingLevelType2 value) {
        this.lvl = value;
    }

}
