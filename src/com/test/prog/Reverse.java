package com.test.prog;
import java.util.Scanner;
public class Reverse 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int rev=0;
	do
	{
		int r=n%10;
		rev=rev*10+r;
		int d=n/10;
		n=d;
	}while(n!=0);//condition is true repeat the loop ,if it is false come out of the loop
	System.out.println("reverse number "+rev);
}
}
