package aws.bluage.l3.workshop.cosgn00c.service.impl;

import aws.bluage.l3.workshop.cosgn00c.business.context.Cosgn00cContext;
import aws.bluage.l3.workshop.cosgn00c.service.Cosgn00cProcess;
import com.netfective.bluage.gapwalk.database.support.central.SQLExecutorBuilder;
import com.netfective.bluage.gapwalk.database.support.central.SQLParameterBuilder;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendTextBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.rt.jics.memory.AssignBuilder;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import java.sql.JDBCType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cosgn00cProcessImpl
 * 
 * Defines application services for Cosgn00cProcess
 * @see Cosgn00cProcess
 */
@Service("aws.bluage.l3.workshop.cosgn00c.service.Cosgn00cProcess")
public class Cosgn00cProcessImpl implements Cosgn00cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cosgn00cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COSGN00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COSGN00C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Signon Screen for the CardDemo Application
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
		----------------------------------------------------------------*
		LINKAGE SECTION
		----------------------------------------------------------------*
		----------------------------------------------------------------*
		PROCEDURE DIVISION
		----------------------------------------------------------------* */
		ctx.getLogData().setLogProgramName("COSGN00C");
		ctx.getLogData().setLogProgramData("Entering program");
		addProgramLog(ctx, ctrl);
		ctx.getWsVariables().setErrFlgOff(true);
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		DataUtils.setToBlank(ctx.getGroup1().getErrmsgoReference());
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getGroup1().getCosgn0aoReference().setBytes(Record.LOW_VALUES);
			ctx.getGroup1().setUseridl(-1);
			sendSignonScreen(ctx, ctrl);
		} else {
			if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
				processEnterKey(ctx, ctrl);
			} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
				ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgThankYou());
				sendPlainText(ctx, ctrl);
			} else {
				ctx.getWsVariables().setWsErrFlg("Y");
				ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
				sendSignonScreen(ctx, ctrl);
			}
		}
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withTransID(ctx.getWsVariables().getWsTranid())
		.withCommarea(ctx.getCarddemoCommarea())
		.withLength(160)
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
	public void processEnterKey(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		ctx.getLogData().setLogProgramData("Entering paragraph PROCESS-ENTER-KEY");
		addProgramLog(ctx, ctrl);
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COSGN0A")
		.withMapset("COSGN00")
		.into(ctx.getGroup1().getCosgn0aiReference())
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (DataUtils.isBlank(ctx.getGroup1().getUseridiReference()) || DataUtils.isLowValue(ctx.getGroup1().getUseridiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Please enter User ID ...");
			ctx.getGroup1().setUseridl(-1);
			sendSignonScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getPasswdiReference()) || DataUtils.isLowValue(ctx.getGroup1().getPasswdiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Please enter Password ...");
			ctx.getGroup1().setPasswdl(-1);
			sendSignonScreen(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		ctx.getWsVariables().setWsUserId(StringUtils.upperCase(ctx.getGroup1().getUseridi()));
		ctx.getCarddemoCommarea().setCdemoUserId(StringUtils.upperCase(ctx.getGroup1().getUseridi()));
		ctx.getWsVariables().setWsUserPwd(StringUtils.upperCase(ctx.getGroup1().getPasswdi()));
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			readUserSecFile(ctx, ctrl);
		}
	}

	/**
	 * Process operation sendSignonScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-SIGNON-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendSignonScreen(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		ctx.getLogData().setLogProgramData("Entering paragraph SEND-SIGNON-SCREEN");
		addProgramLog(ctx, ctrl);
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COSGN0A")
		.withMapset("COSGN00")
		.withData(ctx.getGroup1().getCosgn0aoReference())
		.withErase()
		.withCursor()
		.execute()
		.handleException();
	}

	/**
	 * Process operation sendPlainText.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-PLAIN-TEXT
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendPlainText(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		ctx.getLogData().setLogProgramData("Entering paragraph SEND-PLAIN-TEXT");
		addProgramLog(ctx, ctrl);
		SendTextBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withData(ctx.getWsVariables().getWsMessageReference())
		.withLength(80)
		.withErase()
		.withFreeKB()
		.execute()
		.handleException();
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.execute()
		.handleException();
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
	public void populateHeaderInfo(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		ctx.getLogData().setLogProgramData("Entering paragraph POPULATE-HEADER-INFO");
		addProgramLog(ctx, ctrl);
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
		ctx.getGroup1().setApplido(AssignBuilder.newInstance(ctx.getDfheiblk().getRecord(), ctx).getApplid());
		ctx.getGroup1().setSysido(AssignBuilder.newInstance(ctx.getDfheiblk().getRecord(), ctx).getSysid());
	}

	/**
	 * Process operation readUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readUserSecFile(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		ctx.getLogData().setLogProgramData("Entering paragraph READ-USER-SEC-FILE");
		addProgramLog(ctx, ctrl);
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getSecUserData())
		.length(80)
		.recordIndentificationField(ctx.getWsVariables().getWsUserIdReference())
		.keyLength(8,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == 0) {
			if (DataUtils.compare(ctx.getSecUserData().getSecUsrPwdReference(), ctx.getWsVariables().getWsUserPwdReference()) == 0) {
				ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
				ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
				ctx.getCarddemoCommarea().getCdemoUserIdReference().setValue(ctx.getWsVariables().getWsUserIdReference());
				ctx.getCarddemoCommarea().getCdemoUserTypeReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
				if (ctx.getCarddemoCommarea().isCdemoUsrtypAdmin()) {
					XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram("COADM01C").withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
				} else {
					XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram("COMEN01C").withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
				}
			} else {
				ctx.getWsVariables().setWsMessage("Wrong Password. Try again ...");
				ctx.getGroup1().setPasswdl(-1);
				sendSignonScreen(ctx, ctrl);
			}
		} else if (ctx.getWsVariables().getWsRespCd() == 13) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User not found. Try again ...");
			ctx.getGroup1().setUseridl(-1);
			sendSignonScreen(ctx, ctrl);
		} else {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to verify the User ...");
			ctx.getGroup1().setUseridl(-1);
			sendSignonScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation addProgramLog.
	 * 
	 * ****************************************************************
	 *  Common Logging Routines
	 * ****************************************************************
	 * ****************************************************************
	 *               ADD LOG DEPENDING ON PROGRAM LOG LEVEL
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void addProgramLog(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getLogData().getLogProgramLevelReference())) {
			getProgramLogLevel(ctx, ctrl);
		} 
		if (DataUtils.compare(ctx.getLogData().getLogProgramLevelReference(), "N") == 0) {
			
			/* 
			Do nothing */
		} else if (DataUtils.compare(ctx.getLogData().getLogProgramLevelReference(), "D") == 0) {
			addProgramLogDebug(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getLogData().getLogProgramLevelReference(), "T") == 0) {
			addProgramLogTrace(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
	}

	/**
	 * Process operation getProgramLogLevel.
	 * 
	 * ****************************************************************
	 *                       GET PROGRAM LOG LEVEL
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getProgramLogLevel(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.mapInParameter(SQLParameterBuilder.newInstance(ctx.getLogData().getLogProgramName()).type(JDBCType.CHAR))
			.mapOutParameter(SQLParameterBuilder.newInstance(ctx.getLogData().getLogProgramLevelReference()))
			.execute("COSGN00C_1");
		if (ctx.getSqlca().getSqlcode() == 100) {
			ctx.getLogData().setLogProgramLevel("N");
		}
	}

	/**
	 * Process operation addProgramLogDebug.
	 * 
	 * ****************************************************************
	 *                           ADD LOG DEBUG
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void addProgramLogDebug(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		ctx.getLogData().getLogDateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		if (LOGGER.isInfoEnabled()) LOGGER.info("Logging layout:");
		if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , " -> Current program is: " , ctx.getLogData().getLogProgramName());
		if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , " -> Logging data is: " , ctx.getLogData().getLogProgramData());
		if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , " -> Current date is: " , ctx.getLogData().getLogCurrentDate());
		if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , " -> Current time is: " , ctx.getLogData().getLogCurrentTime());
	}

	/**
	 * Process operation addProgramLogTrace.
	 * 
	 * ****************************************************************
	 *                            ADD LOG TRACE
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void addProgramLogTrace(final Cosgn00cContext ctx, final ExecutionController ctrl) {
		addProgramLogDebug(ctx, ctrl);
		ctx.getLogData().getLogDateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		SQLExecutorBuilder.newInstance(ctrl, ctx, ctx.getSqlca())
			.mapInParameter(SQLParameterBuilder.newInstance(ctx.getLogData().getLogProgramName()))
			.mapInParameter(SQLParameterBuilder.newInstance(ctx.getLogData().getLogProgramData()).type(JDBCType.VARCHAR))
			.mapInParameter(SQLParameterBuilder.newInstance(ctx.getLogData().getLogCurrentDate()))
			.mapInParameter(SQLParameterBuilder.newInstance(ctx.getLogData().getLogCurrentTime()))
			.execute("COSGN00C_2");
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:33 CDT */
		return;
	}

}
