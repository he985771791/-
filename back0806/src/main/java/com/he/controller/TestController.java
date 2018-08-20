package com.he.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.he.pojo.Permission;
import com.he.pojo.User;
import com.he.pojo.UserExample;
import com.he.pojo.UserExample.Criteria;
import com.he.service.permission.PermissionServiceI;
import com.he.service.user.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestController {
	@Autowired
	UserServiceI userService;
	@Autowired
	PermissionServiceI permissionServiceI;
	@Test
	public void test() {
		/*User user = new User();
		user.setPageNo(1);
		user.setPageSize(10);
		UserExample example=new UserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserAccountLike("%1%");
		List<User> users = userService.getUsers(example, user);
		for (User user2 : users) {
			System.out.println(user2.getUserAccount());
		}*/
		Permission permission=new Permission();
		permission.setPageNo(2);
		permission.setPageSize(5);
		List<Permission> permissions = permissionServiceI.getPermissions(null, permission);
		for (Permission permission2 : permissions) {
			System.out.println(permission2.getPermissionName());
		}
	}
}
