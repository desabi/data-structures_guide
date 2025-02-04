package com.desabisc.ds.guide.linear.arrays.easy;

public class SumElements {

    // Write a method that takes an array of integers and returns the sum of all elements.
    public static void main(String[] args) {
        int sum = sumElements(new int[]{1, 2, 3, 4, 5});
        System.out.println("The sum is: " + sum);
    }

    public static int sumElements(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
