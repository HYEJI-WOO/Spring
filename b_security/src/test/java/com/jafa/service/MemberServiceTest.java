package com.jafa.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jafa.domain.AuthVO;
import com.jafa.domain.MemberType;
import com.jafa.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring-config/root-context.xml",
		"classpath:spring-config/security-context.xml",
		"classpath:spring-config/servlet-context.xml"
})
@WebAppConfiguration
public class MemberServiceTest {
	
	@Autowired
	MemberService memberService;

	// 회원가입
	@Test
	@Ignore
	public void test() {
		MemberVO vo = MemberVO.builder()
				.memberId("fefe")
				.password("1234")
				.email("fefe@naver.com")
				.build();
		memberService.join(vo);
	}
	
	// 회원등급변경
	@Test
	public void test2() { 
		memberService.updateMemberType(new AuthVO("admin", MemberType.ROLE_ADMIN));
	}

}
