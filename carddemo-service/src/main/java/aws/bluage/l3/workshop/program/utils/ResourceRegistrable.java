package aws.bluage.l3.workshop.program.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Abstract mother class for registrable resources.
 */
public abstract class ResourceRegistrable {

	/**
	 * The Constant logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceRegistrable.class);
	
	/*
	 * Prefix of system property name for the folder containing resource.
	 */
	private static final String PREFIX_PATH_PROPERTY = "configuration.";

	private final String resourceType;
	private final String resourceDescription;
	private final String resourceFilesPathTemplate;
	private boolean removeAllExtensions = true;

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private ResourceConfiguration configuration;

	/*
	 * Loaded resources.
	 */
	private Map<String, Resource> registeredResources = new HashMap<>();

	/**
	 * Register resource, given its identifier and the corresponding file.
	 * @param identifier the identifier
	 * @param file the file
	 */
	public abstract void registerResource(String identifier, File file);

	/**
	 * Unregister resource, given its identifier and the corresponding file.
	 * @param identifier the identifier
	 * @param file the file
	 */
	public abstract void unregisterResource(String identifier, File file);

	/**
	 * Instantiates a new resourceRegistrable.
	 * @param resourceType the resource type
	 * @param resourceDescription the resource description
	 * @param resourceFilesPathTemplate the resource files path template
	 */ 
	public ResourceRegistrable(String resourceType, String resourceDescription, String resourceFilesPathTemplate) {
		this.resourceType = resourceType;
		this.resourceDescription = resourceDescription;
		this.resourceFilesPathTemplate = resourceFilesPathTemplate;
	}

	/**
	 * Instantiates a new resourceRegistrable.
	 * @param resourceType the resource type
	 * @param resourceDescription the resource description
	 * @param resourceFilesPathTemplate the resource files path template
	 * @param removeAllExtensions remove all extensions flag
	 */
	public ResourceRegistrable(String resourceType, String resourceDescription, String resourceFilesPathTemplate,
			boolean removeAllExtensions) {
		this(resourceType, resourceDescription, resourceFilesPathTemplate);
		this.removeAllExtensions = removeAllExtensions;
	}

	/**
	 * Gets the resource type.
	 * @return the resource type
	 */
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * Gets the resource description.
	 * @return the resource description
	 */
	public String getResourceDescription() {
		return resourceDescription;
	}

	/**
	 * Gets the resource file path template.
	 * @return the resource file path template
	 */
	public String getResourceFilesPathTemplate() {
		return resourceFilesPathTemplate;
	}
	
	/**
	 * Gets the registered resources.
	 * @return the registered resources
	 */
	public Map<String, Resource> getRegisteredResources() {
		return registeredResources;
	}
	
	/**
	 * Register resources from configured path.
	 */
	public void register() {
		List<Resource> resources = findResources();
		if (resources == null || resources.isEmpty()) {
			LOGGER.info("No {} detected.", resourceDescription);
		} else {
			for (Resource resource : resources) {
				register(resource);
			}
		}
	}
	
	/**
	 * Register resource.
	 */
	public void register(Resource resource) {
		File file;
		try {
			file = resource.getFile();
			String identifier = file.getName();
			while (!FilenameUtils.getExtension(identifier).isEmpty()) {
				identifier = FilenameUtils.removeExtension(identifier);
				if (!removeAllExtensions) {
					break;
				}
			}
			registerResource(identifier, file);
			registeredResources.put(identifier, resource);
		} catch (IOException e) {
			LOGGER.error("The file resource {} cannot be resolved. {} registration failed.", resource.getFilename(), resource.getFilename());
			LOGGER.debug("IOException is ", e);
		}
	}
	
	/**
	 * Unregister registered resources.
	 */
	public void unregister() {
		for (Entry<String, Resource> entry : registeredResources.entrySet()) {
			try {
				unregisterResource(entry.getKey(), entry.getValue().getFile());
			} catch (IOException e) {
				String identifier = entry.getKey();
				LOGGER.warn("The file resource {} cannot be resolved. {} unregistration failed.", identifier, identifier);
				LOGGER.debug("IOException is ", e);
			}
		}
	}
	
	/**
	 * Find resources successively from <li>specified system property</li><li>working directory</li><li>classpath</li>.
	 * @return the list of registered resources.
	 */
	private List<Resource> findResources() {

		List<Resource> resources;
		String specificResourceProperty = PREFIX_PATH_PROPERTY + resourceType;
		String resourcesPath = System.getProperty(specificResourceProperty);
		if (resourcesPath != null) {
			LOGGER.info("The parameter \"-D{}\" is set to {}. Looking for {} ...", specificResourceProperty,
					resourcesPath, resourceDescription);
			resources = getResources(reworkPath(resourcesPath));
			if (resources != null && !resources.isEmpty()) {
				return resources;
			}
		} else {
			LOGGER.info("The parameter \"-D{}\" is not set.", specificResourceProperty);
		}
		
		// Allow not only system properties -Dconfiguration.xxx but also yml properties configuration.xxx
		resourcesPath = configuration.getConfiguration().get(resourceType);
		if (resourcesPath != null) {
			LOGGER.info("The yml property \"{}\" is set to {}. Looking for {} ...", specificResourceProperty,
					resourcesPath, resourceDescription);
			resources = getResources(reworkPath(resourcesPath));
			if (resources != null && !resources.isEmpty()) {
				return resources;
			}
		} else {
			LOGGER.info("The yml property \"{}\" is not set.", specificResourceProperty);
		}

		LOGGER.info("Looking for {} in the working directory...", specificResourceProperty);
		resources = getResources("file:." + resourceFilesPathTemplate);
		if (resources != null && !resources.isEmpty()) {
			return resources;
		}

		LOGGER.info("Looking for {} in the classpath...", specificResourceProperty);
		return getResources("classpath:" + resourceFilesPathTemplate);
	}

	/**
	 * Transforms the path supplied by the user into a pattern that fetches files with the correct extension in the supplied folder.
	 * @param path the user-supplied path
	 * @return the reworked pattern
	 */
	private String reworkPath(String path) {
		String result = path.replace("\\", "/");
		if (!path.startsWith("file:") && !path.startsWith("classpath:")) {
			result = "file:" + result;
		}
		if (!result.contains("*")) {
			if (!result.endsWith("/")) {
				result = result + "/";
			}
			result = result + "**" + resourceFilesPathTemplate.substring(resourceFilesPathTemplate.lastIndexOf("/"));
		}
		return result;
	}

	/**
	 * Gets the resources from the location pattern to resolve.
	 * @param locationPattern the location pattern
	 * @return the resources at the given location
	 */
	private List<Resource> getResources(String locationPattern) {
		Resource[] resources = null;
		try {
			resources = applicationContext.getResources(locationPattern);
		} catch (IOException e) {
			LOGGER.debug("No resource found in " + locationPattern + ".", e);
		}
		return resources == null ? null : Arrays.asList(resources);
	}
}
