package com.A;

 class Base {
	public  Boolean hasEdges(){
		return true;
		
	}
}
public class Derived  extends Base
{
	public static void main(String args[])
	{
		Derived z=new Derived();
		System.out.println(z.hasEdges());
	}
	Derived(){
		System.out.println("child class");
	}
	
}

//class  Hope{