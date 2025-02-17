package com.desabisc.ds.guide.linear.arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] numbers = {3, 5, 7, 3, 6, 9, 5, 7, 10};
    System.out.println(Arrays.toString(numbers));

    int[] ints = removeDuplicates(numbers);
    System.out.println(Arrays.toString(ints));
  }

  public static int[] removeDuplicates(int[] numbers) {
    // Step 1: Create a HashSet to store unique values
    Set<Integer> uniqueSet = new HashSet<>();

    // Step 2: Add elements to the HashSet
    for (int currentNumber : numbers) {
      uniqueSet.add(currentNumber);
    }

    // Step 3: Convert the HashSet back to an array
    int[] resultArray = new int[uniqueSet.size()];
    int index = 0;
    for (int currentNumberInSet : uniqueSet) {
      resultArray[index++] = currentNumberInSet;
    }

    // Step 4: Return the result
    return resultArray;
  }
}
