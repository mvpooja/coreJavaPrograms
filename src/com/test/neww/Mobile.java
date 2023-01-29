package com.test.neww;

public class Mobile 
{
 String Mobile_type;
 Sim s;
 
	public Mobile(String mobile_type) 
	{
	Mobile_type = mobile_type;
}
	void met()
 {
	 System.out.println(Mobile_type);
 }
	public void dis(Sim s)
	{
		if(this.s==null)
		{
			System.out.println("sim is inserted");
		}
	}
	public void dis1()
	{
		if(s!=null)
		{
			System.out.println("sim is removed");
		}
	}
 public static void main(String[] args) 
 {
	Mobile m=new Mobile("samsung");
	m.met();
	m.dis(new Sim("jio"));
	
}
}
