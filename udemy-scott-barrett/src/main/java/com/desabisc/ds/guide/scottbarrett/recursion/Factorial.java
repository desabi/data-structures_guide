package com.desabisc.ds.guide.scottbarrett.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Factorial {

  public static int factorial(int number) {
    if (number == 1) {
      return 1;
    }
    int result = number * factorial(number - 1) ;
    log.info("result: {}", result);
    return result;
  }

  public static void main(String[] args) {
    int myFac = factorial(4);
    log.info("Factorial: {}", myFac);
  }

}
