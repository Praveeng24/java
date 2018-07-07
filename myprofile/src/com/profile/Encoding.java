package com.profile;

import java.util.Scanner;

public class Encoding {
public static void firstEncoding(int[] input)
{    int lastValue=input[input.length-1];
	for(int i=0;i<input.length-1;i++)
	{
		for(int j=i+1;j<=i+1;j++)
		{
			input[i]=input[j]-input[i];
			System.out.println(input[i]);
			
			//System.out.println(lastValue);
		}
	}
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0;
	int[] input=new int[n];
	for(int i=0;i<n;i++)
	{
		input[i]=scan.nextInt();
		 sum=sum+input[i];
		
		
	}
	System.out.println(sum);
	firstEncoding(input);
	
}
}
