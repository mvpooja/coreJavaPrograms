package com.test.prog;
import java.util.Scanner;
public class Prime 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("The number is a Prime no");
	}
	else
	{
		System.out.println("The number is not a Prime no");
	}
}
}
