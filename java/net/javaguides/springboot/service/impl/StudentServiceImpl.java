package com.myproject.restexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.restexample.entity.Student;
import com.myproject.restexample.repository.StudentRepository;
import com.myproject.restexample.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student deleteStudentById(Long id) {

		studentRepository.deleteById(id);
		return null;
	}

	
	
}
