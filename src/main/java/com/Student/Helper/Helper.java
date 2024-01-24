package com.Student.Helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Model.StudentData;
import com.Student.Repository.StudentDataRepository;

@Service
public class Helper {
	
	@Autowired
	private StudentDataRepository studentDataRepository;
	
	public StudentData getStudent(int id) {
		
		return studentDataRepository.findById(id);
		
	}
	
	public StudentData getStudent(String data) {
		 StudentData Data=null;
		try {
			
			try {
				
				Data= studentDataRepository.findByName(data);
				 if(Data!=null) {
					 return Data;
				 }
				

			}catch(Exception e) {
				
			}
			try {
				
				Data = studentDataRepository.findByEmail(data);
				 if(Data!=null) {
					 return Data;
				}
				 
			}catch(Exception e) {
				
			}
			try {
				
				Data = studentDataRepository.findByMobileno(data);
				 if(Data!=null) {
					 return Data;
				}
				

			}catch(Exception e) {
				
			}
			
		}catch(Exception e) {
		}
		return null;
	}
	
}
