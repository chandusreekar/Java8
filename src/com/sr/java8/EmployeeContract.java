package com.sr.java8;

@FunctionalInterface
public interface EmployeeContract {
	
	public double calculateSalary();
	
	default double rateOfInteres() {
		return 2.5;
	}
	static String getName() {
		return "Dave";
	}

}
interface AdminContract{
	default double rateOfInteres() {
		return 1.3;
	}
	static String getName() {
		return "Mario";
	}
}
