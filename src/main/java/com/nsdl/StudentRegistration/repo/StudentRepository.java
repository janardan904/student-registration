package com.nsdl.StudentRegistration.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.nsdl.StudentRegistration.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
