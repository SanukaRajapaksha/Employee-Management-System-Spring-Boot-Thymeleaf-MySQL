package com.emplolyeeMangementSystem.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emplolyeeMangementSystem.entity.Employee;
import com.emplolyeeMangementSystem.entity.MyEmployeeList;
import com.emplolyeeMangementSystem.service.EmployeeService;
import com.emplolyeeMangementSystem.service.MyEmployeeListService;


@Controller

public class EmployeeController {
	@Autowired
	private EmployeeService service;
    
	@Autowired
	private MyEmployeeListService myEmployeeService;
	 @GetMapping("/")
	 public String home() {
		 return "home";
		 
	 }
	 @GetMapping("/employee_register")
		 public String employeeRegister() {
		 return "employeeRegister";
	 }
	 @GetMapping("/available_employee")
	     public ModelAndView  getAllEmployee(){
		List<Employee>list=service.getAllEmployee();
	//	ModelAndView m=new ModelAndView();
	//	m.setViewName("employeeList");
		//m.addObject("employee",list);
		//return m;
		return new ModelAndView("employeeList","employee",list);
		 
	 }
	 @PostMapping("/save")
	 public String addEmployee(@ModelAttribute Employee e) {
		 service.save(e);
		 return"redirect:/available_employee";
	 }
	 @GetMapping("/my_employee")
		 public String getMyEmployee(Model model) {
		  
		   List<MyEmployeeList>list=myEmployeeService.getAllMyEmployee();
		   model.addAttribute("employee",list);
		   return "myEmployee"; 
	 }
	 @RequestMapping("/mylist/{id}")
	 public String getMyList(@PathVariable("id")int id){
		 Employee e=service.getEmployeeById(id);
		 MyEmployeeList me=new MyEmployeeList(e.getId(),e.getName(),e.getJobType(),e.getSalary());
		 myEmployeeService.saveMyEmployee(me);
		 return"redirect:/my_employee";
	 }
	 @RequestMapping("/editEmployee/{id}")
	 public String editEmployee(@PathVariable("id")int id,Model model) {
		 Employee e= service.getEmployeeById(id);
		 model.addAttribute("employee", e);
		 return"employeeEdit";
		 
	 }
	 @RequestMapping("/deleteEmployee/{id}")
	 public String deleteEmployee(@PathVariable("id")int id) {
	     service.deleteById(id);
		 return"redirect:/available_employee";
	 }
}
