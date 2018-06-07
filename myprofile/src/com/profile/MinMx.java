package com.profile;

	public class MinMx {
		public static  int getMaxValue(int[] numbers)
		{
			int MaxValue=numbers[0];
			for(int i=0;i<numbers.length;i++)
			{
				if(numbers[i]>MaxValue)
				MaxValue=numbers[i];
				}
			return MaxValue;}
		public static  int getMinValue(int[] numbers)
		{
			int MinValue=numbers[0];
			for(int i=0;i<numbers.length;i++)
			{
				if(numbers[i]<MinValue)
				MinValue=numbers[i];
				
					
					
		}
			return MinValue;}
		public static void main(String args[])
		{
			int[] numbers= {20,78,45,34,67};
			//MinMx minmx=new MinMx();
			int MaxValue=getMaxValue(numbers);
			System.out.println("maxvalue="+MaxValue);
			int MinValue=getMinValue(numbers);
			System.out.println("maxvalue="+MinValue);
			
		}
			
			
			

}
