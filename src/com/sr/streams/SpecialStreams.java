package com.sr.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SpecialStreams {
	public static void main(String[] args) {
		//Range of some numbers
		ArrayList<Integer> numbers =  IntStream.rangeClosed(1, 50).filter(n->n%2==0)
															//.boxed()//Autoboxing
															.mapToObj(Integer::valueOf)
															.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(numbers);
		
		//Infinite Streams
		Stream<Integer> infintie = Stream.iterate(10, n->n+5);
		
		Integer[] infiniteArray = infintie.limit(30).toArray(Integer[]::new);
		System.out.println(Arrays.toString(infiniteArray));
	}

}
