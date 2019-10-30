package com.java8.assignment1;

import java.util.Comparator;
import java.util.stream.Collectors;

public class CustomerDetailsStream {

	public static void main(String[] args) {
		System.out.println("Name of all customers: ");
		DataSource.customerList.stream()
				.map(customer->customer.getName())
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("name of customers who are older than 25 and are Male: ");
		DataSource.customerList.stream()
				.filter(customer->customer.getAge()>25 && customer.getGender()=="Male")
				.map(customer->customer.getName())
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Set with the names of all Customers: ");
		DataSource.customerList.stream()
				.map(customer->customer.getName())
				.collect(Collectors.toSet())
				.forEach(System.out::println);
		
		System.out.println();
		
		Double average_age = DataSource.customerList.stream()
							.filter(customer->customer.getGender()=="Female")
							.collect(Collectors.averagingInt(customer->customer.getAge()));
		System.out.println("the average age of all female customers: " + average_age);
		
		System.out.println();
		
		System.out.println("list with names of customers sorted as per age: ");
		DataSource.customerList.stream()
				 .sorted(Comparator.comparing(Customer::getAge))
				 .collect(Collectors.toList())
				 .forEach(System.out::println);
	}

}
