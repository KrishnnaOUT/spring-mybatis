package com.facebank.springbootmybatis;

import com.facebank.springbootmybatis.domain.User;
import com.facebank.springbootmybatis.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {

		User user = new User();
		user.setName("thisName");
		user.setAge(19);
		userMapper.saveUser(user);
		List<User> list = userMapper.findByName("thisName");
		System.out.println(list.size());
		Assert.assertEquals("thisName", list.get(0).getName());
	}

}
