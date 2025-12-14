package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.rt.provider.LnkRegistry;
import java.io.File;
import org.springframework.stereotype.Component;

/**
 * Lnk json resource registrable.
 */
@Component
public class LnkJsonResourceRegistrable extends ResourceRegistrable {
	
	/**
	 * Instantiates a new lnk json resource registrable.
	 */
	public LnkJsonResourceRegistrable() {
		super("lnk", "lnk files", "/lnk/*.json");
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		LnkRegistry.unregisterLnkFile(identifier, file);
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		LnkRegistry.registerLnkFile(identifier, file);
	}
}
