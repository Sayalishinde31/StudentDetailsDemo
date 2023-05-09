package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

@Autowired
private StudentService stuService;

@PostMapping("/save")
public ResponseEntity<Student> saveStudent(@RequestBody Student student){
	Student stud=stuService.postStudent(student);
	
	return ResponseEntity.ok().body(stud);
}
}
