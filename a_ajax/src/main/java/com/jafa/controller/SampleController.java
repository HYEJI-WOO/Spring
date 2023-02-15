package com.jafa.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jafa.domain.SampleBean;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/sampleBean") 
	public ResponseEntity<SampleBean> getSampleBean() {
		SampleBean bean = new SampleBean(1L, "샘플1");
		return new ResponseEntity<SampleBean>(bean,HttpStatus.OK);
	}
	
	@GetMapping("/sampleBeanList") 
	public ResponseEntity<List<SampleBean>> getBeanList() {
		List<SampleBean> beanList = new ArrayList<SampleBean>();
		SampleBean bean1 = new SampleBean(1L, "샘플1");
		SampleBean bean2 = new SampleBean(2L, "샘플2");
		SampleBean bean3 = new SampleBean(3L, "샘플3");
		SampleBean bean4 = new SampleBean(4L, "샘플4");
		beanList.add(bean1);
		beanList.add(bean2);
		beanList.add(bean3);
		beanList.add(bean4);
		return new ResponseEntity<List<SampleBean>>(beanList,HttpStatus.OK);
	}
	
	@GetMapping("/sampleBeanMap")
	public Map<String, SampleBean> getBeanMap() {
		Map<String, SampleBean> map = new HashMap<String, SampleBean>();
		SampleBean bean1 = new SampleBean(1L, "샘플1");
		SampleBean bean2 = new SampleBean(2L, "샘플2");
		SampleBean bean3 = new SampleBean(3L, "샘플3");
		SampleBean bean4 = new SampleBean(4L, "샘플4");
		map.put("bean1", bean1);
		map.put("bean2", bean2);
		map.put("bean3", bean3);
		map.put("bean4", bean4);
		return map;
	}
	
	@PostMapping("/send")
	public String send(@RequestBody SampleBean bean) {
		System.out.println(bean);
		return "success";
	}
	

}
