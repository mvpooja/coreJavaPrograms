package com.test.prog;
import java.util.Scanner;
public class Table 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=s.nextInt();
	int i;
	int m;
	for(i=1;i<=10;i++)
	{
		m=a*i;
		System.out.println(a+"*"+i+"="+m);
	}
}
}
