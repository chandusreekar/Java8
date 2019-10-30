package com.exercise6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrangeNumber {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter integer array length ");
			int n = sc.nextInt();
			int[] array = new int[n];  //{10,10,62,10,12,52,44,1,854};
			
			for(int i=0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			arrangeLargestNumber(array);
		}
	}
	
	public static void arrangeLargestNumber(int[] array) {
		
		List<String> numbers = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.toList());
		System.out.println(numbers);
		Collections.sort(numbers, (first,second)-> (second+first).compareTo(first+second));
		
		numbers.stream().forEach(System.out::print);
	}
}
