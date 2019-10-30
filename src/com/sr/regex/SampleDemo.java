package com.sr.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleDemo {

	public static void main(String[] args) {
		
		//Pattern & Matcher
		
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter User Name");
//		String username = input.next();
		//Alpha Numeric is allowed no special character, length-->10->15;
//		String exp = "^[a-zA-Z0-9]{3,5}+$";
//		Pattern pattern = Pattern.compile(exp);
//		Matcher match = pattern.matcher(username);
//		if(match.matches()) {
//			System.out.println("Valid UserName");
//		}
//		else {
//			System.out.println("Pattern Macthing Failed");
//		}
//		
		
	//	String s= "12dhfkdhf345nd67hh879";
		  String s = "365";
		  Pattern p = Pattern.compile("\\d{1,3}");
		  Matcher m = p.matcher(s);
		  
		  while(m.find()) {
			  int i =Integer.parseInt(m.group());
			  if(i>0&&i<366) {
		System.out.println(i);
			  }
			
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
