package com.myproject.restexample.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.restexample.entity.Student;
import com.myproject.restexample.repository.StudentRepository;


@Service
public class StudentService  {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public Student addStudent(Student student){  //3.
        return studentRepository.save(student);  //4.
    }
	

    public Iterable<Student> allStudent(){
        return studentRepository.findAll();
    }
    
    public Student getStudent(Integer id){
        return studentRepository.getById(id);
    }
    //getById method is in the JpaRepository, finds the passing id available or not in the database. if available passing details as the pahtVariable
}
