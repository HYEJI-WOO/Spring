package com.jafa.repository;

import java.util.List;

import com.jafa.domain.ToDoDTO;
import com.jafa.domain.ToDoVO;

public interface ToDoRepository {
	
	List<ToDoVO> selectAllByMonth(String date);
	
	void save(ToDoDTO toDoDto);
}
