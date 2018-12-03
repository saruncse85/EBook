package com.ebook.britannica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ebook.britannica.beans.PublishURLS;
import com.ebook.britannica.util.EbookUtility;

@SpringBootApplication
public class EBookApplication {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(EBookApplication.class);
	
	public static PublishURLS urls = null;
	
	public static String sourceFile = "";

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(EBookApplication.class, args);
		if(args.length == 2) {
			sourceFile = args[1];
		} else {
			sourceFile = "britannica_topics.xml";
		}
		urls = EbookUtility.getPublishURLS();
		LOGGER.info("Loaded XML into the context");
	}
}
