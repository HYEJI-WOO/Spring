package com.jafa.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	private IMemberDao iMemberDao; 
	
	@Autowired
	public void setMemberDao(IMemberDao iMemberDao) {
		this.iMemberDao = iMemberDao;
	}

	public void register() {
		iMemberDao.insert();
	}
}
