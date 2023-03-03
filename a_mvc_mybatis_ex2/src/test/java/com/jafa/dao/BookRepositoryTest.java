package com.jafa.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.AppTest;

public class BookRepositoryTest extends AppTest {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	public void test() {
		System.out.println(bookRepository.bookList());
	}

}
