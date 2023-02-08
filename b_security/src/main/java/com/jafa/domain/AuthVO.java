package com.jafa.domain;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthVO {
	private String memberId; 
	private MemberType memberType;
	private int ordinal;
	
	public AuthVO(String memberId, MemberType memberType) {
		this.memberId = memberId;
		this.memberType = memberType;
	}
}
