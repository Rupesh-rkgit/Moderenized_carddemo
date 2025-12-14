package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.rt.provider.ScriptRegistry;
import java.io.File;
import org.springframework.stereotype.Component;

/**
 * Groovy Script registrable.
 */
@Component
public class GroovyScriptRegistrable extends ResourceRegistrable {
	
	/**
	 * Instantiates a new groovy script registrable.
	 */
	public GroovyScriptRegistrable() {
		super("scripts", "groovy scripts", "/scripts/**/*.groovy");
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		ScriptRegistry.unregisterScript(identifier, file);
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		ScriptRegistry.registerScript(identifier, file);
	}
}
