package com.steams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rollNo = 0;
		int marks = 0;
		Map<Integer,Integer> studentMap = new HashMap<Integer, Integer>();
		
		System.out.println("Enter number of students:");
		int n = scn.nextInt();
		
		System.out.println("Enter student roll number and marks");
			for(int i=0;i<n;i++) {
				rollNo = scn.nextInt();
				marks = scn.nextInt();
				studentMap.put(rollNo, marks);
			}
		HashMap<Integer,String> gradeMap = (HashMap<Integer, String>) calculateGrade(studentMap);
		
		System.out.println("Result");
		for (Map.Entry<Integer,String> entry : gradeMap.entrySet()) {  
            System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores){
		Iterator<Entry<Integer, Integer>> itr = scores.entrySet().iterator();
		Map<Integer,String> studentMap = new HashMap<Integer, String>();
		int rollNo = 0, marks=0;
		
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			rollNo = entry.getKey();
			marks = entry.getValue(); 
			if(marks >= 80 && marks <= 100) {
				studentMap.put(rollNo, "A");
			}
			else if(marks < 80 && marks >= 60) {
				studentMap.put(rollNo, "B");
			}
			else if(marks < 60 && marks >= 45) {
				studentMap.put(rollNo, "C");
			}
			else if(marks <45 && marks > 0){
				studentMap.put(rollNo, "D");
			}
		}
		return studentMap;
	}

}
