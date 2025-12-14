
package aws.bluage.l3.workshop.cbtrn03c.service.impl;

import aws.bluage.l3.workshop.cbtrn03c.business.context.Cbtrn03cContext;
import aws.bluage.l3.workshop.cbtrn03c.service.Cbtrn03cProcess;
import aws.bluage.l3.workshop.core.Abend;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.io.IndexedFile;
import com.netfective.bluage.gapwalk.rt.io.OpenMode;
import com.netfective.bluage.gapwalk.rt.io.SequentialFile;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class Cbtrn03cProcessImpl
 * 
 * Defines application services for Cbtrn03cProcess
 * @see Cbtrn03cProcess
 */
@Service("aws.bluage.l3.workshop.cbtrn03c.service.Cbtrn03cProcess")
@Import({
aws.bluage.l3.workshop.core.impl.AbendImpl.class 
}) 	
public class Cbtrn03cProcessImpl implements Cbtrn03cProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cbtrn03cProcessImpl.class);

	@Autowired
	private Abend abendInstance;


	/**
	 * Process operation procedureDivision.
	 * 
	 * PROGRAM-ID.CBTRN03C.
	 *  AUTHOR.        AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void procedureDivision(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		procedureDivision1(ctx, ctrl);
		tranfileClose(ctx, ctrl);
		reptfileClose(ctx, ctrl);
		cardxrefClose(ctx, ctrl);
		trantypeClose(ctx, ctrl);
		trancatgClose(ctx, ctrl);
		dateparmClose(ctx, ctrl);
		if (LOGGER.isInfoEnabled()) LOGGER.info("END OF EXECUTION OF PROGRAM CBTRN03C");
		if (ctx.isMainProgram()) {
			ctrl.stopRunUnit();
		}
	}

	/**
	 * Process operation procedureDivision1.
	 * 
	 * *****************************************************************
	 *  Program     : CBTRN03C.CBL
	 *  Application : CardDemo
	 *  Type        : BATCH COBOL Program
	 *  Function    : Print the transaction detail report.
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
	public void procedureDivision1(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		/* 
		**************************************************************** */
		if (LOGGER.isInfoEnabled()) LOGGER.info("START OF EXECUTION OF PROGRAM CBTRN03C");
		tranfileOpen(ctx, ctrl);
		reptfileOpen(ctx, ctrl);
		cardxrefOpen(ctx, ctrl);
		trantypeOpen(ctx, ctrl);
		trancatgOpen(ctx, ctrl);
		dateparmOpen(ctx, ctrl);
		dateparmRead(ctx, ctrl);
		while (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "Y") != 0) {
			if (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "N") == 0) {
				tranfileGetNext(ctx, ctrl);
				if (DataUtils.compare(ctx.getTranRecord().getTranProcTsReference().getBytes(0, 10), ctx.getWsDateparmRecord().getWsStartDateReference()) >= 0 && DataUtils.compare(ctx.getTranRecord().getTranProcTsReference().getBytes(0, 10), ctx.getWsDateparmRecord().getWsEndDateReference()) <= 0) {
					
					/* 
					Do nothing */
					if (DataUtils.compare(ctx.getEndOfFile().getEndOfFileReference(), "N") == 0) {
						if (LOGGER.isInfoEnabled()) LOGGER.info("{}" , DataUtils.toString(ctx.getTranRecord().getBytes()));
						if (DataUtils.compare(ctx.getWsReportVars().getWsCurrCardNumReference(), ctx.getTranRecord().getTranCardNumReference()) != 0) {
							if (DataUtils.compare(ctx.getWsReportVars().getWsFirstTimeReference(), "N") == 0) {
								writeAccountTotals(ctx, ctrl);
							} 
							ctx.getWsReportVars().getWsCurrCardNumReference().setValue(ctx.getTranRecord().getTranCardNumReference());
							ctx.getXrefFile().getFdXrefCardNumReference().setValue(ctx.getTranRecord().getTranCardNumReference());
							aLookupXref(ctx, ctrl);
						} 
						ctx.getTrantypeFile().getFdTranTypeReference().setValue(ctx.getTranRecord().getTranTypeCdReference());
						bLookupTrantype(ctx, ctrl);
						ctx.getTrancatgFile().getFdTranTypeCdReference().setValue(ctx.getTranRecord().getTranTypeCdReference());
						ctx.getTrancatgFile().setFdTranCatCd(ctx.getTranRecord().getTranCatCd());
						cLookupTrancatg(ctx, ctrl);
						writeTransactionReport(ctx, ctrl);
					} else {
						if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "TRAN-AMT " , ctx.getTranRecord().getTranAmtReference().getValue(String.class));
						if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "WS-PAGE-TOTAL" , ctx.getWsReportVars().getWsPageTotalReference().getValue(String.class));
						ctx.getWsReportVars().setWsPageTotal(ctx.getWsReportVars().getWsPageTotal().add(ctx.getTranRecord().getTranAmt()));
						ctx.getWsReportVars().setWsAccountTotal(ctx.getWsReportVars().getWsAccountTotal().add(ctx.getTranRecord().getTranAmt()));
						writePageTotals(ctx, ctrl);
						writeGrandTotals(ctx, ctrl);
					}
				} else {
					return;
				}
			} 
		}
	}

	/**
	 * Process operation dateparmRead.
	 * 
	 *  Read the date parameter file.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dateparmRead(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile dateParmsFile = ctx.getDateParmsFileHandler(ctrl.getExecutionContext()); 
		boolean result = false; 
		result = dateParmsFile.read();
		if (result) {
			ctx.getWsDateparmRecord().setBytes(ctx.getDateParmsFile().getFdDateparmRecReference().getBytes());
		} 
		if (DataUtils.compare("00", ctx.getDateparmStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else if (DataUtils.compare("10", ctx.getDateparmStatus()) == 0) {
			ctx.getApplResult().setApplResult(16);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}{}{}" , "Reporting from " , ctx.getWsDateparmRecord().getWsStartDate() , " to " , ctx.getWsDateparmRecord().getWsEndDate());
		} else {
			if (ctx.getApplResult().isApplEof()) {
				ctx.getEndOfFile().setEndOfFile("Y");
			} else {
				if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING DATEPARM FILE");
				ctx.getIoStatus().setBytes(ctx.getDateparmStatus().getBytes());
				if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
				abendProgram(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation tranfileGetNext.
	 * 
	 * ****************************************************************
	 *  I/O ROUTINES TO ACCESS A KSDS, VSAM DATA SET...               *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void tranfileGetNext(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		boolean result = false; 
		SequentialFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
		result = transactFile.read();
		if (result) {
			ctx.getTranRecord().setBytes(ctx.getTransactFile().getFdTranfileRecReference().getBytes());
		} 
		if (DataUtils.compare("00", ctx.getTranfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else if (DataUtils.compare("10", ctx.getTranfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(16);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (ctx.getApplResult().isApplEof()) {
				ctx.getEndOfFile().setEndOfFile("Y");
			} else {
				if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING TRANSACTION FILE");
				ctx.getIoStatus().setBytes(ctx.getTranfileStatus().getBytes());
				if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
				abendProgram(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation writeTransactionReport.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeTransactionReport(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		if (DataUtils.compare(ctx.getWsReportVars().getWsFirstTimeReference(), "Y") == 0) {
			ctx.getWsReportVars().setWsFirstTime("N");
			ctx.getReportNameHeader().getReptStartDateReference().setValue(ctx.getWsDateparmRecord().getWsStartDateReference());
			ctx.getReportNameHeader().getReptEndDateReference().setValue(ctx.getWsDateparmRecord().getWsEndDateReference());
			writeHeaders(ctx, ctrl);
		} 
		if (NumberUtils.compare(NumberUtils.modulo(ctx.getWsReportVars().getWsLineCounter(), ctx.getWsReportVars().getWsPageSize()), 0) == 0) {
			writePageTotals(ctx, ctrl);
			writeHeaders(ctx, ctrl);
		} 
		ctx.getWsReportVars().setWsPageTotal(ctx.getWsReportVars().getWsPageTotal().add(ctx.getTranRecord().getTranAmt()));
		ctx.getWsReportVars().setWsAccountTotal(ctx.getWsReportVars().getWsAccountTotal().add(ctx.getTranRecord().getTranAmt()));
		writeDetail(ctx, ctrl);
	}

	/**
	 * Process operation writePageTotals.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writePageTotals(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		ctx.getReportPageTotals().getReptPageTotalReference().setValue(ctx.getWsReportVars().getWsPageTotal());
		ctx.getReportFile().getFdReptfileRecReference().setBytes(ctx.getReportPageTotals().getBytes());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsGrandTotal(ctx.getWsReportVars().getWsGrandTotal().add(ctx.getWsReportVars().getWsPageTotal()));
		ctx.getWsReportVars().setWsPageTotal(BigDecimal.ZERO);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
		ctx.getReportFile().getFdReptfileRecReference().setValue(ctx.getTransactionHeader2().getTransactionHeader2Reference());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
	}

	/**
	 * Process operation writeAccountTotals.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeAccountTotals(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		ctx.getReportAccountTotals().getReptAccountTotalReference().setValue(ctx.getWsReportVars().getWsAccountTotal());
		ctx.getReportFile().getFdReptfileRecReference().setBytes(ctx.getReportAccountTotals().getBytes());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsAccountTotal(BigDecimal.ZERO);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
		ctx.getReportFile().getFdReptfileRecReference().setValue(ctx.getTransactionHeader2().getTransactionHeader2Reference());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
	}

	/**
	 * Process operation writeGrandTotals.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeGrandTotals(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		ctx.getReportGrandTotals().getReptGrandTotalReference().setValue(ctx.getWsReportVars().getWsGrandTotal());
		ctx.getReportFile().getFdReptfileRecReference().setBytes(ctx.getReportGrandTotals().getBytes());
		writeReportRec(ctx, ctrl);
	}

	/**
	 * Process operation writeHeaders.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeHeaders(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		ctx.getReportFile().getFdReptfileRecReference().setBytes(ctx.getReportNameHeader().getBytes());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
		ctx.getReportFile().getFdReptfileRecReference().setValue(ctx.getWsReportVars().getWsBlankLineReference());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
		ctx.getReportFile().getFdReptfileRecReference().setBytes(ctx.getTransactionHeader1().getBytes());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
		ctx.getReportFile().getFdReptfileRecReference().setValue(ctx.getTransactionHeader2().getTransactionHeader2Reference());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
	}

	/**
	 * Process operation writeReportRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeReportRec(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile reportFile = ctx.getReportFileHandler(ctrl.getExecutionContext()); 
		reportFile.write(ctx.getReportFile().getFdReptfileRecReference());
		if (DataUtils.compare("00", ctx.getTranreptStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR WRITING REPTFILE");
			ctx.getIoStatus().setBytes(ctx.getTranreptStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation writeDetail.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeDetail(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		ctx.getTransactionDetailReport().getField().initialize();
		ctx.getTransactionDetailReport().getTranReportTransIdReference().setValue(ctx.getTranRecord().getTranIdReference());
		ctx.getTransactionDetailReport().setTranReportAccountId(ctx.getCardXrefRecord().getXrefAcctIdReference().getValue(String.class));
		ctx.getTransactionDetailReport().getTranReportTypeCdReference().setValue(ctx.getTranRecord().getTranTypeCdReference());
		ctx.getTransactionDetailReport().setTranReportTypeDesc(ctx.getTranTypeRecord().getTranTypeDesc());
		ctx.getTransactionDetailReport().setTranReportCatCd(ctx.getTranRecord().getTranCatCd());
		ctx.getTransactionDetailReport().setTranReportCatDesc(ctx.getTranCatRecord().getTranCatTypeDesc());
		ctx.getTransactionDetailReport().getTranReportSourceReference().setValue(ctx.getTranRecord().getTranSourceReference());
		ctx.getTransactionDetailReport().getTranReportAmtReference().setValue(ctx.getTranRecord().getTranAmt());
		ctx.getReportFile().getFdReptfileRecReference().setBytes(ctx.getTransactionDetailReport().getBytes());
		writeReportRec(ctx, ctrl);
		ctx.getWsReportVars().setWsLineCounter(ctx.getWsReportVars().getWsLineCounter() + 1);
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
	public void tranfileOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		transactFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getTranfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING TRANFILE");
			ctx.getIoStatus().setBytes(ctx.getTranfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation reptfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void reptfileOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile reportFile = ctx.getReportFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		reportFile.open(OpenMode.OUTPUT);
		if (DataUtils.compare("00", ctx.getTranreptStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING REPTFILE");
			ctx.getIoStatus().setBytes(ctx.getTranreptStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation cardxrefOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void cardxrefOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		xrefFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getCardxrefStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING CROSS REF FILE");
			ctx.getIoStatus().setBytes(ctx.getCardxrefStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation trantypeOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trantypeOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		IndexedFile trantypeFile = ctx.getTrantypeFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		trantypeFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getTrantypeStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING TRANSACTION TYPE FILE");
			ctx.getIoStatus().setBytes(ctx.getTrantypeStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation trancatgOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trancatgOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		IndexedFile trancatgFile = ctx.getTrancatgFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		trancatgFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getTrancatgStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING TRANSACTION CATG FILE");
			ctx.getIoStatus().setBytes(ctx.getTrancatgStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation dateparmOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dateparmOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile dateParmsFile = ctx.getDateParmsFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		dateParmsFile.open(OpenMode.INPUT);
		if (DataUtils.compare("00", ctx.getDateparmStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING DATE PARM FILE");
			ctx.getIoStatus().setBytes(ctx.getDateparmStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation aLookupXref.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void aLookupXref(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		boolean invalidKey = false; 
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		xrefFile.read();
		invalidKey = xrefFile.isInvalidKey();
		if (invalidKey) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "INVALID CARD NUMBER : " , ctx.getXrefFile().getFdXrefCardNum());
			ctx.getIoStatus().setBytes(DataUtils.getBytes("23"));
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		} else {
			ctx.getCardXrefRecord().setBytes(ctx.getXrefFile().getFdCardxrefRecReference().getBytes());
		}
	}

	/**
	 * Process operation bLookupTrantype.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void bLookupTrantype(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		boolean invalidKey = false; 
		IndexedFile trantypeFile = ctx.getTrantypeFileHandler(ctrl.getExecutionContext()); 
		trantypeFile.read();
		invalidKey = trantypeFile.isInvalidKey();
		if (invalidKey) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "INVALID TRANSACTION TYPE : " , ctx.getTrantypeFile().getFdTranType());
			ctx.getIoStatus().setBytes(DataUtils.getBytes("23"));
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		} else {
			ctx.getTranTypeRecord().setBytes(ctx.getTrantypeFile().getFdTrantypeRecReference().getBytes());
		}
	}

	/**
	 * Process operation cLookupTrancatg.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void cLookupTrancatg(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		boolean invalidKey = false; 
		IndexedFile trancatgFile = ctx.getTrancatgFileHandler(ctrl.getExecutionContext()); 
		trancatgFile.read();
		invalidKey = trancatgFile.isInvalidKey();
		if (invalidKey) {
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "INVALID TRAN CATG KEY : " , DataUtils.toString(ctx.getTrancatgFile().getFdTranCatKeyReference().getBytes()));
			ctx.getIoStatus().setBytes(DataUtils.getBytes("23"));
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		} else {
			ctx.getTranCatRecord().setBytes(ctx.getTrancatgFile().getFdTranCatRecordReference().getBytes());
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
	public void tranfileClose(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile transactFile = ctx.getTransactFileHandler(ctrl.getExecutionContext()); 
		DataUtils.setToZeroes(ctx.getApplResult().getApplResultReference());
		transactFile.close();
		if (DataUtils.compare("00", ctx.getTranfileStatus()) == 0) {
			ctx.getApplResult().setApplResult(ctx.getApplResult().getApplResult() - ctx.getApplResult().getApplResult());
		} else {
			DataUtils.setToZeroes(ctx.getApplResult().getApplResultReference());
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING POSTED TRANSACTION FILE");
			ctx.getIoStatus().setBytes(ctx.getTranfileStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation reptfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void reptfileClose(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile reportFile = ctx.getReportFileHandler(ctrl.getExecutionContext()); 
		DataUtils.setToZeroes(ctx.getApplResult().getApplResultReference());
		reportFile.close();
		if (DataUtils.compare("00", ctx.getTranreptStatus()) == 0) {
			ctx.getApplResult().setApplResult(ctx.getApplResult().getApplResult() - ctx.getApplResult().getApplResult());
		} else {
			DataUtils.setToZeroes(ctx.getApplResult().getApplResultReference());
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING REPORT FILE");
			ctx.getIoStatus().setBytes(ctx.getTranreptStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation cardxrefClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void cardxrefClose(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		xrefFile.close();
		if (DataUtils.compare("00", ctx.getCardxrefStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING CROSS REF FILE");
			ctx.getIoStatus().setBytes(ctx.getCardxrefStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation trantypeClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trantypeClose(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		IndexedFile trantypeFile = ctx.getTrantypeFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		trantypeFile.close();
		if (DataUtils.compare("00", ctx.getTrantypeStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING TRANSACTION TYPE FILE");
			ctx.getIoStatus().setBytes(ctx.getTrantypeStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation trancatgClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trancatgClose(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		IndexedFile trancatgFile = ctx.getTrancatgFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		trancatgFile.close();
		if (DataUtils.compare("00", ctx.getTrancatgStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING TRANSACTION CATG FILE");
			ctx.getIoStatus().setBytes(ctx.getTrancatgStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation dateparmClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void dateparmClose(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		SequentialFile dateParmsFile = ctx.getDateParmsFileHandler(ctrl.getExecutionContext()); 
		ctx.getApplResult().setApplResult(8);
		dateParmsFile.close();
		if (DataUtils.compare("00", ctx.getDateparmStatus()) == 0) {
			ctx.getApplResult().setApplResult(0);
		} else {
			ctx.getApplResult().setApplResult(12);
		}
		if (ctx.getApplResult().isApplAok()) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING DATE PARM FILE");
			ctx.getIoStatus().setBytes(ctx.getDateparmStatus().getBytes());
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "FILE STATUS IS: " , DataUtils.toString(ctx.getIoStatus().getBytes()));
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation abendProgram.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void abendProgram(final Cbtrn03cContext ctx, final ExecutionController ctrl) {
		if (LOGGER.isInfoEnabled()) LOGGER.info("ABENDING PROGRAM");
		ctx.getTiming().setTiming(0);
		ctx.getAbcode().setAbcode(999);
		abendInstance.triggerAbend(ctx.getAbcode().getAbcode());
	}

}
