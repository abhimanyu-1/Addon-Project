package com.bean.model;

import com.controller.*;

public class Register {

	private int id;
	private String name;
	private String email;
	private String department;
	private String username;
	private String password;
	
	public Register() 
	{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		return "Register [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", username=" + username + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
	
	
	
	
}
