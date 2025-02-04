package com.desabisc.ds.guide.linear.util;

import java.util.Arrays;
import java.util.Random;

public class Utils {

    public static int[] getRandomNumbers(int total) {
        int[] randomNumbers = new int[total];
        Random random = new Random();
        for (int i = 0; i < total; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Random numbers:" + Arrays.toString(randomNumbers));
        return randomNumbers;
    }
}
