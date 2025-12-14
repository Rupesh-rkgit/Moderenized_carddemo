package aws.bluage.l3.workshop.cocrdslc.service;

import aws.bluage.l3.workshop.cocrdslc.business.context.CocrdslcContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface CocrdslcProcess.
 * 
 * Defines application services for CocrdslcProcess
 */
public interface CocrdslcProcess {

	/**
	 * Process operation cocrdslc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void cocrdslc(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void commonReturn(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendMap(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void screenInit(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenVars.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenVars(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenAttrs(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendScreen(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processInputs(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveMap(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editMapInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editMapInputs(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAccount(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editCard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editCard(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getcardByacctcard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getcardByacctcard(final CocrdslcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getcardByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getcardByacct(final CocrdslcContext ctx, final ExecutionController ctrl);

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
	void sendLongText(final CocrdslcContext ctx, final ExecutionController ctrl);

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
	void sendPlainText(final CocrdslcContext ctx, final ExecutionController ctrl);

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
	void yyyyStorePfkey(final CocrdslcContext ctx, final ExecutionController ctrl);

}
