package com.jafa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jafa.domain.BoardVO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardDaoImpl implements BoardDao {
	
	SqlSession sqlSession;

	@Override
	public List<BoardVO> findByWriter(String writer) {
		List<BoardVO> list = sqlSession.selectList("com.jafa.dao.BoardDao.findByWriter", writer);
		return list;
	}

}
