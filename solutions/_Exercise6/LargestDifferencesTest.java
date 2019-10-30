package com.exercise6;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestDifferencesTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter integer array length ");
			int n = sc.nextInt();
			int[] array = new int[n];  //{10,10,62,10,12,52,44,1,854};
			
			for(int i=0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			findingLargestDifferences(array);
		}
	}
	public static void findingLargestDifferences(int[] array) {
		
		IntSummaryStatistics statistics = IntStream.of(array).summaryStatistics();
		List<Integer> ints = Arrays.stream(array).mapToObj(Integer::valueOf).collect(Collectors.toList());
		int difference = statistics.getMax()-statistics.getMin();
		System.out.println(difference);
		
		System.out.println("minimum value index :" + ints.indexOf(statistics.getMin()));
		System.out.println("maximum value index :" + ints.indexOf(statistics.getMax()));
		
		
		
		
	}
}
