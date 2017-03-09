package cn.itcast.sh.service;

import java.util.List;

import cn.itcast.sh.entity.User;

/**
 * AdminService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2016-2-22 下午5:21:09
 * @version 1.0
 */
public interface AdminService {
	/**
	 * 查询所有的用户
	 * @return
	 */
	List<User> getUser();

}
