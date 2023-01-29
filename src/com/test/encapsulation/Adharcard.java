package com.test.encapsulation;

class Adharcard 
{
    private String name;
    private long contactnumber;
    private long adharno;
    
    public Adharcard(String name, long contactnumber, long adharno) 
    {
		this.name = name;
		this.contactnumber = contactnumber;
		this.adharno = adharno;
	}
	public String getn()
    {
     System.out.println("generate and validate otp");
     return name;
    }
    public long getcontactnumber()
    {
     System.out.println("generate and validate otp");
     return contactnumber;
    }
    public long getadharno()
    {
     System.out.println("generate and validate otp");
     return adharno;
    }
    public void setname(String n)
    {
    	System.out.println("generate and validate otp");
    	name=n;
    }
    public void setcntno(long cn)
    {
    	System.out.println("generate and validate otp");
    	contactnumber=cn;
    }
    public void setadhno(long adn)
    {
    	System.out.println("generate and validate otp");
    	adharno=adn;
    }
}
