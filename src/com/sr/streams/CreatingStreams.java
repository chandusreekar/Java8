package com.sr.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		//Creating a stream from a array
		
	//	Arrays.stream(DataSource.totalMarks).forEach(System.out::println);
	//Creating a stream from a collection
//		long count = DataSource.nameList.stream().count();
//		System.out.println("Count "+count);		
//		Stream<String> letters = Stream.of("a","b","c","d");
		
		// Arrays.stream(DataSource.totalMarks).filter(n->n%2==0).forEach(System.out::println);
//		 / static int[] totalMarks = {56,87,46,89,78};
		 Arrays.stream(DataSource.totalMarks)
		 .filter(no->no%2==0)
		 .sorted()
		.limit(2)
		 .forEach(System.out::println);
		 

		 System.out.println("Acocunt Holder, type = Savings");
		 
		Set<String> nameList= DataSource.accountList.stream()
		.filter(p->p.getAccountType().equals("Savings"))
	
		
		 .map(account->account.getAccountHolderName())
		// .collect(Collectors.toCollection(()->new LinkedHashSet()));
		 //Constructor Reference
		 .collect(Collectors.toCollection(LinkedHashSet::new));
		 //Class :: method
		 //array of Account object ===> array of String object=map
		// .map(account->account.getAccountHolderName())
	//	 .toArray();
	//	
	
		 
		 System.out.println("Match Found "+nameList);
		
		 
		 
		 //working with reduce
		 
		 int sum = Arrays.stream(DataSource.totalMarks)
				 		.filter(n->n%2==0)
				 		.reduce(10,(a,i)->(a+i)/DataSource.totalMarks.length);
		 
		 System.out.println("Sum "+sum);
		 
		 
		String result = DataSource.accountList.stream()
				 					.filter(a->{return a.getAccountHolderName().startsWith("J");})
				 					 .map(account->account.getAccountHolderName())
				 					.reduce("Student names", (t,v)->t+" "+v);
		 System.out.println("**********"+result);
		 
		 
		 IntSummaryStatistics summary = Arrays.stream(DataSource.totalMarks).summaryStatistics();
		 System.out.println(summary.getMax());
		 
		 //0 refer to inital value
		 //a -->accumulate the result
		 //i-->recieves the data
		 
		 
		 System.out.println("Find by Id");
		 
		 System.out.println(DataSource.getAccountById(111));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
