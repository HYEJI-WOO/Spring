package com.jafa.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jafa.config.RootConfig;
import com.jafa.config.ServletConfig;
import com.jafa.config.mybatis.MybatisConfig5;
import com.jafa.domain.MemberVO;
import com.jafa.mapper.MemberMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class, MybatisConfig5.class})
@WebAppConfiguration
public class Config5 {
	
	@Autowired
	MemberMapper memberRepository;

	@Test
	public void test() {
		MemberVO vo = memberRepository.findByMno(1L);
		System.out.println(vo);
		
	}
	

}
