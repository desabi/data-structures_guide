package com.desabisc.ds.guide.linear.arrays.easy;

import com.desabisc.ds.guide.linear.util.Utils;

public class EvenAndOdds {
    public static void main(String[] args) {
        int[] randomNumbers = Utils.getRandomNumbers(5);
        showEvenAndOdd(randomNumbers);
    }

    static void showEvenAndOdd(int[] numbers) {
        int evenCounter = 0;
        int oddCounter = 0;
        for (int currentNumber: numbers) {
            if ((currentNumber % 2) == 0) {
                evenCounter++;
            } else  {
                oddCounter++;
            }
        }
        System.out.println("evens = " + evenCounter);
        System.out.println("odds = " + oddCounter);
    }
}
