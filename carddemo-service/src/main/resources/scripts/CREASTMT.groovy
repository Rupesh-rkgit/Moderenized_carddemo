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
	def jobName = "CREASTMT"
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
	// This JCL will create statement for each CARD present in the XREF
	// file
	//*****************************************************************
	lastProgramResult = stepDELDEF01(shell, params, programResults)
	//********************************************************************
	// CREATE COPY OF TRANSACT FILE WITH CARD NUMBER AND TRAN ID AS KEY
	//********************************************************************
	lastProgramResult = stepSTEP010(shell, params, programResults)
	lastProgramResult = stepSTEP020(shell, params, programResults)
	//********************************************************************
	// DELETE TRANSACTION REPORTS FROM PREVIOUS RUN
	//********************************************************************
	lastProgramResult = stepSTEP030(shell, params, programResults)
	//********************************************************************
	// PRODUCING REPORT IN TEXT AND HTML - DEMONSTRATES CALLED SUBROUTINE
	//********************************************************************
	lastProgramResult = stepSTEP040(shell, params, programResults)
	displayEndJob(jobName)
	return programResults.get("GroovyExecutionResult")
}
//*********************************************************************
//*                            STEPS                                  *
//*********************************************************************
// STEP DELDEF01 - PGM - IDCAMS***************************************************
def stepDELDEF01(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("DELDEF01", "IDCAMS", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.systemOut("SYSPRINT")
						.output("*")
						.build()
						.fileSystem("SYSIN")
						.stream(
"""  DELETE    AWS.M2.CARDDEMO.TRXFL.SEQ
  DELETE    AWS.M2.CARDDEMO.TRXFL.VSAM.KSDS                     -
            CLUSTER
  SET       MAXCC = 0
  DEFINE    CLUSTER  (NAME(AWS.M2.CARDDEMO.TRXFL.VSAM.KSDS)     -
                      KEYS(32 0)                                -
                      VOLUMES(TSU023)                           -
                      RECORDSIZE(350 350)                       -
                      SHAREOPTIONS(2 3)                         -
                      ERASE                                     -
                      INDEXED                                   -
                      CYL(1 5))                                 -
            DATA      (NAME(AWS.M2.CARDDEMO.TRXFL.DATA)         -
                      CISZ(4096))                               -
            INDEX     (NAME(AWS.M2.CARDDEMO.TRXFL.INDEX))""", getEncoding())
						.build()
						.getFileConfigurations())
					.withParameters(params)
					.runProgram("IDCAMS")
				})
		}
	}
}
// STEP STEP010 - PGM - SORT******************************************************
def stepSTEP010(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("STEP010", "SORT", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.bluesam("SORTIN")
						.dataset("AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS")
						.disposition("SHR")
						.build()
						.systemOut("SYSPRINT")
						.output("*")
						.build()
						.systemOut("SYSOUT")
						.output("*")
						.build()
						.bluesam("SORTOUT")
						.dataset("AWS.M2.CARDDEMO.TRXFL.SEQ")
						.disposition("NEW")
						.normalTermination("CATLG")
						.abnormalTermination("DELETE")
						.build()
						.fileSystem("SYSIN")
						.stream(
"""  SORT FIELDS=(263,16,CH,A,1,16,CH,A)
  OUTREC FIELDS=(1:263,16,17:1,262,279:279,50)""", getEncoding())
						.build()
						.getFileConfigurations())
					.withParameters(params)
					.runProgram("SORT")
				})
		}
	}
}
// STEP STEP020 - PGM - IDCAMS****************************************************
def stepSTEP020(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			if (checkAllPreviousProgramResults(programResults, 'NE', 0)) {
				return execStep("STEP020", "IDCAMS", programResults, {
					mpr
						.withFileConfigurations(new FileConfigurationUtils()
							.withJobContext(jobContext)
							.systemOut("SYSPRINT")
							.output("*")
							.build()
							.bluesam("INFILE")
							.dataset("AWS.M2.CARDDEMO.TRXFL.SEQ")
							.disposition("SHR")
							.build()
							.bluesam("OUTFILE")
							.dataset("AWS.M2.CARDDEMO.TRXFL.VSAM.KSDS")
							.disposition("SHR")
							.build()
							.fileSystem("SYSIN")
							.stream("  REPRO INFILE(INFILE) OUTFILE(OUTFILE)", getEncoding())
							.build()
							.getFileConfigurations())
						.withParameters(params)
						.runProgram("IDCAMS")
					})
			}
		}
	}
}
// STEP STEP030 - PGM - IEFBR14***************************************************
def stepSTEP030(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			if (checkAllPreviousProgramResults(programResults, 'NE', 0)) {
				return execStep("STEP030", "IEFBR14", programResults, {
					mpr
						.withFileConfigurations(new FileConfigurationUtils()
							.withJobContext(jobContext)
							.bluesam("HTMLFILE")
							.dataset("AWS.M2.CARDDEMO.STATEMNT.HTML")
							.disposition("MOD")
							.normalTermination("DELETE")
							.abnormalTermination("DELETE")
							.build()
							.bluesam("STMTFILE")
							.dataset("AWS.M2.CARDDEMO.STATEMNT.PS")
							.disposition("MOD")
							.normalTermination("DELETE")
							.abnormalTermination("DELETE")
							.build()
							.getFileConfigurations())
						.withParameters(params)
						.runProgram("IEFBR14")
					})
			}
		}
	}
}
// STEP STEP040 - PGM - CBSTM03A**************************************************
def stepSTEP040(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			if (checkAllPreviousProgramResults(programResults, 'NE', 0)) {
				return execStep("STEP040", "CBSTM03A", programResults, {
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
							.bluesam("TRNXFILE")
							.dataset("AWS.M2.CARDDEMO.TRXFL.VSAM.KSDS")
							.disposition("SHR")
							.build()
							.bluesam("XREFFILE")
							.dataset("AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS")
							.disposition("SHR")
							.build()
							.bluesam("ACCTFILE")
							.dataset("AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS")
							.disposition("SHR")
							.build()
							.bluesam("CUSTFILE")
							.dataset("AWS.M2.CARDDEMO.CUSTDATA.VSAM.KSDS")
							.disposition("SHR")
							.build()
							.bluesam("STMTFILE")
							.dataset("AWS.M2.CARDDEMO.STATEMNT.PS")
							.disposition("NEW")
							.normalTermination("CATLG")
							.abnormalTermination("DELETE")
							.build()
							.bluesam("HTMLFILE")
							.dataset("AWS.M2.CARDDEMO.STATEMNT.HTML")
							.disposition("NEW")
							.normalTermination("CATLG")
							.abnormalTermination("DELETE")
							.build()
							.getFileConfigurations())
						.withParameters(params)
						.runProgram("CBSTM03A")
					})
			}
		}
	}
}
