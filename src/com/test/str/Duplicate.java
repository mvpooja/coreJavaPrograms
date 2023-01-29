package com.test.str;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
public class Duplicate 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string:");
	String a=s.nextLine();
	int count=0;
	for(int i=0;i<a.length()-1;i++)
	{
		for(int j=i+1;j<a.length()-1;j++)
		{
		if(a.charAt(i)==a.charAt(j))
		{
			count++;
		}
		}
	}
	if(count==0)
	{
	 System.out.println("No duplicate");
	}
	else
	{
		System.out.println("Duplicate characters present");
	}
}
}
