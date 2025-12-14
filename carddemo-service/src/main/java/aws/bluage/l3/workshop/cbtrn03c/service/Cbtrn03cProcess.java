package aws.bluage.l3.workshop.cbtrn03c.service;

import aws.bluage.l3.workshop.cbtrn03c.business.context.Cbtrn03cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cbtrn03cProcess.
 * 
 * Defines application services for Cbtrn03cProcess
 */
public interface Cbtrn03cProcess {

	/**
	 * Process operation procedureDivision.
	 * 
	 * PROGRAM-ID.CBTRN03C.
	 *  AUTHOR.        AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void procedureDivision(final Cbtrn03cContext ctx, final ExecutionController ctrl);

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
	void procedureDivision1(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dateparmRead.
	 * 
	 *  Read the date parameter file.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dateparmRead(final Cbtrn03cContext ctx, final ExecutionController ctrl);

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
	void tranfileGetNext(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeTransactionReport.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeTransactionReport(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writePageTotals.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writePageTotals(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeAccountTotals.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeAccountTotals(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeGrandTotals.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeGrandTotals(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeHeaders.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeHeaders(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeReportRec.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeReportRec(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeDetail.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeDetail(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tranfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tranfileOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation reptfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void reptfileOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation cardxrefOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void cardxrefOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trantypeOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trantypeOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trancatgOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trancatgOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dateparmOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dateparmOpen(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation aLookupXref.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void aLookupXref(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation bLookupTrantype.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void bLookupTrantype(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation cLookupTrancatg.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void cLookupTrancatg(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tranfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tranfileClose(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation reptfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void reptfileClose(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation cardxrefClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void cardxrefClose(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trantypeClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trantypeClose(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trancatgClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trancatgClose(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation dateparmClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void dateparmClose(final Cbtrn03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation abendProgram.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendProgram(final Cbtrn03cContext ctx, final ExecutionController ctrl);

}
