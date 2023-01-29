package com.test.prog;

public class Staircase 
{
 public static void main(String[] args) 
 {
	int i;
	int j;
	int c=1;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			//System.out.print(c+++" ");
			System.out.print(j);
		}
		c=1;
		System.out.println();
	}
}
}
