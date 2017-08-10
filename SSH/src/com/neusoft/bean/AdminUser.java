package com.neusoft.bean;

public class AdminUser {
	private int id;
	private String username;
	private String password;
	private String loastLoginTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getLoastLoginTime() {
		return loastLoginTime;
	}
	public void setLoastLoginTime(String loastLoginTime) {
		this.loastLoginTime = loastLoginTime;
	}
}
