package com.test.abst;

class Calculator 
{
   Arithmaticopr selectoperation(char c)
  {
	  if(c=='A')
	  {
		  return new Add();
	  }
	  else
	  {
		 return new Sub(); 
	  }
  }
}
