package aws.bluage.l3.workshop.core.helper;

import aws.bluage.l3.workshop.core.exceptions.ConfigurationException;
import jakarta.annotation.PostConstruct;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

/**
 * Helper class used for loading the configuration from file.
 */
@Component
public class ConfigurationHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationHelper.class);

	private static final String PATH_PROPERTY = "configuration.file";
	private static final String FILES = "files";
	private static final String PROGRAMS = "programs";
	private static final String DATASOURCES = "datasources";


	/**
	 * A static factory for creating ConfigurationHolder bean in order to break
	 * the cyclic dependency between ConfigurationHelper and ConfigurationHolder 
	 * when injecting configurationHolder
	 */
	@Bean
	public static ConfigurationHolder getConfigurationHolder(){
		return new ConfigurationHolder();
	}
	
	@Autowired
	ConfigurationHolder configurationHolder;

	@Value("ds-config.yml")
	private final String filename;
	
	/**
	 * Constructor that loads the configuration file named "ds-config.yml".
	 */
	public ConfigurationHelper() {
		this("ds-config.yml");
	}

	/**
	 * Constructor that loads the configuration file with the specified name.
	 * @param filename the name of the configuration file
	 */
	public ConfigurationHelper(String filename) {
		this.filename = filename;
	}
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	private void buildConfiguration() {
		try (BufferedInputStream br = new BufferedInputStream(getConfigurationInputStream(filename))) {
			this.configurationHolder.getConfiguration().putAll((Map<String, Object>) new Yaml().load(br));
		} catch (IOException e) {
			throw new ConfigurationException("Error while loading configuration.", e);
		}
	}
	
	/**
	 * Gets files configurations.
	 * @return files configurations
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> getFilesConfiguration() {
		return (Map<String, Object>) this.configurationHolder.getConfiguration().get(FILES);
	}

	/**
	 * Gets the file configuration for the provided id.
	 * @param id the file identifier
	 * @return the file configuration if it exists. null otherwise.
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> getFileConfiguration(String id) {
		Map<String, Object> files = (Map<String, Object>) this.configurationHolder.getConfiguration().get(FILES);
		return files == null ? null : (Map<String, Object>) files.get(id);
	}
	
	/**
	 * Get the datasource configurations for the given program id.
	 * 
	 * @param id
	 *            the program id
	 * @return the list of datasource configurations
	 */
	public List<DatasourceConfiguration> getDatasourceConfiguration(String id) {
		List<DatasourceConfiguration> selectedDatasourceConfigurations = this.configurationHolder.getDatasourceConfigurations().get(id);
		if (selectedDatasourceConfigurations == null) {
			selectedDatasourceConfigurations = createDatasourceConfiguration(id);
			this.configurationHolder.getDatasourceConfigurations().put(id, selectedDatasourceConfigurations);
		}
		return selectedDatasourceConfigurations;
	}

	@SuppressWarnings("unchecked")
	private List<DatasourceConfiguration> createDatasourceConfiguration(String id) {
		List<DatasourceConfiguration> datasourcesConfigurations = new ArrayList<>();
		Map<String, Object> programs = (Map<String, Object>) this.configurationHolder.getConfiguration().get(PROGRAMS);
		if (programs != null) {
			Map<String, Object> targetProgram = (Map<String, Object>) programs.get(id);
			if (targetProgram != null) {
				List<Map<String, Object>> programDatasources = (List<Map<String, Object>>) targetProgram.get(DATASOURCES);
				if(programDatasources != null) {
					programDatasources.forEach(d -> datasourcesConfigurations.add(new DatasourceConfiguration(d)));
				} else {
					LOGGER.error("The program with id {} has an empty 'datasource' tag in the ds-config.yml.",id);
				}
			} else {
				LOGGER.debug("No program description for the program {} in the ds-config.yml.",id);
			}
		} else {
			LOGGER.warn("The tag 'programs:' is missing from the ds-config.yml");
		}
		return datasourcesConfigurations;
	}

	private InputStream getConfigurationInputStream(String filename) {
		if (System.getProperty(PATH_PROPERTY) != null) {
			LOGGER.warn(MessageFormat.format("Property {0} is deprecated; ignored", PATH_PROPERTY));
		}

		// First, search for the file in the working directory and its parents
		File configFile = getConfigurationFile(filename);
		if (configFile != null) {
			try {
				return new FileInputStream(configFile);
			} catch (FileNotFoundException e) {
				// this should not happen since getConfigurationFile checks
				// if the file exists
				LOGGER.error("Error while loading file " + configFile.getAbsolutePath(), e);
			}
		}

		// Then, search in the classpath
		try {
			return new ClassPathResource(filename).getInputStream();
		} catch (IOException e) {
			// We didn't find any configuration file, fail early
			throw new ConfigurationException("Error while loading configuration from classpath.", e);
		}
	}

	private File getConfigurationFile(String filename) {
		File folder = Paths.get("").toAbsolutePath().toFile();
		while (folder != null) {
			File configFile = new File(folder, filename);
			if (configFile.exists()) {
				return configFile;
			}
			folder = folder.getParentFile();
		}
		return null;
	}
	
	/**
	 * Utility bean carrying program datasources information.
	 */
	public class DatasourceConfiguration {

		private String name;
		private String url;
		private String urlSuffix;
		private String driver;

		/**
		 * Default constructor
		 * 
		 * @param content
		 *            the map extracted from the yml configuration, containing
		 *            datasource information
		 */
		private DatasourceConfiguration(Map<String, Object> content) {

			Object oName = content.get("name");
			if (oName != null && !(oName instanceof String)) {
				LOGGER.error("A datasource name must be either null or a string.");
			} else {
				this.name = oName == null ? "" : (String) oName;
			}

			Object oUrl = content.get("url");
			if (oUrl != null && oUrl instanceof String && !((String) oUrl).isEmpty()) {
				this.url = (String) oUrl;
			} else {
				LOGGER.error("A datasource url described in the ds-config.yml file cannot be null and must be a non-empty string.");
			}

			Object oUrlSuffix = content.get("urlSuffix");
			if (oUrlSuffix != null) {
				if (oUrlSuffix instanceof String) {
					this.urlSuffix = (String) oUrlSuffix;
				} else {
					LOGGER.error("A datasource suffix must be a string");
				}
			}

			Object oDriver = content.get("driver");
			if (oDriver != null && oDriver instanceof String && !((String) oDriver).isEmpty()) {
				this.driver = (String) oDriver;
			} else {
				LOGGER.error("A datasource driver described in the ds-config.yml file cannot be null and must be a non-empty string.");
			}
		}

		public String getUrl() {
			return url;
		}

		public String getDriver() {
			return driver;
		}

		public String getUrlSuffix() {
			return urlSuffix;
		}

		public String getName() {
			return name;
		}
	}
	
	/**
	 * Configuration Holder.
	 */
	private static class ConfigurationHolder {
		
		private final Map<String, Object> configuration = new HashMap<>();
		
		private final Map<String, List<DatasourceConfiguration>> datasourceConfigurations = new HashMap<>();

		/**
	 * Gets the configuration.
	 * @return the configuration
	 */
		public Map<String, Object> getConfiguration() {
			return configuration;
		}

		/**
	 * Gets the datasource configurations.
	 * @return the datasource configurations
	 */
		public Map<String, List<DatasourceConfiguration>> getDatasourceConfigurations() {
			return datasourceConfigurations;
		}
	}
}
