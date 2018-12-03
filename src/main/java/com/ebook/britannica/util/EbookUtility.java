package com.ebook.britannica.util;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import com.ebook.britannica.EBookApplication;
import com.ebook.britannica.beans.PublishURLS;

public class EbookUtility {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EbookUtility.class);
	
	public static PublishURLS getPublishURLS() {
		PublishURLS urls = null;
		
		File file;
		try {
			file = new ClassPathResource(EBookApplication.sourceFile).getFile();
			
			if(file.exists()) {
				LOGGER.info("XML File Exists");
				try {
					JAXBContext context = JAXBContext.newInstance(PublishURLS.class);
					Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
					urls = (PublishURLS)jaxbUnmarshaller.unmarshal(file);
				} catch (JAXBException e) {
					e.printStackTrace();
					LOGGER.error("Error occured while loading the xml file "+e.getMessage());
				}
			} else {
				LOGGER.error("XML File does not exists");
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
			LOGGER.error("Error occurred while accessing resource xml file "+e1.getMessage());
		}
		
		return urls;
	}
}
