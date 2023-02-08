package com.jafa.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jafa.config.RootConfig;
import com.jafa.config.ServletConfig;
import com.jafa.config.mybatis.MybatisConfig4;
import com.jafa.domain.BoardVO;
import com.jafa.mapper.BoardRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class, MybatisConfig4.class})
@WebAppConfiguration
public class Config4 {
	
	@Autowired
	BoardRepository boardRepository;

	@Test
	public void test() {
		BoardVO vo = boardRepository.findByBno(1L);
		System.out.println(vo);
		
	}
	

}
