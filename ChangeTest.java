package com.strings;


public class ChangeTest {
    private int myValue = 0;//non-static
    
    public void showOne(int myValue){
      myValue = myValue;
    }
    
    public void showTwo(int myValue){
        this.myValue = myValue;
    }    
    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(500);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }
}
