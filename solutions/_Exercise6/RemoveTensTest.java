package com.exercise6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveTensTest {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter integer array length ");
			int n = sc.nextInt();
			int[] array = new int[n];  //{10,10,62,10,12,52,44,1,854};
			
			for(int i=0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			int[] returnValue = removingTens(array);
			
			System.out.println(Arrays.toString(returnValue));
		}catch(Exception e) {
			
		}
		
		
	}
	
	public static int[] removingTens(int[] array) {		
		List<Integer> integers = Arrays.stream(array).boxed().filter(each -> each !=10).collect(Collectors.toList());
		
		for(int i=integers.size();i<array.length;i++) {
			integers.add(0);
		}
		return integers.stream().mapToInt(Integer::intValue).toArray();
	}
}
