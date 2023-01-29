package com.test.prog;
import java.util.Scanner;
public class Char 
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character:");
	char a=s.next().charAt(0);
	if((a>='a'&& a<='z') || (a>='A' && a<='Z'))
    {
		System.out.println("The character is Alphabet");
	}
	else if(a>='0' && a<='9')
	{
		System.out.println("the character is Number");
	}
	else
	{
		System.out.println("the character is Special character");
	}
	}
}
