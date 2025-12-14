package aws.bluage.l3.workshop;

import aws.bluage.l3.workshop.core.helper.ConfigurationHelper;
import aws.bluage.l3.workshop.program.utils.SpringBootApplicationBanner;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.netfective.bluage.gapwalk.io.support.FileConfigurationUtils;
import com.netfective.bluage.gapwalk.rt.context.ApplicationContextRegistry;
import com.netfective.bluage.gapwalk.rt.context.ProgramContextStore;
import com.netfective.bluage.gapwalk.rt.io.support.FileConfiguration;
import com.netfective.bluage.gapwalk.rt.jics.JicsParameters;
import com.netfective.bluage.gapwalk.rt.provider.CustomComponentsURLRegistry;
import com.netfective.bluage.gapwalk.rt.provider.ProgramContainer;
import com.netfective.bluage.gapwalk.rt.provider.ProgramRegistry;
import com.netfective.bluage.gapwalk.rt.provider.ServiceContainer;
import com.netfective.bluage.gapwalk.rt.provider.ServiceRegistry;
import com.netfective.bluage.gapwalk.rt.shared.AwsClientSecretsListener;
import jakarta.transaction.TransactionManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
/**
 * SpringBoot web application launcher.
 * Entry point for Tomcat deployment and programs/services/scripts registration.
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"aws.bluage.l3.workshop.program", "aws.bluage.l3.workshop.core","com.netfective.bluage.gapwalk.io.support"
})
@EnableConfigurationProperties
public class SpringBootLauncher extends SpringBootServletInitializer implements WebApplicationInitializer {
	// Logger declaration.
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLauncher.class );

	/**
	 * The spring web application context. The parent context of all sub programs.
	 */
	private static ConfigurableApplicationContext applicationContext;

	@Autowired
	BeanFactory beanFactory;
	
	/**
	 * Flag to enable warmup of the pre construct of contexts.
	 */
	@Value("${context.warmup.enabled:false}")
	private boolean contextWarmupEnabled;


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		Charset charset = Charset.forName("CP1047");
		JicsParameters.setGlobalCharset(charset);
		return application.banner(new SpringBootApplicationBanner("carddemo")).profiles("carddemo").sources(SpringBootLauncher.class).listeners(new AwsClientSecretsListener());
	}

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		applicationContext = application.run();
		return (WebApplicationContext) applicationContext;
	}
	
	/**
	 * Get spring web application context.
	 * @return the spring web application context
	 */
	public static ConfigurableApplicationContext getCac() {
		return applicationContext;
	}
	
	/**
	 * Setup default file configurations.
	 * @param configurationHelper the configuration helper
	 * @return file configurations
	 */
	@Bean
	public Map<String, FileConfiguration> fileConfigurations(ConfigurationHelper configurationHelper) {
		return new FileConfigurationUtils().createFileConfigurationFromMap(configurationHelper.getFilesConfiguration()).getFileConfigurations();
	}


	/**
	 * Setup a datasource.
	 * Will be shared with sub programs and used by modernized ExecSQL statements.
	 * @return a datasource
	 */
	@Bean
	public DataSource primaryDataSource() {
		return (new JndiDataSourceLookup()).getDataSource("java:comp/env/jdbc/primary");
	}

	/**
	 * The user transaction manager setup to handle ExecSQL statements.
	 * @return the user transaction manager
	 */
	@Bean
	public TransactionManager transactionManager() {
		return new UserTransactionManager();
	}
		
	/**
	 * The transaction manager setup to handle ExecSQL statements.
	 * @return the platform transaction manager
	 */
	@Bean
	public PlatformTransactionManager platformTransactionManager(DataSource primaryDataSource) {
		return new JtaTransactionManager(transactionManager());
	}
	
	
	
	
	/**
	 * Initialization method called when the spring application is ready.
	 * Register all programs and services to the gapwalk shared context.
	 * @param event the application ready event
	 */
	@EventListener
	public void initialize(ApplicationReadyEvent event) {
		Map<String, ProgramContainer> programContainers = event.getApplicationContext().getBeansOfType(ProgramContainer.class);
		programContainers.values().forEach(ProgramRegistry::registerProgram);
		Map<String, ServiceContainer> serviceContainers = event.getApplicationContext().getBeansOfType(ServiceContainer.class);
		serviceContainers.values().forEach(ServiceRegistry::registerService);
		
		if (contextWarmupEnabled) {
			ProgramContextStore.preloadAllContexts(event.getApplicationContext(), beanFactory);
		}
		
		enlistCustomJars(event);
		
		// register the current context
		ApplicationContext context = event.getApplicationContext();
		ApplicationContextRegistry.registerContext(ApplicationContextRegistry.SERVICE, context);
		
	}
	
	
    private void enlistCustomJars(ApplicationReadyEvent event) {
		try {
			File folder = event.getApplicationContext().getResource("/WEB-INF/lib").getFile();
			File[] customJars = folder.listFiles(j -> j.getName().endsWith(".jar"));
			if(customJars != null && customJars.length > 0) {
				for (File customJar : customJars) {
					LOGGER.info("Adding {} to groovy classpath", customJar.toURI().toURL());
					CustomComponentsURLRegistry.addURL(customJar.toURI().toURL());
				}
			}
		} catch (IOException ioe) {
			LOGGER.error("Unable to enlist custom jars", ioe);
		}
	}
}
