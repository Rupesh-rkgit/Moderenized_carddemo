package aws.bluage.l3.workshop.coactupc.service;

import aws.bluage.l3.workshop.coactupc.business.context.CoactupcContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface CoactupcProcess.
 * 
 * Defines application services for CoactupcProcess
 */
public interface CoactupcProcess {

	/**
	 * Process operation coactupc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void coactupc(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void commonReturn(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processInputs(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveMap(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editMapInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editMapInputs(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation compareOldNew.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void compareOldNew(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAccount(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editMandatory.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editMandatory(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editYesno.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editYesno(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAlphaReqd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAlphaReqd(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAlphanumReqd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAlphanumReqd(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAlphaOpt.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAlphaOpt(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAlphanumOpt.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAlphanumOpt(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editNumReqd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editNumReqd(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editSigned9v2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editSigned9v2(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editUsPhoneNum.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editUsPhoneNum(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAreaCode.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAreaCode(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAreaCode1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAreaCode1(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAreaCode2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAreaCode2(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editUsSsn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editUsSsn(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editUsStateCd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editUsStateCd(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editFicoScore.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editFicoScore(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editUsStateZipCd.
	 * 
	 * A crude zip code edit based on data from USPS web site
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editUsStateZipCd(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendMap(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void screenInit(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenVars.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenVars(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation showInitialValues.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void showInitialValues(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation showOriginalValues.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void showOriginalValues(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation showUpdatedValues.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void showUpdatedValues(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupInfomsg.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupInfomsg(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenAttrs(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation protectAllAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void protectAllAttrs(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation unprotectFewAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void unprotectFewAttrs(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupInfomsgAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupInfomsgAttrs(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendScreen(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readAcct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readAcct(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getcardxrefByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getcardxrefByacct(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getacctdataByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getacctdataByacct(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getcustdataBycust.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getcustdataBycust(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation storeFetchedData.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void storeFetchedData(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation yyyyStorePfkey.
	 * 
	 * ****************************************************************
	 * Common code to store PFKey
	 * ****************************************************************
	 * ****************************************************************
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
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void yyyyStorePfkey(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation abendRoutine.
	 * 
	 *  Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendRoutine(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editDateCcyymmdd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editDateCcyymmdd(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editDateCcyymmdd1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editDateCcyymmdd1(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editDateCcyymmdd2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editDateCcyymmdd2(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editDateCcyymmdd3.
	 * 
	 * ****************************************************************
	 *  Common Date Routines
	 * ****************************************************************
	 * ****************************************************************
	 * Procedure Division Copybook for DATE related code
	 * ****************************************************************
	 * Date validation paragraph for reuse and hopefully not misuse
	 * Accompanying WORKING Storage is CSUTLDTR
	 * ****************************************************************
	 *  ***  PERFORM EDIT-DATE-CCYYMMDD
	 *          THRU EDIT-DATE-CCYYMMDD-EXIT
	 *          to validate CCYYMMDD dates
	 *       Reusable paras
	 *       a) EDIT-YEAR-CCYY
	 *       b) EDIT-MONTH
	 *       c) EDIT-DAY
	 *       d) EDIT-DATE-OF-BIRTH
	 *       e) EDIT-DATE-OF-BIRTH
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editDateCcyymmdd3(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editMonthExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editMonthExit(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editDayMonthYearExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editDayMonthYearExit(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editDayMonthYearExit1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editDayMonthYearExit1(final CoactupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editDateOfBirth.
	 * 
	 * ****************************************************************
	 * Date of Birth Reasonableness check
	 * ****************************************************************
	 *   At the time of writing this program
	 *   Time travel was not possible.
	 *   Date of birth in the future is not acceptable
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editDateOfBirth(final CoactupcContext ctx, final ExecutionController ctrl);

}
