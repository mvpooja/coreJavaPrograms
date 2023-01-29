//perfect no=6,28
//6=>1,2,3=>1+2+3=6
//28=>1,2,4,7,14=> 1+2+4+7+14=28
package com.test.prog;
import java.util.Scanner;
public class Perfectno 
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
			sum=sum+i;
		}
	}
	System.out.println("The sum is "+sum);
	if(sum==n)
	{
		System.out.println("The given number "+n+" is a perfect number");
	}
	else
	{
		System.out.println("The given number "+n+" is a not a perfect number");
	}
}
}