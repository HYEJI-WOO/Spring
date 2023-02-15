package com.jafa.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jafa.domain.DateVO;
import com.jafa.domain.ToDoDTO;
import com.jafa.domain.ToDoVO;
import com.jafa.repository.ToDoRepository;
import com.jafa.util.CalendarUtil;

@Controller
@RequestMapping("/todo")
public class ToDoController {
	
	@Autowired
	ToDoRepository toDoRepository;
	
	@GetMapping("/{year}/{month}")
	public String list(Model model, @PathVariable Integer month, @PathVariable Integer year) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		List<ToDoVO> todoList = toDoRepository.selectAllByMonth(sdf.format(cal.getTime()));
		System.out.println(todoList);
		
		List<DateVO> dateList = CalendarUtil.getDate(year, month-1);
		for(ToDoVO toDo : todoList) {
			String toDoDate = sdf.format(toDo.getToDoDate());
			for(DateVO vo : dateList) {
				if(toDoDate.equals(vo.toString())) {
					vo.setToDoList(toDo);
				}
			}
		}
		
//		for(DateVO dateVO : dateList) {
//			System.out.println(dateVO.getToDoList());
//		}
		
		model.addAttribute("dateList", dateList);
		return "cal/list";
	}
	
	@PostMapping("/toDoWrite")
	public String toDoWrite(ToDoDTO toDoDto) {
		toDoRepository.save(toDoDto);
		String year = toDoDto.getToDoDate().substring(0,4);
		String month = toDoDto.getToDoDate().substring(4,6);
		return "redirect:/todo/"+year+"/"+month;
	}
}
