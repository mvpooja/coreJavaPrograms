package com.test.rtpoly;

public class Program1 
{
  public static void main(String[] args) 
  {
	Eat e1=new Eat();
	e1.food(new Canteen());
	e1.food(new Restaurent());
	e1.food(new Resort());
  }
}
