package aws.bluage.l3.workshop.spring;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;

public class PlaceholderPropertiesFactoryBean extends PropertiesFactoryBean {
	private static final String START_CONST = "${";
	private static final String END_CONST = "}";
	private static final int MAX_COUNTER = 9;

	// Logger declaration.
	private static final Logger LOGGER = LoggerFactory.getLogger(PlaceholderPropertiesFactoryBean.class );

	/*
	 * (non-Javadoc)
	 * @see org.springframework.core.io.support.PropertiesLoaderSupport#mergeProperties()
	 */
	protected Properties mergeProperties() throws IOException {
		final Properties props = super.mergeProperties();
		resolve(props);
		return props;
	}

	/**
	 * Resolves properties usages in properties values.
	 * Nested properties are not supported (ie : a=${b.${c}})
	 * @param props the properties to resolve
	 */
	private void resolve(final Properties props) {
		for (Map.Entry<Object, Object> property : props.entrySet()) {
			String value = (String) property.getValue();
			if (value != null) {
				int start = value.indexOf(START_CONST);
				int counter = 0;
				while (start > -1 && counter < MAX_COUNTER) {
					int index = 0;
					final int end = value.indexOf(END_CONST, start);
					if (end != -1) {
						final String constName = value.substring(start + 2, end);
						final String constValue = props.getProperty(constName);
						if (constValue != null) {
							value = value.replace(START_CONST + constName + END_CONST, constValue);
							index = start;
						} else {
							LOGGER.warn("No value found for key: ["+constName+"], nested properties are not supported.");
							index = end;
						}
					}
					start = value.indexOf(START_CONST, index);
					counter++;
				}
				if (counter == MAX_COUNTER) {
					LOGGER.error("Error while handling placeholders, please verify that there are no cross referenced properties (like a=${b} and b=${a})");
				}
			}
			property.setValue(value);
		}
	}
}
