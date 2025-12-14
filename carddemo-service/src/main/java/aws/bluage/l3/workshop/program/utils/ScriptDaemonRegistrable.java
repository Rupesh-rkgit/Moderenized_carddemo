package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.rt.provider.ScriptRegistry;
import java.io.File;
import org.springframework.stereotype.Component;

/**
 * Script daemon registrable.
 */
@Component
public class ScriptDaemonRegistrable extends ResourceRegistrable {
	
	/**
	 * Instantiates a new script daemon registrable.
	 */
	public ScriptDaemonRegistrable() {
		super("daemons", "daemon scripts", "/daemons/**/*.groovy");
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
