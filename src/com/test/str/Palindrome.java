package com.test.str;
import java.util.Scanner;
public class Palindrome 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String a=s.nextLine();
	String original=a;
	String rev="";
	for(int i=a.length()-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
	if(original.equals(rev))
	{
		System.out.println("Its a Palindrome");
	}
	else
	{
		System.out.println("Its not a Palindrome");
	}
	
	
}
}
