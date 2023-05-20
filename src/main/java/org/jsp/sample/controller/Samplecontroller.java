package org.jsp.sample.controller;

import org.jsp.sample.dto.sample;
import org.jsp.sample.repository.samplerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Samplecontroller {

	@Autowired
	sample sample;
	
	@Autowired
	samplerepository samplerepository;
	
	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestParam String name , @RequestParam long mobile) {
		sample.setName(name);
		sample.setMobile(mobile);
		samplerepository.save(sample);
		
		return "<h1>DATA SAVED SUCESSFULLY </h1>" ;
	}
}
