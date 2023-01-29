package com.test.abst;

public class Program1 
{
  public static void main(String[] args) 
  { 
	  Calculator c1=new Calculator();
	  Arithmaticopr c2=c1.selectoperation('A');
	  c2.operation();
	  c2.result();
  }
}
