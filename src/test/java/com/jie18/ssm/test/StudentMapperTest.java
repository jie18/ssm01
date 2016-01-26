package com.jie18.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jie18.ssm.dao.StudentMapper;
import com.jie18.ssm.model.Student;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class StudentMapperTest {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void getStudentTest(){
		Student stu = studentMapper.getStudent("123456");
		System.out.println("id: " + stu.getStuID() + ", name: " + stu.getStuName());
		
		List<Student> stuList = studentMapper.getStudentAll();
		for(Student student:stuList){
			System.out.println(student.getStuName());
		}
	}

}
