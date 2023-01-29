package com.test.encapsulation;

public class Bank 
{
 private String bank_name;
 private String bank_manger_name;
 private String branch;
 private String bank_head_office;
 public Bank(String bank_name, String bank_manger_name, String branch, String bank_head_office) 
 {
	this.bank_name = bank_name;
	this.bank_manger_name = bank_manger_name;
	this.branch = branch;
	this.bank_head_office = bank_head_office;
 }
 public String getBank_name() 
 {
	return bank_name;
 }
 public String getBank_manger_name() 
 {
	return bank_manger_name;
 }
 public String getBranch() 
 {
	return branch;
 }
 public String getBank_head_office() 
 {
	return bank_head_office;
 }
 public void setBank_manger_name(String bank_manger_name) 
 {
	this.bank_manger_name = bank_manger_name;
 }
 public void setBranch(String branch) 
 {
	this.branch = branch;
 }

 

 
 
}
