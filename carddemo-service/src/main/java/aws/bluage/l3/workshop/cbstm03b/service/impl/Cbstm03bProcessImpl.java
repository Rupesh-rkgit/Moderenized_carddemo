
package aws.bluage.l3.workshop.cbstm03b.service.impl;

import aws.bluage.l3.workshop.cbstm03b.business.context.Cbstm03bContext;
import aws.bluage.l3.workshop.cbstm03b.service.Cbstm03bProcess;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.io.IndexedFile;
import com.netfective.bluage.gapwalk.rt.io.OpenMode;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class Cbstm03bProcessImpl
 * 
 * Defines application services for Cbstm03bProcess
 * @see Cbstm03bProcess
 */
@Service("aws.bluage.l3.workshop.cbstm03b.service.Cbstm03bProcess")
public class Cbstm03bProcessImpl implements Cbstm03bProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cbstm03bProcessImpl.class);


	/**
	 * Process operation start.
	 * 
	 * PROGRAM-ID.CBSTM03B.
	 *  AUTHOR.        AWS.
	 * *****************************************************************
	 *  Program     : CBSTM03B.CBL
	 *  Application : CardDemo
	 *  Type        : BATCH COBOL Subroutine
	 *  Function    : Does file processing related to Transact Report
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
	 *  This program is to called by the statement create program
	 *  It does file handling
	 * *****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void start(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		start1(ctx, ctrl);
		if (ctx.isMainProgram()) {
			ctrl.stopRunUnit();
		}
	}

	/**
	 * Process operation start1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void start1(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		ctx.getLkM03bArea().bind(ArgUtils.get(ctx, 0));
		if (DataUtils.compare(ctx.getLkM03bArea().getLkM03bDdReference(), "TRNXFILE") == 0) {
			trnxfileProc(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getLkM03bArea().getLkM03bDdReference(), "XREFFILE") == 0) {
			xreffileProc(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getLkM03bArea().getLkM03bDdReference(), "CUSTFILE") == 0) {
			custfileProc(ctx, ctrl);
		} else if (DataUtils.compare(ctx.getLkM03bArea().getLkM03bDdReference(), "ACCTFILE") == 0) {
			acctfileProc(ctx, ctrl);
		} else {
			return;
		}
	}

	/**
	 * Process operation trnxfileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trnxfileProc(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		trnxfileProc1(ctx, ctrl);
		ctx.getLkM03bArea().getLkM03bRcReference().setBytes(ctx.getTrnxfileStatus().getBytes());
	}

	/**
	 * Process operation trnxfileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trnxfileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		boolean result = false; 
		IndexedFile trnxFile = ctx.getTrnxFileHandler(ctrl.getExecutionContext()); 
		if (ctx.getLkM03bArea().isM03bOpen()) {
			trnxFile.open(OpenMode.INPUT);
			return;
		} else {
			if (ctx.getLkM03bArea().isM03bRead()) {
				result = trnxFile.read();
				if (result) {
					ctx.getLkM03bArea().getLkM03bFldtReference().setBytes(ctx.getTrnxFile().getFdTrnxfileRecReference().getBytes());
				} 
				return;
			} else {
				if (ctx.getLkM03bArea().isM03bClose()) {
					trnxFile.close();
					return;
				} else {
					return;
				}
			}
		}
	}

	/**
	 * Process operation xreffileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileProc(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		xreffileProc1(ctx, ctrl);
		ctx.getLkM03bArea().getLkM03bRcReference().setBytes(ctx.getXreffileStatus().getBytes());
	}

	/**
	 * Process operation xreffileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		boolean result = false; 
		IndexedFile xrefFile = ctx.getXrefFileHandler(ctrl.getExecutionContext()); 
		if (ctx.getLkM03bArea().isM03bOpen()) {
			xrefFile.open(OpenMode.INPUT);
			return;
		} else {
			if (ctx.getLkM03bArea().isM03bRead()) {
				result = xrefFile.read();
				if (result) {
					ctx.getLkM03bArea().getLkM03bFldtReference().setBytes(ctx.getXrefFile().getFdXreffileRecReference().getBytes());
				} 
				return;
			} else {
				if (ctx.getLkM03bArea().isM03bClose()) {
					xrefFile.close();
					return;
				} else {
					return;
				}
			}
		}
	}

	/**
	 * Process operation custfileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void custfileProc(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		custfileProc1(ctx, ctrl);
		ctx.getLkM03bArea().getLkM03bRcReference().setBytes(ctx.getCustfileStatus().getBytes());
	}

	/**
	 * Process operation custfileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void custfileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		IndexedFile custFile = ctx.getCustFileHandler(ctrl.getExecutionContext()); 
		boolean result = false; 
		if (ctx.getLkM03bArea().isM03bOpen()) {
			custFile.open(OpenMode.INPUT);
			return;
		} else {
			if (ctx.getLkM03bArea().isM03bReadK()) {
				int len = ctx.getLkM03bArea().getLkM03bKeyLn();
				ctx.getCustFile().getFdCustIdReference().setBytes(ctx.getLkM03bArea().getLkM03bKeyReference().getBytes(0, len));
				result = custFile.read();
				if (result) {
					ctx.getLkM03bArea().getLkM03bFldtReference().setBytes(ctx.getCustFile().getFdCustfileRecReference().getBytes());
				} 
				return;
			} else {
				if (ctx.getLkM03bArea().isM03bClose()) {
					custFile.close();
					return;
				} else {
					return;
				}
			}
		}
	}

	/**
	 * Process operation acctfileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileProc(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		acctfileProc1(ctx, ctrl);
		ctx.getLkM03bArea().getLkM03bRcReference().setBytes(ctx.getAcctfileStatus().getBytes());
	}

	/**
	 * Process operation acctfileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl) {
		IndexedFile acctFile = ctx.getAcctFileHandler(ctrl.getExecutionContext()); 
		boolean result = false; 
		if (ctx.getLkM03bArea().isM03bOpen()) {
			acctFile.open(OpenMode.INPUT);
			return;
		} else {
			if (ctx.getLkM03bArea().isM03bReadK()) {
				int len = ctx.getLkM03bArea().getLkM03bKeyLn();
				ctx.getAcctFile().setFdAcctId(NumberUtils.convert(ctx.getLkM03bArea().getLkM03bKeyReference().getBytes(0, len)).longValue());
				result = acctFile.read();
				if (result) {
					ctx.getLkM03bArea().getLkM03bFldtReference().setBytes(ctx.getAcctFile().getFdAcctfileRecReference().getBytes());
				} 
				return;
			} else {
				if (ctx.getLkM03bArea().isM03bClose()) {
					acctFile.close();
					return;
				} else {
					return;
				}
			}
		}
	}

}
