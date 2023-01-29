package com.test.encapsulation;

public class Facebook 
{
   private String user_name;
   private String user_id;
   private String password;

   public Facebook(String user_name, String user_id, String password) 
   {
	this.user_name = user_name;
	this.user_id = user_id;
	this.password = password;
   }

   public String getUser_name() 
   {
	return user_name;
   }

   public void setUser_name(String user_name) 
   {
	this.user_name = user_name;
   }

   public String getUser_id()
   {
	return user_id;
   }

  public void setPassword(String password) 
  {
	this.password = password;
  } 
}
