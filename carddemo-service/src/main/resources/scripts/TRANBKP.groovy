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
	def jobName = "TRANBKP"
	mpr.setJobContext(jobContext)
	displayStartJob(jobName)
	Map programResults = jobContext.getProgramResults().clone()
	def lastProgramResult
	//-------> TO DO ID : JOBLIB [Line : 18] *****************************************
	// ******************************************************************* 
	// Repro the processed transaction file                                
	// ******************************************************************* 
	stepSTEP05R(shell, jobName, params, programResults)
	// ******************************************************************* 
	// DELETE TRANSACATION MASTER VSAM FILE IF ONE ALREADY EXISTS          
	// ******************************************************************* 
	lastProgramResult = stepSTEP05(shell, params, programResults)
	//                                                                     
	// ******************************************************************* 
	// DEFINE TRANSACATION MASTER VSAM FILE                                
	// ******************************************************************* 
	lastProgramResult = stepSTEP10(shell, params, programResults)
	displayEndJob(jobName)
	return programResults.get("GroovyExecutionResult")
}
//*********************************************************************
//*                            STEPS                                  *
//*********************************************************************
// STEP STEP05R - PROC - REPROC***************************************************
def stepSTEP05R(Object shell, String jobName, Map params, Map programResults) {
	shell.with{
		if (checkValidProgramResults(programResults)) {
			def stepName = 'STEP05R'
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
// STEP STEP05 - PGM - IDCAMS*****************************************************
def stepSTEP05(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			return execStep("STEP05", "IDCAMS", programResults, {
				mpr
					.withFileConfigurations(new FileConfigurationUtils()
						.withJobContext(jobContext)
						.systemOut("SYSPRINT")
						.output("*")
						.build()
						.fileSystem("SYSIN")
						.stream(
"""   DELETE AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS -                                  
          CLUSTER                                                               
   IF MAXCC LE 08 THEN SET MAXCC = 0                                            
   DELETE AWS.M2.CARDDEMO.TRANSACT.VSAM.AIX -                                   
          ALTERNATEINDEX                                                        
   IF MAXCC LE 08 THEN SET MAXCC = 0                                            """, getEncoding())
						.build()
						.getFileConfigurations())
					.withParameters(params)
					.runProgram("IDCAMS")
				})
		}
	}
}
// STEP STEP10 - PGM - IDCAMS*****************************************************
def stepSTEP10(Object shell, Map params, Map programResults){
	shell.with {
		if (checkValidProgramResults(programResults)) {
			if (checkAllPreviousProgramResults(programResults, 'LT', 4)) {
				return execStep("STEP10", "IDCAMS", programResults, {
					mpr
						.withFileConfigurations(new FileConfigurationUtils()
							.withJobContext(jobContext)
							.systemOut("SYSPRINT")
							.output("*")
							.build()
							.fileSystem("SYSIN")
							.stream(
"""   DEFINE CLUSTER (NAME(AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS) -                   
          CYLINDERS(1 5) -                                                      
          VOLUMES(AWSHJ1 -                                                      
          ) -                                                                   
          KEYS(16 0) -                                                          
          RECORDSIZE(350 350) -                                                 
          SHAREOPTIONS(2 3) -                                 
          ERASE -                                                               
          INDEXED -                                                             
          ) -                                                                   
          DATA (NAME(AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS.DATA) -                 
          ) -                                                                   
          INDEX (NAME(AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS.INDEX) -               
          )                                                                     """, getEncoding())
							.build()
							.getFileConfigurations())
						.withParameters(params)
						.runProgram("IDCAMS")
					})
			}
		}
	}
}
