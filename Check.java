package com.practice;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	double d=5/0;
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
System.out.println("The number is div by zero");
	}

}
