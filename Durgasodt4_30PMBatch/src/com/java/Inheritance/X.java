package com.java.Inheritance;

public class X 
{
	
	public  int a=100;
	public final  static  String cname="vmware";
	
	
	
	public  void m1()
	{
		a=10000;
		
		System.out.println("Iam m1 in Class X");
	}

	public static void main(String[] args) 
	{
		X obj=new X();
		obj.m1();
		System.out.println(obj.a);

	}

}
