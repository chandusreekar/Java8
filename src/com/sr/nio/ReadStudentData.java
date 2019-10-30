package com.sr.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadStudentData {

	public static void main(String[] args) {
		try(Stream<String> dataRepo = Files.lines(Paths.get("repo","studentdata.txt"))){
			//to convert Stream of String to a list
			List<String[]> studentList = dataRepo.map(data->{
				String[] rows = data.split(",");
				return rows;
			}).collect(Collectors.toCollection(ArrayList::new));
			System.out.println("***********Student List***********");
			studentList.forEach(s->System.out.println(s[0]+" "+s[1]+" "+s[2]));
			
			
			
		}
		catch (IOException e) {
		e.printStackTrace();
		}
		
		System.out.println("**************Mapped to Student Object***********");
		
		//try(Stream<String> dataRepo = Files.lines(Paths.get("repo","studentdata.txt"))){
		try(Stream<String> dataRepo = Files.newBufferedReader(Paths.get("repo","studentdata.txt")).lines()){
			//to convert Stream of String to a list
			List<Student> studentList = dataRepo.map(ReadStudentData::getStudentData).collect(Collectors.toCollection(ArrayList::new));
			studentList.forEach(System.out::println);
			}
		catch (IOException e) {
		e.printStackTrace();
		}

	}
	public static Student getStudentData(String data) {
		String[] rows = data.split(",");
		Student student = new Student(Integer.parseInt(rows[0]),rows[1],rows[2]);
		return student;
	}
}
