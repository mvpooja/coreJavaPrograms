package com.test.own;

public class Flipflop1 
{
 public static void main(String[] args) 
 {
	 int i,j,k;
		for(i=1;i<=5;i++)
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
