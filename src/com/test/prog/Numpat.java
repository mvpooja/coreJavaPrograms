package com.test.prog;

public class Numpat 
{
	public static void main(String[] args) 
	{
		int i;
		int j;
		int c=5;
		for(i=1;i<=5;i++)//for(i=5;i>=1;i--)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print(c+" ");//System.out.print(i);
			}
			--c;
			System.out.println();
		}
	}
}
//public static void main(String[] args) 
//{
//	int i;
//	int j;
//	int c=1;
//	for(i=1;i<=5;i++)
//	{
//		for(j=1;j<=5;j++)
//		{
//			System.out.print(c);//System.out.print(i);
//		}
//		++c;
//		System.out.println();
//	}
//}
//}
