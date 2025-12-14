
package aws.bluage.l3.workshop.cbtrn02c.service.impl;

import aws.bluage.l3.workshop.cbtrn02c.business.context.Cbtrn02cContext;
import aws.bluage.l3.workshop.cbtrn02c.service.Cbtrn02cProcess;
import aws.bluage.l3.workshop.core.Abend;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.io.IndexedFile;
import com.netfective.bluage.gapwalk.rt.io.OpenMode;
import com.netfective.bluage.gapwalk.rt.io.SequentialFile;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class Cbtrn02cProcessImpl
 * 
 * Defines application services for Cbtrn02cProcess
 * @see Cbtrn02cProcess
 */
@Service("aws.bluage.l3.workshop.cbtrn02c.service.Cbtrn02cProcess")
@Import({
aws.bluage.l3.workshop.core.impl.AbendImpl.class 
}) 	
public class Cbtrn02cProcessImpl implements Cbtrn02cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cbtrn02cProcessImpl.class);

	@Autowired
	private Abend abendInstance;


	/**
	 * Process operation procedureDivision.
	 * 
	 * PROGRAM-ID.CBTRN02C.
	 *  AUTHOR.        AWS.
	 * *****************************************************************
	 *  Program     : CBTRN02C.CBL
	 *  Application : CardDemo
	 *  Type        : BATCH COBOL Program
	 *  Function    : Post the records from daily transaction file.
	 * *****************************************************************
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
	 * *****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void procedureDivision(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		/* 
		**************************************************************** */
		if (LOGGER.isInfoEnabled()) LOGGER.info("START OF EXECUTION OF PROGRAM CBTRN02C");
		dalytranOpen(ctx, ctrl);
		tranfileOpen(ctx, ctrl);
		xreffileOpen(ctx, ctrl);
		dalyrejsOpen(ctx, ctrl);
		acctfileOpen(ctx, ctrl);
		tcatbalfOpen(ctx, ctrl);
		while (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "Y") != 0) {
			if (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "N") == 0) {
				dalytranGetNext(ctx, ctrl);
				if (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "N") == 0) {
					ctx.getWsCounters().setWsTransactionCount(ctx.getWsCounters().getWsTransactionCount() + 1);
					
					/* 
					DISPLAY DALYTRAN-RECORD */
					ctx.getWsValidationTrailer().setWsValidationFailReason(0);
					DataUtils.setToBlank(ctx.getWsValidationTrailer().getWsValidationFailReasonDescReference());
					validateTran(ctx, ctrl);
					if (NumberUtils.eq(ctx.getWsValidationTrailer().getWsValidationFailReasonReference(), 0)) {
						postTransaction(ctx, ctrl);
					} else {
						ctx.getWsCounters().setWsRejectCount(ctx.getWsCounters().getWsRejectCount() + 1);
						writeRejectRec(ctx, ctrl);
					}
				} 
			} 
		}
		dalytranClose(ctx, ctrl);
		tranfileClose(ctx, ctrl);
		xreffileClose(ctx, ctrl);
		dalyrejsClose(ctx, ctrl);
		acctfileClose(ctx, ctrl);
		tcatbalfClose(ctx, ctrl);
		if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "TRANSACTIONS PROCESSED :" , ctx.getWsCounters().getWsTransactionCountReference().getValue(String.class));
		if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "TRANSACTIONS REJECTED  :" , ctx.getWsCounters().getWsRejectCountReference().getValue(String.class));
		if (NumberUtils.gt(ctx.getWsCounters().getWsRejectCountReference(), 0)) {
			ctx.setReturnCode(4);
		} 
		if (LOGGER.isInfoEnabled()) LOGGER.info("END OF EXECUTION OF PROGRAM CBTRN02C");
		if (ctx.isMainProgram()) {
			ctrl.stopRunUnit();
		}
	}

	/**
	 * Process operation dalytranOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dalytranOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		SequentialFile dalytranFile = ctx.getDalytranFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		dalytranFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getDalytranStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING DALYTRAN");
			ctx.getIoStatus().setBytes(ctx.getDalytranStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation tranfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tranfileOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		transactFile.open(OpenMode.OUTPUT);
		if (DataUtils.compare("00", ctx.getTranfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING TRANSACTION FILE");
			ctx.getIoStatus().setBytes(ctx.getTranfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation xreffileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		xrefFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getXreffileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING CROSS REF FILE");
			ctx.getIoStatus().setBytes(ctx.getXreffileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation dalyrejsOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dalyrejsOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		SequentialFile dalyrejsFile = ctx.getDalyrejsFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		dalyrejsFile.open(OpenMode.OUTPUT);
		if (DataUtils.compare("00", ctx.getDalyrejsStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING DALY REJECTS FILE");
			ctx.getIoStatus().setBytes(ctx.getDalyrejsStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation acctfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile accountFile = ctx.getAccountFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		accountFile.open(OpenMode.IO);
		if (DataUtils.compare("00", ctx.getAcctfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING ACCOUNT MASTER FILE");
			ctx.getIoStatus().setBytes(ctx.getAcctfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation tcatbalfOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tcatbalfOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile tcatbalFile = ctx.getTcatbalFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		tcatbalFile.open(OpenMode.IO);
		if (DataUtils.compare("00", ctx.getTcatbalfStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING TRANSACTION BALANCE FILE");
			ctx.getIoStatus().setBytes(ctx.getTcatbalfStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation dalytranGetNext.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dalytranGetNext(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		SequentialFile dalytranFile = ctx.getDalytranFileHandler(ctrl.getExecutionContext()); 
		boolean result = false; 
		result = dalytranFile.read();
		if (result) {
			ctx.getDalytranRecord().setBytes(ctx.getDalytranFile().getFdTranRecordReference().getBytes());
		} 
		if (DataUtils.compare("00", ctx.getDalytranStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
			
			/* 
			DISPLAY DALYTRAN-RECORD */
		} else {
			if (DataUtils.compare("10", ctx.getDalytranStatus()) == 0) {
				ctx.getApplResult().setApplResult(16);
			} else {
				ctx.getApplResult().setApplResult(12);
			}
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (ctx.getApplResult().isApplEof()) {
				ctx.getEndOfFile().setEndOfFile("Y");
			} else {
				if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING DALYTRAN FILE");
				ctx.getIoStatus().setBytes(ctx.getDalytranStatus().getBytes());
				if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
				abendProgram(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation validateTran.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void validateTran(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		aLookupXref(ctx, ctrl);
		if (NumberUtils.eq(ctx.getWsValidationTrailer().getWsValidationFailReasonReference(), 0)) {
			bLookupAcct(ctx, ctrl);
		} else {
			
			/* 
			Do nothing */
		}
		
		/* 
		ADD MORE VALIDATIONS HERE */
		return;
	}

	/**
	 * Process operation aLookupXref.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void aLookupXref(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		boolean invalidKey = false; 
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		/* 
		DISPLAY 'CARD NUMBER: ' DALYTRAN-CARD-NUM */
		ctx.getXrefFile().getFdXrefCardNumReference().setValue(ctx.getDalytranRecord().getDalytranCardNumReference());
		xrefFile.read();
		invalidKey = xrefFile.isInvalidKey();
		if (invalidKey) {
			ctx.getWsValidationTrailer().setWsValidationFailReason(100);
			ctx.getWsValidationTrailer().setWsValidationFailReasonDesc("INVALID CARD NUMBER FOUND");
		} else {
			ctx.getCardXrefRecord().setBytes(ctx.getXrefFile().getFdXreffileRecReference().getBytes());
			
			/* 
			DISPLAY 'ACCOUNT RECORD FOUND'
			Do nothing */
		}
	}

	/**
	 * Process operation bLookupAcct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void bLookupAcct(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile accountFile = ctx.getAccountFileHandler(ctrl.getExecutionContext()); 
		boolean invalidKey = false; 
		ctx.getAccountFile().setFdAcctId(ctx.getCardXrefRecord().getXrefAcctId());
		accountFile.read();
		invalidKey = accountFile.isInvalidKey();
		if (invalidKey) {
			ctx.getWsValidationTrailer().setWsValidationFailReason(101);
			ctx.getWsValidationTrailer().setWsValidationFailReasonDesc("ACCOUNT RECORD NOT FOUND");
		} else {
			ctx.getAccountRecord().setBytes(ctx.getAccountFile().getFdAcctfileRecReference().getBytes());
			
			/* 
			DISPLAY 'ACCT-CREDIT-LIMIT:' ACCT-CREDIT-LIMIT
			DISPLAY 'TRAN-AMT         :' DALYTRAN-AMT */
			ctx.getWsCounters().setWsTempBal(ctx.getAccountRecord().getAcctCurrCycCredit().subtract(ctx.getAccountRecord().getAcctCurrCycDebit()).add(ctx.getDalytranRecord().getDalytranAmt()));
			if (NumberUtils.ge(ctx.getAccountRecord().getAcctCreditLimitReference(), ctx.getWsCounters().getWsTempBalReference())) {
				
				/* 
				Do nothing */
			} else {
				ctx.getWsValidationTrailer().setWsValidationFailReason(102);
				ctx.getWsValidationTrailer().setWsValidationFailReasonDesc("OVERLIMIT TRANSACTION");
			}
			if (DataUtils.compare(ctx.getAccountRecord().getAcctExpiraionDateReference(), ctx.getDalytranRecord().getDalytranOrigTsReference().getBytes(0, 10)) >= 0) {
				
				/* 
				Do nothing */
			} else {
				ctx.getWsValidationTrailer().setWsValidationFailReason(103);
				ctx.getWsValidationTrailer().setWsValidationFailReasonDesc("TRANSACTION RECEIVED AFTER ACCT EXPIRATION");
			}
		}
	}

	/**
	 * Process operation postTransaction.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void postTransaction(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		ctx.getTranRecord().getTranIdReference().setValue(ctx.getDalytranRecord().getDalytranIdReference());
		ctx.getTranRecord().getTranTypeCdReference().setValue(ctx.getDalytranRecord().getDalytranTypeCdReference());
		ctx.getTranRecord().setTranCatCd(ctx.getDalytranRecord().getDalytranCatCd());
		ctx.getTranRecord().getTranSourceReference().setValue(ctx.getDalytranRecord().getDalytranSourceReference());
		ctx.getTranRecord().getTranDescReference().setValue(ctx.getDalytranRecord().getDalytranDescReference());
		ctx.getTranRecord().setTranAmt(ctx.getDalytranRecord().getDalytranAmt());
		ctx.getTranRecord().setTranMerchantId(ctx.getDalytranRecord().getDalytranMerchantId());
		ctx.getTranRecord().getTranMerchantNameReference().setValue(ctx.getDalytranRecord().getDalytranMerchantNameReference());
		ctx.getTranRecord().getTranMerchantCityReference().setValue(ctx.getDalytranRecord().getDalytranMerchantCityReference());
		ctx.getTranRecord().getTranMerchantZipReference().setValue(ctx.getDalytranRecord().getDalytranMerchantZipReference());
		ctx.getTranRecord().getTranCardNumReference().setValue(ctx.getDalytranRecord().getDalytranCardNumReference());
		ctx.getTranRecord().getTranOrigTsReference().setValue(ctx.getDalytranRecord().getDalytranOrigTsReference());
		zGetDb2FormatTimestamp(ctx, ctrl);
		ctx.getTranRecord().getTranProcTsReference().setValue(ctx.getGroup2().getDb2FormatTsReference());
		updateTcatbal(ctx, ctrl);
		updateAccountRec(ctx, ctrl);
		writeTransactionFile(ctx, ctrl);
	}

	/**
	 * Process operation writeRejectRec.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeRejectRec(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		SequentialFile dalyrejsFile = ctx.getDalyrejsFileHandler(ctrl.getExecutionContext()); 
		ctx.getRejectRecord().getRejectTranDataReference().setBytes(ctx.getDalytranRecord().getBytes());
		ctx.getRejectRecord().getValidationTrailerReference().setBytes(ctx.getWsValidationTrailer().getBytes());
		
		/* 
		DISPLAY '***' REJECT-RECORD */
		ctx.getApplResult().setApplResult(8);
		ctx.getDalyrejsFile().getFdRejsRecordReference().setBytes(ctx.getRejectRecord().getBytes());
		dalyrejsFile.write(ctx.getDalyrejsFile().getFdRejsRecordReference());
		if (DataUtils.compare("00", ctx.getDalyrejsStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR WRITING TO REJECTS FILE");
			ctx.getIoStatus().setBytes(ctx.getDalyrejsStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation updateTcatbal.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void updateTcatbal(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		boolean invalidKey = false; 
		IndexedFile tcatbalFile = ctx.getTcatbalFileHandler(ctrl.getExecutionContext()); 
		/* 
		Update the balances in transaction balance file. */
		ctx.getTcatbalFile().setFdTrancatAcctId(ctx.getCardXrefRecord().getXrefAcctId());
		ctx.getTcatbalFile().getFdTrancatTypeCdReference().setValue(ctx.getDalytranRecord().getDalytranTypeCdReference());
		ctx.getTcatbalFile().setFdTrancatCd(ctx.getDalytranRecord().getDalytranCatCd());
		ctx.getWsFlags().setWsCreateTrancatRec("N");
		tcatbalFile.read();
		invalidKey = tcatbalFile.isInvalidKey();
		if (invalidKey) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}" , "TCATBAL record not found for key : " , DataUtils.toString(ctx.getTcatbalFile().getFdTranCatKeyReference().getBytes()) , ".. Creating.");
			ctx.getWsFlags().setWsCreateTrancatRec("Y");
		} else {
			ctx.getTranCatBalRecord().setBytes(ctx.getTcatbalFile().getFdTranCatBalRecordReference().getBytes());
		}
		if (DataUtils.compare("00", ctx.getTcatbalfStatus()) == 0 || DataUtils.compare("23", ctx.getTcatbalfStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING TRANSACTION BALANCE FILE");
			ctx.getIoStatus().setBytes(ctx.getTcatbalfStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
		if (DataUtils.compare(ctx.getWsFlags().getWsCreateTrancatRecReference(), "Y") == 0) {
			aCreateTcatbalRec(ctx, ctrl);
		} else {
			bUpdateTcatbalRec(ctx, ctrl);
		}
	}

	/**
	 * Process operation aCreateTcatbalRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void aCreateTcatbalRec(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile tcatbalFile = ctx.getTcatbalFileHandler(ctrl.getExecutionContext()); 
		ctx.getTranCatBalRecord().getField().initialize();
		ctx.getTranCatBalRecord().setTrancatAcctId(ctx.getCardXrefRecord().getXrefAcctId());
		ctx.getTranCatBalRecord().getTrancatTypeCdReference().setValue(ctx.getDalytranRecord().getDalytranTypeCdReference());
		ctx.getTranCatBalRecord().setTrancatCd(ctx.getDalytranRecord().getDalytranCatCd());
		ctx.getTranCatBalRecord().setTranCatBal(ctx.getTranCatBalRecord().getTranCatBal().add(ctx.getDalytranRecord().getDalytranAmt()));
		ctx.getTcatbalFile().getFdTranCatBalRecordReference().setBytes(ctx.getTranCatBalRecord().getBytes());
		tcatbalFile.write(ctx.getTcatbalFile().getFdTranCatBalRecordReference());
		if (DataUtils.compare("00", ctx.getTcatbalfStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR WRITING TRANSACTION BALANCE FILE");
			ctx.getIoStatus().setBytes(ctx.getTcatbalfStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation bUpdateTcatbalRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void bUpdateTcatbalRec(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile tcatbalFile = ctx.getTcatbalFileHandler(ctrl.getExecutionContext()); 
		ctx.getTranCatBalRecord().setTranCatBal(ctx.getTranCatBalRecord().getTranCatBal().add(ctx.getDalytranRecord().getDalytranAmt()));
		ctx.getTcatbalFile().getFdTranCatBalRecordReference().setBytes(ctx.getTranCatBalRecord().getBytes());
		tcatbalFile.rewrite(ctx.getTcatbalFile().getFdTranCatBalRecordReference());
		if (DataUtils.compare("00", ctx.getTcatbalfStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR REWRITING TRANSACTION BALANCE FILE");
			ctx.getIoStatus().setBytes(ctx.getTcatbalfStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation updateAccountRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void updateAccountRec(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile accountFile = ctx.getAccountFileHandler(ctrl.getExecutionContext()); 
		boolean invalidKey = false; 
		/* 
		Update the balances in account record to reflect posted trans. */
		ctx.getAccountRecord().setAcctCurrBal(ctx.getAccountRecord().getAcctCurrBal().add(ctx.getDalytranRecord().getDalytranAmt()));
		if (NumberUtils.ge(ctx.getDalytranRecord().getDalytranAmtReference(), 0)) {
			ctx.getAccountRecord().setAcctCurrCycCredit(ctx.getAccountRecord().getAcctCurrCycCredit().add(ctx.getDalytranRecord().getDalytranAmt()));
		} else {
			ctx.getAccountRecord().setAcctCurrCycDebit(ctx.getAccountRecord().getAcctCurrCycDebit().add(ctx.getDalytranRecord().getDalytranAmt()));
		}
		ctx.getAccountFile().getFdAcctfileRecReference().setBytes(ctx.getAccountRecord().getBytes());
		accountFile.rewrite(ctx.getAccountFile().getFdAcctfileRecReference());
		invalidKey = accountFile.isInvalidKey();
		if (invalidKey) {
			ctx.getWsValidationTrailer().setWsValidationFailReason(109);
			ctx.getWsValidationTrailer().setWsValidationFailReasonDesc("ACCOUNT RECORD NOT FOUND");
		}
	}

	/**
	 * Process operation writeTransactionFile.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeTransactionFile(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		ctx.getTransactFile().getFdTranfileRecReference().setBytes(ctx.getTranRecord().getBytes());
		transactFile.write(ctx.getTransactFile().getFdTranfileRecReference());
		if (DataUtils.compare("00", ctx.getTranfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR WRITING TO TRANSACTION FILE");
			ctx.getIoStatus().setBytes(ctx.getTranfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation dalytranClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dalytranClose(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		SequentialFile dalytranFile = ctx.getDalytranFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		dalytranFile.close();
		if (DataUtils.compare("00", ctx.getDalytranStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING DALYTRAN FILE");
			ctx.getIoStatus().setBytes(ctx.getDalytranStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation tranfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tranfileClose(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		transactFile.close();
		if (DataUtils.compare("00", ctx.getTranfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING TRANSACTION FILE");
			ctx.getIoStatus().setBytes(ctx.getTranfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation xreffileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileClose(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		xrefFile.close();
		if (DataUtils.compare("00", ctx.getXreffileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING CROSS REF FILE");
			ctx.getIoStatus().setBytes(ctx.getXreffileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation dalyrejsClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dalyrejsClose(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		SequentialFile dalyrejsFile = ctx.getDalyrejsFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		dalyrejsFile.close();
		if (DataUtils.compare("00", ctx.getDalyrejsStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING DAILY REJECTS FILE");
			ctx.getIoStatus().setBytes(ctx.getXreffileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation acctfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileClose(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile accountFile = ctx.getAccountFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		accountFile.close();
		if (DataUtils.compare("00", ctx.getAcctfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING ACCOUNT FILE");
			ctx.getIoStatus().setBytes(ctx.getAcctfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation tcatbalfClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tcatbalfClose(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		IndexedFile tcatbalFile = ctx.getTcatbalFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		tcatbalFile.close();
		if (DataUtils.compare("00", ctx.getTcatbalfStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING TRANSACTION BALANCE FILE");
			ctx.getIoStatus().setBytes(ctx.getTcatbalfStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation zGetDb2FormatTimestamp.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void zGetDb2FormatTimestamp(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		ctx.getCobolTs().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		ctx.getGroup2().getDb2YyyyReference().setValue(ctx.getCobolTs().getCobYyyyReference());
		ctx.getGroup2().getDb2MmReference().setValue(ctx.getCobolTs().getCobMmReference());
		ctx.getGroup2().getDb2DdReference().setValue(ctx.getCobolTs().getCobDdReference());
		ctx.getGroup2().getDb2HhReference().setValue(ctx.getCobolTs().getCobHhReference());
		ctx.getGroup2().getDb2MinReference().setValue(ctx.getCobolTs().getCobMinReference());
		ctx.getGroup2().getDb2SsReference().setValue(ctx.getCobolTs().getCobSsReference());
		ctx.getGroup2().setDb2Mil(NumberUtils.convert(ctx.getCobolTs().getCobMil()).intValue());
		ctx.getGroup2().setDb2Rest("0000");
		ctx.getGroup2().setDb2Streep1("-");
		ctx.getGroup2().setDb2Streep2("-");
		ctx.getGroup2().setDb2Streep3("-");
		ctx.getGroup2().setDb2Dot1(".");
		ctx.getGroup2().setDb2Dot2(".");
		ctx.getGroup2().setDb2Dot3(".");
		
		/* 
		DISPLAY 'DB2-TIMESTAMP = ' DB2-FORMAT-TS */
		return;
	}

	/**
	 * Process operation abendProgram.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void abendProgram(final Cbtrn02cContext ctx, final ExecutionController ctrl) {
		if (LOGGER.isInfoEnabled()) LOGGER.info("ABENDING PROGRAM");
		ctx.getTiming().setTiming(0);
		ctx.getAbcode().setAbcode(999);
		abendInstance.triggerAbend(ctx.getAbcode().getAbcode());
	}

}
