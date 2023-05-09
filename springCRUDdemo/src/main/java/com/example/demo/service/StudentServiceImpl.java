package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository stuRepo;
	@Override
	public Student postStudent(Student student) {
		
		return stuRepo.save(student);
	}

}
