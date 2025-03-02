package com.desabisc.ds.guide.linear.arrays.medium;

import java.util.Arrays;

/**
 * Given an array of size n-1 with distinct integers in the range of [1, n].
 * This array represents a permutation of the integers from 1 to n with one element missing.
 * Find the missing element in the array.
 * <a href="https://www.geeksforgeeks.org/find-the-missing-number/">Source</a>
 */

public class MissingNumber {
  public static void main(String[] args) {
    int[] numbersA = {1, 2, 4, 6, 3, 7, 8};
    int[] numbersB = {1, 2, 4, 5};
    int[] numbersC = {4, 2, 1, 5};
    findMissingNumberC(numbersA);
  }

  /**
   * The idea is to use two nested loops, where the outer one iterate from 1 to n,
   * and inner one iterate for each of the array elements, if the value in outer loop in not found in array,
   * return the value, else iterate to the next value.
   * @param numbers the array of numbers.
   */
  private static void findMissingNumberA(int[] numbers) {
    int n = numbers.length + 1;

    for (int indexA = 1; indexA <= n; indexA++) {
      boolean found = false;

      for (int indexB = 0; indexB < numbers.length; indexB++) {
        System.out.println("indexA = " + indexA + ", numbers[indexB] = " + numbers[indexB]);

        if (numbers[indexB] == indexA) {
          found = true;
          System.out.println("break");
          break;
        }
      }

      if (!found) {
        System.out.println("Missing number: " + indexA);
      }
    }
  }

  /**
   * The idea is to use an auxiliary array to store the frequency of each element in the given array.
   * The number with frequency 0 is the missing number.
   * @param numbers the array of number.
   */
  private static void findMissingNumberB(int[] numbers) {
    // the new size of the array with the missing number included
    int numbersLength = numbers.length + 1; // +1 because it starts from zero 0

    // create an array
    int[] hash = new int[numbersLength + 1]; // +1 is for the extra space for the missing number

    // store the frequency of each element
    for (int index = 0; index < numbers.length; index++) {
                                          // index:           0, 1, 2, 3
      int currentNumber = numbers[index]; // current number: [4, 2, 1, 5]
      // given the current number in the current index
      // stores 1 (represents the frequency) in the new array index position
      // numbers[0] = 4
      // hash[4] = 1
      // hash array index:  0, 1, 2, 3, 4, 5
      // hash array value: [0, 0, 0, 0, 1, 0]
      hash[currentNumber]++;
    }

    // find the missing number
    for (int index = 1; index <= numbersLength; index++) {
      // if the number has zero frequency, then is the missing number
      if (hash[index] == 0) {
        System.out.println("Missing number: " + index);
      }
    }
  }

  /**
   * The sum of the first n natural numbers is given by the formula (n * (n + 1)) / 2.
   * The idea is to compute this sum and subtract the sum of all elements in the array from it
   * to get the missing number.
   *
   * @param numbers the array of integers.
   */
  private static void findMissingNumberC(int[] numbers) {
    System.out.println("Numbers: " + Arrays.toString(numbers));
    int n = numbers.length + 1;

    // calculate the sum of the array elements
    int sum = 0;
    for (int index = 0; index < n - 1; index++) {
      sum += numbers[index];
    }
    System.out.println("sum = " + sum);

    int sum1 = Arrays.stream(numbers).sum();
    System.out.println("sum1 = " + sum1);

    // calculate the expected sum
    int expectedSum = (n * (n + 1)) / 2;
    System.out.println("expectedSum = " + expectedSum);

    // get the missing number
    int missingNumber = expectedSum - sum;
    System.out.println("missingNumber = " + missingNumber);
  }

}
