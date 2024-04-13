package com.Springboot.CrudOperations.service;

import java.util.List;

import com.Springboot.CrudOperations.entity.Student;

public interface StudentService {
	
	
	void addStudent(Student student);
	
	
	Student getStudentById(int id);
	

	List<Student> getAllStudents();
	

	void updateStudent(int id, Student student);
	
	
	void deleteStudent(int id);

}
