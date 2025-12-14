package aws.bluage.l3.workshop.program.utils;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Load resources into the container resource registry.
 */
@Component
public class ResourcesLoader {

	@Autowired	
	GroovyScriptRegistrable scriptsGroovyResourceRegistrable;
	
	@Autowired
	SqlResourceRegistrable sqlResourceRegistrable;
	
	@Autowired
	ScriptDaemonRegistrable scriptsDaemonsResourceRegistrable;
	
	@Autowired
	QueriesDatabaseMappingRegistrable queriesDatabaseMappingResourceRegistrable;
	
	@Autowired
	JasperResourceRegistrable jasperResourceRegistrable;
	
	@Autowired
	DatasetCatalogRegistrable datasetCatalog;
	
	@Autowired
	LnkJsonResourceRegistrable lnkResourceRegistrable;
		
	@Autowired
	MessageLoader messageLoader;
		
	@PostConstruct
	public void registerResources() {		
		scriptsGroovyResourceRegistrable.register();
		sqlResourceRegistrable.register();
		scriptsDaemonsResourceRegistrable.register();
		queriesDatabaseMappingResourceRegistrable.register();
		jasperResourceRegistrable.register();
		datasetCatalog.register();
		lnkResourceRegistrable.register();
		messageLoader.register();
	}
	
	/**
	 * Unregister all resources previously added.
	 */	 
	@PreDestroy
	public void unregisterResources() {
		scriptsGroovyResourceRegistrable.unregister();
		sqlResourceRegistrable.unregister();
		scriptsDaemonsResourceRegistrable.unregister();
		queriesDatabaseMappingResourceRegistrable.unregister();
		jasperResourceRegistrable.unregister();
		datasetCatalog.unregister();
		lnkResourceRegistrable.unregister();
		messageLoader.unregister();
	}
}


