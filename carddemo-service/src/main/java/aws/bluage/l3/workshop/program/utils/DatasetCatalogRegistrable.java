package aws.bluage.l3.workshop.program.utils;

import com.netfective.bluage.gapwalk.io.catalog.DatasetCatalog;
import java.io.File;
import org.springframework.stereotype.Component;

/**
 * Dataset catalog registrable.
 */
@Component
public class DatasetCatalogRegistrable extends ResourceRegistrable {
	
	/**
	 * Instantiates a new dataset catalog registrable.
	 */
	public DatasetCatalogRegistrable() {
		super("catalog", "Dataset Catalog", "/catalog/*.json", false);
	}
	
	/**
	 * Unregister resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void unregisterResource(String identifier, File file) {
		DatasetCatalog.unregisterDataset(identifier, file);
	}
	
	/**
	 * Register resource.
	 * @param identifier the identifier
	 * @param file the file
	 */
	@Override
	public void registerResource(String identifier, File file) {
		DatasetCatalog.registerDataset(identifier, file);
	}
}
