package com.basic.model;

public class Multi
{
	int x;
	public Multi(int a,int b)
	{
		x=a*b;
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		Multi obj = new Multi(8,5);
	}

}
