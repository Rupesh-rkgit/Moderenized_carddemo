package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.rt.provider.SqlRegistry;
import java.io.File;
import org.springframework.stereotype.Component;

/**
 * Sql resource registrable.
 */
@Component
public class SqlResourceRegistrable extends ResourceRegistrable {
	
	/**
	 * Instantiates a new sql resource registrable.
	 */
	public SqlResourceRegistrable() {
		super("sql", "SQL Queries files", "/sql/**/*.sql");
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		SqlRegistry.unregisterSQLQueryFile(identifier, file);
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		SqlRegistry.registerSQLQuery(identifier, file);
	}
}
