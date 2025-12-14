package aws.bluage.l3.workshop.cbstm03b.service;

import aws.bluage.l3.workshop.cbstm03b.business.context.Cbstm03bContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cbstm03bProcess.
 * 
 * Defines application services for Cbstm03bProcess
 */
public interface Cbstm03bProcess {

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
	void start(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation start1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void start1(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trnxfileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trnxfileProc(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trnxfileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trnxfileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileProc(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation custfileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void custfileProc(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation custfileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void custfileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileProc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileProc(final Cbstm03bContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileProc1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileProc1(final Cbstm03bContext ctx, final ExecutionController ctrl);

}
