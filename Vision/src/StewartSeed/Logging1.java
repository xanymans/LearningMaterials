package StewartSeed;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.*;


public class Logging1 {

	static Logger log = Logger.getLogger(Logging1.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		log.info("This message is a info");
		runMethod();
		log.debug("This message is a debug");
	}

	public static void runMethod() {
		log.info("This info message is from runMethod");
	}
}
