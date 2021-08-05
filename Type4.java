package com.anil.learning.methods;

public class Type4 {
 // having some input and output
// if we use static keyword in method then no need to create any object for access,we can
	// access directly calling by method name
	static	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		int res=add(10,20);
		System.out.println(res);
	}
}
