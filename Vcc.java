package com.A;

public class Vcc{
	  public static void main(String[] argv){
	     System.out.print("a"); 
	     try { 
	       System.out.print("b"); 
	      throw new IllegalArgumentException(); 
	     } catch (RuntimeException e)
	     { 
	       System.out.print("c"); 
	     } finally { 
	       System.out.print("d"); 
	     } 
	     System.out.print("e"); 
	  }
	}
