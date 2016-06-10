package com.wangyin.service;

import java.util.List;

import com.wangyin.domain.User;

public interface IUserService {
	void addUser(User user);
	User getUserById(String userId);
	List<User> getAllUsers();
}
