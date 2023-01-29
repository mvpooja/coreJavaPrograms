package com.test.str;
import java.util.Scanner;
public class Program1 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter string");
	String a=s.nextLine();
	String rev="";
	for(int i=a.length()-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
}
}
