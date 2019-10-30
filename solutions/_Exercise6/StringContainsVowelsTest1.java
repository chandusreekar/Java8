package com.exercise6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class StringContainsVowelsTest1 {

	public static void main(String args[]) {
		System.out.println("Enter String : ");

		try (Scanner sc = new Scanner(System.in)) {

			String input = sc.nextLine();
			boolean flag = containsAllVowels(input);
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		} catch (Exception e) {

		}
	}

	public static boolean containsAllVowels(String input) {

		ArrayList<Character> inputList = new ArrayList<>();
		for(char c : input.toCharArray()) {
			inputList.add(c);
		}
		
	//	System.out.println("inputs" + inputList);
		ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	//	System.out.println("inputs" + vowels);
		boolean flag = inputList.containsAll(vowels);

		return flag;
	}
	
	/*public static void f() {
		String s= "12dhfkdhf345nd67hh879";
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s);
		
		while(m.find()) {
			String n = m.group();
			if(n.length()==2) {
				System.out.println(m.group());
			}
		}
	}*/
}