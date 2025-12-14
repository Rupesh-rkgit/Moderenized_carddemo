// Import
import com.netfective.bluage.gapwalk.rt.provider.ScriptRegistry
import com.netfective.bluage.gapwalk.rt.call.MainProgramRunner
import com.netfective.bluage.gapwalk.io.support.FileConfigurationUtils
import com.netfective.bluage.gapwalk.rt.job.support.DefaultJobContext
import com.netfective.bluage.gapwalk.rt.utils.GroovyUtils
import com.netfective.bluage.gapwalk.rt.io.support.FileConfiguration
import com.netfective.bluage.gapwalk.rt.shared.AbendException
import com.netfective.bluage.gapwalk.rt.call.exception.GroovyExecutionException
// Variables
mpr = applicationContext.getBean("com.netfective.bluage.gapwalk.rt.call.ExecutionController", MainProgramRunner.class)
TreeMap mapTransfo = [:]
Map params = ["MapTransfo":mapTransfo]
// Execute job with utility functions
Binding binding = new Binding()
binding.setVariable("jobContext", jobContext)
def shell = new GroovyShell(binding).parse(ScriptRegistry.getScript("functions"))
//*********************************************************************
//*                             JOB                                   *
//*********************************************************************
shell.with {
	def jobName = "POSTTRAN"
	mpr.setJobContext(jobContext)
	displayStartJob(jobName)
	Map programResults = jobContext.getProgramResults().clone()
	def lastProgramResult
	//*****************************************************************
	// Copyright Amazon.com, Inc. or its affiliates.                   
	// All Rights Reserved.                                            
	//                                                                 
	// Licensed under the Apache License, Version 2.0 (the "License"). 
	// You may not use this file except in compliance with the License.
	// You may obtain a copy of the License at                         
	//                                                                 
	//    http://www.apache.org/licenses/LICENSE-2.0                   
	//                                                                 
	// Unless required by applicable law or agreed to in writing,      
	// software distributed under the License is distributed on an     
	// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,    
	// either express or implied. See the License for the specific     
	// language governing permissions and limitations under the License
	//*****************************************************************    
	// ******************************************************************* 
	// Process and load daily transaction file and create transaction      
	// category balance and update transaction master vsam                 
	// ******************************************************************* 
	lastProgramResult = stepSTEP15(shell, params, programResults)
	displayEndJob(jobName)
	return programResults.get("GroovyExecutionResult")
}
//*********************************************************************
//*                            STEPS                                  *
//*********************************************************************
// STEP STEP15 - PGM - CBTRN02C***************************************************
def stepSTEP15(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("STEP15", "CBTRN02C", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.bluesam("STEPLIB")
						.dataset("AWS.M2.CARDDEMO.LOADLIB")
						.disposition("SHR")
						.build()
						.systemOut("SYSPRINT")
						.output("*")
						.build()
						.systemOut("SYSOUT")
						.output("*")
						.build()
						.bluesam("TRANFILE")
						.dataset("AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.bluesam("DALYTRAN")
						.dataset("AWS.M2.CARDDEMO.DALYTRAN.PS")
						.disposition("SHR")
						.build()
						.bluesam("XREFFILE")
						.dataset("AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.gdgSupport("DALYREJS")
						.name("AWS.M2.CARDDEMO.DALYREJS").ownerPath(".").relativeGeneration(1).storageProvider("filesystem").recordSize(430)
						.disposition("NEW")
						.normalTermination("CATLG")
						.abnormalTermination("DELETE")
						.build()
						.bluesam("ACCTFILE")
						.dataset("AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.bluesam("TCATBALF")
						.dataset("AWS.M2.CARDDEMO.TCATBALF.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.getFileConfigurations())
					.withParameters(params)
					.runProgram("CBTRN02C")
				})
		}
	}
}
