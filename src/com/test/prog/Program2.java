package com.test.prog;
import java.util.Scanner;

public class Program2
{
 public static void main(String[] args)
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Student total marks and percentage");
	int m1=s.nextInt();
	int m2=s.nextInt();
	int m3=s.nextInt();
	int m4=s.nextInt();
	float tot=m1+m2+m3+m4;
	System.out.println("Total="+tot);
	float per=(tot/400)*100;
	System.out.println("Percentage="+per);
	
}
}
