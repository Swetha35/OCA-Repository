package com.java;

public class Display {
	public  void  display()
	{
	int	m=-1;
	int n=1;
	int p;
	p= (m--)-(++n);
	
	System.out.println(n);
	System.out.println(m);
	System.out.println(p);	
	}
	public static void main(String  args[])
	{
		Display obj=new Display();
		obj.display();
}
}
