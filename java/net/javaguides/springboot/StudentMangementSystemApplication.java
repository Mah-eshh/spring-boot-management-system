package com.myproject.restexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myproject.restexample.entity.Student;
import com.myproject.restexample.repository.StudentRepository;

@SpringBootApplication
public class StudentMangementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMangementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student ("Mahesh", "Abeykoon", "mah@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student ("Pubudu", "Mahesh", "abc@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student ("Abc", "Deef", "abcdef@gmail.com");
//		studentRepository.save(student3);
		
	}

}
