package com.anil.learning.methods;

public class LocalInstanceVaraibles {
	// any variable present inside the class and outside the method is called instance variable
     int a=20;  //instance variable
     int b=30;  //instance variable
  // any variables present inside the method is called local variable  
     int add(int c,int d) {     //c and d are local variables
    	int e=10; //local variable
    	int f= a+b+c+d+e;
    	return f;
    }
     public static void main(String[] args) {
    	 LocalInstanceVaraibles li=new LocalInstanceVaraibles();
    	 int x=10;
    	 int y=20;
    	 int res=li.add(x,y);
    	 System.out.println(res);
	}
}
