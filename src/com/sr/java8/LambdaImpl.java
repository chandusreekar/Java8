package com.sr.java8;

public class LambdaImpl {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator(){
			@Override
			public double div(int n1, int n2) {
				return n1/n2;
			}
		};
	System.out.println("***********Annonymous Class********************");
	System.out.println("Result "+calc.div(4, 2));
	System.out.println("*********************Lamda Expression**************");
	//       inputs -> ouput
	
	Calculator cal = (n1,n2)->{
		if(n1!=0&&n2!=0)
			return n1/n2;
		return 0;
		};
	
	
	System.out.println("Result "+cal.div(6, 2));
	
	
	}

}
