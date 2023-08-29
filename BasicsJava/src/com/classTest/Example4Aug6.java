package com.classTest;

public class Example4Aug6 {
public static void main(String[] args) {
	int arr[][]= {{0,0,0,0},{0,0,0,1},{0,0,1,1},{0,1,1,1}};
	int rows=arr.length;
	int cols=arr.length;
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
