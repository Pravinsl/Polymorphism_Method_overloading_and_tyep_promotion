package com.Type_promotion;

public class TypePromotione2 {
  /*void sum (int a, int b) {
	  System.out.println("int arg method invoked");
  }*/
  void sum (long a, long b) {
	  System.out.println("long arg method invoked");
  }
  
  public static void main(String[] args) {
	  TypePromotione2 t1 = new TypePromotione2 ();
	  t1.sum(20, 20); // now int arg  sum() method get invoked
	  t1.sum(20, 20); //
}
}
