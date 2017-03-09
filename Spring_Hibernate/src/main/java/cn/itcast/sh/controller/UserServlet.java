package cn.itcast.sh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.itcast.sh.entity.User;
import cn.itcast.sh.service.AdminService;

/**
 * UserServlet
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2016-2-22 下午5:22:35
 * @version 1.0
 */
@WebServlet("/selectUser.action")
public class UserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/** 获取Spring容器 */
		WebApplicationContext wac = WebApplicationContextUtils
				.getWebApplicationContext(this.getServletContext()); 
		/** 获取业务层的Bean */
		AdminService adminService = wac.getBean("adminService", AdminService.class);
		System.out.println(adminService);
		List<User> users = adminService.getUser();
		System.out.println(users);
	}
}
