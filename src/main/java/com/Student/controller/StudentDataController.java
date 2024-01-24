package com.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Helper.Helper;
import com.Student.Model.StudentData;
import com.Student.Repository.StudentDataRepository;

@RestController
public class StudentDataController {
	
	@Autowired
	private StudentDataRepository studentDataRepository;
	
	@Autowired
	private Helper helper;
	
	@PostMapping("/save")
	public String SaveStudent(@RequestBody StudentData studentData ) {
		
		studentDataRepository.save(studentData);
		
		
		
		return "student saved";
	}
	
	@GetMapping("/student")
	public List<StudentData> getAllStudent(){
		return (List<StudentData>) studentDataRepository.findAll();
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<StudentData> getStudent(@PathVariable String id) {
		StudentData studentData=null;
		
		if(id!=null) {
			try {
				
				int data=Integer.parseInt(id);
				 studentData = helper.getStudent(data);
				
			}catch(Exception e) {
				
				 studentData = helper.getStudent(id);
				
			}
		}
		if(studentData!=null) {
		
		return ResponseEntity.ok().body(studentData);
		
		}
		return ResponseEntity.notFound().build();
	}
}
