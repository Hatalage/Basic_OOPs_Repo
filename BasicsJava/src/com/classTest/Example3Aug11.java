package com.classTest;

public class Example3Aug11 {
		public static void main(String[] args) {
		String str1 = "spring" ;
		String str2 = str1.toLowerCase();
		System.out.println(str1==str2);
		String str3 = new String("spring");
		System.out.println(str3 == str2);
		}
}


