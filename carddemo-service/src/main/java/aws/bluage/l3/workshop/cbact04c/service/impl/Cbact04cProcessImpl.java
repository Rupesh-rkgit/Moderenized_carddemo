
package aws.bluage.l3.workshop.cbact04c.service.impl;

import aws.bluage.l3.workshop.cbact04c.business.context.Cbact04cContext;
import aws.bluage.l3.workshop.cbact04c.service.Cbact04cProcess;
import aws.bluage.l3.workshop.core.Abend;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.io.IndexedFile;
import com.netfective.bluage.gapwalk.rt.io.OpenMode;
import com.netfective.bluage.gapwalk.rt.io.SequentialFile;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import java.math.BigDecimal;
import java.math.MathContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class Cbact04cProcessImpl
 * 
 * Defines application services for Cbact04cProcess
 * @see Cbact04cProcess
 */
@Service("aws.bluage.l3.workshop.cbact04c.service.Cbact04cProcess")
@Import({
aws.bluage.l3.workshop.core.impl.AbendImpl.class 
}) 	
public class Cbact04cProcessImpl implements Cbact04cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cbact04cProcessImpl.class);

	@Autowired
	private Abend abendInstance;


	/**
	 * Process operation procedureDivision.
	 * 
	 * PROGRAM-ID.CBACT04C.
	 *  AUTHOR.        AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void procedureDivision(final Cbact04cContext ctx, final ExecutionController ctrl) {
		ctx.getExternalParms().bind(ArgUtils.get(ctx, 0));
		
		/* 
		*****************************************************************
		Program     : CBACT04C.CBL
		Application : CardDemo
		Type        : BATCH COBOL Program
		Function    : This is a interest calculator program.
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
		**************************************************************** */
		if (LOGGER.isInfoEnabled()) LOGGER.info("START OF EXECUTION OF PROGRAM CBACT04C");
		tcatbalfOpen(ctx, ctrl);
		xreffileOpen(ctx, ctrl);
		discgrpOpen(ctx, ctrl);
		acctfileOpen(ctx, ctrl);
		tranfileOpen(ctx, ctrl);
		while (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "Y") != 0) {
			if (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "N") == 0) {
				tcatbalfGetNext(ctx, ctrl);
				if (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "N") == 0) {
					ctx.getWsCounters().setWsRecordCount(ctx.getWsCounters().getWsRecordCount() + 1);
					if (LOGGER.isInfoEnabled()) LOGGER.info("{}" , DataUtils.toString(ctx.getTranCatBalRecord().getBytes()));
					if (DataUtils.compareAlphInt(ctx.getTranCatBalRecord().getTrancatAcctIdReference().getValue(String.class), ctx.getWsMiscVars().getWsLastAcctNum()) != 0) {
						if (DataUtils.compare(ctx.getWsMiscVars().getWsFirstTimeReference(), "Y") != 0) {
							updateAccount(ctx, ctrl);
						} else {
							ctx.getWsMiscVars().setWsFirstTime("N");
						}
						ctx.getWsMiscVars().setWsTotalInt(BigDecimal.ZERO);
						ctx.getWsMiscVars().setWsLastAcctNum(ctx.getTranCatBalRecord().getTrancatAcctIdReference().getValue(String.class));
						ctx.getAccountFile().setFdAcctId(ctx.getTranCatBalRecord().getTrancatAcctId());
						getAcctData(ctx, ctrl);
						ctx.getXrefFile().setFdXrefAcctId(ctx.getTranCatBalRecord().getTrancatAcctId());
						getXrefData(ctx, ctrl);
					} 
					
					/* 
					DISPLAY 'ACCT-GROUP-ID: ' ACCT-GROUP-ID
					DISPLAY 'TRANCAT-CD: ' TRANCAT-CD
					DISPLAY 'TRANCAT-TYPE-CD: ' TRANCAT-TYPE-CD */
					ctx.getDiscgrpFile().getFdDisAcctGroupIdReference().setValue(ctx.getAccountRecord().getAcctGroupIdReference());
					ctx.getDiscgrpFile().setFdDisTranCatCd(ctx.getTranCatBalRecord().getTrancatCd());
					ctx.getDiscgrpFile().getFdDisTranTypeCdReference().setValue(ctx.getTranCatBalRecord().getTrancatTypeCdReference());
					getInterestRate(ctx, ctrl);
					if (NumberUtils.ne(ctx.getDisGroupRecord().getDisIntRateReference(), 0)) {
						computeInterest(ctx, ctrl);
					} 
				} 
			} else {
				updateAccount(ctx, ctrl);
			}
		}
		tcatbalfClose(ctx, ctrl);
		xreffileClose(ctx, ctrl);
		discgrpClose(ctx, ctrl);
		acctfileClose(ctx, ctrl);
		tranfileClose(ctx, ctrl);
		if (LOGGER.isInfoEnabled()) LOGGER.info("END OF EXECUTION OF PROGRAM CBACT04C");
		if (ctx.isMainProgram()) {
			ctrl.stopRunUnit();
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
	public void tcatbalfOpen(final Cbact04cContext ctx, final ExecutionController ctrl) {
		IndexedFile tcatbalFile = ctx.getTcatbalFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		tcatbalFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getTcatbalfStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING TRANSACTION CATEGORY BALANCE");
			ctx.getIoStatus().setBytes(ctx.getTcatbalfStatus().getBytes());
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
	public void xreffileOpen(final Cbact04cContext ctx, final ExecutionController ctrl) {
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
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "ERROR OPENING CROSS REF FILE" , DataUtils.toString(ctx.getXreffileStatus().getBytes()));
			ctx.getIoStatus().setBytes(ctx.getXreffileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation discgrpOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void discgrpOpen(final Cbact04cContext ctx, final ExecutionController ctrl) {
		IndexedFile discgrpFile = ctx.getDiscgrpFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		discgrpFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getDiscgrpStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING DALY REJECTS FILE");
			ctx.getIoStatus().setBytes(ctx.getDiscgrpStatus().getBytes());
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
	public void acctfileOpen(final Cbact04cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation tranfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tranfileOpen(final Cbact04cContext ctx, final ExecutionController ctrl) {
		SequentialFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
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
	 * Process operation tcatbalfGetNext.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tcatbalfGetNext(final Cbact04cContext ctx, final ExecutionController ctrl) {
		boolean result = false; 
		IndexedFile tcatbalFile = ctx.getTcatbalFileHandler(ctrl.getExecutionContext()); 
		result = tcatbalFile.read();
		if (result) {
			ctx.getTranCatBalRecord().setBytes(ctx.getTcatbalFile().getFdTranCatBalRecordReference().getBytes());
		} 
		if (DataUtils.compare("00", ctx.getTcatbalfStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			if (DataUtils.compare("10", ctx.getTcatbalfStatus()) == 0) {
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
				if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING TRANSACTION CATEGORY FILE");
				ctx.getIoStatus().setBytes(ctx.getTcatbalfStatus().getBytes());
				if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
				abendProgram(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation updateAccount.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void updateAccount(final Cbact04cContext ctx, final ExecutionController ctrl) {
		IndexedFile accountFile = ctx.getAccountFileHandler(ctrl.getExecutionContext()); 
		/* 
		Update the balances in account record to reflect posted trans. */
		ctx.getAccountRecord().setAcctCurrBal(ctx.getAccountRecord().getAcctCurrBal().add(ctx.getWsMiscVars().getWsTotalInt()));
		ctx.getAccountRecord().setAcctCurrCycCredit(BigDecimal.ZERO);
		ctx.getAccountRecord().setAcctCurrCycDebit(BigDecimal.ZERO);
		ctx.getAccountFile().getFdAcctfileRecReference().setBytes(ctx.getAccountRecord().getBytes());
		accountFile.rewrite(ctx.getAccountFile().getFdAcctfileRecReference());
		if (DataUtils.compare("00", ctx.getAcctfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR RE-WRITING ACCOUNT FILE");
			ctx.getIoStatus().setBytes(ctx.getAcctfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation getAcctData.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getAcctData(final Cbact04cContext ctx, final ExecutionController ctrl) {
		IndexedFile accountFile = ctx.getAccountFileHandler(ctrl.getExecutionContext()); 
		boolean invalidKey = false; 
		accountFile.read();
		invalidKey = accountFile.isInvalidKey();
		if (invalidKey) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "ACCOUNT NOT FOUND: " , ctx.getAccountFile().getFdAcctIdReference().getValue(String.class));
		} else {
			ctx.getAccountRecord().setBytes(ctx.getAccountFile().getFdAcctfileRecReference().getBytes());
		}
		if (DataUtils.compare("00", ctx.getAcctfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING ACCOUNT FILE");
			ctx.getIoStatus().setBytes(ctx.getAcctfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation getXrefData.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getXrefData(final Cbact04cContext ctx, final ExecutionController ctrl) {
		boolean invalidKey = false; 
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		xrefFile.read(ctx.getXrefFile().getFdXrefAcctIdReference());
		invalidKey = xrefFile.isInvalidKey();
		if (invalidKey) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "ACCOUNT NOT FOUND: " , ctx.getXrefFile().getFdXrefAcctIdReference().getValue(String.class));
		} else {
			ctx.getCardXrefRecord().setBytes(ctx.getXrefFile().getFdXreffileRecReference().getBytes());
		}
		if (DataUtils.compare("00", ctx.getXreffileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING XREF FILE");
			ctx.getIoStatus().setBytes(ctx.getXreffileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation getInterestRate.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getInterestRate(final Cbact04cContext ctx, final ExecutionController ctrl) {
		IndexedFile discgrpFile = ctx.getDiscgrpFileHandler(ctrl.getExecutionContext()); 
		boolean invalidKey = false; 
		discgrpFile.read();
		invalidKey = discgrpFile.isInvalidKey();
		if (invalidKey) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("DISCLOSURE GROUP RECORD MISSING");
			if (LOGGER.isInfoEnabled()) LOGGER.info("TRY WITH DEFAULT GROUP CODE");
		} else {
			ctx.getDisGroupRecord().setBytes(ctx.getDiscgrpFile().getFdDiscgrpRecReference().getBytes());
		}
		if (DataUtils.compare("00", ctx.getDiscgrpStatus()) == 0 || DataUtils.compare("23", ctx.getDiscgrpStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING DISCLOSURE GROUP FILE");
			ctx.getIoStatus().setBytes(ctx.getDiscgrpStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
		if (DataUtils.compare("23", ctx.getDiscgrpStatus()) == 0) {
			ctx.getDiscgrpFile().setFdDisAcctGroupId("DEFAULT");
			aGetDefaultIntRate(ctx, ctrl);
		}
	}

	/**
	 * Process operation aGetDefaultIntRate.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void aGetDefaultIntRate(final Cbact04cContext ctx, final ExecutionController ctrl) {
		IndexedFile discgrpFile = ctx.getDiscgrpFileHandler(ctrl.getExecutionContext()); 
		boolean result = false; 
		result = discgrpFile.read();
		if (result) {
			ctx.getDisGroupRecord().setBytes(ctx.getDiscgrpFile().getFdDiscgrpRecReference().getBytes());
		} 
		if (DataUtils.compare("00", ctx.getDiscgrpStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING DEFAULT DISCLOSURE GROUP");
			ctx.getIoStatus().setBytes(ctx.getDiscgrpStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation computeInterest.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void computeInterest(final Cbact04cContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscVars().setWsMonthlyInt((ctx.getTranCatBalRecord().getTranCatBal().multiply(ctx.getDisGroupRecord().getDisIntRate())).divide(new BigDecimal("1200"), MathContext.DECIMAL128));
		ctx.getWsMiscVars().setWsTotalInt(ctx.getWsMiscVars().getWsTotalInt().add(ctx.getWsMiscVars().getWsMonthlyInt()));
		bWriteTx(ctx, ctrl);
	}

	/**
	 * Process operation bWriteTx.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void bWriteTx(final Cbact04cContext ctx, final ExecutionController ctrl) {
		SequentialFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
		ctx.getWsCounters().setWsTranidSuffix(ctx.getWsCounters().getWsTranidSuffix() + 1);
		StringConcatenationBuilder.newInstance(ctx.getTranRecord().getTranIdReference())
			.addDelimitedBySize(ctx.getExternalParms().getParmDateReference().getBytes())
			.addDelimitedBySize(ctx.getWsCounters().getWsTranidSuffixReference().getValue(String.class))
			.end();
		ctx.getTranRecord().setTranTypeCd("01");
		ctx.getTranRecord().setTranCatCd(NumberUtils.convert("05").intValue());
		ctx.getTranRecord().setTranSource("System");
		StringConcatenationBuilder.newInstance(ctx.getTranRecord().getTranDescReference())
			.addDelimitedBySize("Int. for a/c ")
			.addDelimitedBySize(ctx.getAccountRecord().getAcctIdReference().getValue(String.class))
			.end();
		ctx.getTranRecord().setTranAmt(ctx.getWsMiscVars().getWsMonthlyInt());
		ctx.getTranRecord().setTranMerchantId(0);
		DataUtils.setToBlank(ctx.getTranRecord().getTranMerchantNameReference());
		DataUtils.setToBlank(ctx.getTranRecord().getTranMerchantCityReference());
		DataUtils.setToBlank(ctx.getTranRecord().getTranMerchantZipReference());
		ctx.getTranRecord().getTranCardNumReference().setValue(ctx.getCardXrefRecord().getXrefCardNumReference());
		zGetDb2FormatTimestamp(ctx, ctrl);
		ctx.getTranRecord().getTranOrigTsReference().setValue(ctx.getGroup2().getDb2FormatTsReference());
		ctx.getTranRecord().getTranProcTsReference().setValue(ctx.getGroup2().getDb2FormatTsReference());
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
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR WRITING TRANSACTION RECORD");
			ctx.getIoStatus().setBytes(ctx.getTranfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
		
		/* 
		---------------------------------------------------------------*
		To be implemented */
		return;
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
	public void tcatbalfClose(final Cbact04cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation xreffileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileClose(final Cbact04cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation discgrpClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void discgrpClose(final Cbact04cContext ctx, final ExecutionController ctrl) {
		IndexedFile discgrpFile = ctx.getDiscgrpFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		discgrpFile.close();
		if (DataUtils.compare("00", ctx.getDiscgrpStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING DISCLOSURE GROUP FILE");
			ctx.getIoStatus().setBytes(ctx.getDiscgrpStatus().getBytes());
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
	public void acctfileClose(final Cbact04cContext ctx, final ExecutionController ctrl) {
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
	 * Process operation tranfileClose.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tranfileClose(final Cbact04cContext ctx, final ExecutionController ctrl) {
		SequentialFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
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
	 * Process operation zGetDb2FormatTimestamp.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void zGetDb2FormatTimestamp(final Cbact04cContext ctx, final ExecutionController ctrl) {
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
	public void abendProgram(final Cbact04cContext ctx, final ExecutionController ctrl) {
		if (LOGGER.isInfoEnabled()) LOGGER.info("ABENDING PROGRAM");
		ctx.getTiming().setTiming(0);
		ctx.getAbcode().setAbcode(999);
		abendInstance.triggerAbend(ctx.getAbcode().getAbcode());
	}

}
