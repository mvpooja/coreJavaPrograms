package com.test.tycast;

public class Program2 
{
	public static void main(String[] args) 
	   {
		   Forest f1=new Forest();
		   System.out.println(f1.plants);
		   f1.area();
		   System.out.println(f1.trees);
		   f1.resource();
		   
		   Cultivateland c1=f1;
		   System.out.println(c1.plants);
		   c1.area();  
	   }
}
