package com.btec.dto;

public class SubAsmDTO extends AbstractDTO<SubAsmDTO> {
	private Long subAsmId;
	private String fileName;
	private String comment;
	private int status;
	private int grade;
	private Long asmId;
	private String username;
	public Long getSubAsmId() {
		return subAsmId;
	}
	public void setSubAsmId(Long subAsmId) {
		this.subAsmId = subAsmId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Long getAsmId() {
		return asmId;
	}
	public void setAsmId(Long asmId) {
		this.asmId = asmId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
