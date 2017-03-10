package cn.itcast.sh.service.impl;

import java.util.List;

import cn.itcast.sh.dao.admin.UserDao;
import cn.itcast.sh.entity.User;
import cn.itcast.sh.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private UserDao userDao;
	
	public List<User> getUser(){
		return userDao.find(User.class);
	}
	
	// Corresponds to p method under applicationContext.xml 
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
