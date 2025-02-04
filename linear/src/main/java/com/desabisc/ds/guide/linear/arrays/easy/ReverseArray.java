package com.desabisc.ds.guide.linear.arrays.easy;

import com.desabisc.ds.guide.linear.util.Utils;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] randomNumbers = Utils.getRandomNumbers(5);
        getReversedArray(randomNumbers);
        reverseArray(randomNumbers);
    }

    static int[] getReversedArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        int position = 0;
        for (int index = numbers.length-1; index >= 0; index--) {
            reversedArray[position] = numbers[index];
            position++;
        }
        System.out.println("reversedArray = " +  Arrays.toString(reversedArray));
        return reversedArray;
    }

    public static void reverseArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // Move pointers
            left++;
            right--;
        }
        System.out.println("Reversed array = " + Arrays.toString(numbers));
    }
}
