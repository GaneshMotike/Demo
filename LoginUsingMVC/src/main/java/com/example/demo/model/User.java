package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private String userid;
	private String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	
	

}
