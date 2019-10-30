package com.sr.java8;

public class EmployeeApp implements EmployeeContract,AdminContract{

	@Override
	public double calculateSalary() {
	
		return 400000;
	}


	@Override
	public double rateOfInteres() {
		// TODO Auto-generated method stub
	//	return EmployeeContract.super.rateOfInteres();
		return 4.5;
	}


	public static void main(String[] args) {
		EmployeeContract emp = new EmployeeApp();
		System.out.println(emp.rateOfInteres());
		System.out.println(EmployeeContract.getName());
		System.out.println(AdminContract.getName());
	}
}
