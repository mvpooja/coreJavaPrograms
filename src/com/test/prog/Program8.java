package com.test.prog;

public class Program8 
{
  public static void main(String[] args) 
  {
	int total_students=90;
	int total_boys=45;
	System.out.println("Total students given is "+total_students);
	System.out.println("Total boys given is "+total_boys);
	float gradeA=50;
	System.out.println("Grade A secured in terms of % "+gradeA);
	float grA=total_students*(gradeA/100);
	System.out.println("Grade A secured in terms of numbers "+grA);
	int bgA=20;
	System.out.println("Boys secured grade A is given by:"+bgA);
	float res=grA-bgA;
	System.out.println("Total number of girls secured grade A is "+res);
  }
}
