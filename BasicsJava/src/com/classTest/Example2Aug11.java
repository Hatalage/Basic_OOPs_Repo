package com.classTest;

public class Example2Aug11 {
		public static void main(String[] args) {
		String s1 = "java";
		String s2 = "core";
		String s3 = new String("java");
		String s4 = new String("core");
		String out1 = s1 + s2;
		String out2 = s1.concat(s2);
		System.out.println(out1 == out2);
		String out3 = "javacore";
		String out4 = "java" + s4;
		System.out.println(out1 == out4);
		String out5 = out1.intern();
		System.out.println(out3 == out5);
}
}
