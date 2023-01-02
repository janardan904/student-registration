package com.nsdl.StudentRegistration.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Table(name="student")
@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="student_Id")
	private Long studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="email_Id")
	private String emailId;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date bodate;
	@Column(name="qualification")
	private String qualification;
	
	public Student() {
		
		
	}


	public Student(Long studentId, String studentName, String emailId, String gender, int age, Date bodate,String qualification) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
		this.gender = gender;
		this.age = age;
		this.bodate = bodate;
		this.qualification=qualification;
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getBodate() {
		return bodate;
	}


	public void setBodate(Date bodate) {
		this.bodate = bodate;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", emailId=" + emailId + ", gender="
				+ gender + ", age=" + age + ", bodate=" + bodate + ", qualification=" + qualification + "]";
	}


	

}