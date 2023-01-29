//wajp to take 2 digit integer no and check it is special two digit number or not
//ex:29=>2+9=11
//     =>2*9=18
//then 11+18=29 so 29 is special two digit number
package com.test.prog;
import java.util.Scanner;
public class Special2digit 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("enter two digit number");
	int n=s.nextInt();
	int u=n%10;
	int t=n/10;
	int a=u+t;
	int m=u*t;
	int res=a+m;
	if(res==n)
	{
		System.out.println("The entered number "+n+" is special number");
	}
	else
	{
		System.out.println("The entered number "+n+" is not a special number");
	}
}
}
