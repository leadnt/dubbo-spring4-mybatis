package com.wangyin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wangyin.dao.UserMapper;
import com.wangyin.domain.User;
import com.wangyin.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		System.out.println("服务调用");
		return userMapper.selectAllUsers();
	}

	
	
}
