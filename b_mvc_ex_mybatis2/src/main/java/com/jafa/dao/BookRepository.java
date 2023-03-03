package com.jafa.dao;

import java.util.List;

import com.jafa.domain.BookVO;

public interface BookRepository {
	void addBook(BookVO vo);
	
	List<BookVO> bookList();
}
