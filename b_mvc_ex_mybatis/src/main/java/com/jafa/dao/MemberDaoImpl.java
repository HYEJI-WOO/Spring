package com.jafa.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.jafa.domain.MemberVO;

public class MemberDaoImpl implements MemberDao {

	SqlSessionTemplate sessionTemplate;
	
	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	
	@Override
	public MemberVO findByMno(Long mno) {
		MemberVO vo = sessionTemplate.selectOne("com.jafa.dao.test.MemberDao.findByMno", mno);
		return vo;
	}

	
	

}
