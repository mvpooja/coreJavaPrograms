package com.test.str;
import java.util.Scanner;
public class Countch 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=s.nextLine();
	System.out.println("The length of string "+a.length());
	int count=1;
	for(int i=0;i<a.length()-1;i++)
	{
		if(a.charAt(i)!=' ')
		{
			count++;
		}
	}
	System.out.println("Count without spaces is "+count);
}
}
