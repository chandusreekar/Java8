package com.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	public static void main(String[] args) {
		String input = "abc one two 'with in single quotes' completed";
		
		List<String> matchList = new ArrayList<String>();
		Pattern regex = Pattern.compile("[^\\s\"']+|'([^']*)'");
		Matcher regexMatcher = regex.matcher(input);
		
		while (regexMatcher.find()) {
		    if (regexMatcher.group(1) != null) {
		        matchList.add(regexMatcher.group(1));
		    } else {
		        matchList.add(regexMatcher.group());
		    }
		} 
		matchList.forEach(System.out::println);
	}
}
