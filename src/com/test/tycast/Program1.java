package com.test.tycast;

public class Program1 
{
	public static void main(String[] args) 
	{
		Root3 r3=new Root3();
		r3.sky();
		r3.roads();
		r3.water();
		Root1 r1=r3;
		r1.roads();
		Root2 r2=r3;
		r2.roads();
		r2.water();
	}

}
