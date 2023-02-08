package com.jafa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Criteria {
	private int pageNum;
	private int amount = 10;
	
	public Criteria() {
		this(1,10);
	}
	

}
