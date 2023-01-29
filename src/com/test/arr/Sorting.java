package com.test.arr;
import java.util.Arrays;
public class Sorting 
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,56,4,7};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	
}
}
