package com.icai.service;

import java.util.List;

import com.icai.pojo.User;

public interface UserService {
	/**
	 * 对于用户的增删改查
	 */
	void addUser(User user);

	/**
	 * 根据Id删除用户信息
	 * 
	 * @param userId
	 */
	void deleteUserById(String userId);

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> findUserAll();
	/**
	 * 查询某个用户信息
	 * @param userId
	 * @return
	 */
	User findUserById(String userId);
	
}
