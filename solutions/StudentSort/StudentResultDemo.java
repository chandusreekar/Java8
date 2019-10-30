package com.java8.assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentResultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int percent[]= new int[3];
		String names[]=new String[3];
		for(int i=0;i<3;i++) {
			percent[i] = scn.nextInt();
			names[i] = scn.next();
		}
		System.out.println("Sorted names:");
		String[] sortedNames = StudentResultDemo.sortStudents(names, percent);
		for (String string : sortedNames) {
			System.out.println(string);
		}
		scn.close();
	}
	
	public static String[] sortStudents(String[] student_names, int[] percentage) {
		String[] sortedNames = new String[3];
		int count=0;
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		for (int i=0;i<student_names.length;i++) {
				map.put(student_names[i], percentage[i]);
		}
		
		Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		Iterator<Entry<String, Integer>> itr= sortedMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry mapElement = (Map.Entry)itr.next(); 
			sortedNames[count] = (String) mapElement.getKey();
			count++;
		}
		
		return sortedNames;
	}

}
