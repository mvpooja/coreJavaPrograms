package com.test.prog;
import java.util.Scanner;
public class Abodantnum 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum+=i;
		}
	}
	if(sum>n)
	{
		System.out.println("The number is abodanant");
	}
	else
	{
		System.out.println("The number is not abodanant");
	}
}
}
