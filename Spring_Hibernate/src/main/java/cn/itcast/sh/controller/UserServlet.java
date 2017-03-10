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

// Visit http://localhost:8080/Spring_Hibernate/selectUser.action
@WebServlet("/selectUser.action")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtain the spring container.
		WebApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(this.getServletContext()); 
		// Get the bean.
		AdminService adminService = applicationContext.getBean("adminService", AdminService.class);
		System.out.println(adminService);
		List<User> users = adminService.getUser();
		System.out.println(users);
	}
}
