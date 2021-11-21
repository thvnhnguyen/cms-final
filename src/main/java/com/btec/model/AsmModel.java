package com.btec.model;

import java.sql.Timestamp;

public class AsmModel extends AbstractModel<AsmModel> {
	private Long asmId;
	private String asmName;
	private String asmBrief;
	private Timestamp asmDue;
	private Long limitItem;
	private String feedback;
	
	
	public void setAsmBrief(String asmBrief) {
		this.asmBrief = asmBrief;
	}
	public void setAsmDue(Timestamp asmDue) {
		this.asmDue = asmDue;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Long getAsmId() {
		return asmId;
	}
	public String getAsmName() {
		return asmName;
	}
	public void setAsmName(String asmName) {
		this.asmName = asmName;
	}
	public String getAsmBrief() {
		return asmBrief;
	}
	public void setBrief(String asmBrief) {
		this.asmBrief = asmBrief;
	}
	public Timestamp getAsmDue() {
		return asmDue;
	}
	public Long getLimitItem() {
		return limitItem;
	}
	public void setLimitItem(Long limitItem) {
		this.limitItem = limitItem;
	}

	public String getFeedback() {
		return feedback;
	}

}
