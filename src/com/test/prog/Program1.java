package com.test.prog;
import java.util.Scanner;

public class Program1 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("addition");
	int a=s.nextInt();
	int b=s.nextInt();
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;
	int modulus=a%b;
	System.out.println("sum="+sum);
	System.out.println("subtraction="+sub);
	System.out.println("multiplication="+mul);
	System.out.println("Division="+div);
	System.out.println("modulus="+modulus);
	
 }
}
