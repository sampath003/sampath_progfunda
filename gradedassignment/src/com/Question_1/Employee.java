package com.Question_1;
import java.io.Serializable;

public class Employee implements Serializable{
	String id;
	String name;
	String phone;
	String address;
	int salary;
	
	public Employee(String id, String name, String phone, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", salary="
				+ salary + "]";
	}
	
	
	
}

