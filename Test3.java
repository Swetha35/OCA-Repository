package com.practice;

import java.util.Scanner;

public class Test3 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if((a/2*2)==a)
	{
		System.out.println("even");
			}
	else
		System.out.println("odd");
	}
}