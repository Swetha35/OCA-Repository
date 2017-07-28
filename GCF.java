package com.A;


import java.util.Scanner;

public class GCF {

	public static void main(String[] args)
	{
	int n1,n2,n3,i,result = 0;
	System.out.println("Enter any three numbers:");

	Scanner a=new Scanner(System.in);
	n1=a.nextInt();
	n2=a.nextInt();
	n3=a.nextInt();
	for(i=2;i<=n3;i++)
	{
		if((n1%i==0)&&(n2%i==0)&&(n3%i==0))
		{
			      
					System.out.println("common factor is:"+i);
					result=i;
				}
	}
	System.out.println("GCF is:"+result);
	
	}
	void lcm(int x1,int x2,int x3)
	{
	System.out.println("Enter any three values:");
		Scanner s=new Scanner(System.in);
		x1=s.nextInt();
		x2=s.nextInt();
		x3=s.nextInt();
		
		
		
		
	}
	}
