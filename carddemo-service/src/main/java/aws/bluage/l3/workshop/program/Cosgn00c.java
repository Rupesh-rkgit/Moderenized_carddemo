package aws.bluage.l3.workshop.program;

import aws.bluage.l3.workshop.SpringBootLauncher;
import aws.bluage.l3.workshop.cosgn00c.business.context.Cosgn00cContext;
import aws.bluage.l3.workshop.cosgn00c.service.Cosgn00cProcess;
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
 * Reference the spring application of program COSGN00C.
 *  Provides an access to the contained program for the run unit.
 */
@Component
@Import({
	aws.bluage.l3.workshop.cosgn00c.business.context.Cosgn00cConfiguration.class,
	aws.bluage.l3.workshop.cosgn00c.business.context.Cosgn00cContext.class,
	aws.bluage.l3.workshop.cosgn00c.service.impl.Cosgn00cProcessImpl.class
})
public class Cosgn00c implements Program {
	/**
	 * Unique identifiers for the contained program.
	 */
	private static final Set<String> programIdentifiers = Collections.unmodifiableSet(Stream.of("COSGN00C").collect(Collectors.toSet()));

	/**
	 * Main program identifier for the contained program.
	 */
	private static final String programIdentifier = "COSGN00C";
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
		aws.bluage.l3.workshop.cosgn00c.business.context.Cosgn00cContext.class,
		beanFactory);
	}
	
	/**
	 * Service used by the program runner.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.cosgn00c.service.Cosgn00cProcess")
	private Cosgn00cProcess instanceCosgn00cProcess;
	
	@Override
	public void run(ExecutionController ctrl) {
		instanceCosgn00cProcess.mainPara((Cosgn00cContext) getContext(), ctrl);
	}	

}
