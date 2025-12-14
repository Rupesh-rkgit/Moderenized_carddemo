package aws.bluage.l3.workshop.cbstm03a.business.context;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.ConfigurationBuilder;
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * Creates Datasimplifier configuration for the Cbstm03aContext context.
 */
@org.springframework.context.annotation.Configuration
@Lazy
public class Cbstm03aConfiguration {

	@Bean(name = "Cbstm03aContextConfiguration")
	public Configuration configuration() {
		return new ConfigurationBuilder()
				.encoding(Charset.forName("CP1047"))
				.humanReadableEncoding(Charset.forName("ISO-8859-15"))
				.initDefaultByte(0)
				.build();
	}

}
