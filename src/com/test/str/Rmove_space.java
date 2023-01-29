package com.test.str;

import java.util.Scanner;

public class Rmove_space 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String a=s.nextLine();
		a=a.replaceAll(" ", "");
		//a=a.replaceAll("[' ']", "");
		System.out.println(a);
		char c[]=a.toCharArray();
		String str="";
		for(int i=0;i<a.length();i++)
		{
			if(c[i]!=' ')
			{
				str=str+c[i];
			}
		}
		System.out.println(str);
	}
}
