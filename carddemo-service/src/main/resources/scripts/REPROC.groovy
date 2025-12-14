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
	// REPRO UTILITY TO LOAD OR UNLOAD VSAM FILE                           
	// ******************************************************************* 
	lastProgramResult = stepPRC001(shell, params, programResults)
	displayEndProc(procName)
	return programResults
}
//*********************************************************************
//*                            STEPS                                  *
//*********************************************************************
// STEP PRC001 - PGM - IDCAMS*****************************************************
def stepPRC001(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("PRC001", "IDCAMS", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.systemOut("SYSPRINT")
						.output("*")
						.build()
						.bluesam("FILEIN")
						.dataset("NULLFILE")
						.disposition("SHR")
						.build()
						.bluesam("FILEOUT")
						.dataset("NULLFILE")
						.disposition("SHR")
						.build()
						.fileSystem("SYSIN")
						.path("&CNTLLIB(REPROCT)")
						.disposition("SHR")
						.build()
						.getFileConfigurations(fcmap))
					.withParameters(params)
					.runProgram("IDCAMS")
				})
		}
	}
}
