package com.test.prog;
import java.util.Scanner;
public class Inc 
{
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the last number");
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
    	System.out.println(i);
    }
  }
}
