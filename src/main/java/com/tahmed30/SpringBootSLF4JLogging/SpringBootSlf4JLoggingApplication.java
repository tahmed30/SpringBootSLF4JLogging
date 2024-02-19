package com.tahmed30.SpringBootSLF4JLogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static com.tahmed30.SpringBootSLF4JLogging.ColoredSLF4J.log;

@SpringBootApplication
public class SpringBootSlf4JLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSlf4JLoggingApplication.class, args);
		log(ColoredSLF4J.LogLevel.INFO, "This is a sample code for colored log with log level INFO");
		log(ColoredSLF4J.LogLevel.WARN, "This is a sample code for colored log with log level WARN");
		log(ColoredSLF4J.LogLevel.TRACE, "This is a sample code for colored log with log level TRACE");
		log(ColoredSLF4J.LogLevel.DEBUG, "This is a sample code for colored log with log level DEBUG");
		log(ColoredSLF4J.LogLevel.ERROR, "This is a sample code for colored log with log level ERROR");
	}

}
