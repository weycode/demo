package com.icai.service.impl;

import java.util.List;

import com.icai.dao.UserDao;
import com.icai.dao.impl.UserDaoImpl;
import com.icai.pojo.User;
import com.icai.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public void addUser(User user) {
		user.setId("1");
		System.out.println("业务的代码 添加数据 或者加入缓存 或者判断数据  程序员2");
		userDao.add(user);
	}

	@Override
	public void deleteUserById(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
