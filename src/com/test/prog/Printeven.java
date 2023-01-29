package com.test.prog;
import java.util.Scanner;
public class Printeven
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=s.nextInt();
	int i;
	int sum=0;
	for(i=0;i<=n;i+=2)
	{
		sum=sum+i;
		
	}
	System.out.println("sum of even numbers="+sum);
}
}
