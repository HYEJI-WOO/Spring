package com.jafa.example06;

import org.springframework.context.support.GenericXmlApplicationContext;

// xml에서 property 설정
public class UserPropertyByXML {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring-config/appConfig06.xml");
		JdbcConnector06 bean = ctx.getBean(JdbcConnector06.class);
		System.out.println(bean);
	}

}
