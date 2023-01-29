package com.test.prog;
import java.util.Scanner;
public class Fibno 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	int num1=0;
	int num2=1;
	System.out.println("Enter the value to print the fibonacci series:");
	int n=s.nextInt();
	System.out.println(num1);
	System.out.println(num2);
	int res;
	int temp;
	for(int i=2;i<n;i++)
	{
		res=num1+num2;
		temp=num1;
		num1=num2;
		num2=res;
		System.out.println(res);
	}
 }
}
