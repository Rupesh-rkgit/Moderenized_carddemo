package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.rt.provider.MessageRegistry;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/** Load JSON representations of messages (as extracted by Analyzer) */
@Component
public class MessageLoader extends ResourceRegistrable {

	/**
	 * Instantiates a new message loader.
	 */
	public MessageLoader() {
		super("msgFileLib", "Predefined Messages", "/config/msgFileLib/**/*.properties", false);
	}

	/**
	 * The Constant logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageLoader.class);

	/**
	 * The Constant MESSAGE_DIR_NAME.
	 */
	private static final String MESSAGE_DIR_NAME = "messages";
	
	/**
	 * The resources loaded indicator.
	 */
	private boolean resourcesLoaded = false;
	
	@Autowired
	private ApplicationContext applicationContext;

	/** Search for /messages/** / *.properties files */
	@PostConstruct
	public void registerMessages() throws IOException {

		Resource[] resources;
		try {
			resources = applicationContext.getResources("classpath:/" + MESSAGE_DIR_NAME + "/**/*.properties");
			resourcesLoaded = true;
		} catch (FileNotFoundException e) {
			LOGGER.info("No messages folder; nothing to load");
			return;
		}

		for (Resource resource : resources) {
			try (InputStream is = resource.getInputStream()) {

				// Read and parse resource
				Reader data = new InputStreamReader(is, Charset.forName("UTF-8"));
				Properties prop = new Properties();
				prop.load(data);

				// Add to the registry
				MessageRegistry.register(resource, MESSAGE_DIR_NAME, prop);

			} catch (Exception e) {
				// Do not halt loader
				LOGGER.error("Error while loading message file " + resource.getFilename(), e);
			}
		}
	}

	/**
	 * Unregister all messages previously added.
	 */
	@PreDestroy
	public void unregisterMessages() {
		MessageRegistry.cleanRegistry();
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		// Nothing to do here for now.
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		if(!resourcesLoaded) {
			try (InputStream is = new FileInputStream(file)) {
				
				// Read and parse resource
				Reader data = new InputStreamReader(is, Charset.forName("UTF-8"));
				Properties prop = new Properties();
				prop.load(data);

				// Add to the registry
				MessageRegistry.register(identifier, prop);
			} catch (Exception e) {
				// Do not halt loader
				LOGGER.error("Error while loading message file " + file.getName(), e);
			}
		}
	}
}
