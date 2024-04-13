package com.Springboot.CrudOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.CrudOperations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
