package com.test.arr;

public class Largest 
{
 public static void main(String[] args) 
 {
	int a[]= {6,5,4,3,2,1};
	int com=a[0];
	int sm=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>com)
		{
			com=a[i];
		}
		else if(a[i]<sm)
		{
			sm=a[i];
		}
	}
	System.out.println("Largest is "+com);	
	System.out.println("Smallest is "+sm);	
}
}
