package com.ebook.britannica.doa.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ebook.britannica.EBookApplication;
import com.ebook.britannica.beans.PublishURL;
import com.ebook.britannica.beans.PublishURLS;
import com.ebook.britannica.doa.TopicDAO;
import com.ebook.britannica.util.EbookUtility;

@Repository
public class TopicDAOImpl implements TopicDAO {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(TopicDAOImpl.class);
	
	@Override
	public PublishURLS getClassBasedURL(String className) {
		
		PublishURLS urls = EBookApplication.urls;
		
		Stream<PublishURL> publishUrls = urls.getPublishURLList().stream();
		Stream<PublishURL> filteredUrls = publishUrls.filter(url -> className.equalsIgnoreCase(url.getUrlClass()));
		
		PublishURLS obj = null;
		List<PublishURL> list = filteredUrls.collect(Collectors.toList());
		if(list.size() > 0) {
			LOGGER.info("Class found");
			obj = new PublishURLS();
			obj.setPublishURLList(list);
		} else {
			LOGGER.info("Class Not found ");
			obj = new PublishURLS();
		}
		return obj;
	}
	
	@Override
	public PublishURL getTopicBasedURL(long topicId) {
		PublishURLS urls = EBookApplication.urls;
		
		Stream<PublishURL> publishUrls = urls.getPublishURLList().stream();
		Stream<PublishURL> filteredUrls = publishUrls.filter(url -> url.getTopicId() == topicId);
		
		PublishURL obj = null;
		List<PublishURL> list = filteredUrls.collect(Collectors.toList());
		if(list.size() > 0) {
			LOGGER.info("Topic found ");
			obj = list.get(0);
		} else {
			LOGGER.info("Topic Not found ");
			obj = new PublishURL();
			obj.setTopicId(topicId);
			obj.setError("URL Not Found");
			obj.setCause("topic "+topicId+" not in database");
		}
		return obj;
	}
	
	@Override
	public PublishURLS getAllTopics(String topic) {
		PublishURLS urls = new PublishURLS();
		if("topic".equalsIgnoreCase(topic)) {
			urls = EBookApplication.urls;
		}
		return urls;
	}
}

