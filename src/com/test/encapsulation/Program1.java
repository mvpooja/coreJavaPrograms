package com.test.encapsulation;

public class Program1 
{
   public static void main(String[] args) 
   {
	Adharcard a=new Adharcard("dfgg",442236886556l,4512236788999l);
	System.out.println(a.getn());
	System.out.println(a.getcontactnumber());
    System.out.println(a.getadharno());
	a.setname("pooja");
	a.setcntno(3245678991987l);
	a.setadhno(4321456789l);
	System.out.println(a.getn());
	System.out.println(a.getcontactnumber());
	System.out.println(a.getadharno());
	
   }
}
