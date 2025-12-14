package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.runtime.report.ReportRegistry;
import java.io.File;
import org.springframework.stereotype.Component;

/**
 * jasper resource registrable.
 */
@Component
public class JasperResourceRegistrable extends ResourceRegistrable {
	
	/**
	 * Instantiates a new jasper resource registrable.
	 */
	public JasperResourceRegistrable() {
		super("templates", "Jasper resource files", "/templates/**/*.jrxml");
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		ReportRegistry.unregisterJasperFile(identifier, file);
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		ReportRegistry.registerJasperFile(identifier, file);
	}
}
