package com.jie18.ssm.model;

import java.sql.Date;

public class Student {
	private ClassEntity classEntity;  
    private Date stuBirthday;  
    private String stuID;  
    private String stuName;  
    private String stuSex;
    
	public ClassEntity getClassEntity() {
		return classEntity;
	}
	public void setClassEntity(ClassEntity classEntity) {
		this.classEntity = classEntity;
	}
	public Date getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	
	@Override
	public String toString() {
		return "Student [classEntity=" + classEntity + ", stuBirthday=" + stuBirthday + ", stuID=" + stuID
				+ ", stuName=" + stuName + ", stuSex=" + stuSex + "]";
	}
    
}
