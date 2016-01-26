package com.jie18.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jie18.ssm.dao.StudentMapper;
import com.jie18.ssm.model.Student;

@Controller
@RequestMapping("/studentController")
public class StudentController {
	
	@Autowired
	private StudentMapper stuMapper;
	
	@RequestMapping("/showStudent")
	public String successPage(){
		Student student = stuMapper.getStudent("123456");
		System.out.println("name: " + student.getStuName());
		return "showStudent";
	}

}
