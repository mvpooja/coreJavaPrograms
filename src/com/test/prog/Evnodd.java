package com.test.prog;
import java.util.Scanner;
public class Evnodd 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=s.nextInt();
	String res=(a%2==0)?"Even":"Odd";
	System.out.println("The number "+a+" is "+res);
}
}
