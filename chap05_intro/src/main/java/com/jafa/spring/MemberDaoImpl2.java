package com.jafa.spring;

import org.springframework.stereotype.Component;

@Component("memberDao2")
public class MemberDaoImpl2 implements IMemberDao{
	
	public void insert() {
		System.out.println("memberDao2");
		System.out.println("회원가입");
	}
}