package aws.bluage.l3.workshop.cousr03c.business.context;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.ConfigurationBuilder;
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * Creates Datasimplifier configuration for the Cousr03cContext context.
 */
@org.springframework.context.annotation.Configuration
@Lazy
public class Cousr03cConfiguration {

	@Bean(name = "Cousr03cContextConfiguration")
	public Configuration configuration() {
		return new ConfigurationBuilder()
				.encoding(Charset.forName("CP1047"))
				.humanReadableEncoding(Charset.forName("ISO-8859-15"))
				.initDefaultByte(0)
				.build();
	}

}
