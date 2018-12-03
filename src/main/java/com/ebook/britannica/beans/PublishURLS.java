package com.ebook.britannica.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="publish-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class PublishURLS {
	
//	@XmlElementWrapper(name="publish-list")
	@XmlElement(name="url-publish")
	private List<PublishURL> publishURLList;

	public List<PublishURL> getPublishURLList() {
		return publishURLList;
	}

//	@XmlElement(name="url-publish")
	public void setPublishURLList(List<PublishURL> publishURLList) {
		this.publishURLList = publishURLList;
	}
	
	

}
