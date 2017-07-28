package com.strings;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
        int j; 
        for (i=1; i < 4; i++) { 
           for (j=2; j < 4; j++) { 
              if (j == 3) { 
                 continue; 
              } 
              System.out.println("i: " + i + " j: " + j); 
           } 
        } 
	}

}
