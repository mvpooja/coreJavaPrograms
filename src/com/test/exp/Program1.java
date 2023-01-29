package com.test.exp;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Program1 
{
  public static void main(String[] args) 
  {
	  try
	  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the integer value");
	  int a=s.nextInt();
	  System.out.println("number="+a);
	  System.out.println("number displayed");
	  }
	  catch(InputMismatchException r)
	  {
		  System.out.println("alternative code executed");
	  }
	  System.out.println("process completed");
  }
	

}

