package com.sr.collections;

import java.util.Optional;

import com.sr.streams.DataSource;

public class OptionalImpl {
	public static void main(String[] args) {
		Optional<Student> optStudent = DataSource.getStudentById(111);
//		if(optStudent.isPresent()) {
//			System.out.println(optStudent.get());
//		}
		
		optStudent.ifPresent(s->System.out.println(s.getStudentName()));
		
		Student std = new Student(777,"Test",345345l,"EC",123);
		//Creating Optionals
		//Empty Optional
		Optional<Student> empOpt =Optional.empty();
		
		Optional<Student> optStudent2 = Optional.of(std);
		
		Optional<Student> optStudent3 = Optional.ofNullable(std);
		
		
		
		
		
		
		
	}

}
