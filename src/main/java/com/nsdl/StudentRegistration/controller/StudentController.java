package com.nsdl.StudentRegistration.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsdl.StudentRegistration.model.Student;
import com.nsdl.StudentRegistration.service.StudentServices;


@RestController
@RequestMapping(value="/v2")
public class StudentController {
	
	@Autowired
	StudentServices service;
	
    @GetMapping(value="/getstudents",produces="application/json")
	public ResponseEntity<List<Student>>getstudents(){
		return new ResponseEntity<List<Student>>(service.getstudents(),HttpStatus.OK);
		
	}
    
    
    @GetMapping(value="/getstudent/{studentId}",produces="application/json")
   public ResponseEntity<Optional<Student>> getstudent(@PathVariable("studentId")Long studentId) {
	   return new ResponseEntity <Optional<Student>>(service.getstudentsById(studentId),HttpStatus.OK);
   }
    
    
    @PostMapping( value="/savestudent",consumes="application/json",produces="application/json")
    public ResponseEntity<Student>  save(@RequestBody Student customer) {
    	return new   ResponseEntity<Student>(service.savestudents(customer),HttpStatus.OK);
    }
    
    
    
    @DeleteMapping(value="/deletestudent/{id}")
    public Map<String,Long> deleteStudent(@PathVariable("id") Long studentId) {
     service.deletestudents( studentId);
     Map<String,Long>map=new HashMap<>();
     map.put("this record is deleted", studentId);
    
	return map;
     
    }
    //update the student data
    
    @PutMapping(value="/updatestudent/{id}",produces= "application/json",consumes="application/json")
	public Student updatestudent(@PathVariable ("id")Long  studentId, @RequestBody Student student) {    	
    	return service.updatestudent(studentId, student);
   
		
		
	}
	
}

	
	
	
	
	


