package com.test.exp;
import java.io.IOException;
public class Program3 
{
    public static void main(String[] args) 
    {
    	try
    	{
    	System.out.println("print");
    	throw new IOException();
    	}
    	catch(IOException ref)
    	{
    		System.out.println("code");
    	}
    }
}
