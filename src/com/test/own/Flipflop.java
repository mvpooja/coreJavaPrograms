package com.test.own;

public class Flipflop
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=5;i>=1;i--)
		{
			for(j=1;j!=i;j++)
			{
				System.out.print("  ");
			}
			for(k=j;k<=5;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
