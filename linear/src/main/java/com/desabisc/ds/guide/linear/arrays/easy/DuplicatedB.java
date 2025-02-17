package com.desabisc.ds.guide.linear.arrays.easy;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatedB {
  public static void main(String[] args) {
    List<Integer> listOfNumber = List.of(2, 5, 8, 10, 5, 1);
    List<Integer> duplicated = getDuplicated(listOfNumber);
    System.out.println("duplicated = " + duplicated);
  }

  // https://www.baeldung.com/java-list-find-duplicates
  static List<Integer> getDuplicated(List<Integer> listOfNumbers) {
    Set<Integer> elements = new HashSet<>();
    return listOfNumbers.stream()
        .filter(currentNumber -> !elements.add(currentNumber))
        .toList();
  }
}
