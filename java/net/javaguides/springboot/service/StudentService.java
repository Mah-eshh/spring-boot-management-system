package com.myproject.restexample.service;

import java.util.List;

import com.myproject.restexample.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	Student deleteStudentById(Long id);
}
