package com.java;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		 
		Scanner value=new Scanner(System.in);
		boolean isprime=true;
		int num=value.nextInt();
		int temp;
		value.close();
		for(int i=2;i<=num/2;i++)
		{
			temp =i%num;
			if(temp==0)
			{
				boolean isPrime = false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println(num+"is prime");
		}
		else
		{
			System.out.println(num+"is not prime");
		}
		
	}

}
