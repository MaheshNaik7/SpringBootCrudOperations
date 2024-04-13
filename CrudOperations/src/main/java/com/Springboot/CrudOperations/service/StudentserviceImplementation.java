package com.Springboot.CrudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.CrudOperations.entity.Student;
import com.Springboot.CrudOperations.repository.StudentRepository;

@Service
public class StudentserviceImplementation implements StudentService{
	
	@Autowired
	StudentRepository studentrepo;

	@Override
	public void addStudent(Student student) {
		studentrepo.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		return studentrepo.findById(id).orElse(null);
	}
	

	@Override
	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public void updateStudent(int id, Student student) {
		student.setId(id);
		studentrepo.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentrepo.deleteById(id);
	}

}
