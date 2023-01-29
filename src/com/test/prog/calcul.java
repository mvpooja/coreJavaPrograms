package com.test.prog;
import java.util.Scanner;
public class calcul 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 2 Numbers:");
	int a=s.nextInt();
	int b=s.nextInt();
	int i=1;
	while(i==1)
	{
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("Select any one of the option");
	int c=s.nextInt();
	switch(c)
	{
	case 1:int res1=a+b;
	                System.out.println(a+"+"+b+"="+res1);
	                break;
	case 2:int res2=a-b;
                       System.out.println(a+"-"+b+"="+res2);
                       break;
	case 3:int res3=a*b;
                       System.out.println(a+"*"+b+"="+res3);
                       break;
	case 4:float res4=a/b;
	                System.out.println(a+"/"+b+"="+res4);
	                break;
	case 0: i=0;
		System.out.println("exit");
	        break;
	default:System.out.println("Please enter valid input");
	}
	}
}
}
