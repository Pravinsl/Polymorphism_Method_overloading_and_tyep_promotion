package com.Type_promotion;

public class TypePromotionE {
  /*public static void main(String[] args) {
	double num = 10;
	int result = num + 5.5; // error show the  because the int doesn't not get the double value but double get the int value
	System.out.println(result);
 }*/
	/*public static void main(String[] args) {
		int a = 5;
		float b = 4.5f;
		float result = a + b ; // int a will be promoted to float value
		System.out.println(result);
	}*/
	public static void main(String[] args) {
		byte b = 10;
		int result = b * 10; // byte b will be promoted to int 
		System.out.println(result);
	}
}
