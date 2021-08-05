package com.anil.learning.methods;
/*
com.anil.learning.methods.RefernceVariables@6d06d69c
[I@7852e922    integer
[B@4e25154f    byte
[S@70dea4e     short
[J@5c647e05    long
[F@33909752    float
[D@55f96302    double
[Z@3d4eac69    boolean
[C@42a57993    char
anil           string will default call toString method so it will not print hash code

 */
public class RefernceVariables {
    int age=22;
    
    public static void main(String[] args) {
    	
    	RefernceVariables rv=new RefernceVariables();
		System.out.println(rv);
		
		int arr1[]=new int[5];
		System.out.println(arr1);
		
		byte arr2[]=new byte[5];
		System.out.println(arr2);
		
		short arr3[]=new short[5];
		System.out.println(arr3);
		
		long arr4[]=new long[5];
		System.out.println(arr4);
		
		float arr5[]=new float[5];
		System.out.println(arr5);
		
		double arr6[]=new double[5];
		System.out.println(arr6);
		
		boolean arr7[]=new boolean[5];
		System.out.println(arr7);
		
		char arr8[]=new char[5];
		System.out.println(""+arr8);
		
		// you can use hashCode() method to get hashcode of any object
		String s1="anil";
		System.out.println(s1);
		
	    String s2=new String();
	    System.out.println(s2);
		
	}
}
