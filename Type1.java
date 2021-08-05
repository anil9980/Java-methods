package com.anil.learning.methods;

public class Type1 {
//no input no output
	void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Type1 t1=new Type1();
		t1.add();
	}
}
