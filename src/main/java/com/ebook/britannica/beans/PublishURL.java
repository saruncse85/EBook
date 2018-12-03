package com.ebook.britannica.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="url-publish")
//@XmlType(name="", propOrder= {"topicid","error","cause","urltitle","urlclass"})
public class PublishURL {
	
	private long topicId;
	
	private String urltitle;
	
	private String urlClass;

	private String error;
	
	private String cause;
	
	@XmlElement(name="topicid")
	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}
	
	@XmlElement(name="urltitle")
	public String getUrltitle() {
		return urltitle;
	}

	public void setUrltitle(String urltitle) {
		this.urltitle = urltitle;
	}

	@XmlElement(name="urlclass")
	public String getUrlClass() {
		return urlClass;
	}

	public void setUrlClass(String urlClass) {
		this.urlClass = urlClass;
	}
	
	@XmlElement(name="error")
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@XmlElement(name="cause")
	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

}
