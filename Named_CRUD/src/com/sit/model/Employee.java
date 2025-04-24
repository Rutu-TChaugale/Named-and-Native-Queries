package com.sit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(name="InsertData",query="INSERT INTO Employee(emp_id, emp_name, emp_email) VALUES(:id, :name, :email)")
@NamedNativeQuery(name="SelectData", query="select * from employee")
@NamedNativeQuery(name="UpdateData", query = "update employee set emp_name=:name, emp_email=:email where emp_id=:id")
@NamedNativeQuery(name="DeleteData", query = "delete from employee where emp_id=:id")
public class Employee {
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_email")
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
