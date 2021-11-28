package com.myproject.restexample.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.restexample.entity.Student;
import com.myproject.restexample.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {

	


	    @Autowired
	    private StudentService studentService;
	    
	    
	    
	    //For adding a student 
	  /* 1. Create a method & passing OBJECT (from Student class(which created in entity class)) to fetch student data.
	     2. Copy that Object data to Service layer's 'addStudent' method.
	     3. Take value of #student Object (in Service layer).
	     4. Pass that data to Repository layer.
	    */
	    @PostMapping("/add")
	    public Student addDetails(@RequestBody Student student){   //1.
	        return studentService.addStudent(student);  //2.
	    }
	    
	    

	    
	    //For all student
	    @GetMapping("/all-students")
	    public Iterable<Student> findAll(){
	        return studentService.allStudent();
	    }

}
