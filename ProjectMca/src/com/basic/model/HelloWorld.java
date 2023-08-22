package com.basic.model;

public class HelloWorld 
{
	int c;
	public HelloWorld(int a, int b) 
	{
		c = a + b;
		System.out.println(c);
	}
	
public static void main(String[] args) 
{
	System.out.println("Hellow world");
	HelloWorld obj = new HelloWorld(5,3);
}
}