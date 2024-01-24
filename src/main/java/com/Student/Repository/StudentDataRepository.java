package com.Student.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Student.Model.StudentData;

public interface StudentDataRepository extends CrudRepository<StudentData, Integer> {
	
	StudentData findById(int id);
	StudentData findByName(String name);
	StudentData findByEmail(String email);
	StudentData findByMobileno(String mobileno);

}
