
package aws.bluage.l3.workshop.cocrdlic.service.impl;

import aws.bluage.l3.workshop.cocrdlic.business.context.CocrdlicContext;
import aws.bluage.l3.workshop.cocrdlic.service.CocrdlicProcess;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendTextBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.JicsKeyComparisonMode;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.InspectBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class CocrdlicProcessImpl
 * 
 * Defines application services for CocrdlicProcess
 * @see CocrdlicProcess
 */
@Service("aws.bluage.l3.workshop.cocrdlic.service.CocrdlicProcess")
public class CocrdlicProcessImpl implements CocrdlicProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CocrdlicProcessImpl.class);


	/**
	 * Process operation main.
	 * 
	 * PROGRAM-ID.COCRDLIC.
	 *  DATE-WRITTEN.
	 *      April 2022.
	 *  DATE-COMPILED.
	 *      Today.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main(final CocrdlicContext ctx, final ExecutionController ctrl) {
		main1(ctx, ctrl);
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsConstants().getLitThistranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
		ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
		ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
		ctx.getWsCommarea().getWsCommareaReference().setBytes(ctx.getCarddemoCommarea().getBytes());
		int idx = ctx.getCarddemoCommarea().getSize() + 1 - 1;
		int len = ctx.getWsThisProgcommarea().getSize();
		ctx.getWsCommarea().getWsCommareaReference().setBytes(ctx.getWsThisProgcommarea().getBytes(), idx, len);
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withTransID(ctx.getWsConstants().getLitThistranid())
		.withCommarea(ctx.getWsCommarea().getWsCommareaReference())
		.withLength(2000)
		.execute()
		.handleException();
	}

	/**
	 * Process operation main1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void main1(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		****************************************************************
		Program:     COCRDLIC.CBL                                     *
		Layer:       Business logic                                   *
		Function:    List Credit Cards
		a) All cards if no context passed and admin user
		b) Only the ones associated with ACCT in COMMAREA
		if user is not admin
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
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT */
		ctx.getCcWorkAreas().getCcWorkAreaReference().getField().initialize();
		ctx.getWsMiscStorage().getField().initialize();
		DataUtils.initialize(ctx.getWsCommarea().getWsCommareaReference());
		
		/* 
		****************************************************************
		Store our context
		**************************************************************** */
		ctx.getWsMiscStorage().getWsTranidReference().setValue(ctx.getWsConstants().getLitThistranidReference());
		
		/* 
		****************************************************************
		Ensure error message is cleared                               *
		**************************************************************** */
		ctx.getWsMiscStorage().setWsErrorMsgOff(true);
		
		/* 
		****************************************************************
		Retrived passed data if  any. Initialize them if first run.
		**************************************************************** */
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getCarddemoCommarea().getField().initialize();
			ctx.getWsThisProgcommarea().getField().initialize();
			ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsConstants().getLitThistranidReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCarddemoCommarea().setCdemoUsrtypUser(true);
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getWsThisProgcommarea().setCaFirstPage(true);
			ctx.getWsThisProgcommarea().setCaLastPageNotShown(true);
		} else {
			int len = ctx.getCarddemoCommarea().getSize();
			ctx.getCarddemoCommarea().setBytes(ctx.getDfhcommarea().getBytes(0, len));
			int idx = ctx.getCarddemoCommarea().getSize() + 1 - 1;
			int len1 = ctx.getWsThisProgcommarea().getSize();
			ctx.getWsThisProgcommarea().setBytes(ctx.getDfhcommarea().getBytes(idx, len1));
		}
		
		/* 
		****************************************************************
		If coming in from menu. Lets forget the past and start afresh *
		**************************************************************** */
		if (ctx.getCarddemoCommarea().isCdemoPgmEnter() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsConstants().getLitThispgmReference()) != 0) {
			ctx.getWsThisProgcommarea().getField().initialize();
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getWsThisProgcommarea().setCaFirstPage(true);
			ctx.getWsThisProgcommarea().setCaLastPageNotShown(true);
		} 
		
		/* 
		****************************************************************
		Remap PFkeys as needed.
		Store the Mapped PF Key
		**************************************************************** */
		yyyyStorePfkey(ctx, ctrl);
		
		/* 
		****************************************************************
		If something is present in commarea
		and the from program is this program itself,
		read and edit the inputs given
		**************************************************************** */
		if (ctx.getDfheiblk().getEibcalen() > 0 && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsConstants().getLitThispgmReference()) == 0) {
			receiveMap(ctx, ctrl);
		} 
		
		/* 
		****************************************************************
		Check the mapped key  to see if its valid at this point       *
		F3    - Exit
		Enter - List of cards for current start key
		F8    - Page down
		F7    - Page up
		**************************************************************** */
		ctx.getWsMiscStorage().setPfkInvalid(true);
		if (ctx.getCcWorkAreas().isCcardAidEnter() || ctx.getCcWorkAreas().isCcardAidPfk03() || ctx.getCcWorkAreas().isCcardAidPfk07() || ctx.getCcWorkAreas().isCcardAidPfk08()) {
			ctx.getWsMiscStorage().setPfkValid(true);
		} 
		if (ctx.getWsMiscStorage().isPfkInvalid()) {
			ctx.getCcWorkAreas().setCcardAidEnter(true);
		} 
		
		/* 
		****************************************************************
		If the user pressed PF3 go back to main menu
		**************************************************************** */
		if (ctx.getCcWorkAreas().isCcardAidPfk03() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsConstants().getLitThispgmReference()) == 0) {
			ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsConstants().getLitThistranidReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCarddemoCommarea().setCdemoUsrtypUser(true);
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getCarddemoCommarea().getCdemoToProgramReference().setValue(ctx.getWsConstants().getLitMenupgmReference());
			ctx.getCcWorkAreas().getCcardNextMapsetReference().setValue(ctx.getWsConstants().getLitMenumapsetReference());
			ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getWsMiscStorage().setWsExitMessage(true);
			
			/* 
			CALL MENU PROGRAM */
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getWsConstants().getLitMenupgmReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
		} 
		
		/* 
		****************************************************************
		If the user did not press PF8, lets reset the last page flag
		**************************************************************** */
		if (ctx.getCcWorkAreas().isCcardAidPfk08()) {
			
			/* 
			Do nothing */
		} else {
			ctx.getWsThisProgcommarea().setCaLastPageNotShown(true);
		}
		
		/* 
		****************************************************************
		Now we decide what to do
		**************************************************************** */
		if (ctx.getWsMiscStorage().isInputError()) {
			
			/* 
			****************************************************************
			ASK FOR CORRECTIONS TO INPUTS
			**************************************************************** */
			ctx.getCcWorkAreas().getCcardErrorMsgReference().setValue(ctx.getWsMiscStorage().getWsErrorMsgReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getCcWorkAreas().getCcardNextProgReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCcWorkAreas().getCcardNextMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			if (!(ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) && !(ctx.getWsMiscStorage().isFlgCardfilterNotOk())) {
				readForward(ctx, ctrl);
			} 
			sendMap(ctx, ctrl);
			return;
		} else if ((ctx.getCcWorkAreas().isCcardAidPfk07() && ctx.getWsThisProgcommarea().isCaFirstPage()) || (ctx.getCcWorkAreas().isCcardAidPfk07() && ctx.getWsThisProgcommarea().isCaFirstPage())) {
			ctx.getWsMiscStorage().getWsCardRidCardnumReference().setValue(ctx.getWsThisProgcommarea().getWsCaFirstCardNumReference());
			
			/* 
			MOVE WS-CA-FIRST-CARD-ACCT-ID
			TO WS-CARD-RID-ACCT-ID */
			readForward(ctx, ctrl);
			sendMap(ctx, ctrl);
			return;
		} else if (ctx.getCcWorkAreas().isCcardAidPfk03() || (ctx.getCarddemoCommarea().isCdemoPgmReenter() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsConstants().getLitThispgmReference()) != 0)) {
			ctx.getCarddemoCommarea().getField().initialize();
			ctx.getWsThisProgcommarea().getField().initialize();
			ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsConstants().getLitThistranidReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCarddemoCommarea().setCdemoUsrtypUser(true);
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getWsThisProgcommarea().setCaFirstPage(true);
			ctx.getWsThisProgcommarea().setCaLastPageNotShown(true);
			ctx.getWsMiscStorage().getWsCardRidCardnumReference().setValue(ctx.getWsThisProgcommarea().getWsCaFirstCardNumReference());
			
			/* 
			MOVE WS-CA-FIRST-CARD-ACCT-ID
			TO WS-CARD-RID-ACCT-ID */
			readForward(ctx, ctrl);
			sendMap(ctx, ctrl);
			return;
		} else if (ctx.getCcWorkAreas().isCcardAidPfk08() && ctx.getWsThisProgcommarea().isCaNextPageExists()) {
			ctx.getWsMiscStorage().getWsCardRidCardnumReference().setValue(ctx.getWsThisProgcommarea().getWsCaLastCardNumReference());
			
			/* 
			MOVE WS-CA-LAST-CARD-ACCT-ID
			TO WS-CARD-RID-ACCT-ID */
			ctx.getWsThisProgcommarea().setWsCaScreenNum(ctx.getWsThisProgcommarea().getWsCaScreenNum() + 1);
			readForward(ctx, ctrl);
			sendMap(ctx, ctrl);
			return;
		} else if (ctx.getCcWorkAreas().isCcardAidPfk07() && !(ctx.getWsThisProgcommarea().isCaFirstPage())) {
			ctx.getWsMiscStorage().getWsCardRidCardnumReference().setValue(ctx.getWsThisProgcommarea().getWsCaFirstCardNumReference());
			
			/* 
			MOVE WS-CA-FIRST-CARD-ACCT-ID
			TO WS-CARD-RID-ACCT-ID */
			ctx.getWsThisProgcommarea().setWsCaScreenNum(ctx.getWsThisProgcommarea().getWsCaScreenNum() - 1);
			readBackwards(ctx, ctrl);
			sendMap(ctx, ctrl);
			return;
		} else if (ctx.getCcWorkAreas().isCcardAidEnter() && ctx.getWsMiscStorage().isItemFromViewRequestedOn(ctx.getWsMiscStorage().getISelected() - 1) && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsConstants().getLitThispgmReference()) == 0) {
			ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsConstants().getLitThistranidReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCarddemoCommarea().setCdemoUsrtypUser(true);
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getCcWorkAreas().getCcardNextProgReference().setValue(ctx.getWsConstants().getLitCarddtlpgmReference());
			ctx.getCcWorkAreas().getCcardNextMapsetReference().setValue(ctx.getWsConstants().getLitCarddtlmapsetReference());
			ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsConstants().getLitCarddtlmapReference());
			ctx.getCarddemoCommarea().setCdemoAcctId(NumberUtils.convert(ctx.getWsThisProgcommarea().getItemFromWsRowAcctno(ctx.getWsMiscStorage().getISelected() - 1)).longValue());
			ctx.getCarddemoCommarea().setCdemoCardNum(NumberUtils.convert(ctx.getWsThisProgcommarea().getItemFromWsRowCardNum(ctx.getWsMiscStorage().getISelected() - 1)).longValue());
			
			/* 
			CALL CARD DETAIL PROGRAM */
			XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCcWorkAreas().getCcardNextProgReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
		} else if (ctx.getCcWorkAreas().isCcardAidEnter() && ctx.getWsMiscStorage().isItemFromUpdateRequestedOn(ctx.getWsMiscStorage().getISelected() - 1) && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsConstants().getLitThispgmReference()) == 0) {
			ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsConstants().getLitThistranidReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCarddemoCommarea().setCdemoUsrtypUser(true);
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getCcWorkAreas().getCcardNextProgReference().setValue(ctx.getWsConstants().getLitCardupdpgmReference());
			ctx.getCcWorkAreas().getCcardNextMapsetReference().setValue(ctx.getWsConstants().getLitCardupdmapsetReference());
			ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsConstants().getLitCardupdmapReference());
			ctx.getCarddemoCommarea().setCdemoAcctId(NumberUtils.convert(ctx.getWsThisProgcommarea().getItemFromWsRowAcctno(ctx.getWsMiscStorage().getISelected() - 1)).longValue());
			ctx.getCarddemoCommarea().setCdemoCardNum(NumberUtils.convert(ctx.getWsThisProgcommarea().getItemFromWsRowCardNum(ctx.getWsMiscStorage().getISelected() - 1)).longValue());
			
			/* 
			CALL CARD UPDATE PROGRAM */
			XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCcWorkAreas().getCcardNextProgReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
		} else {
			
			/* 
			**************************************************************** */
			ctx.getWsMiscStorage().getWsCardRidCardnumReference().setValue(ctx.getWsThisProgcommarea().getWsCaFirstCardNumReference());
			
			/* 
			MOVE WS-CA-FIRST-CARD-ACCT-ID
			TO WS-CARD-RID-ACCT-ID */
			readForward(ctx, ctrl);
			sendMap(ctx, ctrl);
			return;
		}
		
		/* 
		If we had an error setup error message to display and return */
		if (ctx.getWsMiscStorage().isInputError()) {
			ctx.getCcWorkAreas().getCcardErrorMsgReference().setValue(ctx.getWsMiscStorage().getWsErrorMsgReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCarddemoCommarea().getCdemoLastMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			ctx.getCcWorkAreas().getCcardNextProgReference().setValue(ctx.getWsConstants().getLitThispgmReference());
			ctx.getCcWorkAreas().getCcardNextMapsetReference().setValue(ctx.getWsConstants().getLitThismapsetReference());
			ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsConstants().getLitThismapReference());
			
			/* 
			PERFORM 1000-SEND-MAP
			THRU 1000-SEND-MAP */
			return;
		} else {
			ctx.getCcWorkAreas().getCcardNextProgReference().setValue(ctx.getWsConstants().getLitThispgmReference());
		}
	}

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendMap(final CocrdlicContext ctx, final ExecutionController ctrl) {
		screenInit(ctx, ctrl);
		screenArrayInit(ctx, ctrl);
		setupArrayAttribs(ctx, ctrl);
		setupScreenAttrs(ctx, ctrl);
		setupMessage(ctx, ctrl);
		sendScreen(ctx, ctrl);
	}

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void screenInit(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getCcrdliaoReference().setBytes(Record.LOW_VALUES);
		ctx.getWsDateTime().getWsCurdateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		ctx.getGroup1().getTitle01oReference().setValue(ctx.getCcdaScreenTitle().getCcdaTitle01Reference());
		ctx.getGroup1().getTitle02oReference().setValue(ctx.getCcdaScreenTitle().getCcdaTitle02Reference());
		ctx.getGroup1().getTrnnameoReference().setValue(ctx.getWsConstants().getLitThistranidReference());
		ctx.getGroup1().getPgmnameoReference().setValue(ctx.getWsConstants().getLitThispgmReference());
		ctx.getWsDateTime().getWsCurdateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		ctx.getWsDateTime().setWsCurdateMm(ctx.getWsDateTime().getWsCurdateMonth());
		ctx.getWsDateTime().setWsCurdateDd(ctx.getWsDateTime().getWsCurdateDay());
		ctx.getWsDateTime().setWsCurdateYy(NumberUtils.convert(ctx.getWsDateTime().getWsCurdateYearReference().getBytes(2, 2)).intValue());
		ctx.getGroup1().getCurdateoReference().setBytes(ctx.getWsDateTime().getWsCurdateMmDdYyReference().getBytes());
		ctx.getWsDateTime().setWsCurtimeHh(ctx.getWsDateTime().getWsCurtimeHours());
		ctx.getWsDateTime().setWsCurtimeMm(ctx.getWsDateTime().getWsCurtimeMinute());
		ctx.getWsDateTime().setWsCurtimeSs(ctx.getWsDateTime().getWsCurtimeSecond());
		ctx.getGroup1().getCurtimeoReference().setBytes(ctx.getWsDateTime().getWsCurtimeHhMmSsReference().getBytes());
		
		/* 
		PAGE NUMBER */
		ctx.getGroup1().setPagenoo(ctx.getWsThisProgcommarea().getWsCaScreenNumReference().getValue(String.class));
		ctx.getWsMiscStorage().setWsNoInfoMessage(true);
		ctx.getGroup1().getInfomsgoReference().setValue(ctx.getWsMiscStorage().getWsInfoMsgReference());
		ctx.getGroup1().getInfomsgcReference().setValue(ctx.getDfhbmsca().getDfhbmdarReference());
	}

	/**
	 * Process operation screenArrayInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void screenArrayInit(final CocrdlicContext ctx, final ExecutionController ctrl) {
		/* 
		USE REDEFINES AND CLEAN UP REPETITIVE CODE !! */
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(0))) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().setCrdsel1o(ctx.getWsMiscStorage().getItemFromWsEditSelect(0));
			ctx.getGroup1().getAcctno1oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowAcctnoReference(0));
			ctx.getGroup1().getCrdnum1oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(0));
			ctx.getGroup1().getCrdsts1oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(0));
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(1))) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().setCrdsel2o(ctx.getWsMiscStorage().getItemFromWsEditSelect(1));
			ctx.getGroup1().getAcctno2oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowAcctnoReference(1));
			ctx.getGroup1().getCrdnum2oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(1));
			ctx.getGroup1().getCrdsts2oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(1));
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(2))) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().setCrdsel3o(ctx.getWsMiscStorage().getItemFromWsEditSelect(2));
			ctx.getGroup1().getAcctno3oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowAcctnoReference(2));
			ctx.getGroup1().getCrdnum3oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(2));
			ctx.getGroup1().getCrdsts3oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(2));
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(3))) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().setCrdsel4o(ctx.getWsMiscStorage().getItemFromWsEditSelect(3));
			ctx.getGroup1().getAcctno4oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowAcctnoReference(3));
			ctx.getGroup1().getCrdnum4oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(3));
			ctx.getGroup1().getCrdsts4oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(3));
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(4))) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().setCrdsel5o(ctx.getWsMiscStorage().getItemFromWsEditSelect(4));
			ctx.getGroup1().getAcctno5oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowAcctnoReference(4));
			ctx.getGroup1().getCrdnum5oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(4));
			ctx.getGroup1().getCrdsts5oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(4));
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(5))) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().setCrdsel6o(ctx.getWsMiscStorage().getItemFromWsEditSelect(5));
			ctx.getGroup1().getAcctno6oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowAcctnoReference(5));
			ctx.getGroup1().getCrdnum6oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(5));
			ctx.getGroup1().getCrdsts6oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(5));
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(6))) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().setCrdsel7o(ctx.getWsMiscStorage().getItemFromWsEditSelect(6));
			ctx.getGroup1().getAcctno7oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowAcctnoReference(6));
			ctx.getGroup1().getCrdnum7oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(6));
			ctx.getGroup1().getCrdsts7oReference().setValue(ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(6));
		}
	}

	/**
	 * Process operation setupArrayAttribs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupArrayAttribs(final CocrdlicContext ctx, final ExecutionController ctrl) {
		/* 
		USE REDEFINES AND CLEAN UP REPETITIVE CODE !! */
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(0)) || ctx.getWsMiscStorage().isFlgProtectSelectRowsYes()) {
			ctx.getGroup1().getCrdsel1aReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		} else {
			if (DataUtils.compare("1", ctx.getWsMiscStorage().getItemFromWsRowCrdselectErrorReference(0)) == 0) {
				ctx.getGroup1().getCrdsel1cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (DataUtils.isBlank(ctx.getWsMiscStorage().getItemFromWsEditSelectReference(0)) || DataUtils.isLowValue(ctx.getWsMiscStorage().getItemFromWsEditSelectReference(0))) {
					ctx.getGroup1().setCrdsel1o("*");
				} 
			} 
			ctx.getGroup1().getCrdsel1aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(1)) || ctx.getWsMiscStorage().isFlgProtectSelectRowsYes()) {
			ctx.getGroup1().getCrdsel2aReference().setValue(ctx.getDfhbmsca().getDfhbmproReference());
		} else {
			if (DataUtils.compare("1", ctx.getWsMiscStorage().getItemFromWsRowCrdselectErrorReference(1)) == 0) {
				ctx.getGroup1().getCrdsel2cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				ctx.getGroup1().setCrdsel2l(-1);
			} 
			ctx.getGroup1().getCrdsel2aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(2)) || ctx.getWsMiscStorage().isFlgProtectSelectRowsYes()) {
			ctx.getGroup1().getCrdsel3aReference().setValue(ctx.getDfhbmsca().getDfhbmproReference());
		} else {
			if (DataUtils.compare("1", ctx.getWsMiscStorage().getItemFromWsRowCrdselectErrorReference(2)) == 0) {
				ctx.getGroup1().getCrdsel3cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				ctx.getGroup1().setCrdsel3l(-1);
			} 
			ctx.getGroup1().getCrdsel3aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(3)) || ctx.getWsMiscStorage().isFlgProtectSelectRowsYes()) {
			ctx.getGroup1().getCrdsel4aReference().setValue(ctx.getDfhbmsca().getDfhbmproReference());
			ctx.getWsMiscStorage().setI(NumberUtils.convert(ctx.getDfhbmsca().getDfhbmpro()).intValue());
		} else {
			if (DataUtils.compare("1", ctx.getWsMiscStorage().getItemFromWsRowCrdselectErrorReference(3)) == 0) {
				ctx.getGroup1().getCrdsel4cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				ctx.getGroup1().setCrdsel4l(-1);
			} 
			ctx.getGroup1().getCrdsel4aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(4)) || ctx.getWsMiscStorage().isFlgProtectSelectRowsYes()) {
			ctx.getGroup1().getCrdsel5aReference().setValue(ctx.getDfhbmsca().getDfhbmproReference());
		} else {
			if (DataUtils.compare("1", ctx.getWsMiscStorage().getItemFromWsRowCrdselectErrorReference(4)) == 0) {
				ctx.getGroup1().getCrdsel5cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				ctx.getGroup1().setCrdsel5l(-1);
			} 
			ctx.getGroup1().getCrdsel5aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(5)) || ctx.getWsMiscStorage().isFlgProtectSelectRowsYes()) {
			ctx.getGroup1().getCrdsel6aReference().setValue(ctx.getDfhbmsca().getDfhbmproReference());
		} else {
			if (DataUtils.compare("1", ctx.getWsMiscStorage().getItemFromWsRowCrdselectErrorReference(5)) == 0) {
				ctx.getGroup1().getCrdsel6cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				ctx.getGroup1().setCrdsel6l(-1);
			} 
			ctx.getGroup1().getCrdsel6aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getItemFromWsEachCardReference(6)) || ctx.getWsMiscStorage().isFlgProtectSelectRowsYes()) {
			ctx.getGroup1().getCrdsel7aReference().setValue(ctx.getDfhbmsca().getDfhbmproReference());
		} else {
			if (DataUtils.compare("1", ctx.getWsMiscStorage().getItemFromWsRowCrdselectErrorReference(6)) == 0) {
				ctx.getGroup1().getCrdsel7cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				ctx.getGroup1().setCrdsel7l(-1);
			} 
			ctx.getGroup1().getCrdsel7aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
	}

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupScreenAttrs(final CocrdlicContext ctx, final ExecutionController ctrl) {
		/* 
		INITIALIZE SEARCH CRITERIA */
		if (ctx.getDfheiblk().getEibcalen() == 0 || (ctx.getCarddemoCommarea().isCdemoPgmEnter() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsConstants().getLitMenupgmReference()) == 0)) {
			
			/* 
			Do nothing */
		} else {
			if (ctx.getWsMiscStorage().isFlgAcctfilterIsvalid() || ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
				ctx.getGroup1().getAcctsidoReference().setValue(ctx.getCcWorkAreas().getCcAcctIdReference());
				ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			} else if (NumberUtils.eq(ctx.getCarddemoCommarea().getCdemoAcctIdReference(), 0)) {
				ctx.getGroup1().getAcctsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().setAcctsido(ctx.getCarddemoCommarea().getCdemoAcctIdReference().getValue(String.class));
				ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			}
			if (ctx.getWsMiscStorage().isFlgCardfilterIsvalid() || ctx.getWsMiscStorage().isFlgCardfilterNotOk()) {
				ctx.getGroup1().getCardsidoReference().setValue(ctx.getCcWorkAreas().getCcCardNumReference());
				ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			} else if (NumberUtils.eq(ctx.getCarddemoCommarea().getCdemoCardNumReference(), 0)) {
				ctx.getGroup1().getCardsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().setCardsido(ctx.getCarddemoCommarea().getCdemoCardNumReference().getValue(String.class));
				ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			}
		}
		
		/* 
		POSITION CURSOR */
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
			ctx.getGroup1().setAcctsidl(-1);
		} 
		if (ctx.getWsMiscStorage().isFlgCardfilterNotOk()) {
			ctx.getGroup1().getCardsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
			ctx.getGroup1().setCardsidl(-1);
		} 
		
		/* 
		IF NO ERRORS POSITION CURSOR AT ACCTID */
		if (ctx.getWsMiscStorage().isInputOk()) {
			ctx.getGroup1().setAcctsidl(-1);
		}
	}

	/**
	 * Process operation setupMessage.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupMessage(final CocrdlicContext ctx, final ExecutionController ctrl) {
		/* 
		SETUP MESSAGE */
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk() || ctx.getWsMiscStorage().isFlgCardfilterNotOk()) {
			
			/* 
			Do nothing */
		} else if (ctx.getCcWorkAreas().isCcardAidPfk07() && ctx.getWsThisProgcommarea().isCaFirstPage()) {
			ctx.getWsMiscStorage().setWsErrorMsg("NO PREVIOUS PAGES TO DISPLAY");
		} else if (ctx.getCcWorkAreas().isCcardAidPfk08() && ctx.getWsThisProgcommarea().isCaNextPageNotExists() && ctx.getWsThisProgcommarea().isCaLastPageShown()) {
			ctx.getWsMiscStorage().setWsErrorMsg("NO MORE PAGES TO DISPLAY");
		} else if (ctx.getCcWorkAreas().isCcardAidPfk08() && ctx.getWsThisProgcommarea().isCaNextPageNotExists()) {
			ctx.getWsMiscStorage().setWsInformRecActions(true);
			if (ctx.getWsThisProgcommarea().isCaLastPageNotShown() && ctx.getWsThisProgcommarea().isCaNextPageNotExists()) {
				ctx.getWsThisProgcommarea().setCaLastPageShown(true);
			} 
		} else if (ctx.getWsMiscStorage().isWsNoInfoMessage() || ctx.getWsThisProgcommarea().isCaNextPageExists()) {
			ctx.getWsMiscStorage().setWsInformRecActions(true);
		} else {
			ctx.getWsMiscStorage().setWsNoInfoMessage(true);
		}
		ctx.getGroup1().setErrmsgo(ctx.getWsMiscStorage().getWsErrorMsg());
		if (!(ctx.getWsMiscStorage().isWsNoInfoMessage()) && !(ctx.getWsMiscStorage().isWsNoRecordsFound())) {
			ctx.getGroup1().getInfomsgoReference().setValue(ctx.getWsMiscStorage().getWsInfoMsgReference());
			ctx.getGroup1().getInfomsgcReference().setValue(ctx.getDfhbmsca().getDfhneutrReference());
		}
	}

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendScreen(final CocrdlicContext ctx, final ExecutionController ctrl) {
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getWsConstants().getLitThismap())
		.withMapset(ctx.getWsConstants().getLitThismapset())
		.withData(ctx.getGroup1().getCcrdliaoReference())
		.withCursor()
		.withErase()
		.withFreeKB()
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
	}

	/**
	 * Process operation receiveMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveMap(final CocrdlicContext ctx, final ExecutionController ctrl) {
		receiveScreen(ctx, ctrl);
		editInputs(ctx, ctrl);
	}

	/**
	 * Process operation receiveScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveScreen(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getWsConstants().getLitThismap())
		.withMapset(ctx.getWsConstants().getLitThismapset())
		.into(ctx.getGroup1().getCcrdliaiReference())
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getCcWorkAreas().getCcAcctIdReference().setValue(ctx.getGroup1().getAcctsidiReference());
		ctx.getCcWorkAreas().getCcCardNumReference().setValue(ctx.getGroup1().getCardsidiReference());
		ctx.getWsMiscStorage().setItemFromWsEditSelect(ctx.getGroup1().getCrdsel1i(),0);
		ctx.getWsMiscStorage().setItemFromWsEditSelect(ctx.getGroup1().getCrdsel2i(),1);
		ctx.getWsMiscStorage().setItemFromWsEditSelect(ctx.getGroup1().getCrdsel3i(),2);
		ctx.getWsMiscStorage().setItemFromWsEditSelect(ctx.getGroup1().getCrdsel4i(),3);
		ctx.getWsMiscStorage().setItemFromWsEditSelect(ctx.getGroup1().getCrdsel5i(),4);
		ctx.getWsMiscStorage().setItemFromWsEditSelect(ctx.getGroup1().getCrdsel6i(),5);
		ctx.getWsMiscStorage().setItemFromWsEditSelect(ctx.getGroup1().getCrdsel7i(),6);
	}

	/**
	 * Process operation editInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editInputs(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setInputOk(true);
		ctx.getWsMiscStorage().setFlgProtectSelectRowsNo(true);
		editAccount(ctx, ctrl);
		editCard(ctx, ctrl);
		editArray(ctx, ctrl);
	}

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAccount(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setFlgAcctfilterBlank(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getCcWorkAreas().getCcAcctIdReference()) || DataUtils.isBlank(ctx.getCcWorkAreas().getCcAcctIdReference()) || NumberUtils.eq(ctx.getCcWorkAreas().getCcAcctIdNReference(), 0)) {
			ctx.getWsMiscStorage().setFlgAcctfilterBlank(true);
			DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
			return;
		} else {
			
			/* 
			Not numeric
			Not 11 characters */
			if (!(DataUtils.isNumeric(ctx.getCcWorkAreas().getCcAcctIdReference()))) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
				ctx.getWsMiscStorage().setFlgProtectSelectRowsYes(true);
				ctx.getWsMiscStorage().setWsErrorMsg("ACCOUNT FILTER,IF SUPPLIED MUST BE A 11 DIGIT NUMBER");
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
				return;
			} else {
				ctx.getCarddemoCommarea().setCdemoAcctId(NumberUtils.convert(ctx.getCcWorkAreas().getCcAcctId()).longValue());
				ctx.getWsMiscStorage().setFlgAcctfilterIsvalid(true);
				return;
			}
		}
	}

	/**
	 * Process operation editCard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editCard(final CocrdlicContext ctx, final ExecutionController ctrl) {
		/* 
		Not numeric
		Not 16 characters */
		ctx.getWsMiscStorage().setFlgCardfilterBlank(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getCcWorkAreas().getCcCardNumReference()) || DataUtils.isBlank(ctx.getCcWorkAreas().getCcCardNumReference()) || NumberUtils.eq(ctx.getCcWorkAreas().getCcCardNumNReference(), 0)) {
			ctx.getWsMiscStorage().setFlgCardfilterBlank(true);
			DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoCardNumReference());
			return;
		} else {
			
			/* 
			Not numeric
			Not 16 characters */
			if (!(DataUtils.isNumeric(ctx.getCcWorkAreas().getCcCardNumReference()))) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgCardfilterNotOk(true);
				ctx.getWsMiscStorage().setFlgProtectSelectRowsYes(true);
				if (ctx.getWsMiscStorage().isWsErrorMsgOff()) {
					ctx.getWsMiscStorage().setWsErrorMsg("CARD ID FILTER,IF SUPPLIED MUST BE A 16 DIGIT NUMBER");
				} 
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoCardNumReference());
				return;
			} else {
				ctx.getCarddemoCommarea().setCdemoCardNum(ctx.getCcWorkAreas().getCcCardNumN());
				ctx.getWsMiscStorage().setFlgCardfilterIsvalid(true);
				return;
			}
		}
	}

	/**
	 * Process operation editArray.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editArray(final CocrdlicContext ctx, final ExecutionController ctrl) {
		if (ctx.getWsMiscStorage().isInputError()) {
			return;
		} else {
			InspectBuilder.newInstance(ctx.getWsMiscStorage().getWsEditSelectFlagsReference())
				.countInto(ctx.getWsMiscStorage().getIReference())
				.all("S","U")
				.apply();
			if (ctx.getWsMiscStorage().getI() > 1) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setWsMoreThan1Action(true);
				ctx.getWsMiscStorage().getWsEditSelectErrorFlagsReference().setValue(ctx.getWsMiscStorage().getWsEditSelectFlagsReference());
				InspectBuilder.newInstance(ctx.getWsMiscStorage().getWsEditSelectErrorFlagsReference())
					.replace()
					.all("S")
					.by("1")
					.replace()
					.all("U")
					.by("1")
					.replace()
					.characters()
					.by("0")
					.apply();
			} 
			DataUtils.setToZeroes(ctx.getWsMiscStorage().getISelectedReference());
			ctx.getWsMiscStorage().setI(1);
			while (ctx.getWsMiscStorage().getI() <= 7) {
				if (ctx.getWsMiscStorage().isItemFromSelectOk(ctx.getWsMiscStorage().getI() - 1)) {
					ctx.getWsMiscStorage().setISelected(ctx.getWsMiscStorage().getI());
					if (ctx.getWsMiscStorage().isWsMoreThan1Action()) {
						ctx.getWsMiscStorage().setItemFromWsRowCrdselectError("1",ctx.getWsMiscStorage().getI() - 1);
					} 
				} else if (ctx.getWsMiscStorage().isItemFromSelectBlank(ctx.getWsMiscStorage().getI() - 1)) {
					
					/* 
					Do nothing */
				} else {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setItemFromWsRowCrdselectError("1",ctx.getWsMiscStorage().getI() - 1);
					if (ctx.getWsMiscStorage().isWsErrorMsgOff()) {
						ctx.getWsMiscStorage().setWsInvalidActionCode(true);
					} 
				}
				ctx.getWsMiscStorage().setI(ctx.getWsMiscStorage().getI() + 1);
			}
		}
	}

	/**
	 * Process operation readForward.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readForward(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ctx.getWsThisProgcommarea().getWsAllRowsReference().setBytes(Record.LOW_VALUES);
		
		/* 
		****************************************************************
		Start Browse
		**************************************************************** */
		JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.startBrowse()
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
		.keyLength(16,false)
		.keyComparisonMode(JicsKeyComparisonMode.GREATER_OR_EQUAL)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		
		/* 
		****************************************************************
		Loop through records and fetch max screen records
		**************************************************************** */
		DataUtils.setToZeroes(ctx.getWsMiscStorage().getWsScrnCounterReference());
		ctx.getWsThisProgcommarea().setCaNextPageExists(true);
		ctx.getWsMiscStorage().setMoreRecordsToRead(true);
		while (!(ctx.getWsMiscStorage().isReadLoopExit())) {
			JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
			.readNext()
			.into(ctx.getCardRecord())
			.length(150)
			.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
			.keyLength(16,false)
			.execute();
			ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
			ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
			if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue() || ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.DUPREC.getIntValue()) {
				filterRecords(ctx, ctrl);
				if (ctx.getWsMiscStorage().isWsDonotExcludeThisRecord()) {
					ctx.getWsMiscStorage().setWsScrnCounter(ctx.getWsMiscStorage().getWsScrnCounter() + 1);
					ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(ctx.getWsMiscStorage().getWsScrnCounter() - 1).setValue(ctx.getCardRecord().getCardNumReference());
					ctx.getWsThisProgcommarea().setItemFromWsRowAcctno(ctx.getCardRecord().getCardAcctIdReference().getValue(String.class),ctx.getWsMiscStorage().getWsScrnCounter() - 1);
					ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(ctx.getWsMiscStorage().getWsScrnCounter() - 1).setValue(ctx.getCardRecord().getCardActiveStatusReference());
					if (ctx.getWsMiscStorage().getWsScrnCounter() == 1) {
						ctx.getWsThisProgcommarea().setWsCaFirstCardAcctId(ctx.getCardRecord().getCardAcctId());
						ctx.getWsThisProgcommarea().getWsCaFirstCardNumReference().setValue(ctx.getCardRecord().getCardNumReference());
						if (NumberUtils.eq(ctx.getWsThisProgcommarea().getWsCaScreenNumReference(), 0)) {
							ctx.getWsThisProgcommarea().setWsCaScreenNum(ctx.getWsThisProgcommarea().getWsCaScreenNum() + 1);
						} else {
							
							/* 
							Do nothing */
						}
					} else {
						
						/* 
						Do nothing */
					}
				} else {
					
					/* 
					Do nothing */
				}
				
				/* 
				****************************************************************
				Max Screen size
				**************************************************************** */
				if (ctx.getWsMiscStorage().getWsScrnCounter() == ctx.getWsConstants().getWsMaxScreenLines()) {
					ctx.getWsMiscStorage().setReadLoopExit(true);
					ctx.getWsThisProgcommarea().setWsCaLastCardAcctId(ctx.getCardRecord().getCardAcctId());
					ctx.getWsThisProgcommarea().getWsCaLastCardNumReference().setValue(ctx.getCardRecord().getCardNumReference());
					JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
					.readNext()
					.into(ctx.getCardRecord())
					.length(150)
					.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
					.keyLength(16,false)
					.execute();
					ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
					ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
					if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue() || ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.DUPREC.getIntValue()) {
						ctx.getWsThisProgcommarea().setCaNextPageExists(true);
						ctx.getWsThisProgcommarea().setWsCaLastCardAcctId(ctx.getCardRecord().getCardAcctId());
						ctx.getWsThisProgcommarea().getWsCaLastCardNumReference().setValue(ctx.getCardRecord().getCardNumReference());
					} else if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.ENDFILE.getIntValue()) {
						ctx.getWsThisProgcommarea().setCaNextPageNotExists(true);
						if (ctx.getWsMiscStorage().isWsErrorMsgOff()) {
							ctx.getWsMiscStorage().setWsErrorMsg("NO MORE RECORDS TO SHOW");
						} 
					} else {
						
						/* 
						This is some kind of error. Change to END BR
						And exit */
						ctx.getWsMiscStorage().setReadLoopExit(true);
						ctx.getWsMiscStorage().setErrorOpname("READ");
						ctx.getWsMiscStorage().setErrorFile(ctx.getWsConstants().getLitCardFile());
						ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
						ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
						ctx.getWsMiscStorage().getWsErrorMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
					}
				} 
			} else if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.ENDFILE.getIntValue()) {
				ctx.getWsMiscStorage().setReadLoopExit(true);
				ctx.getWsThisProgcommarea().setCaNextPageNotExists(true);
				ctx.getWsThisProgcommarea().setWsCaLastCardAcctId(ctx.getCardRecord().getCardAcctId());
				ctx.getWsThisProgcommarea().getWsCaLastCardNumReference().setValue(ctx.getCardRecord().getCardNumReference());
				if (ctx.getWsMiscStorage().isWsErrorMsgOff()) {
					ctx.getWsMiscStorage().setWsErrorMsg("NO MORE RECORDS TO SHOW");
				} 
				if (NumberUtils.eq(ctx.getWsThisProgcommarea().getWsCaScreenNumReference(), 1) && ctx.getWsMiscStorage().getWsScrnCounter() == 0) {
					
					/* 
					MOVE 'NO RECORDS TO SHOW'  TO WS-ERROR-MSG */
					ctx.getWsMiscStorage().setWsNoRecordsFound(true);
				} 
			} else {
				
				/* 
				This is some kind of error. Change to END BR
				And exit */
				ctx.getWsMiscStorage().setReadLoopExit(true);
				ctx.getWsMiscStorage().setErrorOpname("READ");
				ctx.getWsMiscStorage().setErrorFile(ctx.getWsConstants().getLitCardFile());
				ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
				ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
				ctx.getWsMiscStorage().getWsErrorMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
			}
		}
		JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.endBrowse()
		.execute()
		.handleException();
	}

	/**
	 * Process operation readBackwards.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readBackwards(final CocrdlicContext ctx, final ExecutionController ctrl) {
		readBackwards1(ctx, ctrl);
		JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.endBrowse()
		.execute()
		.handleException();
	}

	/**
	 * Process operation readBackwards1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readBackwards1(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ctx.getWsThisProgcommarea().getWsAllRowsReference().setBytes(Record.LOW_VALUES);
		ctx.getWsThisProgcommarea().getWsCaLastCardkeyReference().setBytes(ctx.getWsThisProgcommarea().getWsCaFirstCardkeyReference().getBytes());
		
		/* 
		****************************************************************
		Start Browse
		**************************************************************** */
		JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.startBrowse()
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
		.keyLength(16,false)
		.keyComparisonMode(JicsKeyComparisonMode.GREATER_OR_EQUAL)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		
		/* 
		****************************************************************
		Loop through records and fetch max screen records
		**************************************************************** */
		ctx.getWsMiscStorage().setWsScrnCounter(ctx.getWsConstants().getWsMaxScreenLines() + 1);
		ctx.getWsThisProgcommarea().setCaNextPageExists(true);
		ctx.getWsMiscStorage().setMoreRecordsToRead(true);
		
		/* 
		****************************************************************
		Now we show the records from previous set.
		**************************************************************** */
		JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.readPrev()
		.into(ctx.getCardRecord())
		.length(150)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
		.keyLength(16,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue() || ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.DUPREC.getIntValue()) {
			ctx.getWsMiscStorage().setWsScrnCounter(ctx.getWsMiscStorage().getWsScrnCounter() - 1);
			while (!(ctx.getWsMiscStorage().isReadLoopExit())) {
				JicsFileBuilder.newInstance(ctx.getWsConstants().getLitCardFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
				.readPrev()
				.into(ctx.getCardRecord())
				.length(150)
				.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
				.keyLength(16,false)
				.execute();
				ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
				ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
				if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue() || ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.DUPREC.getIntValue()) {
					filterRecords(ctx, ctrl);
					if (ctx.getWsMiscStorage().isWsDonotExcludeThisRecord()) {
						ctx.getWsThisProgcommarea().getItemFromWsRowCardNumReference(ctx.getWsMiscStorage().getWsScrnCounter() - 1).setValue(ctx.getCardRecord().getCardNumReference());
						ctx.getWsThisProgcommarea().setItemFromWsRowAcctno(ctx.getCardRecord().getCardAcctIdReference().getValue(String.class),ctx.getWsMiscStorage().getWsScrnCounter() - 1);
						ctx.getWsThisProgcommarea().getItemFromWsRowCardStatusReference(ctx.getWsMiscStorage().getWsScrnCounter() - 1).setValue(ctx.getCardRecord().getCardActiveStatusReference());
						ctx.getWsMiscStorage().setWsScrnCounter(ctx.getWsMiscStorage().getWsScrnCounter() - 1);
						if (ctx.getWsMiscStorage().getWsScrnCounter() == 0) {
							ctx.getWsMiscStorage().setReadLoopExit(true);
							ctx.getWsThisProgcommarea().setWsCaFirstCardAcctId(ctx.getCardRecord().getCardAcctId());
							ctx.getWsThisProgcommarea().getWsCaFirstCardNumReference().setValue(ctx.getCardRecord().getCardNumReference());
						} else {
							
							/* 
							Do nothing */
						}
					} else {
						
						/* 
						Do nothing */
					}
				} else {
					
					/* 
					This is some kind of error. Change to END BR
					And exit */
					ctx.getWsMiscStorage().setReadLoopExit(true);
					ctx.getWsMiscStorage().setErrorOpname("READ");
					ctx.getWsMiscStorage().setErrorFile(ctx.getWsConstants().getLitCardFile());
					ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
					ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
					ctx.getWsMiscStorage().getWsErrorMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
				}
			}
		} else {
			
			/* 
			This is some kind of error. Change to END BR
			And exit */
			ctx.getWsMiscStorage().setReadLoopExit(true);
			ctx.getWsMiscStorage().setErrorOpname("READ");
			ctx.getWsMiscStorage().setErrorFile(ctx.getWsConstants().getLitCardFile());
			ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
			ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
			ctx.getWsMiscStorage().getWsErrorMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
			return;
		}
	}

	/**
	 * Process operation filterRecords.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void filterRecords(final CocrdlicContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setWsDonotExcludeThisRecord(true);
		if (ctx.getWsMiscStorage().isFlgAcctfilterIsvalid()) {
			if (DataUtils.compareAlphInt(ctx.getCardRecord().getCardAcctIdReference().getValue(String.class), ctx.getCcWorkAreas().getCcAcctId()) == 0) {
				
				/* 
				Do nothing */
			} else {
				ctx.getWsMiscStorage().setWsExcludeThisRecord(true);
				return;
			}
		} else {
			
			/* 
			Do nothing */
		}
		if (ctx.getWsMiscStorage().isFlgCardfilterIsvalid()) {
			if (DataUtils.compareAlphInt(ctx.getCardRecord().getCardNum(), ctx.getCcWorkAreas().getCcCardNumNReference().getValue(String.class)) == 0) {
				
				/* 
				Do nothing */
			} else {
				ctx.getWsMiscStorage().setWsExcludeThisRecord(true);
				return;
			}
		} else {
			
			/* 
			Do nothing */
		}
	}

	/**
	 * Process operation yyyyStorePfkey.
	 * 
	 * ****************************************************************
	 * Common code to store PFKey
	 * ****************************************************************
	 * ****************************************************************
	 *  Copyright Amazon.com, Inc. or its affiliates.
	 *  All Rights Reserved.
	 *  Licensed under the Apache License, Version 2.0 (the \"License\").
	 *  You may not use this file except in compliance with the License.
	 *  You may obtain a copy of the License at
	 *     http://www.apache.org/licenses/LICENSE-2.0
	 *  Unless required by applicable law or agreed to in writing,
	 *  software distributed under the License is distributed on an
	 *  \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
	 *  either express or implied. See the License for the specific
	 *  language governing permissions and limitations under the License
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void yyyyStorePfkey(final CocrdlicContext ctx, final ExecutionController ctrl) {
		/* 
		Map AID to PFKey in COMMON Area
		****************************************************************
		**************************************************************** */
		if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidEnter(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhclearReference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidClear(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpa1Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPa1(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpa2Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPa2(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf1Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk01(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf2Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk02(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk03(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf4Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk04(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf5Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk05(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf6Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk06(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf7Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk07(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf8Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk08(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf9Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk09(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf10Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk10(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf11Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk11(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf12Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk12(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf13Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk01(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf14Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk02(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf15Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk03(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf16Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk04(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf17Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk05(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf18Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk06(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf19Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk07(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf20Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk08(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf21Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk09(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf22Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk10(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf23Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk11(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf24Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk12(true);
		}
	}

	/**
	 * Process operation sendPlainText.
	 * 
	 *  Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
	 * ****************************************************************
	 *  Plain text exit - Dont use in production                      *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendPlainText(final CocrdlicContext ctx, final ExecutionController ctrl) {
		SendTextBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withData(ctx.getWsMiscStorage().getWsErrorMsgReference())
		.withLength(75)
		.withErase()
		.withFreeKB()
		.execute()
		.handleException();
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.execute()
		.handleException();
	}

	/**
	 * Process operation sendLongText.
	 * 
	 * ****************************************************************
	 *  Display Long text and exit                                    *
	 *  This is primarily for debugging and should not be used in     *
	 *  regular course                                                *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendLongText(final CocrdlicContext ctx, final ExecutionController ctrl) {
		SendTextBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withData(ctx.getWsMiscStorage().getWsLongMsgReference())
		.withLength(500)
		.withErase()
		.withFreeKB()
		.execute()
		.handleException();
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.execute()
		.handleException();
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:33 CDT */
		return;
	}

}
