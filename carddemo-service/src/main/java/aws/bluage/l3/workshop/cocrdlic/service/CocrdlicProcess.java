package aws.bluage.l3.workshop.cocrdlic.service;

import aws.bluage.l3.workshop.cocrdlic.business.context.CocrdlicContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface CocrdlicProcess.
 * 
 * Defines application services for CocrdlicProcess
 */
public interface CocrdlicProcess {

	/**
	 * Process operation main.
	 * 
	 * PROGRAM-ID.COCRDLIC.
	 *  DATE-WRITTEN.
	 *      April 2022.
	 *  DATE-COMPILED.
	 *      Today.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation main1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void main1(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendMap(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void screenInit(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation screenArrayInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void screenArrayInit(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupArrayAttribs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupArrayAttribs(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenAttrs(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupMessage.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupMessage(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendScreen(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveMap(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveScreen(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editInputs(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAccount(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editCard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editCard(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editArray.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editArray(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readForward.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readForward(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readBackwards.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readBackwards(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readBackwards1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readBackwards1(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation filterRecords.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void filterRecords(final CocrdlicContext ctx, final ExecutionController ctrl);

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
	void yyyyStorePfkey(final CocrdlicContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendPlainText.
	 * 
	 *  Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
	 * ****************************************************************
	 *  Plain text exit - Dont use in production                      *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendPlainText(final CocrdlicContext ctx, final ExecutionController ctrl);

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
	void sendLongText(final CocrdlicContext ctx, final ExecutionController ctrl);

}
