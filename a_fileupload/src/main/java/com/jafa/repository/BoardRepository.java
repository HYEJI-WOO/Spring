package com.jafa.repository;

import java.util.List;

import com.jafa.domain.BoardVO;

public interface BoardRepository {
	
	// 글목록
	List<BoardVO> list();
	
	//글쓰기
	void write(BoardVO vo);
	
	// 글상세
	BoardVO detail(Long bno);
	
	// 글삭제
	void remove(Long bno);
	
	// 글수정
	void modify(BoardVO vo);

}
