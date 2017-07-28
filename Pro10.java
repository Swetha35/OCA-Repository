package com.A;

import java.util.ArrayList;
import java.util.List;

public class Pro10{
	  public static void main(String[] argv){
	     int[] array = {6,9,8}; 
	     List<Integer> list = new ArrayList<>(); 
	     list.add(array[0]); 
	     list.add(array[2]); 
	     try{
	    	 list.set(2, array[1]); 
	    	 
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("ArrayIndexOutOfBoxException  ");
	     }
	     list.remove(0); 
	     System.out.println(list); 
	  }
	}
