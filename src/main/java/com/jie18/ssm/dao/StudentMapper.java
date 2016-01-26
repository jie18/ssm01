package com.jie18.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jie18.ssm.model.Student;

@Repository
public interface StudentMapper {
	
	public Student getStudent(String stuID);
	
	public Student getStudentAndClass(String stuID);
	
	public List<Student> getStudentAll();
	
	public void insertStudent(Student stu);
	public void deleteStudent(Student stu);
	public void updateStudent(Student stu);

}
