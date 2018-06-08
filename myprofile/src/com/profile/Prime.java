package com.profile;

public class Prime {

	public static void main(String[] args) {

		int num = 30, num2 = 10;
		int flag = 0;
		for (int i = num2; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else 
					flag = 1;
					
			}

			if (flag == 1)
			System.out.println(i);	
			// else
			// System.out.println(num2 + " is not a prime number.");
		}
	}
}
