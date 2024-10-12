package com.emplolyeeMangementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emplolyeeMangementSystem.entity.MyEmployeeList;
import com.emplolyeeMangementSystem.repository.MyEmployeeRepository;

@Service
public class MyEmployeeListService {
	
	@Autowired
	private MyEmployeeRepository myemployee;
	public void saveMyEmployee(MyEmployeeList employee) {
		myemployee.save(employee);
		
	}
	public List<MyEmployeeList> getAllMyEmployee(){
		return myemployee.findAll();
		
	}
	public void deleteById(int id) {
		myemployee.deleteById(id);
	}

}
