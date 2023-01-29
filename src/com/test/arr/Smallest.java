package com.test.arr;

public class Smallest 
{
public static void main(String[] args) 
{
	int a[]= {6,11,22,8,13,5};
	int small=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<small)
		{
			small=a[i];
		}
	}
	System.out.println("The smallest is "+small);
}
}
