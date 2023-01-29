package com.test.encapsulation;

public class Program2 
{
public static void main(String[] args) 
{
	Facebook f=new Facebook("pooja","12p345","12qwer34");
	System.out.println("usename: "+f.getUser_name());
	System.out.println("userid: "+f.getUser_id());
	f.setUser_name("abcd");
	f.setPassword("qw128ert");
	System.out.println("usename: "+f.getUser_name());
	System.out.println("userid: "+f.getUser_id());
}
}
