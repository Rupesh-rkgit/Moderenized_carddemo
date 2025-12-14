
package aws.bluage.l3.workshop.cousr02c.service.impl;

import aws.bluage.l3.workshop.cousr02c.business.context.Cousr02cContext;
import aws.bluage.l3.workshop.cousr02c.service.Cousr02cProcess;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.JicsIsolationLevel;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cousr02cProcessImpl
 * 
 * Defines application services for Cousr02cProcess
 * @see Cousr02cProcess
 */
@Service("aws.bluage.l3.workshop.cousr02c.service.Cousr02cProcess")
public class Cousr02cProcessImpl implements Cousr02cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cousr02cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COUSR02C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cousr02cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COUSR02C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : Update a user in USRSEC file
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
				ctx.getGroup1().getCousr2aoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().setUsridinl(-1);
				if (!(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCu02UsrSelectedReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCu02UsrSelectedReference()))) {
					ctx.getGroup1().getUsridiniReference().setValue(ctx.getCarddemoCommarea().getCdemoCu02UsrSelectedReference());
					processEnterKey(ctx, ctrl);
				} 
				sendUsrupdScreen(ctx, ctrl);
			} else {
				receiveUsrupdScreen(ctx, ctrl);
				if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
					processEnterKey(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
					updateUserInfo(ctx, ctrl);
					if (DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoFromProgramReference()) || DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoFromProgramReference())) {
						ctx.getCarddemoCommarea().setCdemoToProgram("COADM01C");
					} else {
						ctx.getCarddemoCommarea().getCdemoToProgramReference().setValue(ctx.getCarddemoCommarea().getCdemoFromProgramReference());
					}
					returnToPrevScreen(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf4Reference()) == 0) {
					clearCurrentScreen(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf5Reference()) == 0) {
					updateUserInfo(ctx, ctrl);
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf12Reference()) == 0) {
					ctx.getCarddemoCommarea().setCdemoToProgram("COADM01C");
					returnToPrevScreen(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendUsrupdScreen(ctx, ctrl);
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
	public void processEnterKey(final Cousr02cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getGroup1().getUsridiniReference()) || DataUtils.isLowValue(ctx.getGroup1().getUsridiniReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User ID can NOT be empty...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else {
			ctx.getGroup1().setUsridinl(-1);
			
			/* 
			Do nothing */
		}
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			DataUtils.setToBlank(ctx.getGroup1().getFnameiReference());
			DataUtils.setToBlank(ctx.getGroup1().getLnameiReference());
			DataUtils.setToBlank(ctx.getGroup1().getPasswdiReference());
			DataUtils.setToBlank(ctx.getGroup1().getUsrtypeiReference());
			ctx.getSecUserData().getSecUsrIdReference().setValue(ctx.getGroup1().getUsridiniReference());
			readUserSecFile(ctx, ctrl);
		} 
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			ctx.getGroup1().getFnameiReference().setValue(ctx.getSecUserData().getSecUsrFnameReference());
			ctx.getGroup1().getLnameiReference().setValue(ctx.getSecUserData().getSecUsrLnameReference());
			ctx.getGroup1().getPasswdiReference().setValue(ctx.getSecUserData().getSecUsrPwdReference());
			ctx.getGroup1().getUsrtypeiReference().setValue(ctx.getSecUserData().getSecUsrTypeReference());
			sendUsrupdScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation updateUserInfo.
	 * 
	 * ----------------------------------------------------------------*
	 *                       UPDATE-USER-INFO
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void updateUserInfo(final Cousr02cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getGroup1().getUsridiniReference()) || DataUtils.isLowValue(ctx.getGroup1().getUsridiniReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User ID can NOT be empty...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getFnameiReference()) || DataUtils.isLowValue(ctx.getGroup1().getFnameiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("First Name can NOT be empty...");
			ctx.getGroup1().setFnamel(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getLnameiReference()) || DataUtils.isLowValue(ctx.getGroup1().getLnameiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Last Name can NOT be empty...");
			ctx.getGroup1().setLnamel(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getPasswdiReference()) || DataUtils.isLowValue(ctx.getGroup1().getPasswdiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Password can NOT be empty...");
			ctx.getGroup1().setPasswdl(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else if (DataUtils.isBlank(ctx.getGroup1().getUsrtypeiReference()) || DataUtils.isLowValue(ctx.getGroup1().getUsrtypeiReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User Type can NOT be empty...");
			ctx.getGroup1().setUsrtypel(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else {
			ctx.getGroup1().setFnamel(-1);
			
			/* 
			Do nothing */
		}
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			ctx.getSecUserData().getSecUsrIdReference().setValue(ctx.getGroup1().getUsridiniReference());
			readUserSecFile(ctx, ctrl);
			if (DataUtils.compare(ctx.getGroup1().getFnameiReference(), ctx.getSecUserData().getSecUsrFnameReference()) != 0) {
				ctx.getSecUserData().getSecUsrFnameReference().setValue(ctx.getGroup1().getFnameiReference());
				ctx.getWsVariables().setUsrModifiedYes(true);
			} 
			if (DataUtils.compare(ctx.getGroup1().getLnameiReference(), ctx.getSecUserData().getSecUsrLnameReference()) != 0) {
				ctx.getSecUserData().getSecUsrLnameReference().setValue(ctx.getGroup1().getLnameiReference());
				ctx.getWsVariables().setUsrModifiedYes(true);
			} 
			if (DataUtils.compare(ctx.getGroup1().getPasswdiReference(), ctx.getSecUserData().getSecUsrPwdReference()) != 0) {
				ctx.getSecUserData().getSecUsrPwdReference().setValue(ctx.getGroup1().getPasswdiReference());
				ctx.getWsVariables().setUsrModifiedYes(true);
			} 
			if (DataUtils.compare(ctx.getGroup1().getUsrtypeiReference(), ctx.getSecUserData().getSecUsrTypeReference()) != 0) {
				ctx.getSecUserData().getSecUsrTypeReference().setValue(ctx.getGroup1().getUsrtypeiReference());
				ctx.getWsVariables().setUsrModifiedYes(true);
			} 
			if (ctx.getWsVariables().isUsrModifiedYes()) {
				updateUserSecFile(ctx, ctrl);
			} else {
				ctx.getWsVariables().setWsMessage("Please modify to update ...");
				ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				sendUsrupdScreen(ctx, ctrl);
			}
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
	public void returnToPrevScreen(final Cousr02cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendUsrupdScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-USRUPD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendUsrupdScreen(final Cousr02cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COUSR2A")
		.withMapset("COUSR02")
		.withData(ctx.getGroup1().getCousr2aoReference())
		.withErase()
		.withCursor()
		.execute()
		.handleException();
	}

	/**
	 * Process operation receiveUsrupdScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-USRUPD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveUsrupdScreen(final Cousr02cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COUSR2A")
		.withMapset("COUSR02")
		.into(ctx.getGroup1().getCousr2aiReference())
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
	public void populateHeaderInfo(final Cousr02cContext ctx, final ExecutionController ctrl) {
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
	public void readUserSecFile(final Cousr02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.setIsolationLevel(JicsIsolationLevel.UPDATE)
		.updateNoToken()
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
			ctx.getWsVariables().setWsMessage("Press PF5 key to save your updates ...");
			ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhneutrReference());
			sendUsrupdScreen(ctx, ctrl);
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User ID NOT found...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup User...");
			ctx.getGroup1().setFnamel(-1);
			sendUsrupdScreen(ctx, ctrl);
		}
	}

	/**
	 * Process operation updateUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       UPDATE-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void updateUserSecFile(final Cousr02cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsUsrsecFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.rewrite()
		.from(ctx.getSecUserData())
		.length(80)
		.execute();
		ctx.getWsVariables().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsVariables().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
			ctx.getGroup1().getErrmsgcReference().setValue(ctx.getDfhbmsca().getDfhgreenReference());
			StringConcatenationBuilder.newInstance(ctx.getWsVariables().getWsMessageReference())
				.addDelimitedBySize("User ")
				.addDelimitedByLiteral(ctx.getSecUserData().getSecUsrId()," ")
				.addDelimitedBySize(" has been updated ...")
				.end();
			sendUsrupdScreen(ctx, ctrl);
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("User ID NOT found...");
			ctx.getGroup1().setUsridinl(-1);
			sendUsrupdScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to Update User...");
			ctx.getGroup1().setFnamel(-1);
			sendUsrupdScreen(ctx, ctrl);
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
	public void clearCurrentScreen(final Cousr02cContext ctx, final ExecutionController ctrl) {
		initializeAllFields(ctx, ctrl);
		sendUsrupdScreen(ctx, ctrl);
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
	public void initializeAllFields(final Cousr02cContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().setUsridinl(-1);
		DataUtils.setToBlank(ctx.getGroup1().getUsridiniReference());
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
