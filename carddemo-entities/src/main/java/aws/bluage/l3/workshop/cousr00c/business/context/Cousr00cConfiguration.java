package aws.bluage.l3.workshop.cousr00c.business.context;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.ConfigurationBuilder;
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * Creates Datasimplifier configuration for the Cousr00cContext context.
 */
@org.springframework.context.annotation.Configuration
@Lazy
public class Cousr00cConfiguration {

	@Bean(name = "Cousr00cContextConfiguration")
	public Configuration configuration() {
		return new ConfigurationBuilder()
				.encoding(Charset.forName("CP1047"))
				.humanReadableEncoding(Charset.forName("ISO-8859-15"))
				.initDefaultByte(0)
				.build();
	}

}
