package com.test.abst;

class Program2 
{
   public static void main(String[] args) 
   {
	Kcet_website k=new Kcet_website();
	Government g=k.select('A');
	g.course();
	g.location();
	g.feestruct();
}
}
