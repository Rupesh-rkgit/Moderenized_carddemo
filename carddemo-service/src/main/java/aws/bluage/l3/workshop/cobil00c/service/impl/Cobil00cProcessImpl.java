
package aws.bluage.l3.workshop.cobil00c.service.impl;

import aws.bluage.l3.workshop.cobil00c.business.context.Cobil00cContext;
import aws.bluage.l3.workshop.cobil00c.service.Cobil00cProcess;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.internal.JicsTimeBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.JicsIsolationLevel;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cobil00cProcessImpl
 * 
 * Defines application services for Cobil00cProcess
 * @see Cobil00cProcess
 */
@Service("aws.bluage.l3.workshop.cobil00c.service.Cobil00cProcess")
public class Cobil00cProcessImpl implements Cobil00cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cobil00cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COBIL00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cobil00cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COBIL00C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Bill Payment - Pay account balance in full and a
		tractionsaction for the online bill payment.
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
				ctx.getGroup1().getCobil0aoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().setActidinl(-1);
				if (!(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCb00TrnSelectedReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCb00TrnSelectedReference()))) {
					ctx.getGroup1().setActidini(ctx.getCarddemoCommarea().getCdemoCb00TrnSelected());
					processEnterKey(ctx, ctrl);
				} 
				sendBillpayScreen(ctx, ctrl);
			} else {
				receiveBillpayScreen(ctx, ctrl);
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
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendBillpayScreen(ctx, ctrl);
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
	public void processEnterKey(final Cobil00cContext ctx, final ExecutionController ctrl) {
		ctx.getWsVariables().setConfPayNo(true);
		if (DataUtils.isBlank(ctx.getGroup1().getActidiniReference()) || DataUtils.isLowValue(ctx.getGroup1().getActidiniReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Acct ID can NOT be empty...");
			ctx.getGroup1().setActidinl(-1);
			sendBillpayScreen(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			ctx.getAccountRecord().setAcctId(NumberUtils.convert(ctx.getGroup1().getActidini()).longValue());
			ctx.getCardXrefRecord().setXrefAcctId(NumberUtils.convert(ctx.getGroup1().getActidini()).longValue());
			if (DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "Y") == 0 || DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "y") == 0) {
				ctx.getWsVariables().setConfPayYes(true);
				readAcctdatFile(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "N") == 0 || DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "n") == 0) {
				clearCurrentScreen(ctx, ctrl);
				ctx.getWsVariables().setWsErrFlg("Y");
			} else if (DataUtils.isBlank(ctx.getGroup1().getConfirmiReference()) || DataUtils.isLowValue(ctx.getGroup1().getConfirmiReference())) {
				readAcctdatFile(ctx, ctrl);
			} else {
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getWsVariables().setWsMessage("Invalid value. Valid values are (Y/N)...");
				ctx.getGroup1().setConfirml(-1);
				sendBillpayScreen(ctx, ctrl);
			}
			ctx.getWsVariables().getWsCurrBalReference().setValue(ctx.getAccountRecord().getAcctCurrBal());
			ctx.getGroup1().setCurbali(ctx.getWsVariables().getWsCurrBal());
		} 
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (NumberUtils.le(ctx.getAccountRecord().getAcctCurrBalReference(), 0) && !(DataUtils.isBlank(ctx.getGroup1().getActidiniReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getActidiniReference()))) {
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getWsVariables().setWsMessage("You have nothing to pay...");
				ctx.getGroup1().setActidinl(-1);
				sendBillpayScreen(ctx, ctrl);
			} 
		} 
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (ctx.getWsVariables().isConfPayYes()) {
				readCxacaixFile(ctx, ctrl);
				ctx.getTranRecord().getTranIdReference().setBytes(Record.HIGH_VALUES);
				startbrTransactFile(ctx, ctrl);
				readprevTransactFile(ctx, ctrl);
				endbrTransactFile(ctx, ctrl);
				ctx.getWsVariables().setWsTranIdNum(NumberUtils.convert(ctx.getTranRecord().getTranId()).longValue());
				ctx.getWsVariables().setWsTranIdNum(ctx.getWsVariables().getWsTranIdNum() + 1);
				ctx.getTranRecord().getField().initialize();
				ctx.getTranRecord().setTranId(ctx.getWsVariables().getWsTranIdNumReference().getValue(String.class));
				ctx.getTranRecord().setTranTypeCd("02");
				ctx.getTranRecord().setTranCatCd(2);
				ctx.getTranRecord().setTranSource("POS TERM");
				ctx.getTranRecord().setTranDesc("BILL PAYMENT - ONLINE");
				ctx.getTranRecord().setTranAmt(ctx.getAccountRecord().getAcctCurrBal());
				ctx.getTranRecord().getTranCardNumReference().setValue(ctx.getCardXrefRecord().getXrefCardNumReference());
				ctx.getTranRecord().setTranMerchantId(999999999);
				ctx.getTranRecord().setTranMerchantName("BILL PAYMENT");
				ctx.getTranRecord().setTranMerchantCity("N/A");
				ctx.getTranRecord().setTranMerchantZip("N/A");
				getCurrentTimestamp(ctx, ctrl);
				ctx.getTranRecord().getTranOrigTsReference().setBytes(ctx.getWsDateTime().getWsTimestampReference().getBytes());
				ctx.getTranRecord().getTranProcTsReference().setBytes(ctx.getWsDateTime().getWsTimestampReference().getBytes());
				writeTransactFile(ctx, ctrl);
				ctx.getAccountRecord().setAcctCurrBal(ctx.getAccountRecord().getAcctCurrBal().subtract(ctx.getTranRecord().getTranAmt()));
				updateAcctdatFile(ctx, ctrl);
			} else {
				ctx.getWsVariables().setWsMessage("Confirm to make a bill payment...");
				ctx.getGroup1().setConfirml(-1);
			}
			sendBillpayScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation getCurrentTimestamp.
	 * 
	 * ----------------------------------------------------------------*
	 *                       GET-CURRENT-TIMESTAMP
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getCurrentTimestamp(final Cobil00cContext ctx, final ExecutionController ctrl) {
		JicsTimeBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.askTime()
		.absoluteTime(ctx.getWsVariables().getWsAbsTimeReference())
		.execute()
		.handleException();
		JicsTimeBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.formatTime()
		.time(ctx.getWsVariables().getWsCurTimeX08Reference())
		.absoluteTime(ctx.getWsVariables().getWsAbsTimeReference())
		.formattedDate(ctx.getWsVariables().getWsCurDateX10Reference(),"YYYYMMDD")
		.datesep("-")
		.timesep(":")
		.execute()
		.handleException();
		ctx.getWsDateTime().getWsTimestampReference().getField().initialize();
		ctx.getWsDateTime().getWsTimestampReference().setBytes(ctx.getWsVariables().getWsCurDateX10Reference().getBytes(), 0, 10);
		ctx.getWsDateTime().getWsTimestampReference().setBytes(ctx.getWsVariables().getWsCurTimeX08Reference().getBytes(), 11, 8);
		DataUtils.setToZeroes(ctx.getWsDateTime().getWsTimestampTmMs6Reference());
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
	public void returnToPrevScreen(final Cobil00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendBillpayScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-BILLPAY-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendBillpayScreen(final Cobil00cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COBIL0A")
		.withMapset("COBIL00")
		.withData(ctx.getGroup1().getCobil0aoReference())
		.withErase()
		.withCursor()
		.execute()
		.handleException();
	}

	/**
	 * Process operation receiveBillpayScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-BILLPAY-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveBillpayScreen(final Cobil00cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COBIL0A")
		.withMapset("COBIL00")
		.into(ctx.getGroup1().getCobil0aiReference())
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
	public void populateHeaderInfo(final Cobil00cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation readAcctdatFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-ACCTDAT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readAcctdatFile(final Cobil00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsAcctdatFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.setIsolationLevel(JicsIsolationLevel.UPDATE)
		.updateNoToken()
		.into(ctx.getAccountRecord())
		.length(300)
		.recordIndentificationField(ctx.getAccountRecord().getAcctIdReference())
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
			sendBillpayScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup Account...");
			ctx.getGroup1().setActidinl(-1);
			sendBillpayScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation updateAcctdatFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       UPDATE-ACCTDAT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void updateAcctdatFile(final Cobil00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsAcctdatFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.rewrite()
		.from(ctx.getAccountRecord())
		.length(300)
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
			sendBillpayScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to Update Account...");
			ctx.getGroup1().setActidinl(-1);
			sendBillpayScreen(ctx, ctrl);
		}
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
	public void readCxacaixFile(final Cobil00cContext ctx, final ExecutionController ctrl) {
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
			sendBillpayScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup XREF AIX file...");
			ctx.getGroup1().setActidinl(-1);
			sendBillpayScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation startbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       STARTBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void startbrTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl) {
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
			sendBillpayScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup Transaction...");
			ctx.getGroup1().setActidinl(-1);
			sendBillpayScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation readprevTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READPREV-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readprevTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl) {
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
			sendBillpayScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation endbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       ENDBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void endbrTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.endBrowse()
		.execute()
		.handleException();
	}

	/**
	 * Process operation writeTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       WRITE-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl) {
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
				.addDelimitedBySize("Payment successful. ")
				.addDelimitedBySize(" Your Transaction ID is ")
				.addDelimitedByLiteral(ctx.getTranRecord().getTranId()," ")
				.addDelimitedBySize(".")
				.end();
			sendBillpayScreen(ctx, ctrl);
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.DUPKEY.getIntValue() || ctx.getWsVariables().getWsRespCd() == ResponseCode.DUPREC.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Tran ID already exist...");
			ctx.getGroup1().setActidinl(-1);
			sendBillpayScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to Add Bill pay Transaction...");
			ctx.getGroup1().setActidinl(-1);
			sendBillpayScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation clearCurrentScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       CLEAR-CURRENT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void clearCurrentScreen(final Cobil00cContext ctx, final ExecutionController ctrl) {
		initializeAllFields(ctx, ctrl);
		sendBillpayScreen(ctx, ctrl);
	}

	/**
	 * Process operation initializeAllFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                       INITIALIZE-ALL-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void initializeAllFields(final Cobil00cContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().setActidinl(-1);
		DataUtils.setToBlank(ctx.getGroup1().getActidiniReference());
		DataUtils.setToBlank(ctx.getGroup1().getCurbaliReference());
		DataUtils.setToBlank(ctx.getGroup1().getConfirmiReference());
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:32 CDT */
		return;
	}

}
