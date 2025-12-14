
package aws.bluage.l3.workshop.comen01c.service.impl;

import aws.bluage.l3.workshop.comen01c.business.context.Comen01cContext;
import aws.bluage.l3.workshop.comen01c.service.Comen01cProcess;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.InspectBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Comen01cProcessImpl
 * 
 * Defines application services for Comen01cProcess
 * @see Comen01cProcess
 */
@Service("aws.bluage.l3.workshop.comen01c.service.Comen01cProcess")
public class Comen01cProcessImpl implements Comen01cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Comen01cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COMEN01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Comen01cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COMEN01C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Main Menu for the Regular users
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
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		DataUtils.setToBlank(ctx.getGroup1().getErrmsgoReference());
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getCarddemoCommarea().setCdemoFromProgram("COSGN00C");
			returnToSignonScreen(ctx, ctrl);
		} else {
			int len = ctx.getDfheiblk().getEibcalen();
			ctx.getCarddemoCommarea().setBytes(ctx.getDfhcommarea().getBytes(0, len));
			if (!(ctx.getCarddemoCommarea().isCdemoPgmReenter())) {
				ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
				ctx.getGroup1().getComen1aoReference().setBytes(Record.LOW_VALUES);
				sendMenuScreen(ctx, ctrl);
			} else {
				receiveMenuScreen(ctx, ctrl);
				if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
					processEnterKey(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
					ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
					returnToSignonScreen(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendMenuScreen(ctx, ctrl);
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
	public void processEnterKey(final Comen01cContext ctx, final ExecutionController ctrl) {
		ctx.getWsVariables().setWsIdx(ctx.getGroup1().getOptioniReference().getRecord().getSize());
		boolean condition = true;
		while (condition) {
			int idx = ctx.getWsVariables().getWsIdx() - 1;
			condition = !(!(DataUtils.isBlank(ctx.getGroup1().getOptioniReference().getBytes(idx, 1))) || ctx.getWsVariables().getWsIdx() == 1);
			if (condition) {
				ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + -1);
			} 
		}
		int len = ctx.getWsVariables().getWsIdx();
		ctx.getWsVariables().getWsOptionXReference().setBytes(ctx.getGroup1().getOptioniReference().getBytes(0, len));
		InspectBuilder.newInstance(ctx.getWsVariables().getWsOptionXReference())
			.replace()
			.all(" ")
			.by("0")
			.apply();
		ctx.getWsVariables().setWsOption(NumberUtils.convert(ctx.getWsVariables().getWsOptionX()).intValue());
		ctx.getGroup1().setOptiono(ctx.getWsVariables().getWsOptionReference().getValue(String.class));
		if (!(DataUtils.isNumeric(ctx.getWsVariables().getWsOptionReference())) || NumberUtils.gt(ctx.getWsVariables().getWsOptionReference(), ctx.getCarddemoMainMenuOptions().getCdemoMenuOptCountReference()) || NumberUtils.eq(ctx.getWsVariables().getWsOptionReference(), 0)) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Please enter a valid option number...");
			sendMenuScreen(ctx, ctrl);
		} 
		if (ctx.getCarddemoCommarea().isCdemoUsrtypUser() && DataUtils.compare("A", ctx.getCarddemoMainMenuOptions().getItemFromCdemoMenuOptUsrtypeReference(ctx.getWsVariables().getWsOption() - 1)) == 0) {
			ctx.getWsVariables().setErrFlgOn(true);
			DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
			ctx.getWsVariables().setWsMessage("No access - Admin Only option... ");
			sendMenuScreen(ctx, ctrl);
		} 
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (DataUtils.compare(ctx.getCarddemoMainMenuOptions().getItemFromCdemoMenuOptPgmnameReference(ctx.getWsVariables().getWsOption() - 1).getBytes(0, 5), "DUMMY") != 0) {
				ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
				ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
				
				/* 
				MOVE WS-USER-ID   TO CDEMO-USER-ID
				MOVE SEC-USR-TYPE TO CDEMO-USER-TYPE */
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
				XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoMainMenuOptions().getItemFromCdemoMenuOptPgmnameReference(ctx.getWsVariables().getWsOption() - 1)).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
			} 
			DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
			ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhgreenReference());
			/* FIXME BA:START PATCH P1 */
			String option = ctx.getCarddemoMainMenuOptions().getItemFromCdemoMenuOptName(ctx.getWsVariables().getWsOption() - 1);
			option = StringUtils.stripEnd(option, " ");
			ctx.getWsVariables().setWsMessage(String.format("This option %s is coming soon ...", option));
			/*
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
				.addDelimitedBySize("This option ")
				.addDelimitedByLiteral(ctx.getCarddemoMainMenuOptions().getItemFromCdemoMenuOptName(ctx.getWsVariables().getWsOption() - 1)," ")
				.addDelimitedBySize("is coming soon ...")
				.end();
			*/
			/* BA:END PATCH P1 */
			sendMenuScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation returnToSignonScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RETURN-TO-SIGNON-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void returnToSignonScreen(final Comen01cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).execute().handleException();
	}

	/**
	 * Process operation sendMenuScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-MENU-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendMenuScreen(final Comen01cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		buildMenuOptions(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COMEN1A")
		.withMapset("COMEN01")
		.withData(ctx.getGroup1().getComen1aoReference())
		.withErase()
		.execute()
		.handleException();
	}

	/**
	 * Process operation receiveMenuScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-MENU-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveMenuScreen(final Comen01cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COMEN1A")
		.withMapset("COMEN01")
		.into(ctx.getGroup1().getComen1aiReference())
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
	public void populateHeaderInfo(final Comen01cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation buildMenuOptions.
	 * 
	 * ----------------------------------------------------------------*
	 *                       BUILD-MENU-OPTIONS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void buildMenuOptions(final Comen01cContext ctx, final ExecutionController ctrl) {
		ctx.getWsVariables().setWsIdx(1);
		while (NumberUtils.le(ctx.getWsVariables().getWsIdxReference(), ctx.getCarddemoMainMenuOptions().getCdemoMenuOptCountReference())) {
			DataUtils.setToBlank(ctx.getWsVariables().getWsMenuOptTxtReference());
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMenuOptTxtReference())
				.addDelimitedBySize(ctx.getCarddemoMainMenuOptions().getItemFromCdemoMenuOptNumReference(ctx.getWsVariables().getWsIdx() - 1).getValue(String.class))
				.addDelimitedBySize(". ")
				.addDelimitedBySize(ctx.getCarddemoMainMenuOptions().getItemFromCdemoMenuOptNameReference(ctx.getWsVariables().getWsIdx() - 1).getBytes())
				.end();
			if (ctx.getWsVariables().getWsIdx() == 1) {
				ctx.getGroup1().getOptn001oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 2) {
				ctx.getGroup1().getOptn002oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 3) {
				ctx.getGroup1().getOptn003oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 4) {
				ctx.getGroup1().getOptn004oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 5) {
				ctx.getGroup1().getOptn005oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 6) {
				ctx.getGroup1().getOptn006oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 7) {
				ctx.getGroup1().getOptn007oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 8) {
				ctx.getGroup1().getOptn008oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 9) {
				ctx.getGroup1().getOptn009oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 10) {
				ctx.getGroup1().getOptn010oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 11) {
				ctx.getGroup1().getOptn011oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 12) {
				ctx.getGroup1().getOptn012oReference().setValue(ctx.getWsVariables().getWsMenuOptTxtReference());
			} else {
				
				/* 
				Do nothing */
			}
			ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
		}
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:33 CDT */
		return;
	}

}
