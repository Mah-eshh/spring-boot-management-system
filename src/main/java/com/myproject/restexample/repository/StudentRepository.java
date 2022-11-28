package com.myproject.restexample.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.restexample.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

	//Student getById(Long id);
	Student getById(Integer id);
	
}
