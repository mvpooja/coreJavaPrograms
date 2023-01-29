package com.test.prog;
import java.util.Scanner;
public class Pevodd 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	if(num%2==0)
	{
	 System.out.println("FIZZ");
	}
	else
	{
		System.out.println("BUZZ");
	}
}
}
