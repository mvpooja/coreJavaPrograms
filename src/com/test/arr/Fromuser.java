package com.test.arr;
import java.util.Scanner;
public class Fromuser 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int siz=s.nextInt();
	int a[]=new int[siz];
	System.out.println("enter the element");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("The values are:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
