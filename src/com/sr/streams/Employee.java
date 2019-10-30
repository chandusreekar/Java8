package com.sr.streams;

public class Employee {
	
	private int empId;
	private String empName;
	private int empAge;
	private String empDomain;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int empAge, String empDomain) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empDomain = empDomain;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpDomain() {
		return empDomain;
	}
	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empDomain=" + empDomain
				+ "]";
	}
	

}
