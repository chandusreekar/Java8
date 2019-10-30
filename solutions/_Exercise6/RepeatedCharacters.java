package com.exercise6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String input = sc.next();
			findingMostRepeatedCharacterInString(input);
			
		}
	}
	
	public static void findingMostRepeatedCharacterInString(String input) {
		HashMap<Character,Integer> charsMap = new HashMap<>();
		
		for(char c : input.toCharArray()) {
			if(charsMap.containsKey(c)) {
				int count = charsMap.get(c);
				charsMap.put(c, count+1);
			}else {
				charsMap.put(c, 1);
			}
		}
		Optional<Entry<Character,Integer>> max = charsMap.entrySet().stream().max(Comparator.comparing(Entry::getValue));
		
		max.ifPresent(System.out::println);
	}
}
