//printing person name,age,mobile no,city name
package com.test.prog;
import java.util.Scanner;
public class Program4 
{
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Deatails of a person");
	System.out.println("Enter name:");
	String n=s.nextLine();
	System.out.println("Enter age:");
    int a=s.nextInt();
    System.out.println("Enter Mobileno:");
	long mn=s.nextLong();
	System.out.println("Enter city name:");
	String cn=s.next();
	System.out.println("Name:"+n);
	System.out.println("Age:"+a);
	System.out.println("Mobile Number:"+mn);
	System.out.println("City Name:"+cn);
  }
}
