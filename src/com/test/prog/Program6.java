//swapping of two numbers using another variable
package com.test.prog;
public class Program6 
{
   public static void main(String[] args) 
   {
	 int a=6;
	 int b=8;
	 System.out.println("before swap");
	 System.out.println(a);
	 System.out.println(b);
	 int temp=a;
	 a=b;
	 b=temp;
	 System.out.println("After swap");
	 System.out.println(a);
	 System.out.println(b);
   }
}
