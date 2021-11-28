package com.btec.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	@Id
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "phone")
	private String phone;

	@Column(name = "fullName")
	private String fullName;

	@Column(name = "email")
	private String email;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "status")
	private Integer status;

	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	private List<RoleEntity> roles = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_class", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "classId"))
	@JsonBackReference
	private List<ClassEntity> classUser = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<SubasmEntity> subasmuser = new ArrayList<>();
		
	public List<ClassEntity> getClassUser() {
		return classUser;
	}

	public void setClassUser(List<ClassEntity> classUser) {
		this.classUser = classUser;
	}

	public List<SubasmEntity> getSubasmuser() {
		return subasmuser;
	}

	public void setSubasmuser(List<SubasmEntity> subasmuser) {
		this.subasmuser = subasmuser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

}
