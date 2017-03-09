package cn.itcast.sh.service.impl;

import java.util.List;

import cn.itcast.sh.dao.admin.UserDao;
import cn.itcast.sh.entity.User;
import cn.itcast.sh.service.AdminService;

/**
 * AdminServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2016-2-22 下午5:21:30
 * @version 1.0
 */
public class AdminServiceImpl implements AdminService {
	private UserDao userDao;
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	public List<User> getUser(){
		return userDao.find(User.class);
	}
	
	/** setter注入 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
