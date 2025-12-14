package aws.bluage.l3.workshop.coactvwc.service;

import aws.bluage.l3.workshop.coactvwc.business.context.CoactvwcContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface CoactvwcProcess.
 * 
 * Defines application services for CoactvwcProcess
 */
public interface CoactvwcProcess {

	/**
	 * Process operation coactvwc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void coactvwc(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void commonReturn(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendMap(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void screenInit(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenVars.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenVars(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenAttrs(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendScreen(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processInputs(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveMap(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editMapInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editMapInputs(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAccount(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readAcct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readAcct(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getcardxrefByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getcardxrefByacct(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getacctdataByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getacctdataByacct(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getcustdataBycust.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getcustdataBycust(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendPlainText.
	 * 
	 * ****************************************************************
	 *  Plain text exit - Dont use in production                      *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendPlainText(final CoactvwcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendLongText.
	 * 
	 * ****************************************************************
	 *  Display Long text and exit                                    *
	 *  This is primarily for debugging and should not be used in     *
	 *  regular course                                                *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendLongText(final CoactvwcContext ctx, final ExecutionController ctrl);

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
	void yyyyStorePfkey(final CoactvwcContext ctx, final ExecutionController ctrl);

}
