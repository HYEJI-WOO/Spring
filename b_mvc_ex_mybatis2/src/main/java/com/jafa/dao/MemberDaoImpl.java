package com.jafa.dao;

import org.apache.ibatis.session.SqlSession;

import com.jafa.domain.MemberVO;

public class MemberDaoImpl implements MemberDao {

	SqlSession sqlSession;
	
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public MemberVO findByMno(Long mno) {
		return sqlSession.selectOne("org.mybatis.example.MemberDao.selectAll", mno);
	}

}
