
package aws.bluage.l3.workshop.cousr00c.service.impl;

import aws.bluage.l3.workshop.cousr00c.business.context.Cousr00cContext;
import aws.bluage.l3.workshop.cousr00c.service.Cousr00cProcess;
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
 * Class Cousr00cProcessImpl
 * 
 * Defines application services for Cousr00cProcess
 * @see Cousr00cProcess
 */
@Service("aws.bluage.l3.workshop.cousr00c.service.Cousr00cProcess")
public class Cousr00cProcessImpl implements Cousr00cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cousr00cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COUSR00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cousr00cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COUSR00C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : List all users from USRSEC file
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
		ctx.getWsVariables().setUserSecNotEof(true);
		ctx.getCarddemoCommarea().setNextPageNo(true);
		ctx.getWsVariables().setSendEraseYes(true);
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		DataUtils.setToBlank(ctx.getGroup1().getErrmsgoReference());
		ctx.getGroup1().setUsridinl(-1);
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
			returnToPrevScreen(ctx, ctrl);
		} else {
			int len = ctx.getDfheiblk().getEibcalen();
			ctx.getCarddemoCommarea().setBytes(ctx.getDfhcommarea().getBytes(0, len));
			if (!(ctx.getCarddemoCommarea().isCdemoPgmReenter())) {
				ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
				ctx.getGroup1().getCousr0aoReference().setBytes(Record.LOW_VALUES);
				processEnterKey(ctx, ctrl);
				sendUsrlstScreen(ctx, ctrl);
			} else {
				receiveUsrlstScreen(ctx, ctrl);
				if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
					processEnterKey(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
					ctx.getCarddemoCommarea().setCdemoToProgram("COADM01C");
					returnToPrevScreen(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf7Reference()) == 0) {
					processPf7Key(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf8Reference()) == 0) {
					processPf8Key(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getGroup1().setUsridinl(-1);
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendUsrlstScreen(ctx, ctrl);
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
	public void processEnterKey(final Cousr00cContext ctx, final ExecutionController ctrl) {
		if (!(DataUtils.isBlank(ctx.getGroup1().getSel0001iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0001iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0001iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid01iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0002iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0002iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0002iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid02iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0003iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0003iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0003iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid03iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0004iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0004iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0004iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid04iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0005iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0005iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0005iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid05iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0006iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0006iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0006iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid06iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0007iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0007iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0007iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid07iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0008iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0008iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0008iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid08iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0009iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0009iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0009iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid09iReference());
		} else if (!(DataUtils.isBlank(ctx.getGroup1().getSel0010iReference())) && !(DataUtils.isLowValue(ctx.getGroup1().getSel0010iReference()))) {
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference().setValue(ctx.getGroup1().getSel0010iReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference().setValue(ctx.getGroup1().getUsrid10iReference());
		} else {
			DataUtils.setToBlank(ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference());
			DataUtils.setToBlank(ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference());
		}
		if (!(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference())) && !(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCu00UsrSelectedReference()))) {
			if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference(), "U") == 0 || DataUtils.compare(ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference(), "u") == 0) {
				ctx.getCarddemoCommarea().setCdemoToProgram("COUSR02C");
				ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
				ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
				ctx.getCarddemoCommarea().setCdemoPgmContext(0);
				XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
			} else if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference(), "D") == 0 || DataUtils.compare(ctx.getCarddemoCommarea().getCdemoCu00UsrSelFlgReference(), "d") == 0) {
				ctx.getCarddemoCommarea().setCdemoToProgram("COUSR03C");
				ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
				ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
				ctx.getCarddemoCommarea().setCdemoPgmContext(0);
				XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
			} else {
				ctx.getWsVariables().setWsMessage("Invalid selection. Valid values are U and D");
				ctx.getGroup1().setUsridinl(-1);
			}
		} 
		if (DataUtils.isBlank(ctx.getGroup1().getUsridiniReference()) || DataUtils.isLowValue(ctx.getGroup1().getUsridiniReference())) {
			ctx.getSecUserData().getSecUsrIdReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getSecUserData().getSecUsrIdReference().setValue(ctx.getGroup1().getUsridiniReference());
		}
		ctx.getGroup1().setUsridinl(-1);
		ctx.getCarddemoCommarea().setCdemoCu00PageNum(0);
		processPageForward(ctx, ctrl);
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			DataUtils.setToBlank(ctx.getGroup1().getUsridinoReference());
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
	public void processPf7Key(final Cousr00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCu00UsridFirstReference()) || DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCu00UsridFirstReference())) {
			ctx.getSecUserData().getSecUsrIdReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getSecUserData().getSecUsrIdReference().setValue(ctx.getCarddemoCommarea().getCdemoCu00UsridFirstReference());
		}
		ctx.getCarddemoCommarea().setNextPageYes(true);
		ctx.getGroup1().setUsridinl(-1);
		if (NumberUtils.gt(ctx.getCarddemoCommarea().getCdemoCu00PageNumReference(), 1)) {
			processPageBackward(ctx, ctrl);
		} else {
			ctx.getWsVariables().setWsMessage("You are already at the top of the page...");
			ctx.getWsVariables().setSendEraseNo(true);
			sendUsrlstScreen(ctx, ctrl);
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
	public void processPf8Key(final Cousr00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCu00UsridLastReference()) || DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCu00UsridLastReference())) {
			ctx.getSecUserData().getSecUsrIdReference().setBytes(Record.HIGH_VALUES);
		} else {
			ctx.getSecUserData().getSecUsrIdReference().setValue(ctx.getCarddemoCommarea().getCdemoCu00UsridLastReference());
		}
		ctx.getGroup1().setUsridinl(-1);
		if (ctx.getCarddemoCommarea().isNextPageYes()) {
			processPageForward(ctx, ctrl);
		} else {
			ctx.getWsVariables().setWsMessage("You are already at the bottom of the page...");
			ctx.getWsVariables().setSendEraseNo(true);
			sendUsrlstScreen(ctx, ctrl);
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
	public void processPageForward(final Cousr00cContext ctx, final ExecutionController ctrl) {
		startbrUserSecFile(ctx, ctrl);
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) != 0 && DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf7Reference()) != 0 && DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) != 0) {
				readnextUserSecFile(ctx, ctrl);
			} 
			if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				ctx.getWsVariables().setWsIdx(1);
				while (ctx.getWsVariables().getWsIdx() <= 10) {
					initializeUserData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
				}
			} 
			ctx.getWsVariables().setWsIdx(1);
			while (!(ctx.getWsVariables().getWsIdx() >= 11 || ctx.getWsVariables().isUserSecEof() || ctx.getWsVariables().isErrFlgOn())) {
				readnextUserSecFile(ctx, ctrl);
				if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff()) {
					populateUserData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
				} 
			}
			if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				ctx.getCarddemoCommarea().setCdemoCu00PageNum(ctx.getCarddemoCommarea().getCdemoCu00PageNum() + 1);
				readnextUserSecFile(ctx, ctrl);
				if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff()) {
					ctx.getCarddemoCommarea().setNextPageYes(true);
				} else {
					ctx.getCarddemoCommarea().setNextPageNo(true);
				}
			} else {
				ctx.getCarddemoCommarea().setNextPageNo(true);
				if (ctx.getWsVariables().getWsIdx() > 1) {
					ctx.getCarddemoCommarea().setCdemoCu00PageNum(ctx.getCarddemoCommarea().getCdemoCu00PageNum() + 1);
				} 
			}
			endbrUserSecFile(ctx, ctrl);
			ctx.getGroup1().setPagenumi(ctx.getCarddemoCommarea().getCdemoCu00PageNumReference().getValue(String.class));
			DataUtils.setToBlank(ctx.getGroup1().getUsridinoReference());
			sendUsrlstScreen(ctx, ctrl);
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
	public void processPageBackward(final Cousr00cContext ctx, final ExecutionController ctrl) {
		startbrUserSecFile(ctx, ctrl);
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) != 0 && DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf8Reference()) != 0) {
				readprevUserSecFile(ctx, ctrl);
			} 
			if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				ctx.getWsVariables().setWsIdx(1);
				while (ctx.getWsVariables().getWsIdx() <= 10) {
					initializeUserData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
				}
			} 
			ctx.getWsVariables().setWsIdx(10);
			while (!(ctx.getWsVariables().getWsIdx() <= 0 || ctx.getWsVariables().isUserSecEof() || ctx.getWsVariables().isErrFlgOn())) {
				readprevUserSecFile(ctx, ctrl);
				if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff()) {
					populateUserData(ctx, ctrl);
					ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() - 1);
				} 
			}
			if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff()) {
				readprevUserSecFile(ctx, ctrl);
				if (ctx.getCarddemoCommarea().isNextPageYes()) {
					if (ctx.getWsVariables().isUserSecNotEof() && ctx.getWsVariables().isErrFlgOff() && NumberUtils.gt(ctx.getCarddemoCommarea().getCdemoCu00PageNumReference(), 1)) {
						ctx.getCarddemoCommarea().setCdemoCu00PageNum(ctx.getCarddemoCommarea().getCdemoCu00PageNum() - 1);
					} else {
						ctx.getCarddemoCommarea().setCdemoCu00PageNum(1);
					}
				} 
			} 
			endbrUserSecFile(ctx, ctrl);
			ctx.getGroup1().setPagenumi(ctx.getCarddemoCommarea().getCdemoCu00PageNumReference().getValue(String.class));
			sendUsrlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation populateUserData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       POPULATE-USER-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void populateUserData(final Cousr00cContext ctx, final ExecutionController ctrl) {
		if (ctx.getWsVariables().getWsIdx() == 1) {
			ctx.getGroup1().getUsrid01iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsridFirstReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname01iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname01iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype01iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 2) {
			ctx.getGroup1().getUsrid02iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname02iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname02iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype02iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 3) {
			ctx.getGroup1().getUsrid03iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname03iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname03iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype03iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 4) {
			ctx.getGroup1().getUsrid04iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname04iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname04iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype04iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 5) {
			ctx.getGroup1().getUsrid05iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname05iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname05iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype05iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 6) {
			ctx.getGroup1().getUsrid06iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname06iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname06iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype06iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 7) {
			ctx.getGroup1().getUsrid07iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname07iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname07iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype07iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 8) {
			ctx.getGroup1().getUsrid08iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname08iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname08iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype08iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 9) {
			ctx.getGroup1().getUsrid09iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname09iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname09iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype09iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else if (ctx.getWsVariables().getWsIdx() == 10) {
			ctx.getGroup1().getUsrid10iReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getCarddemoCommarea().getCdemoCu00UsridLastReference().setValue(ctx.getSecUserData().getSecUsrIdReference());
			ctx.getGroup1().getFname10iReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLname10iReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getUtype10iReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
		} else {
			
			/* 
			Do nothing */
		}
	}

	/**
	 * Process operation initializeUserData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       INITIALIZE-USER-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void initializeUserData(final Cousr00cContext ctx, final ExecutionController ctrl) {
		if (ctx.getWsVariables().getWsIdx() == 1) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid01iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname01iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname01iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype01iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 2) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid02iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname02iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname02iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype02iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 3) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid03iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname03iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname03iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype03iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 4) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid04iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname04iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname04iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype04iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 5) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid05iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname05iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname05iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype05iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 6) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid06iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname06iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname06iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype06iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 7) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid07iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname07iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname07iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype07iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 8) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid08iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname08iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname08iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype08iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 9) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid09iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname09iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname09iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype09iReference());
		} else if (ctx.getWsVariables().getWsIdx() == 10) {
			DataUtils.setToBlank(ctx.getGroup1().getUsrid10iReference());
			DataUtils.setToBlank(ctx.getGroup1().getFname10iReference());
			DataUtils.setToBlank(ctx.getGroup1().getLname10iReference());
			DataUtils.setToBlank(ctx.getGroup1().getUtype10iReference());
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
	public void returnToPrevScreen(final Cousr00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendUsrlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-USRLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendUsrlstScreen(final Cousr00cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		if (ctx.getWsVariables().isSendEraseYes()) {
			SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.withMap("COUSR0A")
			.withMapset("COUSR00")
			.withData(ctx.getGroup1().getCousr0aoReference())
			.withErase()
			.withCursor()
			.execute()
			.handleException();
		} else {
			SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.withMap("COUSR0A")
			.withMapset("COUSR00")
			.withData(ctx.getGroup1().getCousr0aoReference())
			.withCursor()
			.execute()
			.handleException();
		}
	}

	/**
	 * Process operation receiveUsrlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-USRLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveUsrlstScreen(final Cousr00cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COUSR0A")
		.withMapset("COUSR00")
		.into(ctx.getGroup1().getCousr0aiReference())
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
	public void populateHeaderInfo(final Cousr00cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation startbrUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       STARTBR-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void startbrUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.startBrowse()
		.recordIndentificationField(ctx.getSecUserData().getSecUsrIdReference())
		.keyLength(8,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			
			/* 
			Do nothing */
			ctx.getWsVariables().setUserSecEof(true);
			ctx.getWsVariables().setWsMessage("You are at the top of the page...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrlstScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup User...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation readnextUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READNEXT-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readnextUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.readNext()
		.into(ctx.getSecUserData())
		.length(80)
		.recordIndentificationField(ctx.getSecUserData().getSecUsrIdReference())
		.keyLength(8,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.ENDFILE.getIntValue()) {
			
			/* 
			Do nothing */
			ctx.getWsVariables().setUserSecEof(true);
			ctx.getWsVariables().setWsMessage("You have reached the bottom of the page...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrlstScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup User...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation readprevUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READPREV-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readprevUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.readPrev()
		.into(ctx.getSecUserData())
		.length(80)
		.recordIndentificationField(ctx.getSecUserData().getSecUsrIdReference())
		.keyLength(8,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Do nothing */
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.ENDFILE.getIntValue()) {
			
			/* 
			Do nothing */
			ctx.getWsVariables().setUserSecEof(true);
			ctx.getWsVariables().setWsMessage("You have reached the top of the page...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrlstScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup User...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrlstScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation endbrUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       ENDBR-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void endbrUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.endBrowse()
		.execute()
		.handleException();
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:34 CDT */
		return;
	}

}
