package com.jafa.mybatis;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jafa.dao.BookRepository;
import com.jafa.domain.BookVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring-config/root-context.xml",
		"classpath:spring-config/servlet-context.xml",
		"classpath:spring-config/mybatis/mybatis-config4.xml",
})
@WebAppConfiguration
public class Config3 {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	public void test() {
		List<BookVO> bookList = bookRepository.bookList();
		System.out.println(bookList);
	}
	
	@Test
	@Ignore
	public void test2() {
		BookVO vo = BookVO.builder()
				.title("스프링4")
				.writer("홍길동").build();
		System.out.println("데이터 삽입 전 : " + vo);
		bookRepository.addBook(vo);
		System.out.println("데이터 삽입 후 : " + vo);
	}

}
 