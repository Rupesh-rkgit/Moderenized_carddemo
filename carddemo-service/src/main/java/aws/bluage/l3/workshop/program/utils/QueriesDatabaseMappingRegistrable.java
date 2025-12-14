package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.rt.provider.SqlRegistry;
import java.io.File;
import org.springframework.stereotype.Component;

/**
 * Queries database mappings resource registrable.
 */
@Component
public class QueriesDatabaseMappingRegistrable extends ResourceRegistrable {
	
	/**
	 * Instantiates a new Queries database mappings resource registrable.
	 */
	public QueriesDatabaseMappingRegistrable() {
		super("databaseMapping", "Queries Database mapping file", "/sql/**/queries-database.mapping");
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		SqlRegistry.unregisterQueriesDatabaseMappingFile(identifier, file);
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		SqlRegistry.registerQueriesDatabaseMappingFile(identifier, file);
	}
}
