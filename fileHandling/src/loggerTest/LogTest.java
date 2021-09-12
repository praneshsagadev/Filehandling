package loggerTest;


import org.apache.log4j.PropertyConfigurator;
import org.slf4j.*;

public class LogTest {
	
	public static Logger log = LoggerFactory.getLogger(LogTest.class);

	public static void main(String[] args) {
		
		
		PropertyConfigurator.configure("D:\\SELENIUM WORKSPACE\\fileHandling\\Referenced Libraries");
		
		log.info("this is an info message");
		log.debug("this is debug");
		

	}

}
