package com.nsdl.StudentRegistration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsdl.StudentRegistration.model.Student;
import com.nsdl.StudentRegistration.repo.StudentRepository;


@Service
public class StudentServices {
	
	@Autowired
	private StudentRepository repository;
	
	

	public List<Student> getstudents(){
		List<Student> student=new ArrayList<Student>();
		repository.findAll().forEach(student1->student.add(student1));
		return student;	
	}
	
	//get the perticular recoreds
		public Optional<Student> getstudentsById(Long studentId) {
			return repository.findById(studentId);
			
		}
		//save  the record
		public Student savestudents(Student student) {
			//Student student1 =new Student();
			
			return repository.save(student);
			
		}
		public void deletestudents(Long studentId) {
			
			 repository.deleteById(studentId  );
		
		}

		public Student updatestudent(Long studentId,Student student) {
			Optional<Student> student1 = repository.findById(studentId);
			if (student1.isPresent()) {
				Student student2=student1.get();
				student2.setStudentId(student.getStudentId());
				student2.setStudentName(student.getStudentName());
				student2.setEmailId(student.getEmailId());
				student2.setBodate(student.getBodate());
				student2.setAge(student.getAge());
				student2.setQualification(student.getQualification());
				return repository.save(student2);
			}
			else
				return repository.save(student);
		        	
		     
			
		}
}
