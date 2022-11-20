package com.typecasting.demo;

public class TypeCasting {

	public static void main(String[] args) {
//AutoType Conversion
		int x =20;
		double y = 40.5;
		long p= 30;
		float q = 10.60f;
		//int z = x + y; //Error; Cannot convert double to int
		double z = x+y;
		System.out.println("Sum of two numbers: " +z);
		
		//long r = p-q;//Can't convert from float to long
		float r =p-q;
		System.out.println("Subtraction of two numbers: "+r);
		
//AutoType Promotion
		byte b =42;
		char c = 'a';
		short s = 1024;
		int i = 5000;
		float f = 5.67f;
		double d = .1234;
		
		//Expression
		double result  = (f*b)+(i/c)-(d*s);
		//Result after all the promotions are done
		System.out.println("result = "+result);
		
		
//Explicit TypeCasting (Narrowing Conversion)
		double d2 = 100.4;
		//explicit type casting
		long l = (long)d2;
		int i2 = (int)l;
		System.out.println("Double value: "+d2);
		System.out.println("Long value: "+l);
		System.out.println("Int value: "+i2);
		
		
byte b2;
int z2 = 257;
double dou = 323.142;
System.out.println("Conversion of int to byte.");
b2=(byte)z2;
System.out.println("i = "+ z2 + " b = "+b2);
System.out.println("Conversion double to int.");
z2=(int)dou;
System.out.println("d = "+ dou + " b = "+z2);
System.out.println("Conversion double to byte.");
b2 = (byte)dou;
System.out.println("d = "+ dou + " b = "+b2);
		

	}

}
