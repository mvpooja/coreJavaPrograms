//swapping of two numbers without using temp
package com.test.prog;
public class Program7 
{
  public static void main(String[] args) 
  {
	int a=6,b=8;
	System.out.println("before swap");
	System.out.println(a);
	System.out.println(b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swap");
	System.out.println(a);
	System.out.println(b);
	
}
}
