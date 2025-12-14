package aws.bluage.l3.workshop.corpt00c.service.impl;

import aws.bluage.l3.workshop.corpt00c.business.context.Corpt00cContext;
import aws.bluage.l3.workshop.corpt00c.service.Corpt00cProcess;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.internal.JicsTDQueueBuilder;
import com.netfective.bluage.gapwalk.rt.jobqueue.ScriptLauncherJob;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.CallBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Corpt00cProcessImpl
 * 
 * Defines application services for Corpt00cProcess
 * @see Corpt00cProcess
 */
@Service("aws.bluage.l3.workshop.corpt00c.service.Corpt00cProcess")
public class Corpt00cProcessImpl implements Corpt00cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Corpt00cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.CORPT00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Corpt00cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : CORPT00C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Print Transaction reports by submitting batch
		job from online using extra partition TDQ.
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
		ctx.getWsVariables().setTransactNotEof(true);
		ctx.getWsVariables().setSendEraseYes(true);
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
				ctx.getGroup1().getCorpt0aoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().setMonthlyl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} else {
				receiveTrnrptScreen(ctx, ctrl);
				if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
					processEnterKey(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
					ctx.getCarddemoCommarea().setCdemoToProgram("COMEN01C");
					returnToPrevScreen(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getGroup1().setMonthlyl(-1);
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendTrnrptScreen(ctx, ctrl);
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
	public void processEnterKey(final Corpt00cContext ctx, final ExecutionController ctrl) {
		if (LOGGER.isInfoEnabled()) LOGGER.info("PROCESS ENTER KEY");
		if (!(DataUtils.isBlank(ctx.getGroup1().getMonthlyiReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getMonthlyiReference()))) {
			ctx.getWsVariables().setWsReportName("Monthly");
			ctx.getWsDateTime().getWsCurdateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
			ctx.getWsVariables().setWsStartDateYyyy(ctx.getWsDateTime().getWsCurdateYearReference().getValue(String.class));
			ctx.getWsVariables().setWsStartDateMm(ctx.getWsDateTime().getWsCurdateMonthReference().getValue(String.class));
			ctx.getWsVariables().setWsStartDateDd("01");
			ctx.getJobData().getParmStartDate1Reference().setBytes(ctx.getWsVariables().getWsStartDateReference().getBytes());
			ctx.getJobData().getParmStartDate2Reference().setBytes(ctx.getWsVariables().getWsStartDateReference().getBytes());
			ctx.getWsDateTime().setWsCurdateDay(1);
			ctx.getWsDateTime().setWsCurdateMonth(ctx.getWsDateTime().getWsCurdateMonth() + 1);
			if (NumberUtils.gt(ctx.getWsDateTime().getWsCurdateMonthReference(), 12)) {
				ctx.getWsDateTime().setWsCurdateYear(ctx.getWsDateTime().getWsCurdateYear() + 1);
				ctx.getWsDateTime().setWsCurdateMonth(1);
			} 
			ctx.getWsDateTime().setWsCurdateN(DateHelper.dateOfInteger(new BigDecimal(DateHelper.integerOfDate(ctx.getWsDateTime().getWsCurdateN())).subtract(BigDecimal.ONE)));
			ctx.getWsVariables().setWsEndDateYyyy(ctx.getWsDateTime().getWsCurdateYearReference().getValue(String.class));
			ctx.getWsVariables().setWsEndDateMm(ctx.getWsDateTime().getWsCurdateMonthReference().getValue(String.class));
			ctx.getWsVariables().setWsEndDateDd(ctx.getWsDateTime().getWsCurdateDayReference().getValue(String.class));
			ctx.getJobData().getParmEndDate1Reference().setBytes(ctx.getWsVariables().getWsEndDateReference().getBytes());
			ctx.getJobData().getParmEndDate2Reference().setBytes(ctx.getWsVariables().getWsEndDateReference().getBytes());
			submitJobToIntrdr(ctx, ctrl);
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getYearlyiReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getYearlyiReference()))) {
			ctx.getWsVariables().setWsReportName("Yearly");
			ctx.getWsDateTime().getWsCurdateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
			ctx.getWsVariables().setWsStartDateYyyy(ctx.getWsDateTime().getWsCurdateYearReference().getValue(String.class));
			ctx.getWsVariables().setWsEndDateYyyy(ctx.getWsDateTime().getWsCurdateYearReference().getValue(String.class));
			ctx.getWsVariables().setWsStartDateMm("01");
			ctx.getWsVariables().setWsStartDateDd("01");
			ctx.getJobData().getParmStartDate1Reference().setBytes(ctx.getWsVariables().getWsStartDateReference().getBytes());
			ctx.getJobData().getParmStartDate2Reference().setBytes(ctx.getWsVariables().getWsStartDateReference().getBytes());
			ctx.getWsVariables().setWsEndDateMm("12");
			ctx.getWsVariables().setWsEndDateDd("31");
			ctx.getJobData().getParmEndDate1Reference().setBytes(ctx.getWsVariables().getWsEndDateReference().getBytes());
			ctx.getJobData().getParmEndDate2Reference().setBytes(ctx.getWsVariables().getWsEndDateReference().getBytes());
			submitJobToIntrdr(ctx, ctrl);
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getCustomiReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getCustomiReference()))) {
			if (DataUtils.isBlank(ctx.getGroup1().getSdtmmiReference()) || DataUtils.isLowValue(ctx.getGroup1().getSdtmmiReference())) {
				ctx.getWsVariables().setWsMessage("Start Date - Month can NOT be empty...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setSdtmml(-1);
				sendTrnrptScreen(ctx, ctrl);
			} else if (DataUtils.isBlank(ctx.getGroup1().getSdtddiReference()) || DataUtils.isLowValue(ctx.getGroup1().getSdtddiReference())) {
				ctx.getWsVariables().setWsMessage("Start Date - Day can NOT be empty...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setSdtddl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} else if (DataUtils.isBlank(ctx.getGroup1().getSdtyyyyiReference()) || DataUtils.isLowValue(ctx.getGroup1().getSdtyyyyiReference())) {
				ctx.getWsVariables().setWsMessage("Start Date - Year can NOT be empty...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setSdtyyyyl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} else if (DataUtils.isBlank(ctx.getGroup1().getEdtmmiReference()) || DataUtils.isLowValue(ctx.getGroup1().getEdtmmiReference())) {
				ctx.getWsVariables().setWsMessage("End Date - Month can NOT be empty...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setEdtmml(-1);
				sendTrnrptScreen(ctx, ctrl);
			} else if (DataUtils.isBlank(ctx.getGroup1().getEdtddiReference()) || DataUtils.isLowValue(ctx.getGroup1().getEdtddiReference())) {
				ctx.getWsVariables().setWsMessage("End Date - Day can NOT be empty...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setEdtddl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} else if (DataUtils.isBlank(ctx.getGroup1().getEdtyyyyiReference()) || DataUtils.isLowValue(ctx.getGroup1().getEdtyyyyiReference())) {
				ctx.getWsVariables().setWsMessage("End Date - Year can NOT be empty...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setEdtyyyyl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} else {
				
				/* 
				Do nothing */
			}
			ctx.getWsVariables().setWsNum99(NumberUtils.convert(ctx.getGroup1().getSdtmmi()).intValue());
			ctx.getGroup1().setSdtmmi(ctx.getWsVariables().getWsNum99Reference().getValue(String.class));
			ctx.getWsVariables().setWsNum99(NumberUtils.convert(ctx.getGroup1().getSdtddi()).intValue());
			ctx.getGroup1().setSdtddi(ctx.getWsVariables().getWsNum99Reference().getValue(String.class));
			ctx.getWsVariables().setWsNum9999(NumberUtils.convert(ctx.getGroup1().getSdtyyyyi()).intValue());
			ctx.getGroup1().setSdtyyyyi(ctx.getWsVariables().getWsNum9999Reference().getValue(String.class));
			ctx.getWsVariables().setWsNum99(NumberUtils.convert(ctx.getGroup1().getEdtmmi()).intValue());
			ctx.getGroup1().setEdtmmi(ctx.getWsVariables().getWsNum99Reference().getValue(String.class));
			ctx.getWsVariables().setWsNum99(NumberUtils.convert(ctx.getGroup1().getEdtddi()).intValue());
			ctx.getGroup1().setEdtddi(ctx.getWsVariables().getWsNum99Reference().getValue(String.class));
			ctx.getWsVariables().setWsNum9999(NumberUtils.convert(ctx.getGroup1().getEdtyyyyi()).intValue());
			ctx.getGroup1().setEdtyyyyi(ctx.getWsVariables().getWsNum9999Reference().getValue(String.class));
			if (!(DataUtils.isNumeric(ctx.getGroup1().getSdtmmiReference())) || DataUtils.compare(ctx.getGroup1().getSdtmmiReference(), "12") > 0) {
				ctx.getWsVariables().setWsMessage("Start Date - Not a valid Month...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setSdtmml(-1);
				sendTrnrptScreen(ctx, ctrl);
			} 
			if (!(DataUtils.isNumeric(ctx.getGroup1().getSdtddiReference())) || DataUtils.compare(ctx.getGroup1().getSdtddiReference(), "31") > 0) {
				ctx.getWsVariables().setWsMessage("Start Date - Not a valid Day...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setSdtddl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} 
			if (!(DataUtils.isNumeric(ctx.getGroup1().getSdtyyyyiReference()))) {
				ctx.getWsVariables().setWsMessage("Start Date - Not a valid Year...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setSdtyyyyl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} 
			if (!(DataUtils.isNumeric(ctx.getGroup1().getEdtmmiReference())) || DataUtils.compare(ctx.getGroup1().getEdtmmiReference(), "12") > 0) {
				ctx.getWsVariables().setWsMessage("End Date - Not a valid Month...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setEdtmml(-1);
				sendTrnrptScreen(ctx, ctrl);
			} 
			if (!(DataUtils.isNumeric(ctx.getGroup1().getEdtddiReference())) || DataUtils.compare(ctx.getGroup1().getEdtddiReference(), "31") > 0) {
				ctx.getWsVariables().setWsMessage("End Date - Not a valid Day...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setEdtddl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} 
			if (!(DataUtils.isNumeric(ctx.getGroup1().getEdtyyyyiReference()))) {
				ctx.getWsVariables().setWsMessage("End Date - Not a valid Year...");
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setEdtyyyyl(-1);
				sendTrnrptScreen(ctx, ctrl);
			} 
			ctx.getWsVariables().getWsStartDateYyyyReference().setValue(ctx.getGroup1().getSdtyyyyiReference());
			ctx.getWsVariables().getWsStartDateMmReference().setValue(ctx.getGroup1().getSdtmmiReference());
			ctx.getWsVariables().getWsStartDateDdReference().setValue(ctx.getGroup1().getSdtddiReference());
			ctx.getWsVariables().getWsEndDateYyyyReference().setValue(ctx.getGroup1().getEdtyyyyiReference());
			ctx.getWsVariables().getWsEndDateMmReference().setValue(ctx.getGroup1().getEdtmmiReference());
			ctx.getWsVariables().getWsEndDateDdReference().setValue(ctx.getGroup1().getEdtddiReference());
			ctx.getCsutldtcParm().getCsutldtcDateReference().setBytes(ctx.getWsVariables().getWsStartDateReference().getBytes());
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
					ctx.getWsVariables().setWsMessage("Start Date - Not a valid date...");
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getGroup1().setSdtmml(-1);
					sendTrnrptScreen(ctx, ctrl);
				} 
			}
			ctx.getCsutldtcParm().getCsutldtcDateReference().setBytes(ctx.getWsVariables().getWsEndDateReference().getBytes());
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
					ctx.getWsVariables().setWsMessage("End Date - Not a valid date...");
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getGroup1().setEdtmml(-1);
					sendTrnrptScreen(ctx, ctrl);
				} 
			}
			ctx.getJobData().getParmStartDate1Reference().setBytes(ctx.getWsVariables().getWsStartDateReference().getBytes());
			ctx.getJobData().getParmStartDate2Reference().setBytes(ctx.getWsVariables().getWsStartDateReference().getBytes());
			ctx.getJobData().getParmEndDate1Reference().setBytes(ctx.getWsVariables().getWsEndDateReference().getBytes());
			ctx.getJobData().getParmEndDate2Reference().setBytes(ctx.getWsVariables().getWsEndDateReference().getBytes());
			ctx.getWsVariables().setWsReportName("Custom");
			if (!(ctx.getWsVariables().isErrFlgOn())) {
				submitJobToIntrdr(ctx, ctrl);
			} 
		} else {
			ctx.getWsVariables().setWsMessage("Select a report type to print report...");
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getGroup1().setMonthlyl(-1);
			sendTrnrptScreen(ctx, ctrl);
		}
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			initializeAllFields(ctx, ctrl);
			ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhgreenReference());
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
				.addDelimitedByLiteral(ctx.getWsVariables().getWsReportName()," ")
				.addDelimitedBySize(" report submitted for printing ...")
				.end();
			ctx.getGroup1().setMonthlyl(-1);
			sendTrnrptScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation submitJobToIntrdr.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SUBMIT-JOB-TO-INTRDR
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void submitJobToIntrdr(final Corpt00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getGroup1().getConfirmiReference()) || DataUtils.isLowValue(ctx.getGroup1().getConfirmiReference())) {
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
				.addDelimitedBySize("Please confirm to print the ")
				.addDelimitedByLiteral(ctx.getWsVariables().getWsReportName()," ")
				.addDelimitedBySize(" report...")
				.end();
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getGroup1().setConfirml(-1);
			sendTrnrptScreen(ctx, ctrl);
		} 
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "Y") == 0 || DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "y") == 0) {
				
				/* 
				Do nothing */
			} else if (DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "N") == 0 || DataUtils.compare(ctx.getGroup1().getConfirmiReference(), "n") == 0) {
				initializeAllFields(ctx, ctrl);
				ctx.getWsVariables().setWsErrFlg("Y");
				sendTrnrptScreen(ctx, ctrl);
			} else {
				StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
					.addDelimitedBySize("\"")
					.addDelimitedByLiteral(ctx.getGroup1().getConfirmi()," ")
					.addDelimitedBySize("\" is not a valid value to confirm...")
					.end();
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getGroup1().setConfirml(-1);
				sendTrnrptScreen(ctx, ctrl);
			}
			/* FIXME BA:START PATCH P2 */
			ScriptLauncherJob scriptLauncherJob = (ScriptLauncherJob) ctrl.getApplicationContext().getBean(com.netfective.bluage.gapwalk.rt.jobqueue.ScriptLauncherJob.class);
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put("startDate", ctx.getJobData().getParmStartDate1());
			parameters.put("endDate", ctx.getJobData().getParmEndDate1());
			scriptLauncherJob.executeAsyncScriptJob("TRANREPT", parameters);
			/*
			ctx.getWsVariables().setEndLoopNo(true);
			ctx.getWsVariables().setWsIdx(1);
			while (!(ctx.getWsVariables().getWsIdx() > 1000 || ctx.getWsVariables().isEndLoopYes() || ctx.getWsVariables().isErrFlgOn())) {
				ctx.getWsVariables().setJclRecord(ctx.getJobData().getItemFromJobLines(ctx.getWsVariables().getWsIdx() - 1));
				if (DataUtils.compare(ctx.getWsVariables().getJclRecordReference(), "/*EOF") == 0 || DataUtils.isBlank(ctx.getWsVariables().getJclRecordReference()) || DataUtils.isLowValue(ctx.getWsVariables().getJclRecordReference())) {
					ctx.getWsVariables().setEndLoopYes(true);
				} 
				wirteJobsubTdq(ctx, ctrl);
				ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
			}
			*/
			/* BA:END PATCH P2 */
		}
	}

	/**
	 * Process operation wirteJobsubTdq.
	 * 
	 * ----------------------------------------------------------------*
	 *                       WIRTE-JOBSUB-TDQ
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void wirteJobsubTdq(final Corpt00cContext ctx, final ExecutionController ctrl) {
		JicsTDQueueBuilder.newInstance("JOBS", ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.writeQ()
		.from(ctx.getWsVariables().getJclRecordReference())
		.length(80)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to Write TDQ (JOBS)...");
			ctx.getGroup1().setMonthlyl(-1);
			sendTrnrptScreen(ctx, ctrl);
		}
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
	public void returnToPrevScreen(final Corpt00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendTrnrptScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNRPT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendTrnrptScreen(final Corpt00cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		if (ctx.getWsVariables().isSendEraseYes()) {
			SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.withMap("CORPT0A")
			.withMapset("CORPT00")
			.withData(ctx.getGroup1().getCorpt0aoReference())
			.withErase()
			.withCursor()
			.execute()
			.handleException();
		} else {
			SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.withMap("CORPT0A")
			.withMapset("CORPT00")
			.withData(ctx.getGroup1().getCorpt0aoReference())
			.withCursor()
			.execute()
			.handleException();
		}
		returnToCics(ctx, ctrl);
	}

	/**
	 * Process operation returnToCics.
	 * 
	 * ----------------------------------------------------------------*
	 *                          RETURN-TO-CICS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void returnToCics(final Corpt00cContext ctx, final ExecutionController ctrl) {
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withTransID(ctx.getWsVariables().getWsTranid())
		.withCommarea(ctx.getCarddemoCommarea())
		.execute()
		.handleException();
	}

	/**
	 * Process operation receiveTrnrptScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNRPT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveTrnrptScreen(final Corpt00cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("CORPT0A")
		.withMapset("CORPT00")
		.into(ctx.getGroup1().getCorpt0aiReference())
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
	public void populateHeaderInfo(final Corpt00cContext ctx, final ExecutionController ctrl) {
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
	public void initializeAllFields(final Corpt00cContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().setMonthlyl(-1);
		DataUtils.initialize(ctx.getGroup1().getMonthlyiReference());
		DataUtils.initialize(ctx.getGroup1().getYearlyiReference());
		DataUtils.initialize(ctx.getGroup1().getCustomiReference());
		DataUtils.initialize(ctx.getGroup1().getSdtmmiReference());
		DataUtils.initialize(ctx.getGroup1().getSdtddiReference());
		DataUtils.initialize(ctx.getGroup1().getSdtyyyyiReference());
		DataUtils.initialize(ctx.getGroup1().getEdtmmiReference());
		DataUtils.initialize(ctx.getGroup1().getEdtddiReference());
		DataUtils.initialize(ctx.getGroup1().getEdtyyyyiReference());
		DataUtils.initialize(ctx.getGroup1().getConfirmiReference());
		DataUtils.initialize(ctx.getWsVariables().getWsMessageReference());
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:33 CDT */
		return;
	}

}
