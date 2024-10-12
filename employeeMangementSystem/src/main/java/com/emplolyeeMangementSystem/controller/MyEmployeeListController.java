package com.emplolyeeMangementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emplolyeeMangementSystem.service.MyEmployeeListService;

@Controller
public class MyEmployeeListController {
	
	@Autowired
	private MyEmployeeListService service;
     
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id")int id ) {
		 service.deleteById(id);
    	 return"redirect:/my_employee";
	}
}
