package com.steams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AnagramString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of Strings between 1 to 100000.....");
		int n = scn.nextInt();
		String[] array_of_strings = new String[n];
		
		System.out.println("Enter Strings which have length between 1 to 50.....");
		for(int i=0;i<n;i++) {
			array_of_strings[i] = scn.next();
		}
		
		System.out.println("Below is the largest anagram group: ");
		for (String string : getLargestAnagramGroup(array_of_strings)) {
	        System.out.println(string);
	    }
	}
	
	public static String[] getLargestAnagramGroup(String[] inputArray) {
	    // Creating a linked hash map to maintain the order
	    Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();

	    for (String string : inputArray) {
	        char[] charArray = string.toCharArray();
	        Arrays.sort(charArray);
	        String sortedStr = new String(charArray);
	        List<String> anagrams = map.get(sortedStr);
	        if (anagrams == null) {
	            anagrams = new ArrayList<String>();
	        }

	        anagrams.add(string);

	        map.put(sortedStr, anagrams);
	    }

	    Set<Entry<String, List<String>>> entrySet = map.entrySet();
	    List<String> l = new ArrayList<String>();
	    int highestAnagrams = -1;
	    for (Entry<String, List<String>> entry : entrySet) {
	        List<String> value = entry.getValue();
	        if (value.size() > highestAnagrams) {
	            highestAnagrams = value.size();
	            l = value;
	        }
	    }

	    return l.toArray(new String[l.size()]);
	}

}
