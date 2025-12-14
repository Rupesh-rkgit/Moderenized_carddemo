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
binding.setVariable("fcmap", fcmap)
def shell = new GroovyShell(binding).parse(ScriptRegistry.getScript("functions"))
//*********************************************************************
//*                             PROC                                  *
//*********************************************************************
shell.with {
	def procName = "REPROC"
	mpr.setJobContext(jobContext)
	def jobName = "" + jobContext.getJobName() + "-" + procName
	displayStartProc(procName)
	mpr.withSchenv(jobContext.getSchenv())
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
	// Unload the processed transaction file                               
	// ******************************************************************* 
	stepSTEP01R(shell, jobName, params, programResults)
	// ******************************************************************* 
	// Filter the transactions for a the parm date and sort by card num    
	// ******************************************************************* 
	lastProgramResult = stepSTEP05R(shell, params, programResults)
	// ******************************************************************* 
	// Produce a formatted report for processed transactions               
	// ******************************************************************* 
	lastProgramResult = stepSTEP10R(shell, params, programResults)
	displayEndProc(procName)
	return programResults
}
//*********************************************************************
//*                            STEPS                                  *
//*********************************************************************
// STEP STEP01R - PROC - REPROC***************************************************
def stepSTEP01R(Object shell, String jobName, Map params, Map programResults) {
	shell.with{
		if (checkValidProgramResults(programResults)) {
			def stepName = 'STEP01R'
			execStepSimple(stepName, programResults, {
				def procName = 'REPROC'
				TreeMap mapTransfo = params["MapTransfo"]
				mapTransfo['CNTLLIB'] = 'AWS.M2.CARDDEMO.CNTL'
				Map<String,FileConfiguration> fcmap = new FileConfigurationUtils()
				.withJobContext(jobContext)
				.bluesam("PRC001.FILEIN")
				.dataset("AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS")
				.disposition("SHR")
				.build()
				.gdgSupport("PRC001.FILEOUT")
				.name("AWS.M2.CARDDEMO.TRANSACT.BKUP").ownerPath(".").relativeGeneration(1).storageProvider("filesystem").recordSize(350)
				.disposition("NEW")
				.normalTermination("CATLG")
				.abnormalTermination("DELETE")
				.build()
				.getFileConfigurations();
				File procFile = ScriptRegistry.getScript(procName);
				File resolvedProcFile = buildResolvedFile(jobName,stepName,procName)
				GroovyUtils.processGroovyParams(procFile, resolvedProcFile, mapTransfo, programResults)
				return execGroovy(applicationContext, mapTransfo, resolvedProcFile, jobContext, fcmap)
			})
		}
	}
}
// STEP STEP05R - PGM - SORT******************************************************
def stepSTEP05R(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("STEP05R", "SORT", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.gdgSupport("SORTIN")
						.name("AWS.M2.CARDDEMO.TRANSACT.BKUP").ownerPath(".").relativeGeneration(1).storageProvider("filesystem")
						.disposition("SHR")
						.build()
						.fileSystem("SYSIN")
						.stream(
""" SORT FIELDS=(263,16,ZD,A)                                                  
                                         """, getEncoding())
						.build()
						.systemOut("SYSOUT")
						.output("*")
						.build()
						.gdgSupport("SORTOUT")
						.name("AWS.M2.CARDDEMO.TRANSACT.DALY").ownerPath(".").relativeGeneration(1).storageProvider("filesystem")
						.disposition("NEW")
						.normalTermination("CATLG")
						.abnormalTermination("DELETE")
						.dcbParameters("*.SORTIN")
						.build()
						.getFileConfigurations(fcmap))
					.withParameters(params)
					.runProgram("SORT")
				})
		}
	}
}
// STEP STEP10R - PGM - CBTRN03C**************************************************
def stepSTEP10R(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("STEP10R", "CBTRN03C", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.bluesam("STEPLIB")
						.dataset("AWS.M2.CARDDEMO.LOADLIB")
						.disposition("SHR")
						.build()
						.systemOut("SYSOUT")
						.output("*")
						.build()
						.systemOut("SYSPRINT")
						.output("*")
						.build()
						.gdgSupport("TRANFILE")
						.name("AWS.M2.CARDDEMO.TRANSACT.DALY").ownerPath(".").relativeGeneration(1).storageProvider("filesystem")
						.disposition("SHR")
						.build()
						.bluesam("CARDXREF")
						.dataset("AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.bluesam("TRANTYPE")
						.dataset("AWS.M2.CARDDEMO.TRANTYPE.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.bluesam("TRANCATG")
						.dataset("AWS.M2.CARDDEMO.TRANCATG.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.bluesam("DATEPARM")
						.dataset("AWS.M2.CARDDEMO.DATEPARM")
						.disposition("SHR")
						.build()
						.gdgSupport("TRANREPT")
						.name("AWS.M2.CARDDEMO.TRANREPT").ownerPath(".").relativeGeneration(1).storageProvider("filesystem").recordSize(133)
						.disposition("NEW")
						.normalTermination("CATLG")
						.abnormalTermination("DELETE")
						.build()
						.getFileConfigurations(fcmap))
					.withParameters(params)
					.runProgram("CBTRN03C")
				})
		}
	}
}
