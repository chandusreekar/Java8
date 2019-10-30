package com.steams;

import java.util.Scanner;

public class LuckyRegistrationNumber {
	
	public static int checkRegistrationNumber(String regNo) {
		
		if(regNo.length() != 10) {
			return -1;
		}
		
		String pp = regNo.substring(0, 2);
		int xx = Integer.valueOf(regNo.substring(2, 4));
		String qq = regNo.substring(4, 6);
		int yyyy = Integer.valueOf(regNo.substring(6, 10));
		
		if(pp.equals("KA") || pp.equals("DL")) {
			if(xx >=1 && xx <= 10) {
				if(Character.isUpperCase(qq.charAt(0)) || Character.isUpperCase(qq.charAt(1))) {
					if(yyyy>=1000 && yyyy<=9999) {
						if(checkIfLucky(yyyy) == true) {
							return 1;
						}
						else {
							return 0;
						}
					}
				}
			}
		}
		
		return -1;
	}
	
	public static boolean checkIfLucky(int n) {
		int sum =0;
		
		while(n>0 || sum>9) {
			if(n==0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		
		if(sum == 6) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter vehicle registration number");
		String vehicleNo = scn.next();
		
		int flag = LuckyRegistrationNumber.checkRegistrationNumber(vehicleNo);
		if(flag == 1) {
			System.out.println("Registration number is valid and it is the lucky number....");
		}
		else if(flag == 0) {
			System.out.println("Registration number is valid....");
		}
		else {
			System.out.println("Registration number is invalid....");
		}
		scn.close();
	}
}
