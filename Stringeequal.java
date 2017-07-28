package com.strings;

public class Stringeequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="navy";
String  s2=new String("navy");
StringBuilder sb=new StringBuilder("navy");
System.out.println(s1.equals(s2));
System.out.println(s1==s2);
//System.out.println();
System.out.println(s2.toString() == s1); 
System.out.println(sb.toString().equals(s1)); 

}

}
