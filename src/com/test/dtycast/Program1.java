package com.test.dtycast;

public class Program1 
{
  public static void main(String[] args) 
  {
	Peak ref=new Onground();//up casting
	ref.temple();
	
	Onground res=(Onground) ref;
	res.temple();
	res.land();
  }
}
