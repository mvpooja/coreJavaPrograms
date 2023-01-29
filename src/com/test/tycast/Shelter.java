package com.test.tycast;

public class Shelter 
{
   void shelter1(Hut h)
   {
	   System.out.println("Hut");
	   h.live();
   }
   void shelter2(Normal_house n)
   {
	   System.out.println("Normal house");
	   n.live();
	   n.rooms();
   }
   void shelter3(Villa v)
   {
	   System.out.println("Villa");
	   v.live();
	   v.rooms();
	   v.duplex();
	   v.garden();
	   v.swimmingpool();
   }
}
