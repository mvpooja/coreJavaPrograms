package com.test.prog;
import java.util.Scanner;
public class Leapyear 
{
  public static void main(String[] args) 
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the year");
	  int y=s.nextInt();
	  if(y%4==0)
	  {
		  if(y%100==0)
		  {
			  if(y%400==0)
			  {
				  System.out.println("It is a leap year");
			  }
			  else
			  {
				  System.out.println("It is not a leap year");
			  }
		  }
		  else if(y%100!=0)
		  {
			  System.out.println("It is a leap year");
		  }
		  
	  }
	  else
	 {
	     System.out.println("It is not a leap year");
	 }
	 
}
	
  
}
