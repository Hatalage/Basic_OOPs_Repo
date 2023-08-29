package com.classTest;

public class Example6Aug11 {
	    public static void main(String[] args) {
	        String input = "u8aba4q5";
	        int sum = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (Character.isDigit(c)) {
	                sum = sum+ Character.getNumericValue(c);
	            }
	        }
	        System.out.println("Sum of digits in the string: " + sum);
	    }
}

