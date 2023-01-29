package com.test.prog;
import java.util.Scanner;
public class Reverse2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int rev;
		while(n>0)
		{
			rev=n%10;
			System.out.print(rev);
			n=n/10;
		}
	}
}
