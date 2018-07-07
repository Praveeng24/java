package com.profile;

import java.util.Scanner;

public class Dis {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String str1 = scan.nextLine();
			String[] word = str1.split("");
			String value="";
			//char[] ch = new char[str1.length()];
			//int var = 1; 
			for(int i=0;i<word.length;i++)
			{
				value=word[i];
				System.out.println(value);
			}

}}
