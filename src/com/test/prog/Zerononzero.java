package com.test.prog;
import java.util.Scanner;
public class Zerononzero 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("The number "+n+" is zero number");
		}
		else
		{
			System.out.println("The number "+n+" is nonzero number");
		}
	}
}
