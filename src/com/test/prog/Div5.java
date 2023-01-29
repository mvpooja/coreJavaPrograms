package com.test.prog;
import java.util.Scanner;
public class Div5 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=s.nextInt();
	if(a%5==0)
	{
		System.out.println("Lucky");
	}
	else
	{
		System.out.println("do nothing");
	}
}
}
