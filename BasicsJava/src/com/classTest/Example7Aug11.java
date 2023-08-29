package com.classTest;

public class Example7Aug11 {
	    public static void main(String[] args) {
	        String str = "I like spring programming";
	        String[] words = str.split(" ");
	        String longestWord = "";
	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }
	        System.out.println("Longest word is: " + longestWord);
	    }
}

