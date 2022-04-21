package com.jspider.spring.constructort.primitive;

public class Employee {
	private String name;
	private String empId;
	private double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	public Employee(String name, String empId, double sal) {
		super();
		this.name = name;
		this.empId = empId;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", sal=" + sal + "]";
	}
	
	

}
