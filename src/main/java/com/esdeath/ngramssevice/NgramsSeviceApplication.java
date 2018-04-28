package com.esdeath.ngramssevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NgramsSeviceApplication {

	//public static Logger logger;
	public static void main(String[] args) {
//		logger = LoggerFactory.getLogger(NgramsSeviceApplication.class);
////		logger.info("Log4j2 successfully running!");
		SpringApplication.run(NgramsSeviceApplication.class, args);
	}

}
