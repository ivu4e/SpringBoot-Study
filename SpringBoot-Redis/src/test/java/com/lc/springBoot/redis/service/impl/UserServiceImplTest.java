package com.lc.springBoot.redis.service.impl;

import com.BaseTest;
import com.lc.springBoot.redis.model.User;
import com.lc.springBoot.redis.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author lengchuan <lishuijun1992@gmail.com>
 * @date 17-5-8
 */
public class UserServiceImplTest extends BaseTest {
	@Test
	public void getUser() throws Exception {
		System.out.println(userService.getUser(1));
	}

	@Autowired
	private UserService userService;

	@Test
	public void createUser() throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("test1");
		user.setEmail("test@test.com");
		userService.createUser(user);
	}


}