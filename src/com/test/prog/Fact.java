package com.test.prog;
import java.util.Scanner;
public class Fact 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value to print the factorial of that number:");
	int n=s.nextInt();
	int fact=1;
	int i;
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of "+n+" is "+fact);
}
}
