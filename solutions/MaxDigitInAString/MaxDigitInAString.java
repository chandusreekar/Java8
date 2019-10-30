package com.steams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxDigitInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter input string: ");
		String inputString = scn.nextLine();
		
		String numericStr = inputString.replaceAll("[^0-9]", "");
		
		if(numericStr.length() != 0) {
			int max = Character.getNumericValue(numericStr.charAt(0));
			
			for(int i=1;i<numericStr.length();i++) {
				int compare = Character.getNumericValue(numericStr.charAt(i));
				if(max < compare) {
					max = compare;
				}
			}
			System.out.println("Max digit is: " + max);
		}
		else {
			System.out.println("No digits in string");
		}
		scn.close();
	}

}
