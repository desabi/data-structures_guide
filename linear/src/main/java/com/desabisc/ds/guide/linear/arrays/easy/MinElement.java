package com.desabisc.ds.guide.linear.arrays.easy;

import com.desabisc.ds.guide.linear.util.Utils;

public class MinElement {
    public static void main(String[] args) {
        int[] number = Utils.getRandomNumbers(6);
        getMinElement(number);
    }

    public static int getMinElement(int[] numbers) {
        // Step 1: initialize minNumber with the first element of the array.
        int minNumber = numbers[0];

        for(int currentNumber: numbers) { // Step 2: Loop through the array
            if (currentNumber < minNumber) { // Step 3: Compare each element with min
                minNumber = currentNumber; // Step 4: Update min if a min number is found
            }
        }
        System.out.println("minNumber = " + minNumber);
        return minNumber; // Step 5: Return the min value
    }
}
