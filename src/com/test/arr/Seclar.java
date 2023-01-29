package com.test.arr;

public class Seclar 
{
public static void main(String[] args) 
{
	int a[]= {5,3,4,1};
	int sec=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>a[i])
			{
				sec=a[j];
			}
		}
	}
	
	System.out.println("the  sec largest value is "+sec);
}
}
