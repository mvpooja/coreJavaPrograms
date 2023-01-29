package com.test.abst;

class Kcet_website 
{
   Government select(char c)
   {
	   if(c=='A')
	   {
		   return new CollegeA();
	   }
	   else
	   {
		   return new CollegeB();
	   }
   }
}
