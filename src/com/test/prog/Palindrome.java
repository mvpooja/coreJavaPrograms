package com.test.prog;
import java.util.Scanner;
public class Palindrome 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int rev=0;
	if(n<10)
	{
		System.out.println("The number is not a palindrome");
	}
	if(n>=10)
	{
		int num=n;
	do
	{
		int r=num%10;
		rev=rev*10+r;
		int d=num/10;
		num=d;
	}while(num!=0);
	if(rev==n)
	{
		System.out.println("the number is Palindrome");
	}
	else
	{
		System.out.println("the number is not a palindrome");
	}
	}
}
	
}
