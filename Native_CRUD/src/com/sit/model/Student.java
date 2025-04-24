package com.sit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(name="UpdateData", query = "update student set sname=:name,semail=:email,saddr=:addr where sid=:id")
@NamedNativeQuery(name="SelectData", query = "select * from student")
@NamedNativeQuery(name="DeleteData", query = "delete from student where sid=:id")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private int id;
	
	@Column(name="sname")
	private String name;
	
	@Column(name="saddr")
	private String addr;
	
	@Column(name="semail")
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//to string 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + ", email=" + email + "]";
	}
	
	
	

}
