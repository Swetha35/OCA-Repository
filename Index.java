package com.strings;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "animals";
		System.out.println(string.indexOf('a')); // 0
		System.out.println(string.indexOf("al")); // 4
		System.out.println(string.indexOf('a', 4)); // 4
		System.out.println(string.indexOf("al", 5)); // -1
	}

}
