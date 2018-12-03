package com.ebook.britannica.service;

import com.ebook.britannica.beans.PublishURL;
import com.ebook.britannica.beans.PublishURLS;

public interface TopicService {

	public PublishURL getTopicBasedURL(long topicId);
	
	public PublishURLS getClassBasedURL(String className);
	
	public PublishURLS getAllTopics(String topic);
}
