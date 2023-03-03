package com.jafa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.jafa.domain.BookVO;

public interface BookRepository {

	@Insert("insert into book_mybatis values(bookId_seq_mybatis.nextval, #{title}, #{writer})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	void addBook(BookVO vo);
	
	@Select("select * from book_mybatis")
	List<BookVO> bookList();
	
}
