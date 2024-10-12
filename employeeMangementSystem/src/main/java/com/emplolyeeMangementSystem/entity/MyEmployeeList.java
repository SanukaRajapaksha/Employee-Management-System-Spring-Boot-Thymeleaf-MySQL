package com.emplolyeeMangementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyEmployee")
public class MyEmployeeList {
	@Id
	private int id;
	private String name;
	private String jobType;
	private String salary;
	public MyEmployeeList(int id, String name, String jobType, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.jobType = jobType;
		this.salary = salary;
	}
	public MyEmployeeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
