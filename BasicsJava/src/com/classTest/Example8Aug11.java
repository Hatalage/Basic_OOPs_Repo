package com.classTest;

import java.util.Arrays;

public class Example8Aug11 {
	    public static void pushZerosToEnd(int[] arr) {
	        int count = 0; // Count of non-zero elements
	        
	        // Traverse the array, move non-zero elements to the front
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                arr[count++] = arr[i];
	            }
	        }
	        
	        // Fill the remaining indices with zeros
	        while (count < arr.length) {
	            arr[count++] = 0;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {10, 0, 3, 5, 0, 21, 0, 22};
	        
	        System.out.println("Original array: " + Arrays.toString(arr));
	        
	        pushZerosToEnd(arr);
	        
	        System.out.println("Array after pushing zeros to the end: " + Arrays.toString(arr));
	    }
}

