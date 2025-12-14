
package aws.bluage.l3.workshop.cotrn00c.service.impl;

import aws.bluage.l3.workshop.cotrn00c.business.context.Cotrn00cContext;
import aws.bluage.l3.workshop.cotrn00c.service.Cotrn00cProcess;
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
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cotrn00cProcessImpl
 * 
 * Defines application services for Cotrn00cProcess
 * @see Cotrn00cProcess
 */
@Service("aws.bluage.l3.workshop.cotrn00c.service.Cotrn00cProcess")
public class Cotrn00cProcessImpl implements Cotrn00cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cotrn00cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COTRN00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COTRN00C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : List Transactions from TRANSACT file
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
		ctx.getCarddemoCommarea().setNextPageNo(true);
		ctx.getWsVariables().setSendEraseYes(true);
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		DataUtils.setToBlank(ctx.getGroup1().getErrmsgoReference());
		ctx.getGroup1().setTrnidinl(-1);
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
			returnToPrevScreen(ctx, ctrl);
		} else {
			int len = ctx.getDfheiblk().getEibcalen();
			ctx.getCarddemoCommarea().setBytes(ctx.getDfhcommarea().getBytes(0, len));
			if (!(ctx.getCarddemoCommarea().isCdemoPgmReenter())) {
				ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
				ctx.getGroup1().getCotrn0aoReference().setBytes(Record.LOW_VALUES);
				processEnterKey(ctx, ctrl);
				sendTrnlstScreen(ctx, ctrl);
			} else {
				receiveTrnlstScreen(ctx, ctrl);
				if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
					processEnterKey(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
					ctx.getCarddemoCommarea().setCdemoToProgram("COMEN01C");
					returnToPrevScreen(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf7Reference()) == 0) {
					processPf7Key(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf8Reference()) == 0) {
					processPf8Key(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getGroup1().setTrnidinl(-1);
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendTrnlstScreen(ctx, ctrl);
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
	public void processEnterKey(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		if (!(DataUtils.isBlank(ctx.getGroup1().getSel0001iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0001iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0001iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid01iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0002iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0002iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0002iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid02iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0003iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0003iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0003iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid03iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0004iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0004iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0004iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid04iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0005iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0005iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0005iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid05iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0006iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0006iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0006iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid06iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0007iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0007iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0007iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid07iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0008iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0008iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0008iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid08iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0009iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0009iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0009iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid09iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0010iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0010iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference().setValue(ctx.getGroup1().getSel0010iReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference().setValue(ctx.getGroup1().getTrnid10iReference());
		} else {
			DataUtils.setToBlank(ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference());
			DataUtils.setToBlank(ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference());
		}
		if (!(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference())) && !(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCt00TrnSelectedReference()))) {
			if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference(), "S") == 0 || DataUtils.compare(ctx.getCarddemoCommarea().getCdemoCt00TrnSelFlgReference(), "s") == 0) {
				ctx.getCarddemoCommarea().setCdemoToProgram("COTRN01C");
				ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
				ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
				ctx.getCarddemoCommarea().setCdemoPgmContext(0);
				XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
			} else {
				
				/* 
				SET TRANSACT-EOF TO TRUE */
				ctx.getWsVariables().setWsMessage("Invalid selection. Valid value is S");
				ctx.getGroup1().setTrnidinl(-1);
				
				/* 
				PERFORM SEND-TRNLST-SCREEN */
			}
		} 
		if (DataUtils.isBlank(ctx.getGroup1().getTrnidiniReference()) || DataUtils.isLowValue(ctx.getGroup1().getTrnidiniReference())) {
			ctx.getTranRecord().getTranIdReference().setBytes(Record.LOW_VALUES);
		} else {
			if (DataUtils.isNumeric(ctx.getGroup1().getTrnidiniReference())) {
				ctx.getTranRecord().getTranIdReference().setValue(ctx.getGroup1().getTrnidiniReference());
			} else {
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getWsVariables().setWsMessage("Tran ID must be Numeric ...");
				ctx.getGroup1().setTrnidinl(-1);
				sendTrnlstScreen(ctx, ctrl);
			}
		}
		ctx.getGroup1().setTrnidinl(-1);
		ctx.getCarddemoCommarea().setCdemoCt00PageNum(0);
		processPageForward(ctx, ctrl);
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnidinoReference());
		}
	}

	/**
	 * Process operation processPf7Key.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PF7-KEY
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void processPf7Key(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCt00TrnidFirstReference()) || DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCt00TrnidFirstReference())) {
			ctx.getTranRecord().getTranIdReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getTranRecord().getTranIdReference().setValue(ctx.getCarddemoCommarea().getCdemoCt00TrnidFirstReference());
		}
		ctx.getCarddemoCommarea().setNextPageYes(true);
		ctx.getGroup1().setTrnidinl(-1);
		if (NumberUtils.gt(ctx.getCarddemoCommarea().getCdemoCt00PageNumReference(), 1)) {
			processPageBackward(ctx, ctrl);
		} else {
			ctx.getWsVariables().setWsMessage("You are already at the top of the page...");
			ctx.getWsVariables().setSendEraseNo(true);
			sendTrnlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation processPf8Key.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PF8-KEY
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void processPf8Key(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCt00TrnidLastReference()) || DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCt00TrnidLastReference())) {
			ctx.getTranRecord().getTranIdReference().setBytes(Record.HIGH_VALUES);
		} else {
			ctx.getTranRecord().getTranIdReference().setValue(ctx.getCarddemoCommarea().getCdemoCt00TrnidLastReference());
		}
		ctx.getGroup1().setTrnidinl(-1);
		if (ctx.getCarddemoCommarea().isNextPageYes()) {
			processPageForward(ctx, ctrl);
		} else {
			ctx.getWsVariables().setWsMessage("You are already at the bottom of the page...");
			ctx.getWsVariables().setSendEraseNo(true);
			sendTrnlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation processPageForward.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PAGE-FORWARD
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void processPageForward(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		startbrTransactFile(ctx, ctrl);
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) != 0 && DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf7Reference()) != 0 && DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) != 0) {
				readnextTransactFile(ctx, ctrl);
			} 
			if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				ctx.getWsVariables().setWsIdx(1);
				while (ctx.getWsVariables().getWsIdx() <= 10) {
					initializeTranData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
				}
			} 
			ctx.getWsVariables().setWsIdx(1);
			while (!(ctx.getWsVariables().getWsIdx() >= 11 || ctx.getWsVariables().isTransactEof() || ctx.getWsVariables().isErrFlgOn())) {
				readnextTransactFile(ctx, ctrl);
				if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff()) {
					populateTranData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
				} 
			}
			if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				ctx.getCarddemoCommarea().setCdemoCt00PageNum(ctx.getCarddemoCommarea().getCdemoCt00PageNum() + 1);
				readnextTransactFile(ctx, ctrl);
				if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff()) {
					ctx.getCarddemoCommarea().setNextPageYes(true);
				} else {
					ctx.getCarddemoCommarea().setNextPageNo(true);
				}
			} else {
				ctx.getCarddemoCommarea().setNextPageNo(true);
				if (ctx.getWsVariables().getWsIdx() > 1) {
					ctx.getCarddemoCommarea().setCdemoCt00PageNum(ctx.getCarddemoCommarea().getCdemoCt00PageNum() + 1);
				} 
			}
			endbrTransactFile(ctx, ctrl);
			ctx.getGroup1().setPagenumi(ctx.getCarddemoCommarea().getCdemoCt00PageNumReference().getValue(String.class));
			DataUtils.setToBlank(ctx.getGroup1().getTrnidinoReference());
			sendTrnlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation processPageBackward.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PAGE-BACKWARD
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void processPageBackward(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		startbrTransactFile(ctx, ctrl);
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) != 0 && DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf8Reference()) != 0) {
				readprevTransactFile(ctx, ctrl);
			} 
			if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				ctx.getWsVariables().setWsIdx(1);
				while (ctx.getWsVariables().getWsIdx() <= 10) {
					initializeTranData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
				}
			} 
			ctx.getWsVariables().setWsIdx(10);
			while (!(ctx.getWsVariables().getWsIdx() <= 0 || ctx.getWsVariables().isTransactEof() || ctx.getWsVariables().isErrFlgOn())) {
				readprevTransactFile(ctx, ctrl);
				if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff()) {
					populateTranData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() - 1);
				} 
			}
			if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				readprevTransactFile(ctx, ctrl);
				if (ctx.getCarddemoCommarea().isNextPageYes()) {
					if (ctx.getWsVariables().isTransactNotEof() && ctx.getWsVariables().isErrFlgOff() && NumberUtils.gt(ctx.getCarddemoCommarea().getCdemoCt00PageNumReference(), 1)) {
						ctx.getCarddemoCommarea().setCdemoCt00PageNum(ctx.getCarddemoCommarea().getCdemoCt00PageNum() - 1);
					} else {
						ctx.getCarddemoCommarea().setCdemoCt00PageNum(1);
					}
				} 
			} 
			endbrTransactFile(ctx, ctrl);
			ctx.getGroup1().setPagenumi(ctx.getCarddemoCommarea().getCdemoCt00PageNumReference().getValue(String.class));
			sendTrnlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation populateTranData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       POPULATE-TRAN-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void populateTranData(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		ctx.getWsVariables().getWsTranAmtReference().setValue(ctx.getTranRecord().getTranAmt());
		ctx.getWsDateTime().getWsTimestampReference().setBytes(ctx.getTranRecord().getTranOrigTsReference().getBytes());
		ctx.getWsDateTime().setWsCurdateYy(NumberUtils.convert(ctx.getWsDateTime().getWsTimestampDtYyyyReference().getBytes(2, 2)).intValue());
		ctx.getWsDateTime().setWsCurdateMm(ctx.getWsDateTime().getWsTimestampDtMm());
		ctx.getWsDateTime().setWsCurdateDd(ctx.getWsDateTime().getWsTimestampDtDd());
		ctx.getWsVariables().getWsTranDateReference().setBytes(ctx.getWsDateTime().getWsCurdateMmDdYyReference().getBytes());
		if (ctx.getWsVariables().getWsIdx() == 1) {
			ctx.getGroup1().getTrnid01iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnidFirstReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate01iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc01i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt001i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 2) {
			ctx.getGroup1().getTrnid02iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate02iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc02i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt002i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 3) {
			ctx.getGroup1().getTrnid03iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate03iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc03i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt003i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 4) {
			ctx.getGroup1().getTrnid04iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate04iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc04i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt004i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 5) {
			ctx.getGroup1().getTrnid05iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate05iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc05i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt005i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 6) {
			ctx.getGroup1().getTrnid06iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate06iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc06i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt006i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 7) {
			ctx.getGroup1().getTrnid07iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate07iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc07i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt007i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 8) {
			ctx.getGroup1().getTrnid08iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate08iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc08i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt008i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 9) {
			ctx.getGroup1().getTrnid09iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate09iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc09i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt009i(ctx.getWsVariables().getWsTranAmt());
		} else if (ctx.getWsVariables().getWsIdx() == 10) {
			ctx.getGroup1().getTrnid10iReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getCarddemoCommarea().getCdemoCt00TrnidLastReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getTdate10iReference().setValue(ctx.getWsVariables().getWsTranDateReference());
			ctx.getGroup1().setTdesc10i(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTamt010i(ctx.getWsVariables().getWsTranAmt());
		} else {
			
			/* 
			Do nothing */
		}
	}

	/**
	 * Process operation initializeTranData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       INITIALIZE-TRAN-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void initializeTranData(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		if (ctx.getWsVariables().getWsIdx() == 1) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid01iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate01iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc01iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt001iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 2) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid02iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate02iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc02iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt002iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 3) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid03iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate03iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc03iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt003iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 4) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid04iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate04iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc04iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt004iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 5) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid05iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate05iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc05iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt005iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 6) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid06iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate06iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc06iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt006iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 7) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid07iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate07iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc07iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt007iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 8) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid08iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate08iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc08iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt008iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 9) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid09iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate09iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc09iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt009iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 10) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnid10iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdate10iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesc10iReference());
			DataUtils.setToBlank(ctx.getGroup1().getTamt010iReference());
		} else {
			
			/* 
			Do nothing */
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
	public void returnToPrevScreen(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendTrnlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendTrnlstScreen(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		if (ctx.getWsVariables().isSendEraseYes()) {
			SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.withMap("COTRN0A")
			.withMapset("COTRN00")
			.withData(ctx.getGroup1().getCotrn0aoReference())
			.withErase()
			.withCursor()
			.execute()
			.handleException();
		} else {
			SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.withMap("COTRN0A")
			.withMapset("COTRN00")
			.withData(ctx.getGroup1().getCotrn0aoReference())
			.withCursor()
			.execute()
			.handleException();
		}
	}

	/**
	 * Process operation receiveTrnlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveTrnlstScreen(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COTRN0A")
		.withMapset("COTRN00")
		.into(ctx.getGroup1().getCotrn0aiReference())
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
	public void populateHeaderInfo(final Cotrn00cContext ctx, final ExecutionController ctrl) {
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
	public void startbrTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl) {
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
			
			/* 
			Do nothing */
			ctx.getWsVariables().setTransactEof(true);
			ctx.getWsVariables().setWsMessage("You are at the top of the page...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnlstScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup transaction...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation readnextTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READNEXT-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readnextTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.readNext()
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
			
			/* 
			Do nothing */
			ctx.getWsVariables().setTransactEof(true);
			ctx.getWsVariables().setWsMessage("You have reached the bottom of the page...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnlstScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup transaction...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnlstScreen(ctx, ctrl);
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
	public void readprevTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl) {
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
			
			/* 
			Do nothing */
			ctx.getWsVariables().setTransactEof(true);
			ctx.getWsVariables().setWsMessage("You have reached the top of the page...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnlstScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup transaction...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnlstScreen(ctx, ctrl);
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
	public void endbrTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.endBrowse()
		.execute()
		.handleException();
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:34 CDT */
		return;
	}

}
