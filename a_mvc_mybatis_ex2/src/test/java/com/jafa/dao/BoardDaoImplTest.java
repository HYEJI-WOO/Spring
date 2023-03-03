package com.jafa.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.AppTest;

public class BoardDaoImplTest extends AppTest {
	
	@Autowired
	BoardDao boardDao;
	
	@Test
	public void test() {
		System.out.println(boardDao.findByWriter("관리자"));
	}

}
