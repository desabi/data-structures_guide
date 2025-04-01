package com.desabisc.ds.guide.scottbarrett.recursion;

public class CallStackMain {
  public static void methodThee() {
    System.out.println("Three");
  }

  public static void methodTwo() {
    methodThee();
    System.out.println("Two");
  }

  public static void methodOne() {
    methodTwo();
    System.out.println("One");
  }

  public static void main(String[] args) {
    methodOne();
  }
}
