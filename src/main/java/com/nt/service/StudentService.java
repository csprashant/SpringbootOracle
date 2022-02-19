package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired StudentRepo repo;
	
	public Student saveStudent(Student s)
	{
		Student save = repo.save(s);
		return save;
	}
	public List<Student> getAllStudent(){
		return repo.findAll();
	}

}
