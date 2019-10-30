package com.sr.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class EmployeeApp {

	public static void main(String[] args) {
//		DataSource.empList.sort(Comparator.comparingInt(Employee::getEmpAge).reversed());
//	//	DataSource.empList.forEach(System.out::println);
//
//		DataSource.empList.sort(Comparator.comparing(Employee::getEmpDomain).thenComparing(Employee::getEmpName));
//		DataSource.empList.forEach(System.out::println);
//		
		//DataSource.empList.removeIf(e->e.getEmpId()==103);
		//DataSource.empList.forEach(System.out::println);
		
		List<Employee> empData = new ArrayList(DataSource.empList);
		empData.removeIf(e->e.getEmpId()==103);
		empData.forEach(System.out::println);
		
		
		Map<Integer,String> mapData = new LinkedHashMap();
		
		mapData.merge(100, "chandu", (o,n)->n);
		mapData.put(111, "Anne");
		mapData.put(222, "John");
		mapData.put(333, "Smith");
		mapData.put(444, "Dave");
		
		
		mapData.merge(222, "James", (o,n)->n);
		mapData.merge(555, "Mario", (o,n)->n);
		
		mapData.forEach((k,v)->System.out.println(k+" "+v));
		
		
		//concat
		
		Stream<Integer> s1 = Stream.of(1,2,3);
		Stream<Integer> s2 = Stream.of(4,5,6);
		Stream<Integer> s3 = Stream.of(7,8,9);
		Stream.concat(s1, Stream.concat(s2, s3)).forEach(System.out::print);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
