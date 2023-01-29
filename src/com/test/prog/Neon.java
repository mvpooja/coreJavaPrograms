package com.test.prog;
import java.util.Scanner;
public class Neon 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int sq=n*n;
	int sum=0;
		int s=sq;
		do
		{
			int r=s%10;
			sum=sum+r;
			int d=s/10;
			s=d;
		}while(s!=0);
		if(sum==n)
		{
			System.out.println("The number is neon because square of the number "+n+"="+sum);
		}
		else
		{
			System.out.println("the number is not neon");
		}
	}

}
