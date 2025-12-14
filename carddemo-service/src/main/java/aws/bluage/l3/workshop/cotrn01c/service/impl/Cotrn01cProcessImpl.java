
package aws.bluage.l3.workshop.cotrn01c.service.impl;

import aws.bluage.l3.workshop.cotrn01c.business.context.Cotrn01cContext;
import aws.bluage.l3.workshop.cotrn01c.service.Cotrn01cProcess;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cotrn01cProcessImpl
 * 
 * Defines application services for Cotrn01cProcess
 * @see Cotrn01cProcess
 */
@Service("aws.bluage.l3.workshop.cotrn01c.service.Cotrn01cProcess")
public class Cotrn01cProcessImpl implements Cotrn01cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cotrn01cProcessImpl.class);


	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COTRN01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void mainPara(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*****************************************************************
		Program     : COTRN01C.CBL
		Application : CardDemo
		Type        : CICS COBOL Program
		Function    : View a Transaction from TRANSACT file
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
				ctx.getGroup1().getCotrn1aoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().setTrnidinl(-1);
				if (!(DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoCt01TrnSelectedReference())) && !(DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoCt01TrnSelectedReference()))) {
					ctx.getGroup1().getTrnidiniReference().setValue(ctx.getCarddemoCommarea().getCdemoCt01TrnSelectedReference());
					processEnterKey(ctx, ctrl);
				} 
				sendTrnviewScreen(ctx, ctrl);
			} else {
				receiveTrnviewScreen(ctx, ctrl);
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
				} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf5Reference()) == 0) {
					ctx.getCarddemoCommarea().setCdemoToProgram("COTRN00C");
					returnToPrevScreen(ctx, ctrl);
				} else {
					ctx.getWsVariables().setWsErrFlg("Y");
					ctx.getWsVariables().setWsMessage(ctx.getCcdaCommonMessages().getCcdaMsgInvalidKey());
					sendTrnviewScreen(ctx, ctrl);
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
	public void processEnterKey(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getGroup1().getTrnidiniReference()) || DataUtils.isLowValue(ctx.getGroup1().getTrnidiniReference())) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Tran ID can NOT be empty...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnviewScreen(ctx, ctrl);
		} else {
			ctx.getGroup1().setTrnidinl(-1);
			
			/* 
			Do nothing */
		}
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			DataUtils.setToBlank(ctx.getGroup1().getTrnidiReference());
			DataUtils.setToBlank(ctx.getGroup1().getCardnumiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTtypcdiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTcatcdiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTrnsrciReference());
			DataUtils.setToBlank(ctx.getGroup1().getTrnamtiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTdesciReference());
			DataUtils.setToBlank(ctx.getGroup1().getTorigdtiReference());
			DataUtils.setToBlank(ctx.getGroup1().getTprocdtiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMidiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMnameiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMcityiReference());
			DataUtils.setToBlank(ctx.getGroup1().getMzipiReference());
			ctx.getTranRecord().getTranIdReference().setValue(ctx.getGroup1().getTrnidiniReference());
			readTransactFile(ctx, ctrl);
		} 
		if (!(ctx.getWsVariables().isErrFlgOn())) {
			ctx.getWsVariables().getWsTranAmtReference().setValue(ctx.getTranRecord().getTranAmt());
			ctx.getGroup1().getTrnidiReference().setValue(ctx.getTranRecord().getTranIdReference());
			ctx.getGroup1().getCardnumiReference().setValue(ctx.getTranRecord().getTranCardNumReference());
			ctx.getGroup1().getTtypcdiReference().setValue(ctx.getTranRecord().getTranTypeCdReference());
			ctx.getGroup1().setTcatcdi(ctx.getTranRecord().getTranCatCdReference().getValue(String.class));
			ctx.getGroup1().getTrnsrciReference().setValue(ctx.getTranRecord().getTranSourceReference());
			ctx.getGroup1().setTrnamti(ctx.getWsVariables().getWsTranAmt());
			ctx.getGroup1().setTdesci(ctx.getTranRecord().getTranDesc());
			ctx.getGroup1().setTorigdti(ctx.getTranRecord().getTranOrigTs());
			ctx.getGroup1().setTprocdti(ctx.getTranRecord().getTranProcTs());
			ctx.getGroup1().setMidi(ctx.getTranRecord().getTranMerchantIdReference().getValue(String.class));
			ctx.getGroup1().setMnamei(ctx.getTranRecord().getTranMerchantName());
			ctx.getGroup1().setMcityi(ctx.getTranRecord().getTranMerchantCity());
			ctx.getGroup1().getMzipiReference().setValue(ctx.getTranRecord().getTranMerchantZipReference());
			sendTrnviewScreen(ctx, ctrl);
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
	public void returnToPrevScreen(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoToProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoToProgramReference())) {
			ctx.getCarddemoCommarea().setCdemoToProgram("COSGN00C");
		} 
		ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsVariables().getWsTranidReference());
		ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsVariables().getWsPgmnameReference());
		DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoPgmContextReference());
		XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
	}

	/**
	 * Process operation sendTrnviewScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNVIEW-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendTrnviewScreen(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		populateHeaderInfo(ctx, ctrl);
		ctx.getGroup1().setErrmsgo(ctx.getWsVariables().getWsMessage());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COTRN1A")
		.withMapset("COTRN01")
		.withData(ctx.getGroup1().getCotrn1aoReference())
		.withErase()
		.withCursor()
		.execute()
		.handleException();
	}

	/**
	 * Process operation receiveTrnviewScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNVIEW-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveTrnviewScreen(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap("COTRN1A")
		.withMapset("COTRN01")
		.into(ctx.getGroup1().getCotrn1aiReference())
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
	public void populateHeaderInfo(final Cotrn01cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation readTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readTransactFile(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsVariables().getWsTransactFileReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.setIsolationLevel(JicsIsolationLevel.UPDATE)
		.updateNoToken()
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
		} else if (ctx.getWsVariables().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Transaction ID NOT found...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnviewScreen(ctx, ctrl);
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "RESP:" , ctx.getWsVariables().getWsRespCdReference().getValue(String.class) , "REAS:" , ctx.getWsVariables().getWsReasCdReference().getValue(String.class));
			ctx.getWsVariables().setWsErrFlg("Y");
			ctx.getWsVariables().setWsMessage("Unable to lookup Transaction...");
			ctx.getGroup1().setTrnidinl(-1);
			sendTrnviewScreen(ctx, ctrl);
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
	public void clearCurrentScreen(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		initializeAllFields(ctx, ctrl);
		sendTrnviewScreen(ctx, ctrl);
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
	public void initializeAllFields(final Cotrn01cContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().setTrnidinl(-1);
		DataUtils.setToBlank(ctx.getGroup1().getTrnidiniReference());
		DataUtils.setToBlank(ctx.getGroup1().getTrnidiReference());
		DataUtils.setToBlank(ctx.getGroup1().getCardnumiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTtypcdiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTcatcdiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTrnsrciReference());
		DataUtils.setToBlank(ctx.getGroup1().getTrnamtiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTdesciReference());
		DataUtils.setToBlank(ctx.getGroup1().getTorigdtiReference());
		DataUtils.setToBlank(ctx.getGroup1().getTprocdtiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMidiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMnameiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMcityiReference());
		DataUtils.setToBlank(ctx.getGroup1().getMzipiReference());
		DataUtils.setToBlank(ctx.getWsVariables().getWsMessageReference());
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:34 CDT */
		return;
	}

}
