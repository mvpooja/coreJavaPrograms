package com.test.own;

public class Star5 
{
public static void main(String[] args) 
{
	int i,j,k;
	int n=1;
	for(i=4;i>=1;i--)
	{
		for(j=1;j!=i;j++)
		{
			System.out.print("  ");
		}
		for(k=1;k<=n;k++)
		{
			System.out.print("* ");
		}
		n+=2;
		System.out.println(" ");
	}
}
}
