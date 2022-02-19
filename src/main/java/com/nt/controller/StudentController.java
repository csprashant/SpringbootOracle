package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;
import com.nt.service.StudentService;

@RestController
public class StudentController {
	@Autowired StudentService service;
	
	@PostMapping("student")
	public String saveStudent() {
		Student s=new Student();
		s.setName("Rajes");
		s.setPer(90.45);
		s.setRoll(102);
		
		service.saveStudent(s);
		return "Record inserted";
		
				}

	@GetMapping("student")
	public String getAll() {
		return service.getAllStudent().toString();
	}
}
