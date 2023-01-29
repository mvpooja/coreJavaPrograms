package com.test.str;
import java.util.Scanner;
public class Removespe 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String:");
	String a=s.nextLine();
	a=a.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(a);
}
}
