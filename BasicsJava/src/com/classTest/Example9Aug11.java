package com.classTest;

import java.util.Scanner;

class Dept {
	    private int did;
	    private String dname;
	    private Emp[] earr;

	    public Dept(int did, String dname, Emp[] earr) {
	        this.did = did;
	        this.dname = dname;
	        this.earr = earr;
	    }
	}

	class Emp {
	    private int eid;
	    private String name;

	    public Emp(int eid, String name) {
	        this.eid = eid;
	        this.name = name;
	    }
	}

	public class Example9Aug11 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Dept[] darr = new Dept[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter department ID:");
	            int did = sc.nextInt();
	            System.out.println("Enter department name:");
	            String dname = sc.next();
	            Emp[] earr = new Emp[2];

	            for (int j = 0; j < 2; j++) {
	                System.out.println("Enter employee ID:");
	                int eid = sc.nextInt();
	                System.out.println("Enter employee name:");
	                String name = sc.next();
	                earr[j] = new Emp(eid, name);
	            }

	            darr[i] = new Dept(did, dname, earr);
	        }
	    }
	}

