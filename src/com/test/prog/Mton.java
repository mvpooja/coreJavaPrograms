package com.test.prog;
import java.util.Scanner;
public class Mton 
{
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the Range of numbers");
    int m=s.nextInt();
    int n=s.nextInt();
    for(int i=m;i<=n;i++)
    {
    	System.out.println(i);
    }
  }
}
