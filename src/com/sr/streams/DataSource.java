package com.sr.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.sr.collections.Student;

public class DataSource {
	
	
	 static int[] totalMarks = {56,87,46,89,78};
	 
	 
	 static List<String> nameList = Arrays.asList(new String[] {
			"Mark","James","John","Anne","Jade" 
	 });
	 
	 static List<Account> accountList = Arrays.asList(new Account[] {
			
			 new Account(555,"Mavis",38,"Current"),
			 new Account(111,"Mark",45,"Savings"),
			 new Account(111,"Priya",32,"Savings"),
			 new Account(444,"Rashmi",36,"Savings"),
			
			 new Account(333,"Vinay",50,"Current")
			
	 });
	 
	 
	 static List<Student> studentList = Arrays.asList(new Student[] {
				
			 new Student(555,"Mavis",8723428934l,"CS",670),
			 new Student(444,"Rashmi",234234234l,"EC",480),
			 new Student(222,"Anne",234234234l,"EC",777),
			// new Student(111,"Priya",234234234l,"EC",345),
			 new Student(666,"Test",234234234l,"EC",345),
			 new Student(333,"Vinay",2342342355l,"CS",864)
			
	 });
	 
	 static List<Employee> empList = Arrays.asList(new Employee[] {
				
			 new Employee(101,"Dave",34,"Devlopment"),
			 new Employee(103,"Anne",26,"Devlopment"),
			 new Employee(105,"James",46,"Testing"),
			 new Employee(104,"John",21,"Devlopment"),
			 new Employee(102,"Smith",52,"Testing"),
			 
			
	 });
	
	 
	 public static Optional<Account> getAccountById(int accId){
		 
		 return accountList.stream().findAny();
		 }
	 
	 
 public static Optional<Student> getStudentById(int studentId){
		 
		 return studentList.stream()
				 .filter(s->s.getStudentId()==studentId)
				 .findFirst();
 }


}
