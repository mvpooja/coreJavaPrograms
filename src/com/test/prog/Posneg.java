package com.test.prog;
import java.util.Scanner;
public class Posneg 
{
 public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	if(n>0)
	{
		System.out.println("The number "+n+" is Positive number");
	}
	else
	{
		System.out.println("The number "+n+" is Negative number");
	}
}
}
