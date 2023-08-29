package com.classTest;
import java.util.Scanner; 
public class Example1Aug11 {
	
	 	public static void main(String[] args) {  	 	
	 		Scanner sc = new Scanner(System.in);  	 	
	 		Student1 sarr[] = new Student1[2];  	 	
	 		int roll = 1; 
	 	 	for (int i = 0; i < sarr.length; i++) {  	 	 
	 	 		sarr[i] = new Student1();  	 	 
	 	 		sarr[i].setRollno(roll++); 
	 	 	 	sarr[i].setName("john"); 
	 	 	 	for (int j = 0; j < sarr[i].marks.length; j++) { 
	 	 	 	 	sarr[i].marks[j] = 80; 
	 	 	 	} 
	 	 	 	System.out.println(sarr[i]); 
	 	 	} 
	 	} 
	}  
	class Student1 { 
	 	@Override 
	 	public String toString() { 
	 	 	return "rollno=" + rollno + ", name=" + name + ", marks=" + marks; 
	 	} 
	 
	 	public int getRollno() { 
	 	 	return rollno; 
	 	} 
	 
	 	public void setRollno(int rollno) {  	 	
	 		this.rollno = rollno; 
	 	} 
	 
	 	public String getName() { 
	 	 	return name; 
	 	} 
	 
	 	public void setName(String name) { 
	 	 	this.name = name; 
	 	} 
	 
	 	public int[] getMarks() { 
	 	 	return marks; 
	 	} 
	 
	 	public void setMarks(int[] marks) {  	 	
	 		this.marks = marks; 
	 	} 
	 	private int rollno;  	private String name; 
	 	int[] marks = new int[3]; 
	} 


