package com.exercise6;

import java.util.HashMap;
import java.util.Map.Entry;

public class LongestSpan {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 2, 1, 2, 1, 3 };
		findingLongestSpan(array);
	}

	public static void findingLongestSpan(int[] array) {

		HashMap<Integer, Integer> spans = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			
			int each = array[i];
			if (!spans.containsKey(each)) {
				spans.put(array[i], 0);				
			}
		
			for (int j = array.length-1 ; j > i; j--) {

				if (array[i] == array[j]) {

					if (spans.containsKey(each)) {
						int previous = spans.get(array[i]);

						if (j > previous) {
							spans.put(array[i], j-i+1);
						}
					}
					break;
				}
			}
		}
		
		Entry<Integer, Integer> max = spans.entrySet().stream().map(each -> each).max((n1,n2)-> n1.getValue()-n2.getValue()).get();
		System.out.println(max.getKey() + "-" + max.getValue());

	}

}
