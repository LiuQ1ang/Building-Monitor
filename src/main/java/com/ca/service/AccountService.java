package com.ca.service;

import java.util.List;

import com.ca.pojo.User;

/**
 * @author liuzhilong<alexmaven@icloud.com>
 */
public interface AccountService {
	public boolean login(User user);
	public User SelUserByUser(User user);
	public User SelUserById(int id);
	public List<User> SelUserByName(String name);
	public void InsUserByUser(User user);
}
