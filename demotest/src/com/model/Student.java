package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDemo")
public class Student {
@Id
@GeneratedValue
private int studentId;
@Column
private String studentName;
@Column
private String address;
@Column
private String mobileNo;

public Student() {}
public Student(int studentId, String studentName, String address,
		String mobileNo) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.address = address;
	this.mobileNo = mobileNo;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
}
