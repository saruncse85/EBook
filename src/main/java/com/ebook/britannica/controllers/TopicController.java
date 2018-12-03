package com.ebook.britannica.controllers;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ebook.britannica.beans.PublishURL;
import com.ebook.britannica.beans.PublishURLS;
import com.ebook.britannica.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	private 
	@RequestMapping(value="eb/topic/{topic_id}",method=RequestMethod.GET)
	@Produces({MediaType.APPLICATION_XML})
	PublishURL getPublishURL(@PathVariable("topic_id") long topic_id) {
		PublishURL urlObj = null;
		urlObj = topicService.getTopicBasedURL(topic_id);
		
		return urlObj;
	}
	
	private 
	@RequestMapping(value="eb/class/{class-name}",method=RequestMethod.GET)
	PublishURLS getPublishURLForClass(@PathVariable("class-name") String className) {
		PublishURLS classURL = topicService.getClassBasedURL(className);
		return classURL;
	}
	
	private 
	@RequestMapping(value="eb/all/{topic}", method=RequestMethod.GET)
	PublishURLS getPublishURLForAllTopics(@PathVariable("topic") String topic) {
		PublishURLS classURL = topicService.getAllTopics(topic);
		return classURL;
	}
}
