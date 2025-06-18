package com.java.project.practice;

public class Operation {
	public static void add(int a,int b) {
		System.out.print(a+b);
		System.out.println("Completed");
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
		System.out.println("Completed");
	}
	public static void mul(int a,int b) {
		System.out.println(a*b);
		System.out.println("Completed");
	}
	public static void div(int a,int b) {
		if(a==0 || b==0) {
			System.out.println("Number canot be divided by zero");
		}
		System.out.println(a/b);
		System.out.println("Completed");
	}
}
