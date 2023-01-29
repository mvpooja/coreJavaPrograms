package com.test.str;
import java.util.Scanner;
public class Count 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=s.nextLine();
	int count=1;
	for(int i=0;i<=a.length()-1;i++)
	{
		if((a.charAt(i)==' ')&&(a.charAt(i+1)!=' '))
		{
			count++;
		}
	}
	System.out.println("the count is "+count);
}
}
