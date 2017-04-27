package StewartSeedTestCase1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	
	private static final Logger log = LogManager.getLogger(Logging.class.getName());

	public static void main(String[] args) {
		log.trace("Trace Message Logged");
		log.debug("Debug Message Logged");
		log.info("Info Message Logged");
		log.error("Error Message Logged");
		log.fatal("Fatal Message Logged");
	}
}
