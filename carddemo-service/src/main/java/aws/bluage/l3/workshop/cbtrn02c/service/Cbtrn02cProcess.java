package aws.bluage.l3.workshop.cbtrn02c.service;

import aws.bluage.l3.workshop.cbtrn02c.business.context.Cbtrn02cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cbtrn02cProcess.
 * 
 * Defines application services for Cbtrn02cProcess
 */
public interface Cbtrn02cProcess {

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
	void procedureDivision(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dalytranOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dalytranOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tranfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tranfileOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dalyrejsOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dalyrejsOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tcatbalfOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tcatbalfOpen(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dalytranGetNext.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dalytranGetNext(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation validateTran.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void validateTran(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation aLookupXref.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void aLookupXref(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation bLookupAcct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void bLookupAcct(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation postTransaction.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void postTransaction(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeRejectRec.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeRejectRec(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation updateTcatbal.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void updateTcatbal(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation aCreateTcatbalRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void aCreateTcatbalRec(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation bUpdateTcatbalRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void bUpdateTcatbalRec(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation updateAccountRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void updateAccountRec(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeTransactionFile.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeTransactionFile(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dalytranClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dalytranClose(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tranfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tranfileClose(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileClose(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dalyrejsClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dalyrejsClose(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileClose(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tcatbalfClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tcatbalfClose(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation zGetDb2FormatTimestamp.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void zGetDb2FormatTimestamp(final Cbtrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation abendProgram.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendProgram(final Cbtrn02cContext ctx, final ExecutionController ctrl);

}
