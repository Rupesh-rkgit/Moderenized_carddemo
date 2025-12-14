package aws.bluage.l3.workshop.cocrdupc.service;

import aws.bluage.l3.workshop.cocrdupc.business.context.CocrdupcContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface CocrdupcProcess.
 * 
 * Defines application services for CocrdupcProcess
 */
public interface CocrdupcProcess {

	/**
	 * Process operation cocrdupc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void cocrdupc(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void commonReturn(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processInputs(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveMap(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editMapInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editMapInputs(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editAccount(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editCard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editCard(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editName.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editName(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editCardstatus.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editCardstatus(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editExpiryMon.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editExpiryMon(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation editExpiryYear.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void editExpiryYear(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendMap(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void screenInit(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenVars.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenVars(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupInfomsg.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupInfomsg(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void setupScreenAttrs(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendScreen(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readData.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readData(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getcardByacctcard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getcardByacctcard(final CocrdupcContext ctx, final ExecutionController ctrl);

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
	void yyyyStorePfkey(final CocrdupcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation abendRoutine.
	 * 
	 *  Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendRoutine(final CocrdupcContext ctx, final ExecutionController ctrl);

}
