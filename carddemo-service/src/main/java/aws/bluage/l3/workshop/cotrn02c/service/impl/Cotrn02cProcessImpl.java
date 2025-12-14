
package aws.bluage.l3.workshop.cotrn02c.service.impl;

import aws.bluage.l3.workshop.cotrn02c.business.context.Cotrn02cContext;
import aws.bluage.l3.workshop.cotrn02c.service.Cotrn02cProcess;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.CallBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cotrn02cProcessImpl
 * 
 * Defines application services for Cotrn02cProcess
 * @see Cotrn02cProcess
 */
@Service("aws.bluage.l3.workshop.cotrn02c.service.Cotrn02cProcess")
public class Cotrn02cProcessImpl implements Cotrn02cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cotrn02cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COTRN02C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COTRN02C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Add a new Transaction to TRANSACT file
		*****************************************************************
		Copyright Amazon.com, Inc. or its affiliates.
		All Rights Reserved.
		Licensed under the Apache License, Version 2.0 (the \"License\").
		You may not use this file except in compliance with the License.
		You may obtain a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
		Unless required by applicable law or agreed to in writing,
		software distributed under the License is distributed on an
		\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
		either express or implied. See the License for the specific
		language governing permissions and limitations under the License
		*****************************************************************
		----------------------------------------------------------------*
		WORKING STORAGE SECTION
		----------------------------------------------------------------*
		No background transparency
		----------------------------------------------------------------*
		LINKAGE SECTION
		----------------------------------------------------------------*
		----------------------------------------------------------------*
		PROCEDURE DIVISION
		----------------------------------------------------------------* */
		ctx.getWsVariables().setErrFlgOff(true);
		ctx.getWsVariables().setUsrModifiedNo(true);
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		DataUtils.setToBlank(ctx.getGroup1().getErrmsgoReference());
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
			returnToPrevScreen(ctx, ctrl);
		} else {
			int len = ctx.getDfheiblk().getEibcalen();
			ctx.getCarddemoCommarea().setBytes(ctx.getDfhcommarea().getBytes(0, len));
			if (!(ctx.getCarddemoCommarea().isCdemoPgmReenter())) {
				ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
				ctx.getGroup1().getCotrn2aoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().setActidinl(-1);
				if (!(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCt02TrnSelectedReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCt02TrnSelectedReference()))) {
					ctx.getGroup1().getCardniniReference().setValue(ctx.getCarddemoCommarea().getCdemoCt02TrnSelectedReference());
					processEnterKey(ctx, ctrl);
				} 
				sendTrnaddScreen(ctx, ctrl);
			} else {
				receiveTrnaddScreen(ctx, ctrl);
				if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
					processEnterKey(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
					if (DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoFromProgramReference()) || DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoFromProgramReference())) {
						ctx.getCarddemoCommarea().setCdemoToProgram("COMEN01C");
					} else {
						ctx.getCarddemoCommarea().getCdemoToProgramReference().setValue(ctx.getCarddemoCommarea().getCdemoFromProgramReference());
					}
					returnToPrevScreen(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf4Reference()) == 0) {
					clearCurrentScreen(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf5Reference()) == 0) {
					copyLastTranData(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendTrnaddScreen(ctx, ctrl);
				}
			}
		}
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withTransID(ctx.getWsVariables().getWsTranid())
		.withCommarea(ctx.getCarddemoCommarea())
		.execute()
		.handleException();
	}

	/**
	 * Process operation processEnterKey.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-ENTER-KEY
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void processEnterKey(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		validateInputKeyFields(ctx, ctrl);
		validateInputDataFields(ctx, ctrl);
		if (DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "Y") == 0 || DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "y") == 0) {
			addTransaction(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "N") == 0 || DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "n") == 0 || DataUtils.isBlank(ctx.getGroup1().getConfirmiReference()) || DataUtils.isLowValue(ctx.getGroup1().getConfirmiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Confirm to add this transaction...");
			ctx.getGroup1().setConfirml(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Invalid value. Valid values are (Y/N)...");
			ctx.getGroup1().setConfirml(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation validateInputKeyFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                       VALIDATE-INPUT-KEY-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void validateInputKeyFields(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		if (!(DataUtils.isBlank(ctx.getGroup1().getActidiniReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getActidiniReference()))) {
			if (!(DataUtils.isNumeric(ctx.getGroup1().getActidiniReference()))) {
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getWsVariables().setWsMessage("Account ID must be Numeric...");
				ctx.getGroup1().setActidinl(-1);
				sendTrnaddScreen(ctx, ctrl);
			} 
			ctx.getWsVariables().setWsAcctIdN(NumberUtils.convert(ctx.getGroup1().getActidini()).longValue());
			ctx.getCardXrefRecord().setXrefAcctId(ctx.getWsVariables().getWsAcctIdN());
			ctx.getGroup1().setActidini(ctx.getWsVariables().getWsAcctIdNReference().getValue(String.class));
			readCxacaixFile(ctx, ctrl);
			ctx.getGroup1().getCardniniReference().setValue(ctx.getCardXrefRecord().getXrefCardNumReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getCardniniReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getCardniniReference()))) {
			if (!(DataUtils.isNumeric(ctx.getGroup1().getCardniniReference()))) {
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getWsVariables().setWsMessage("Card Number must be Numeric...");
				ctx.getGroup1().setCardninl(-1);
				sendTrnaddScreen(ctx, ctrl);
			} 
			ctx.getWsVariables().setWsCardNumN(NumberUtils.convert(ctx.getGroup1().getCardnini()).longValue());
			ctx.getCardXrefRecord().setXrefCardNum(ctx.getWsVariables().getWsCardNumNReference().getValue(String.class));
			ctx.getGroup1().setCardnini(ctx.getWsVariables().getWsCardNumNReference().getValue(String.class));
			readCcxrefFile(ctx, ctrl);
			ctx.getGroup1().setActidini(ctx.getCardXrefRecord().getXrefAcctIdReference().getValue(String.class));
		} else {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Account or Card Number must be entered...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation validateInputDataFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                  VALIDATE-INPUT-DATA-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void validateInputDataFields(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		if (ctx.getWsVariables().isErrFlgOn()) {
			DataUtils.setToBlank(ctx.getGroup1().getTtypcdiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTcatcdiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTrnsrciReference());
			DataUtils.setToBlank(ctx.getGroup1().getTrnamtiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesciReference());
			DataUtils.setToBlank(ctx.getGroup1().getTorigdtiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTprocdtiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMidiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMnameiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMcityiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMzipiReference());
		} 
		if (DataUtils.isBlank(ctx.getGroup1().getTtypcdiReference()) || DataUtils.isLowValue(ctx.getGroup1().getTtypcdiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Type CD can NOT be empty...");
			ctx.getGroup1().setTtypcdl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getTcatcdiReference()) || DataUtils.isLowValue(ctx.getGroup1().getTcatcdiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Category CD can NOT be empty...");
			ctx.getGroup1().setTcatcdl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getTrnsrciReference()) || DataUtils.isLowValue(ctx.getGroup1().getTrnsrciReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Source can NOT be empty...");
			ctx.getGroup1().setTrnsrcl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getTdesciReference()) || DataUtils.isLowValue(ctx.getGroup1().getTdesciReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Description can NOT be empty...");
			ctx.getGroup1().setTdescl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getTrnamtiReference()) || DataUtils.isLowValue(ctx.getGroup1().getTrnamtiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Amount can NOT be empty...");
			ctx.getGroup1().setTrnamtl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getTorigdtiReference()) || DataUtils.isLowValue(ctx.getGroup1().getTorigdtiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Orig Date can NOT be empty...");
			ctx.getGroup1().setTorigdtl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getTprocdtiReference()) || DataUtils.isLowValue(ctx.getGroup1().getTprocdtiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Proc Date can NOT be empty...");
			ctx.getGroup1().setTprocdtl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getMidiReference()) || DataUtils.isLowValue(ctx.getGroup1().getMidiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Merchant ID can NOT be empty...");
			ctx.getGroup1().setMidl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getMnameiReference()) || DataUtils.isLowValue(ctx.getGroup1().getMnameiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Merchant Name can NOT be empty...");
			ctx.getGroup1().setMnamel(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getMcityiReference()) || DataUtils.isLowValue(ctx.getGroup1().getMcityiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Merchant City can NOT be empty...");
			ctx.getGroup1().setMcityl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getMzipiReference()) || DataUtils.isLowValue(ctx.getGroup1().getMzipiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Merchant Zip can NOT be empty...");
			ctx.getGroup1().setMzipl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		if (!(DataUtils.isNumeric(ctx.getGroup1().getTtypcdiReference()))) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Type CD must be Numeric...");
			ctx.getGroup1().setTtypcdl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else if (!(DataUtils.isNumeric(ctx.getGroup1().getTcatcdiReference()))) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Category CD must be Numeric...");
			ctx.getGroup1().setTcatcdl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		if ((DataUtils.compare(ctx.getGroup1().getTrnamtiReference().getBytes(0, 1), "-") != 0 && DataUtils.compare(ctx.getGroup1().getTrnamtiReference().getBytes(0, 1), "+") != 0) || !(DataUtils.isNumeric(ctx.getGroup1().getTrnamtiReference().getBytes(1, 8))) || DataUtils.compare(ctx.getGroup1().getTrnamtiReference().getBytes(9, 1), ".") != 0 || !(DataUtils.isNumeric(ctx.getGroup1().getTrnamtiReference().getBytes(10, 2)))) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Amount should be in format -99999999.99");
			ctx.getGroup1().setTrnamtl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		if (!(DataUtils.isNumeric(ctx.getGroup1().getTorigdtiReference().getBytes(0, 4))) || DataUtils.compare(ctx.getGroup1().getTorigdtiReference().getBytes(4, 1), "-") != 0 || !(DataUtils.isNumeric(ctx.getGroup1().getTorigdtiReference().getBytes(5, 2))) || DataUtils.compare(ctx.getGroup1().getTorigdtiReference().getBytes(7, 1), "-") != 0 || !(DataUtils.isNumeric(ctx.getGroup1().getTorigdtiReference().getBytes(8, 2)))) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Orig Date should be in format YYYY-MM-DD");
			ctx.getGroup1().setTorigdtl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		if (!(DataUtils.isNumeric(ctx.getGroup1().getTprocdtiReference().getBytes(0, 4))) || DataUtils.compare(ctx.getGroup1().getTprocdtiReference().getBytes(4, 1), "-") != 0 || !(DataUtils.isNumeric(ctx.getGroup1().getTprocdtiReference().getBytes(5, 2))) || DataUtils.compare(ctx.getGroup1().getTprocdtiReference().getBytes(7, 1), "-") != 0 || !(DataUtils.isNumeric(ctx.getGroup1().getTprocdtiReference().getBytes(8, 2)))) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Proc Date should be in format YYYY-MM-DD");
			ctx.getGroup1().setTprocdtl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		ctx.getWsVariables().setWsTranAmtN(NumberUtils.convert(ctx.getGroup1().getTrnamti()));
		ctx.getWsVariables().getWsTranAmtEReference().setValue(ctx.getWsVariables().getWsTranAmtN());
		ctx.getGroup1().setTrnamti(ctx.getWsVariables().getWsTranAmtE());
		ctx.getCsutldtcParm().getCsutldtcDateReference().setValue(ctx.getGroup1().getTorigdtiReference());
		ctx.getCsutldtcParm().getCsutldtcDateFormatReference().setValue(ctx.getWsVariables().getWsDateFormatReference());
		DataUtils.setToBlank(ctx.getCsutldtcParm().getCsutldtcResultReference());
		ctrl.callSubProgram("CSUTLDTC", CallBuilder.newInstance()
			.byReference(ctx.getCsutldtcParm().getCsutldtcDateReference())
			.byReference(ctx.getCsutldtcParm().getCsutldtcDateFormatReference())
			.byReference(ctx.getCsutldtcParm().getCsutldtcResultReference())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getCsutldtcParm().getCsutldtcResultSevCdReference(), "0000") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (DataUtils.compare(ctx.getCsutldtcParm().getCsutldtcResultMsgNumReference(), "2513") != 0) {
				ctx.getWsVariables().setWsMessage("Orig Date - Not a valid date...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setTorigdtl(-1);
				sendTrnaddScreen(ctx, ctrl);
			} 
		}
		ctx.getCsutldtcParm().getCsutldtcDateReference().setValue(ctx.getGroup1().getTprocdtiReference());
		ctx.getCsutldtcParm().getCsutldtcDateFormatReference().setValue(ctx.getWsVariables().getWsDateFormatReference());
		DataUtils.setToBlank(ctx.getCsutldtcParm().getCsutldtcResultReference());
		ctrl.callSubProgram("CSUTLDTC", CallBuilder.newInstance()
			.byReference(ctx.getCsutldtcParm().getCsutldtcDateReference())
			.byReference(ctx.getCsutldtcParm().getCsutldtcDateFormatReference())
			.byReference(ctx.getCsutldtcParm().getCsutldtcResultReference())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getCsutldtcParm().getCsutldtcResultSevCdReference(), "0000") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (DataUtils.compare(ctx.getCsutldtcParm().getCsutldtcResultMsgNumReference(), "2513") != 0) {
				ctx.getWsVariables().setWsMessage("Proc Date - Not a valid date...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setTprocdtl(-1);
				sendTrnaddScreen(ctx, ctrl);
			} 
		}
		if (!(DataUtils.isNumeric(ctx.getGroup1().getMidiReference()))) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Merchant ID must be Numeric...");
			ctx.getGroup1().setMidl(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation addTransaction.
	 * 
	 * ----------------------------------------------------------------*
	 *                         ADD-TRANSACTION
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void addTransaction(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		ctx.getTranRecord().getTranIdReference().setBytes(Record.HIGH_VALUES);
		startbrTransactFile(ctx, ctrl);
		readprevTransactFile(ctx, ctrl);
		endbrTransactFile(ctx, ctrl);
		ctx.getWsVariables().setWsTranIdN(NumberUtils.convert(ctx.getTranRecord().getTranId()).longValue());
		ctx.getWsVariables().setWsTranIdN(ctx.getWsVariables().getWsTranIdN() + 1);
		ctx.getTranRecord().getField().initialize();
		ctx.getTranRecord().setTranId(ctx.getWsVariables().getWsTranIdNReference().getValue(String.class));
		ctx.getTranRecord().getTranTypeCdReference().setValue(ctx.getGroup1().getTtypcdiReference());
		ctx.getTranRecord().setTranCatCd(NumberUtils.convert(ctx.getGroup1().getTcatcdi()).intValue());
		ctx.getTranRecord().getTranSourceReference().setValue(ctx.getGroup1().getTrnsrciReference());
		ctx.getTranRecord().setTranDesc(ctx.getGroup1().getTdesci());
		ctx.getWsVariables().setWsTranAmtN(NumberUtils.convert(ctx.getGroup1().getTrnamti()));
		ctx.getTranRecord().setTranAmt(ctx.getWsVariables().getWsTranAmtN());
		ctx.getTranRecord().getTranCardNumReference().setValue(ctx.getGroup1().getCardniniReference());
		ctx.getTranRecord().setTranMerchantId(NumberUtils.convert(ctx.getGroup1().getMidi()).intValue());
		ctx.getTranRecord().setTranMerchantName(ctx.getGroup1().getMnamei());
		ctx.getTranRecord().setTranMerchantCity(ctx.getGroup1().getMcityi());
		ctx.getTranRecord().getTranMerchantZipReference().setValue(ctx.getGroup1().getMzipiReference());
		ctx.getTranRecord().setTranOrigTs(ctx.getGroup1().getTorigdti());
		ctx.getTranRecord().setTranProcTs(ctx.getGroup1().getTprocdti());
		writeTransactFile(ctx, ctrl);
	}

	/**
	 * Process operation copyLastTranData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       COPY-LAST-TRAN-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void copyLastTranData(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		validateInputKeyFields(ctx, ctrl);
		ctx.getTranRecord().getTranIdReference().setBytes(Record.HIGH_VALUES);
		startbrTransactFile(ctx, ctrl);
		readprevTransactFile(ctx, ctrl);
		endbrTransactFile(ctx, ctrl);
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			ctx.getWsVariables().getWsTranAmtEReference().setValue(ctx.getTranRecord().getTranAmt());
			ctx.getGroup1().getTtypcdiReference().setValue(ctx.getTranRecord().getTranTypeCdReference());
			ctx.getGroup1().setTcatcdi(ctx.getTranRecord().getTranCatCdReference().getValue(String.class));
			ctx.getGroup1().getTrnsrciReference().setValue(ctx.getTranRecord().getTranSourceReference());
			ctx.getGroup1().setTrnamti(ctx.getWsVariables().getWsTranAmtE());
			ctx.getGroup1().setTdesci(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTorigdti(ctx.getTranRecord().getTranOrigTs());
			ctx.getGroup1().setTprocdti(ctx.getTranRecord().getTranProcTs());
			ctx.getGroup1().setMidi(ctx.getTranRecord().getTranMerchantIdReference().getValue(String.class));
			ctx.getGroup1().setMnamei(ctx.getTranRecord().getTranMerchantName());
			ctx.getGroup1().setMcityi(ctx.getTranRecord().getTranMerchantCity());
			ctx.getGroup1().getMzipiReference().setValue(ctx.getTranRecord().getTranMerchantZipReference());
		} 
		processEnterKey(ctx, ctrl);
	}

	/**
	 * Process operation returnToPrevScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RETURN-TO-PREV-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void returnToPrevScreen(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendTrnaddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendTrnaddScreen(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COTRN2A")
		.withMapset("COTRN02")
		.withData(ctx.getGroup1().getCotrn2aoReference())
		.withErase()
		.withCursor()
		.execute()
		.handleException();
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withTransID(ctx.getWsVariables().getWsTranid())
		.withCommarea(ctx.getCarddemoCommarea())
		.execute()
		.handleException();
	}

	/**
	 * Process operation receiveTrnaddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveTrnaddScreen(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COTRN2A")
		.withMapset("COTRN02")
		.into(ctx.getGroup1().getCotrn2aiReference())
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
	}

	/**
	 * Process operation populateHeaderInfo.
	 * 
	 * ----------------------------------------------------------------*
	 *                       POPULATE-HEADER-INFO
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void populateHeaderInfo(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		ctx.getWsDateTime().getWsCurdateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		ctx.getGroup1().getTitle01oReference().setValue(ctx.getCcdaScreenTitle().getCcdaTitle01Reference());
		ctx.getGroup1().getTitle02oReference().setValue(ctx.getCcdaScreenTitle().getCcdaTitle02Reference());
		ctx.getGroup1().getTrnnameoReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getGroup1().getPgmnameoReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		ctx.getWsDateTime().setWsCurdateMm(ctx.getWsDateTime().getWsCurdateMonth());
		ctx.getWsDateTime().setWsCurdateDd(ctx.getWsDateTime().getWsCurdateDay());
		ctx.getWsDateTime().setWsCurdateYy(NumberUtils.convert(ctx.getWsDateTime().getWsCurdateYearReference().getBytes(2, 2)).intValue());
		ctx.getGroup1().getCurdateoReference().setBytes(ctx.getWsDateTime().getWsCurdateMmDdYyReference().getBytes());
		ctx.getWsDateTime().setWsCurtimeHh(ctx.getWsDateTime().getWsCurtimeHours());
		ctx.getWsDateTime().setWsCurtimeMm(ctx.getWsDateTime().getWsCurtimeMinute());
		ctx.getWsDateTime().setWsCurtimeSs(ctx.getWsDateTime().getWsCurtimeSecond());
		ctx.getGroup1().getCurtimeoReference().setBytes(ctx.getWsDateTime().getWsCurtimeHhMmSsReference().getBytes());
	}

	/**
	 * Process operation readCxacaixFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-CXACAIX-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readCxacaixFile(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsCxacaixFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getCardXrefRecord())
		.length(50)
		.recordIndentificationField(ctx.getCardXrefRecord().getXrefAcctIdReference())
		.keyLength(11,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Account ID NOT found...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup Acct in XREF AIX file...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation readCcxrefFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-CCXREF-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readCcxrefFile(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsCcxrefFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getCardXrefRecord())
		.length(50)
		.recordIndentificationField(ctx.getCardXrefRecord().getXrefCardNumReference())
		.keyLength(16,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Card Number NOT found...");
			ctx.getGroup1().setCardninl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup Card # in XREF file...");
			ctx.getGroup1().setCardninl(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation startbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     STARTBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void startbrTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.startBrowse()
		.recordIndentificationField(ctx.getTranRecord().getTranIdReference())
		.keyLength(16,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Transaction ID NOT found...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup Transaction...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation readprevTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     READPREV-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readprevTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.readPrev()
		.into(ctx.getTranRecord())
		.length(350)
		.recordIndentificationField(ctx.getTranRecord().getTranIdReference())
		.keyLength(16,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.ENDFILE.getIntValue()) {
			DataUtils.setToZeroes(ctx.getTranRecord().getTranIdReference());
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup Transaction...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation endbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     ENDBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void endbrTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.endBrowse()
		.execute()
		.handleException();
	}

	/**
	 * Process operation writeTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     WRITE-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.write(false)
		.from(ctx.getTranRecord())
		.length(350)
		.recordIndentificationField(ctx.getTranRecord().getTranIdReference())
		.keyLength(16,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			initializeAllFields(ctx, ctrl);
			DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
			ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhgreenReference());
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
				.addDelimitedBySize("Transaction added successfully. ")
				.addDelimitedBySize(" Your Tran ID is ")
				.addDelimitedByLiteral(ctx.getTranRecord().getTranId()," ")
				.addDelimitedBySize(".")
				.end();
			sendTrnaddScreen(ctx, ctrl);
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.DUPKEY.getIntValue() || ctx.getWsVariables().getWsRespCd() == ResponseCode.DUPREC.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Tran ID already exist...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to Add Transaction...");
			ctx.getGroup1().setActidinl(-1);
			sendTrnaddScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation clearCurrentScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                     CLEAR-CURRENT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void clearCurrentScreen(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		initializeAllFields(ctx, ctrl);
		sendTrnaddScreen(ctx, ctrl);
	}

	/**
	 * Process operation initializeAllFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                     INITIALIZE-ALL-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void initializeAllFields(final Cotrn02cContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().setActidinl(-1);
		DataUtils.setToBlank(ctx.getGroup1().getActidiniReference());
		DataUtils.setToBlank(ctx.getGroup1().getCardniniReference());
		DataUtils.setToBlank(ctx.getGroup1().getTtypcdiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTcatcdiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTrnsrciReference());
		DataUtils.setToBlank(ctx.getGroup1().getTrnamtiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTdesciReference());
		DataUtils.setToBlank(ctx.getGroup1().getTorigdtiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTprocdtiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMidiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMnameiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMcityiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMzipiReference());
		DataUtils.setToBlank(ctx.getGroup1().getConfirmiReference());
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:34 CDT */
		return;
	}

}
