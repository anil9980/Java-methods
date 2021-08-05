package com.anil.learning.methods;


// nothing is overloaded in method overloading.
// it looks users as polymorphism but it is acutally virtual polymorphism
//one method doing one job only but it looks user one method is doing multiple jobs.
//two or more method have same name but different in their signature.
public class MethodOverloading {
	int a=10,b=10,c=20;
	float d=10.0f,e=2.8f,f=5.6f;
	long g=1111L,h=86968L;
	double i=4.89,j=8.95;
	boolean k=true,l=false;
	
	int add(int x,int y) {
		return x+y;
	}
	int add(int x,int y,int z) {
		return x+y+z;
	}
	float add(float x,int y) {
		return x+y;
	}
	boolean add(boolean x,boolean y) {
		return x;
	}
	double add(int x, float y ,double z) {
		return x+y+z;
	}
	void add(float x,float y) {
		float z=(int)x+(int)y;
		System.out.println(z);
	}
public static void main(String[] args) {
	MethodOverloading mo=new MethodOverloading();
	int res1=mo.add(10, 20);
	System.out.println(res1);
	
	boolean res2=mo.add(false, true);
	System.out.println(res2);
	
	mo.add(2.4f, 5.6f);
}
}
