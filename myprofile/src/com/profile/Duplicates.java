package com.profile;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int array[]=new int[10];
		for(int i=0;i<10;i++)
		{
			array[i]=scan.nextInt();
		}
	for(int i:array)
	{
		array[i]=1;
	}
	for(int i:array)
	{
		System.out.println(array[i]);
	}
	}

}
