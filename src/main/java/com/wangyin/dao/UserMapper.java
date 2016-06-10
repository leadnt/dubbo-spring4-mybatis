package com.wangyin.dao;

import java.util.List;

import com.wangyin.domain.User;

public interface UserMapper {

    int insert(User record);

    User selectByPrimaryKey(String userId);

	List<User> selectAllUsers();
}
