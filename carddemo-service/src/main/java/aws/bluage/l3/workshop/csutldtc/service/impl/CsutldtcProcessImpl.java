
package aws.bluage.l3.workshop.csutldtc.service.impl;

import aws.bluage.l3.workshop.csutldtc.business.context.CsutldtcContext;
import aws.bluage.l3.workshop.csutldtc.service.CsutldtcProcess;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.CallBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Class CsutldtcProcessImpl
 * 
 * Defines application services for CsutldtcProcess
 * @see CsutldtcProcess
 */
@Service("aws.bluage.l3.workshop.csutldtc.service.CsutldtcProcess")
public class CsutldtcProcessImpl implements CsutldtcProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CsutldtcProcessImpl.class);


	/**
	 * Process operation procedureDivision.
	 * 
	 * PROGRAM-ID.CSUTLDTC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void procedureDivision(final CsutldtcContext ctx, final ExecutionController ctrl) {
		ctx.getLsDate().bind(ArgUtils.get(ctx, 0));
		ctx.getLsDateFormat().bind(ArgUtils.get(ctx, 1));
		ctx.getLsResult().bind(ArgUtils.get(ctx, 2));
		
		/* 
		*****************************************************************
		****       CALL TO CEEDAYS                                *******
		*****************************************************************
		Copyright Amazon.com, Inc. or its affiliates.
		All Rights Reserved.
		Licensed under the Apache License, Version 2.0 (the \"License\").
		You may not use this file except in compliance with the License.
		You may obtain a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
		Unless required by applicable law or agreed to in writing,
		software distributed under the License is distributed on an
		\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
		either express or implied. See the License for the specific
		language governing permissions and limitations under the License
		***************************************************************** */
		ctx.getWsMessage().getField().initialize();
		DataUtils.setToBlank(ctx.getWsMessage().getWsDateReference());
		a000Main(ctx, ctrl);
		
		/* 
		DISPLAY WS-MESSAGE */
		ctx.getLsResult().getLsResultReference().setBytes(ctx.getWsMessage().getBytes());
		ctx.setReturnCode(ctx.getWsMessage().getWsSeverityN());
		if (!(ctx.isMainProgram())) {
			return;
		} else {
			
			/* 
			GOBACK */
			a000Main(ctx, ctrl);
		}
	}

	/**
	 * Process operation a000Main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void a000Main(final CsutldtcContext ctx, final ExecutionController ctrl) {
		ctx.getWsDateToTest().setVstringLength_2(ctx.getLsDate().getLsDateReference().getRecord().getSize());
		ctx.getWsDateToTest().getVstringTextReference().setBytes(ctx.getLsDate().getLsDateReference().getBytes());
		ctx.getWsMessage().getWsDateReference().setValue(ctx.getLsDate().getLsDateReference());
		ctx.getWsDateFormat().setVstringLength_3(ctx.getLsDateFormat().getLsDateFormatReference().getRecord().getSize());
		ctx.getWsDateFormat().getVstringTextReference().setBytes(ctx.getLsDateFormat().getLsDateFormatReference().getBytes());
		ctx.getWsMessage().getWsDateFmtReference().setValue(ctx.getLsDateFormat().getLsDateFormatReference());
		ctx.getOutputLillian().setOutputLillian(0);
		ctrl.callSubProgram("CEEDAYS", CallBuilder.newInstance()
			.byReference(ctx.getWsDateToTest())
			.byReference(ctx.getWsDateFormat())
			.byReference(ctx.getOutputLillian().getOutputLillianReference())
			.byReference(ctx.getFeedbackCode())
			.getArguments(), ctx);
		ctx.getWsMessage().getWsDateReference().setBytes(ctx.getWsDateToTest().getBytes());
		ctx.getWsMessage().setWsSeverityN(ctx.getFeedbackCode().getSeverity());
		ctx.getWsMessage().setWsMsgNoN(ctx.getFeedbackCode().getMsgNo());
		
		/* 
		WS-RESULT IS 15 CHARACTERS
		123456789012345' */
		if (ctx.getFeedbackCode().isFcInvalidDate()) {
			ctx.getWsMessage().setWsResult("Date is valid");
		} else if (ctx.getFeedbackCode().isFcInsufficientData()) {
			ctx.getWsMessage().setWsResult("Insufficient");
		} else if (ctx.getFeedbackCode().isFcBadDateValue()) {
			ctx.getWsMessage().setWsResult("Datevalue error");
		} else if (ctx.getFeedbackCode().isFcInvalidEra()) {
			ctx.getWsMessage().setWsResult("Invalid Era    ");
		} else if (ctx.getFeedbackCode().isFcUnsuppRange()) {
			ctx.getWsMessage().setWsResult("Unsupp. Range  ");
		} else if (ctx.getFeedbackCode().isFcInvalidMonth()) {
			ctx.getWsMessage().setWsResult("Invalid month  ");
		} else if (ctx.getFeedbackCode().isFcBadPicString()) {
			ctx.getWsMessage().setWsResult("Bad Pic String ");
		} else if (ctx.getFeedbackCode().isFcNonNumericData()) {
			ctx.getWsMessage().setWsResult("Nonnumeric data");
		} else if (ctx.getFeedbackCode().isFcYearInEraZero()) {
			ctx.getWsMessage().setWsResult("YearInEra is 0 ");
		} else {
			ctx.getWsMessage().setWsResult("Date is invalid");
		}
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:35 CDT */
		return;
	}

}
