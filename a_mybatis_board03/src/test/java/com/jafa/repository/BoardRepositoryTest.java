package com.jafa.repository;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.AppTest;
import com.jafa.domain.BoardVO;

public class BoardRepositoryTest extends AppTest{

	@Autowired
	BoardRepository repository;
	
	@Test
	@Ignore
	public void findAllTest() {
		
	}
	
	
}
