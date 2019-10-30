package com.sr.streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.sr.collections.Student;

public class MapImpl {

	public static void main(String[] args) {
		List<Student> studentList = DataSource.studentList;
		//map<key, value>
		Map<Integer,Student> mapData = 
				studentList.stream().collect(Collectors.toMap(Student::getStudentId,s->s));
		System.out.println(mapData);
		
//		Map<Integer,Student> mapData2 = 
//				mapData.entrySet().stream().collect(
//					    Collectors.toMap(s->s.getKey(),s-> s.getValue(),(a,b)->a, TreeMap::new));

	//	mapData2.entrySet().stream().filter(s->s.getKey()<555).forEach(s->System.out.println(s.getKey()+" "+s.getValue().getStudentName()));
	
		System.out.println("*************Grouping By*****************");
		
		Map<String,List<Student>> mapData2 = 
				DataSource.studentList.stream().collect(Collectors.groupingBy(Student::getBranch));
		
		mapData2.entrySet().stream()
		.forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
		
		
		Map<String,List<String>> mapData3 = 
				DataSource.studentList.stream()
				.collect(Collectors.groupingBy(Student::getBranch,
						Collectors.mapping(Student::getStudentName, Collectors.toList())
						));
		
		mapData3.entrySet().stream()
		.forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
		
		System.out.println("************Finding Average*******************");
		Map<String,Double> avgData = DataSource.studentList.stream()
															.collect(Collectors.groupingBy(Student::getBranch,
															Collectors.averagingInt(Student::getTotalMarks)		
																	));
		
		
		
		avgData.entrySet().stream()
		.forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
		
		
		System.out.println("************Joining()*******************");
		String studentName = DataSource.studentList.stream().map(Student::getStudentName)
		.collect(Collectors.joining(" , "));
		System.out.println(studentName);
		
		System.out.println("************Reducing()*******************");
		
		
		Map<String,Optional<Student>> reduceData = DataSource.studentList.stream().collect(Collectors.groupingBy(Student::getBranch
				,Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Student::getTotalMarks)))));
		
		reduceData.forEach((c,s)->System.out.println(c +" "+s.get().getStudentName()));
		
	//	System.out.println(reduceData);
		
		
		
		
		
		
	
	}

}
