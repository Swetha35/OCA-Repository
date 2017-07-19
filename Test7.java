package com.practice;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test7 t=new Test7();
char c=4*4;
String s="Fast";
s=t.pearl(s);
System.out.println(Byte.parseByte(s,c));
	}
String pearl(String s)
{
	return s.substring(0,1);
}
}
