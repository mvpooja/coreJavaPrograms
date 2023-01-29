package com.test.libr;

class Method
{
	int a;
	char c;
	public Method(int a,char c)
	{
		this.a=a;
		this.c=c;
	}
	public boolean equals(Object ob)
	{
		Method m=(Method) ob;
		return this.a==m.a & this.c==m.c;
	}
	
}

public class Program3 
{
  public static void main(String[] args) 
  {
	Method m1=new Method(23,'f');
	Method m2=new Method(23,'f');
	boolean r=m1.equals(m2);
	System.out.println(r);
	
  }
}
