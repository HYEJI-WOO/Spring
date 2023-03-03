package com.jafa.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.AppTest;

public class BoardRepositoryTest extends AppTest {

	@Autowired
	BoardRepository boardRepository;
	
	@Test
	public void test() {
		System.out.println(boardRepository.boardList());
	}

}
