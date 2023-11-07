package com.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student implements Serializable
{
 @Id
 @Column
 private int sid;
 private String sname;
 private int sage;
 private String saddress;
 private String Student;
 public Student()
 {
	 System.out.println("Stuedent Object Created");
 }
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}
public String getStudent() {
	return Student;
}
public void setStudent(String student) {
	Student = student;
}
 
}
