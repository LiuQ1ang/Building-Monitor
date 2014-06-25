package com.ca.pojo;

import org.nutz.dao.entity.annotation.*;

@Table("t_user")
public class User {
	@Id
	private Integer id;
	@Column
	private String username;
	@Column
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	public User() {
		
	}
	
	public User(String username,String password) {
		this.username = username;
		this.password = password;
	}
}
