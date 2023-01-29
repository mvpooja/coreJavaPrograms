package com.test.exp;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program2 
{
  public static void main(String[] args)
  {
	try 
  {
	 Scanner s=new Scanner(System.in);
	  System.out.println("enter first number");
	  int a=s.nextInt();
	  System.out.println("enter second number");
	  int b=s.nextInt();
	  System.out.println("divide");
	  float div=a/b;
	  System.out.println("answer="+div);
  }
  catch(InputMismatchException ref)
  {
	  System.out.println("alternate code1");
  }
  catch(ArithmeticException r) 
	{ 
	  System.out.println("alternate code2"); 
	 }
	System.out.println("operation completed");
}
}
