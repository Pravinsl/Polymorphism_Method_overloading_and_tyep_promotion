package com.Type_promotion;

public class OverloadingExample {
   public void add(int a, int b) {
	   System.out.println("add method with 2 int argument "+(a+b));
   }
  public void add(int a, int b, int c) {
	   System.out.println("add method with 3 int argument "+(a+b+c));
   }
  public void add(int a, long b) {
	   System.out.println("add method with 2 argument but b of these is long "+(a+b));
   }
   public void add(long a, int b) {
	   System.out.println("add method with 2 argument but b of these is long "+(a+b));
   }

}
