package aws.bluage.l3.workshop.program;

import aws.bluage.l3.workshop.SpringBootLauncher;
import aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext;
import aws.bluage.l3.workshop.cbstm03a.service.Cbstm03aProcess;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.context.Context;
import com.netfective.bluage.gapwalk.rt.context.ProgramContextStore;
import com.netfective.bluage.gapwalk.rt.provider.Program;
import com.netfective.bluage.gapwalk.rt.shared.ExecutionContext;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.sql.DataSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Reference the spring application of program CBSTM03A.
 *  Provides an access to the contained program for the run unit.
 */
@Component
@Import({
	aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aConfiguration.class,
	aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext.class,
	aws.bluage.l3.workshop.cbstm03a.service.impl.Cbstm03aProcessImpl.class
})
public class Cbstm03a implements Program {
	/**
	 * Unique identifiers for the contained program.
	 */
	private static final Set<String> programIdentifiers = Collections.unmodifiableSet(Stream.of("CBSTM03A").collect(Collectors.toSet()));

	/**
	 * Main program identifier for the contained program.
	 */
	private static final String programIdentifier = "CBSTM03A";
	@Autowired
	PlatformTransactionManager transactionManager;
	
	@Autowired
	Map<String, DataSource> datasources;
	@Autowired
	BeanFactory beanFactory;
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigurableApplicationContext getSpringApplication() {
		return SpringBootLauncher.getCac();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void updateExecutionContext(ExecutionContext executionContext) {
		executionContext.setDatasources(datasources);
		executionContext.setDatabaseSupport(ExecutionContext.DatabaseSupport.POSTGRE);
		executionContext.setSqlcaVersion(ExecutionContext.SqlcaVersion.getEnum("ansi-comp5"));
		executionContext.setTransactionManager(transactionManager);
		executionContext.setUseSQLDateNewParadigm(true);
		executionContext.setUseSQLTrimStringType(false);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<String> getProgramIdentifiers() {
		return programIdentifiers;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getProgramMainIdentifier() {
		return programIdentifier;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public Context getContext() {
		return ProgramContextStore.getOrCreate(
		getProgramMainIdentifier(),
		aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext.class,
		beanFactory);
	}
	
	/**
	 * Service used by the program runner.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.cbstm03a.service.Cbstm03aProcess")
	private Cbstm03aProcess instanceCbstm03aProcess;
	
	@Override
	public void run(ExecutionController ctrl) {
		instanceCbstm03aProcess.cbstm03a((Cbstm03aContext) getContext(), ctrl);
	}	

}
