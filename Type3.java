package com.anil.learning.methods;

public class Type3 {
 // no input but some output
	int add() {
		int a=20;
		int b=20;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Type3 t3=new Type3();
		int res=t3.add();
		System.out.println(res);
	}
}
