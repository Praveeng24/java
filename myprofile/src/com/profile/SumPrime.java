package com.profile;

public class SumPrime {
	public static void main(String args[])
	{
		int a=30, flag=1,k = 0,i;
		//int[] b=new int[100];
		
		for( i=2;i<=a;i++)
		{
			if(a%i==0)
			{
			flag=0;
			break;
			}
			
		}
				if(flag==1)
			{
					System.out.println("Prime number");
				//b[k]=i;
				// k++;
			}
		
	/*	for(  i=0;i<=k;i++)
		{
			for(  j=0;j<=k;j++)
			{
				int sum = 40;
				int r;
				r=b[i]+b[j];
				if(r==sum)
				{
					System.out.println(r);
				}
			}
			
			
			
			
			
			
			
		}**/
	}

}
