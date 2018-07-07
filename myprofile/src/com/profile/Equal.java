package com.profile;
	import java.util.*;
public class Equal
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String[] array=scan.nextLine().split(" ");
        int count=0,count1=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].length()%2==0)
            {
                
                for(int j=0;j<array.length-1;j++)
                {
                    
                    if(Character.isUpperCase(array[i].charAt(i)))
                    {
                        count++;
                    }
                    else
                    {
                        count1++;
                    }
                }
                if(count==count1)
                {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
    




