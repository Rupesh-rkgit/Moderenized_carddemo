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
	def jobName = "COMBTRAN"
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
	// Sort current transaction file and system generated transactions
	// ******************************************************************* 
	lastProgramResult = stepSTEP05R(shell, params, programResults)
	// ******************************************************************* 
	// Load combined file to transaction master
	// ******************************************************************* 
	lastProgramResult = stepSTEP10(shell, params, programResults)
	displayEndJob(jobName)
	return programResults.get("GroovyExecutionResult")
}
//*********************************************************************
//*                            STEPS                                  *
//*********************************************************************
// STEP STEP05R - PGM - SORT******************************************************
def stepSTEP05R(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("STEP05R", "SORT", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.concatenation("SORTIN")
						.name("AWS.M2.CARDDEMO.TRANSACT.BKUP").ownerPath(".").relativeGeneration(0)
						.disposition("SHR")
						.name("AWS.M2.CARDDEMO.SYSTRAN").ownerPath(".").relativeGeneration(0)
						.disposition("SHR")
						.build()
						.fileSystem("SYSIN")
						.stream(" SORT FIELDS=(1,16,CH,A)                                                  ", getEncoding())
						.build()
						.systemOut("SYSOUT")
						.output("*")
						.build()
						.gdgSupport("SORTOUT")
						.name("AWS.M2.CARDDEMO.TRANSACT.COMBINED").ownerPath(".").relativeGeneration(1).storageProvider("filesystem")
						.disposition("NEW")
						.normalTermination("CATLG")
						.abnormalTermination("DELETE")
						.dcbParameters("*.SORTIN")
						.build()
						.getFileConfigurations())
					.withParameters(params)
					.runProgram("SORT")
				})
		}
	}
}
// STEP STEP10 - PGM - IDCAMS*****************************************************
def stepSTEP10(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("STEP10", "IDCAMS", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.systemOut("SYSPRINT")
						.output("*")
						.build()
						.gdgSupport("TRANSACT")
						.name("AWS.M2.CARDDEMO.TRANSACT.COMBINED").ownerPath(".").relativeGeneration(1).storageProvider("filesystem")
						.disposition("SHR")
						.build()
						.bluesam("TRANVSAM")
						.dataset("AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.fileSystem("SYSIN")
						.stream("   REPRO INFILE(TRANSACT) OUTFILE(TRANVSAM)                                     ", getEncoding())
						.build()
						.getFileConfigurations())
					.withParameters(params)
					.runProgram("IDCAMS")
				})
		}
	}
}
