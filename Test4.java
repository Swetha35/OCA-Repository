package com.practice;

public class Test4 {
	public static void main(String[] args) {
	
		Integer intobj=Integer.valueOf(args[args.length-1]);
		int i=intobj.intValue();
		if(args.length>1)
			System.out.println(i);
		if(args.length>0)
			System.out.println(i-1);
		else
			System.out.println(i-2);
	
	}
}
