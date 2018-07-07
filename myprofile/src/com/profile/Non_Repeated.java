package com.profile;

import java.util.Scanner;

public class Non_Repeated

{

	public static void main(String[] args)

	{

		int n, flag = 0;

		Scanner s = new Scanner(System.in);

		
		String str1 = s.nextLine();
		String[] word = str1.split("");

		char ch[] = new char[str1.length()];

		for (int i = 0; i <word.length; i++)

		{

			ch = ch+word[i];
	

		}

		System.out.print("Non repeated elements are:");

		for (int i = 0; i <= str1.length(); i++)

		{

			for (int j = 0; j <=str1.length(); j++)

			{

				if (i != j)

				{

					if (ch[i] != ch[i])

					{

						flag = 1;
					}
					

					else

					{

						flag = 0;

						break;

					}

				}

			}

			if (flag == 1)

			{

				System.out.print(ch[i]);

			}

		}

	}

}
