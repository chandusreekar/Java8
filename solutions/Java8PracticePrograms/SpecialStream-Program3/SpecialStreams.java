//### Special Streams
//- Use IntStream to generate a range of numbers from 20 to 50 inclusive. From the stream, store the square of odd multiples of 3
//  in an LinkedList
//- Generate a infinite stream with multiples of 5 and collect the first 20 multiples in an array.


package com.customer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialStreams {

	public static void main(String[] args) {
		
		
		//- Use IntStream to generate a range of numbers from 20 to 50 inclusive. From the stream, store the square of odd multiples of 3 in an LinkedList
		LinkedList<Integer> list = IntStream.range(20, 50).filter(n->n%2!=0&&n%3==0).map(n->n*n).
				boxed().
				collect(Collectors.toCollection(LinkedList::new));
		System.out.println("Use IntStream to generate a range of numbers from 20 to 50 inclusive. From the stream, store the square of odd multiples of 3 in an LinkedList");
		list.stream().forEach(System.out::println);
		
		//- Generate a infinite stream with multiples of 5 and collect the first 20 multiples in an array.
		System.out.println("\nGenerate a infinite stream with multiples of 5 and collect the first 20 multiples in an array.");
		IntStream stream = IntStream.iterate(5, n->n+5);
		int[] array = stream.limit(20).toArray();
		System.out.println(Arrays.toString(array));
		
	}

}


















