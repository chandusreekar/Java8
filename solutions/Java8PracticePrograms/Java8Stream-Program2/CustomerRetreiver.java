package com.streams2;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomerRetreiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************map with customer 'name' as key and 'age' as value***************");
		Map<String,Integer> map =
				Datasource.customerList.stream().collect(Collectors.toMap(Customer::getName, Customer::getAge));
		System.out.println(map);
		System.out.println();
		
		System.out.println("***************customers with age greater than 25**********************");
		map.entrySet().stream().filter(c->c.getValue()>25).forEach(System.out::println);
		System.out.println();
		
		System.out.println("***************Map with key as gender and value as List of Customer objects******************");
		Map<String,List<Customer>> map1 = Datasource.customerList.stream().
				collect(Collectors.groupingBy(Customer::getGender));
		map1.entrySet().stream().forEach(s->System.out.println(s.getKey()+s.getValue()));
		System.out.println();
		
		System.out.println("***************Map with key as gender and value as List of Customer Names********************");
		Map<String,List<String>> map2 = Datasource.customerList.stream().
				collect(Collectors.groupingBy(Customer::getGender, 
						Collectors.mapping(Customer::getName, Collectors.toList())));
		map2.entrySet().stream().forEach(s->System.out.println(s.getKey()+s.getValue()));
		System.out.println();
		
		System.out.println("***************names of Customers whose age is greater than 25*******************");
		String customerNames = Datasource.customerList.stream()
								.filter(customer->customer.getAge()>25)
								.map(customer->customer.getName())
								.collect(Collectors.joining(","));
		System.out.println(customerNames);
		System.out.println();
		
		System.out.println("**********************Special Streams***********************************");
		LinkedList<Integer> numbers = IntStream.rangeClosed(20,50).filter(n->n%3==0)
										.filter(n->n%2==1)
										.map(n->n*n)
										.mapToObj(Integer::valueOf)
										.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(numbers);
		
		System.out.println();
		System.out.println("Infinite stream with multiples of 5 and collect the first 20 multiples in an array");
		Stream<Integer> infinite = Stream.iterate(5,n->n+5);
		infinite.limit(20).collect(Collectors.toList()).forEach(System.out::println);
	}

}
