package com.btec.model;

public class ContentModel extends AbstractModel<ContentModel> {
	private Long contentId;
	private String link;
	public Long getContentId() {
		return contentId;
	}
	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}
