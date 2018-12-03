package com.ebook.britannica.doa;

import com.ebook.britannica.beans.PublishURL;
import com.ebook.britannica.beans.PublishURLS;

public interface TopicDAO {
	
	public PublishURL getTopicBasedURL(long topicId);
	
	public PublishURLS getClassBasedURL(String className);
	
	public PublishURLS getAllTopics(String topic);

}
