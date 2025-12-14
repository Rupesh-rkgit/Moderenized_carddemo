package aws.bluage.l3.workshop.core;

/**
 * Interface Abend.
 * 
 * Define abend operations.
 */
public interface Abend {

	/**
	 * Trigger an abend with an abend code
	 * @param abendCode the abend code
	 */
	void triggerAbend (int abendCode);
	
	/**
	 * Trigger an abend
	 */
	void triggerAbend ();
	
}