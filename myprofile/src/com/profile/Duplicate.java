package com.profile;

import java.util.Scanner;

public class Duplicate {


		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);		//Input String	
			String[] words=scan.nextLine().split(" ");	//Split the word from String
			int wrc=1;							//Variable for getting Repeated word count
			
			for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
			{
				for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
				{
					
				if(words[i].equals(words[j]))	//Checking for both strings are equal
					{
						wrc=wrc+1;				//if equal increment the count
									//Replace repeated words by zero
					
				}
				}
				if(words[i]!="0")
				{
					System.out.println(wrc);
				wrc=1;
				
		      
				
		}
		}}}
	


