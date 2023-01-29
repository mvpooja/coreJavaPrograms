package com.test.prog;
import java.util.Scanner;
public class Divs 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int sum=0;
	System.out.println("The Divisors are:");
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
			System.out.println(i);
		}
	}
	System.out.println("The sum is "+sum);
}
}
