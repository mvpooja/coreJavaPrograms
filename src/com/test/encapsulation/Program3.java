package com.test.encapsulation;

public class Program3 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank("sbi","sandip","xyz","bang");
		System.out.println("Bank_name: "+b.getBank_name());
		System.out.println("Bank_manger_name: "+b.getBank_manger_name());
		System.out.println("Branch: "+b.getBranch());
		System.out.println("Bank_head_office :"+b.getBank_head_office());
		b.setBranch("qwert");
		b.setBank_manger_name("sudip");
		System.out.println("Bank_name: "+b.getBank_name());
		System.out.println("Bank_manger_name: "+b.getBank_manger_name());
		System.out.println("Branch: "+b.getBranch());
		System.out.println("Bank_head_office :"+b.getBank_head_office());

	}

}
