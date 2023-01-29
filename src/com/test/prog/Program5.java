//gratest of three numbers
package com.test.prog;
import java.util.Scanner;
public class Program5 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 3 numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a>b && a>c)
	{
		System.out.println("The Larger number is:"+a);
	}
	else if(b>c && b>a)
	{
		System.out.println("The Larger number is:"+b);
	}
	else
	{
		System.out.println("The Larger number is:"+c);
	}
 }
}
