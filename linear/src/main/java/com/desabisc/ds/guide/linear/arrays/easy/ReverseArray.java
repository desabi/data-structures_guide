package com.desabisc.ds.guide.linear.arrays.easy;

import com.desabisc.ds.guide.linear.util.Utils;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] randomNumbers = Utils.getRandomNumbers(5);
        getReversedArray(randomNumbers);
        reverseArray(randomNumbers);
    }

    static void getReversedArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        int position = 0;
        for (int index = numbers.length - 1; index >= 0; index--) {
            reversedArray[position] = numbers[index];
            position++;
        }
        System.out.println("reversedArray = " + Arrays.toString(reversedArray));
    }

    /**
     * Array: [1, 2, 3, 4, 5]
     *         ^           ^
     *       left        right
     * swamp:
     * Array after swap: [5, 2, 3, 4, 1]
     *                    ^           ^
     *                  left        right
     * move pointers:
     * Array: [5, 2, 3, 4, 1]
     *            ^     ^
     *          left   right
     *
     * @param numbers the random numbers.
     */
    public static void reverseArray(int[] numbers) {
        int left = 0; // represents the start of the array
        int right = numbers.length - 1; // represents the end of the array

        while (left < right) {
            // Swap elements at left and right indices
            int temp = numbers[left]; // save the left value in a temporary variable
            numbers[left] = numbers[right]; // move the right value to the left
            numbers[right] = temp; // move the saved left value to the right

            // Move pointers
            left++;
            right--;
        }
        System.out.println("Reversed array = " + Arrays.toString(numbers));
    }
}
