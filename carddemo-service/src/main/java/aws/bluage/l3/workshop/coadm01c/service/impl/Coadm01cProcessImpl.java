
package aws.bluage.l3.workshop.coadm01c.service.impl;

import aws.bluage.l3.workshop.coadm01c.business.context.Coadm01cContext;
import aws.bluage.l3.workshop.coadm01c.service.Coadm01cProcess;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Coadm01cProcessImpl
 * 
 * Defines application services for Coadm01cProcess
 * @see Coadm01cProcess
 */
@Service("aws.bluage.l3.workshop.coadm01c.service.Coadm01cProcess")
public class Coadm01cProcessImpl implements Coadm01cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Coadm01cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COADM01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Coadm01cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COADM01C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Admin Menu for Admin users
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
				ctx.getGroup1().getCoadm1aoReference().setBytes(Record.LOW_VALUES);
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
	public void processEnterKey(final Coadm01cContext ctx, final ExecutionController ctrl) {
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
		if (!(DataUtils.isNumeric(ctx.getWsVariables().getWsOptionReference())) || NumberUtils.gt(ctx.getWsVariables().getWsOptionReference(), ctx.getCarddemoAdminMenuOptions().getCdemoAdminOptCountReference()) || NumberUtils.eq(ctx.getWsVariables().getWsOptionReference(), 0)) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Please enter a valid option number...");
			sendMenuScreen(ctx, ctrl);
		} 
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			if (DataUtils.compare(ctx.getCarddemoAdminMenuOptions().getItemFromCdemoAdminOptPgmnameReference(ctx.getWsVariables().getWsOption() - 1).getBytes(0, 5), "DUMMY") != 0) {
				ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
				ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
				XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoAdminMenuOptions().getItemFromCdemoAdminOptPgmnameReference(ctx.getWsVariables().getWsOption() - 1)).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
			} 
			DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
			ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhgreenReference());
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
				.addDelimitedBySize("This option ")
				.addDelimitedBySize("is coming soon ...")
				.end();
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
	public void returnToSignonScreen(final Coadm01cContext ctx, final ExecutionController ctrl) {
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
	public void sendMenuScreen(final Coadm01cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		buildMenuOptions(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COADM1A")
		.withMapset("COADM01")
		.withData(ctx.getGroup1().getCoadm1aoReference())
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
	public void receiveMenuScreen(final Coadm01cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COADM1A")
		.withMapset("COADM01")
		.into(ctx.getGroup1().getCoadm1aiReference())
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
	public void populateHeaderInfo(final Coadm01cContext ctx, final ExecutionController ctrl) {
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
	public void buildMenuOptions(final Coadm01cContext ctx, final ExecutionController ctrl) {
		ctx.getWsVariables().setWsIdx(1);
		while (NumberUtils.le(ctx.getWsVariables().getWsIdxReference(), ctx.getCarddemoAdminMenuOptions().getCdemoAdminOptCountReference())) {
			DataUtils.setToBlank(ctx.getWsVariables().getWsAdminOptTxtReference());
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsAdminOptTxtReference())
				.addDelimitedBySize(ctx.getCarddemoAdminMenuOptions().getItemFromCdemoAdminOptNumReference(ctx.getWsVariables().getWsIdx() - 1).getValue(String.class))
				.addDelimitedBySize(". ")
				.addDelimitedBySize(ctx.getCarddemoAdminMenuOptions().getItemFromCdemoAdminOptNameReference(ctx.getWsVariables().getWsIdx() - 1).getBytes())
				.end();
			if (ctx.getWsVariables().getWsIdx() == 1) {
				ctx.getGroup1().getOptn001oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 2) {
				ctx.getGroup1().getOptn002oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 3) {
				ctx.getGroup1().getOptn003oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 4) {
				ctx.getGroup1().getOptn004oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 5) {
				ctx.getGroup1().getOptn005oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 6) {
				ctx.getGroup1().getOptn006oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 7) {
				ctx.getGroup1().getOptn007oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 8) {
				ctx.getGroup1().getOptn008oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 9) {
				ctx.getGroup1().getOptn009oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else if (ctx.getWsVariables().getWsIdx() == 10) {
				ctx.getGroup1().getOptn010oReference().setValue(ctx.getWsVariables().getWsAdminOptTxtReference());
			} else {
				
				/* 
				Do nothing */
			}
			ctx.getWsVariables().setWsIdx(ctx.getWsVariables().getWsIdx() + 1);
		}
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:32 CDT */
		return;
	}

}
