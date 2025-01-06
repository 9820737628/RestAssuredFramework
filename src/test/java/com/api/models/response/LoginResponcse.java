package com.api.models.response;

import java.util.List;

public class LoginResponcse {

	private String token;
	private String type;
	private int id;
	private String username;
	private String email;
	private List<String> roles;
	
	
	public LoginResponcse() {
		
	};
	public LoginResponcse(String token, String tyep, int id, String username, String email, List<String> roles) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "LoginResponcse [token=" + token + ", tyep=" + type + ", id=" + id + ", username=" + username
				+ ", email=" + email + ", roles=" + roles + "]";
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTyep() {
		return type;
	}
	public void setType(String tyep) {
		this.type = type;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	
	
	
}
