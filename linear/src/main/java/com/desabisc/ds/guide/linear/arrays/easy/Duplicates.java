package com.desabisc.ds.guide.linear.arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
  public static void main(String[] args) {
    //int[] numbersA = new int[] {9, 2, 3, 6, 7, 4};
    int[] numbersB = new int[] {2, 5, 8, 10, 5, 1};
    int[] numbersC = new int[] {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};

    System.out.println(getDuplicated(numbersC));
  }

  /**
   * The current solution has a time complexity of O(n²) due to the nested loops.
   * For large arrays, this might not be efficient.
   *
   * @param numbers the numbers array.
   */
  static void findDuplicates(int[] numbers) {
    // iterate through each element in the array
    for (int i = 0; i <= numbers.length; i++) {
      // compare the current element with the rest
      for (int j = i + 1; j < numbers.length; j++) {
        int intA = numbers[i];
        int intB = numbers[j];
        if (intA == intB) {
          System.out.println("Duplicated found: " + numbers[i]);
        }
      }
    }
  }

  static List<Integer> getDuplicated(int[] arrayOfNumbers) {
    List<Integer> listDuplicated = new ArrayList<>();

    // iterate through each element in the array
    for (int i = 0; i <= arrayOfNumbers.length; i++) {
      // compare the current element with the rest
      for (int j = i + 1; j < arrayOfNumbers.length; j++) {
        int intA = arrayOfNumbers[i];
        int intB = arrayOfNumbers[j];
        if (intA == intB) {
          if (!listDuplicated.contains(arrayOfNumbers[1])) {
            listDuplicated.add(arrayOfNumbers[i]);
            break;
          }
        }
      }
    }

    return listDuplicated;
  }

  /**
   * We can optimize this by using a HashSet, which allows for average O(1) time complexity
   * for insertions and lookups.
   *
   * @param numbers
   * @return
   */
  static Set<Integer> getDuplicates(int[] numbers) {
    HashSet<Integer> hashSetDuplicates = new HashSet<>();
    // A HashSet stores unique elements, so any duplicate insertion will fail.
    HashSet<Integer> hashSetSeen = new HashSet<>();
    // Try to add each element to the HashSet.
    for (int currentNumber : numbers) {
      // If an element cannot be added (i.e., it's already present), a duplicate exists.
      boolean repeated = !hashSetSeen.add(currentNumber);
      if (repeated) {
        // add the current number as duplicated
        hashSetDuplicates.add(currentNumber);
      }
    }
    return hashSetDuplicates;
  }


}
