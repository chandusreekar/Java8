package com.sr.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProductApp {
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
			new Product(111,"Laptop",55000),
			new Product(222,"EarPhones",500),
			new Product(333,"Mobile",10000),
			new Product(444,"Microwave",35000)
		);
		
		//Length of the product Name;
//		Collections.sort(productList,new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getProductName().length()-p2.getProductName().length();
//			}
//		});
//		System.out.println("**************Using Annonymous Class*********************");
//		for (Product product : productList) {
//			System.out.println(product);
//		}
		
		System.out.println("*************Usign Lambda Expression************");
		
		//Collections.sort(productList,(p1,p2)->p1.getProductName().length()-p2.getProductName().length());
	
		//productList.forEach(p->System.out.println(p));
		
		Collections.sort(productList,Comparator.comparing(Product::getProductName));
		productList.forEach(System.out :: println);
		System.out.println("**********Sorting based on price*************");
		Collections.sort(productList,Comparator.comparing(Product::getProductPrice));
		productList.forEach(System.out :: println);
		System.out.println("************Fetch Product starting with letter M**************");
		displayProduct(productList,product -> product.getProductName().startsWith("M"));
		
	}
	static void displayProduct(List<Product> proList,Predicate<Product> p) {
		for (Product pro : proList) {
			if(p.test(pro)) {
				System.out.println(pro);
			}
		}
		
	}
	
	

}
