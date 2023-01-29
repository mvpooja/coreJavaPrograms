package com.test.tycast;

public class Program3 
{
  public static void main(String[] args) 
  {
	Shelter s=new Shelter();
	s.shelter1(new Hut());
	s.shelter1(new Normal_house()); 
    s.shelter1(new Villa());
    
	s.shelter2(new Normal_house()); 
	s.shelter2(new Villa());
	 
	s.shelter3(new Villa());
  }
}
