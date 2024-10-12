package com.emplolyeeMangementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emplolyeeMangementSystem.entity.MyEmployeeList;

@Repository
public interface MyEmployeeRepository extends JpaRepository<MyEmployeeList,Integer> {

}
