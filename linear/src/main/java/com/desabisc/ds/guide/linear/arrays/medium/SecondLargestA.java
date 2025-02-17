package com.desabisc.ds.guide.linear.arrays.medium;

import com.desabisc.ds.guide.linear.util.Utils;
import java.util.Arrays;

public class SecondLargestA {

  public static void main(String[] args) {
    int[] arrayOfNumbers = Utils.getRandomNumbers(6);
    findSecondLargest(arrayOfNumbers);
  }

  public static int findSecondLargest(int[] numbers) {
    if (numbers.length < 2) {
      throw new IllegalArgumentException("Array must have at least two elements.");
    }

    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    // For each element in the array, we perform the following checks.
    for (int currentNumber : numbers) {
      // If the current element is greater than first.
      if (currentNumber > firstLargest) {
        // Update second to the value of first.
        secondLargest = firstLargest;
        // Update first to the current element.
        firstLargest = currentNumber;
      } else if (currentNumber > secondLargest && currentNumber != firstLargest) {
        // If the current element is not greater than first but is greater than second:
        // Update second to the current element.
        secondLargest = currentNumber;
      }
    }

    if (secondLargest == Integer.MIN_VALUE) {
      throw new IllegalArgumentException("No second largest element found.");
    }

    System.out.println("secondLargest = " + secondLargest);
    return secondLargest;
  }

  static void printSecondLargestNumberA(int[] arrayOfNumbers) {
    int arrayOfNumbersLength = arrayOfNumbers.length;

    // Sort the array in non-decreasing order
    Arrays.sort(arrayOfNumbers);
    System.out.println("arrayOfNumbers = " + Arrays.toString(arrayOfNumbers));

    int result = arrayOfNumbers[arrayOfNumbersLength-2];
    System.out.println("result = " + result);
  }

  static void printSecondLargestNumberB(int arrayOfNumbers) {
    int first = Integer.MIN_VALUE;
  }

}
