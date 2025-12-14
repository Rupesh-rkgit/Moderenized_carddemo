
package aws.bluage.l3.workshop.cousr01c.service.impl;

import aws.bluage.l3.workshop.cousr01c.business.context.Cousr01cContext;
import aws.bluage.l3.workshop.cousr01c.service.Cousr01cProcess;
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
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cousr01cProcessImpl
 * 
 * Defines application services for Cousr01cProcess
 * @see Cousr01cProcess
 */
@Service("aws.bluage.l3.workshop.cousr01c.service.Cousr01cProcess")
public class Cousr01cProcessImpl implements Cousr01cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cousr01cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COUSR01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cousr01cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COUSR01C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Add a new Regular/Admin user to USRSEC file
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
		COPY DFHATTR.
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
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
			returnToPrevScreen(ctx, ctrl);
		} else {
			int len = ctx.getDfheiblk().getEibcalen();
			ctx.getCarddemoCommarea().setBytes(ctx.getDfhcommarea().getBytes(0, len));
			if (!(ctx.getCarddemoCommarea().isCdemoPgmReenter())) {
				ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
				ctx.getGroup1().getCousr1aoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().setFnamel(-1);
				sendUsraddScreen(ctx, ctrl);
			} else {
				receiveUsraddScreen(ctx, ctrl);
				if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
					processEnterKey(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
					ctx.getCarddemoCommarea().setCdemoToProgram("COADM01C");
					returnToPrevScreen(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf4Reference()) == 0) {
					clearCurrentScreen(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getGroup1().setFnamel(-1);
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendUsraddScreen(ctx, ctrl);
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
	public void processEnterKey(final Cousr01cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getGroup1().getFnameiReference()) || DataUtils.isLowValue(ctx.getGroup1().getFnameiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("First Name can NOT be empty...");
			ctx.getGroup1().setFnamel(-1);
			sendUsraddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getLnameiReference()) || DataUtils.isLowValue(ctx.getGroup1().getLnameiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Last Name can NOT be empty...");
			ctx.getGroup1().setLnamel(-1);
			sendUsraddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getUseridiReference()) || DataUtils.isLowValue(ctx.getGroup1().getUseridiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User ID can NOT be empty...");
			ctx.getGroup1().setUseridl(-1);
			sendUsraddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getPasswdiReference()) || DataUtils.isLowValue(ctx.getGroup1().getPasswdiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Password can NOT be empty...");
			ctx.getGroup1().setPasswdl(-1);
			sendUsraddScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getUsrtypeiReference()) || DataUtils.isLowValue(ctx.getGroup1().getUsrtypeiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User Type can NOT be empty...");
			ctx.getGroup1().setUsrtypel(-1);
			sendUsraddScreen(ctx, ctrl);
		} else {
			ctx.getGroup1().setFnamel(-1);
			
			/* 
			Do nothing */
		}
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			ctx.getSecUserData().getSecUsrIdReference().setValue(ctx.getGroup1().getUseridiReference());
			ctx.getSecUserData().getSecUsrFnameReference().setValue(ctx.getGroup1().getFnameiReference());
			ctx.getSecUserData().getSecUsrLnameReference().setValue(ctx.getGroup1().getLnameiReference());
			ctx.getSecUserData().getSecUsrPwdReference().setValue(ctx.getGroup1().getPasswdiReference());
			ctx.getSecUserData().getSecUsrTypeReference().setValue(ctx.getGroup1().getUsrtypeiReference());
			writeUserSecFile(ctx, ctrl);
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
	public void returnToPrevScreen(final Cousr01cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		
		/* 
		MOVE WS-USER-ID   TO CDEMO-USER-ID
		MOVE SEC-USR-TYPE TO CDEMO-USER-TYPE */
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendUsraddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-USRADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendUsraddScreen(final Cousr01cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COUSR1A")
		.withMapset("COUSR01")
		.withData(ctx.getGroup1().getCousr1aoReference())
		.withErase()
		.withCursor()
		.execute()
		.handleException();
	}

	/**
	 * Process operation receiveUsraddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-USRADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveUsraddScreen(final Cousr01cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COUSR1A")
		.withMapset("COUSR01")
		.into(ctx.getGroup1().getCousr1aiReference())
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
	public void populateHeaderInfo(final Cousr01cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation writeUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       WRITE-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeUserSecFile(final Cousr01cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.write(false)
		.from(ctx.getSecUserData())
		.length(80)
		.recordIndentificationField(ctx.getSecUserData().getSecUsrIdReference())
		.keyLength(8,false)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			initializeAllFields(ctx, ctrl);
			DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
			ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhgreenReference());
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
				.addDelimitedBySize("User ")
				.addDelimitedByLiteral(ctx.getSecUserData().getSecUsrId()," ")
				.addDelimitedBySize(" has been added ...")
				.end();
			sendUsraddScreen(ctx, ctrl);
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.DUPKEY.getIntValue() || ctx.getWsVariables().getWsRespCd() == ResponseCode.DUPREC.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User ID already exist...");
			ctx.getGroup1().setUseridl(-1);
			sendUsraddScreen(ctx, ctrl);
		} else {
			
			/* 
			DISPLAY 'RESP:' WS-RESP-CD 'REAS:' WS-REAS-CD */
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to Add User...");
			ctx.getGroup1().setFnamel(-1);
			sendUsraddScreen(ctx, ctrl);
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
	public void clearCurrentScreen(final Cousr01cContext ctx, final ExecutionController ctrl) {
		initializeAllFields(ctx, ctrl);
		sendUsraddScreen(ctx, ctrl);
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
	public void initializeAllFields(final Cousr01cContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().setFnamel(-1);
		DataUtils.setToBlank(ctx.getGroup1().getUseridiReference());
		DataUtils.setToBlank(ctx.getGroup1().getFnameiReference());
		DataUtils.setToBlank(ctx.getGroup1().getLnameiReference());
		DataUtils.setToBlank(ctx.getGroup1().getPasswdiReference());
		DataUtils.setToBlank(ctx.getGroup1().getUsrtypeiReference());
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:34 CDT */
		return;
	}

}
