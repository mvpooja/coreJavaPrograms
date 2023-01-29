package com.test.libr;
class Demo1
{
	
}
class Demo2
{
	public int hashCode()
	{
		return 12;
	}
}
class Demo3
{
	public String toString()
	{
		return "somthing";
	}
}
public class Program2 
{
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		System.out.println(d1.toString());
		System.out.println(d1);
		System.out.println(d1.hashCode());
		Demo2 d2=new Demo2();
		System.out.println(d2.toString());
		System.out.println(d2.hashCode());
		Demo3 d3=new Demo3();
		System.out.println(d3.toString());
		System.out.println(d3);
	}	
}
