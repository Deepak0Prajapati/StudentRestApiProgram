package com.Student.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int rollno;
	private String name;
	private String email;
	private String mobileno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public StudentData(int rollno, String name, String email, String mobileno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
	}
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentData [rollno=" + rollno + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno + "]";
	}
	
	

}
