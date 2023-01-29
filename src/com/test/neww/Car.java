package com.test.neww;
//composition
public class Car 
{
 String model;
 String color;
 String type;
 int no_of_wheels;
 double price;
 String brand;
 Engine e=new Engine();
public Car(String model, String color, String type, int no_of_wheels, double price, String brand) 
{
	this.model = model;
	this.color = color;
	this.type = type;
	this.no_of_wheels = no_of_wheels;
	this.price = price;
	this.brand = brand;
}
public static void main(String[] args) 
{
	Car c=new Car("yzx23er","Red","Race",4,456789,"rrr");
	System.out.println(c.model);
	System.out.println(c.color);
	System.out.println(c.type);
	System.out.println(c.no_of_wheels);
	System.out.println(c.price);
	System.out.println(c.brand);
	System.out.println(c.e.type);
	System.out.println(c.e.capacity);
	System.out.println(c.e.strokes);
	System.out.println(c.e.number);
	System.out.println(c.e.model);
	System.out.println(c.e.power);
}
 

}
