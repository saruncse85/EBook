package com.ebook.britannica.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebook.britannica.beans.PublishURL;
import com.ebook.britannica.beans.PublishURLS;
import com.ebook.britannica.doa.TopicDAO;
import com.ebook.britannica.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDAO topicDAO;
	

	@Override
	public PublishURL getTopicBasedURL(long topicId) {
		return topicDAO.getTopicBasedURL(topicId);
	}

	@Override
	public PublishURLS getClassBasedURL(String className) {
		return topicDAO.getClassBasedURL(className);
	}
	
	@Override
	public PublishURLS getAllTopics(String topic) {
		return topicDAO.getAllTopics(topic);
	}

	
}
