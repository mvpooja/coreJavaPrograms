package com.test.prog;

public class Numberpat 
{
public static void main(String[] args) 
{
	int i;
	int j;
	int c=0;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
			System.out.print(++c+" ");//System.out.print(j);
		}
		c=0;
		System.out.println();
	}
}
}
