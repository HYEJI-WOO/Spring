package com.jafa.mybatis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jafa.dao.MemberDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring-config/root-context.xml",
		"classpath:spring-config/servlet-context.xml",
		"classpath:spring-config/mybatis/mybatis-config1.xml",
})
@WebAppConfiguration
public class Config1 {

	@Autowired
	MemberDao memberDao;
	
	@Test
	public void test() {
		System.out.println(memberDao.findByMno(1L));
	}

}
 