package aws.bluage.l3.workshop.core.helper;

import aws.bluage.l3.workshop.core.exceptions.UnsupportedException;

/**
 * Technical Helper.
 */
public class BluageUtils {
	
	private static final String UNSUPPORTED = "UNSUPPORTED";

	/**
	 * No instance, static usage only. 
	 */
	private BluageUtils(){
		//No instance, static usage only.
	}

	 /**
	 * Make the actual execution flow fail on purpose, because an unsupported feature has been encountered.
	 * The implementation of this method should always throw a RuntimeException.
	 * @return no object should be returned, a RuntimeException should be thrown instead.
	 */
	public static <T> T fail(){
		throw new UnsupportedException (UNSUPPORTED);
	}
	
	 /**
	 * Make the actual execution flow fail on purpose, because an unsupported feature has been encountered.
	 * The implementation of this method should always throw a RuntimeException.
	 * @return nothing, a RuntimeException should be thrown instead.
	 */
	public static boolean unsupported(){
		throw new UnsupportedException (UNSUPPORTED);
	}

}
