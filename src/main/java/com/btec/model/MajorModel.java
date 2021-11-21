package com.btec.model;

public class MajorModel extends AbstractModel<MajorModel>{
	private Long majorId;
	private String majorName;
	private String majorDesc;
	public Long getMajorId() {
		return majorId;
	}
	public void setMajorId(Long majorId) {
		this.majorId = majorId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getMajorDesc() {
		return majorDesc;
	}
	public void setMajorDesc(String majorDesc) {
		this.majorDesc = majorDesc;
	}
	
}
