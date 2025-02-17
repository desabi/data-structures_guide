package com.desabisc.ds.guide.linear.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Utils {

    public static int[] getRandomNumbers(int total) {
        int[] randomNumbers = new int[total];
        Random random = new Random();
        for (int i = 0; i < total; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Random numbers: " + Arrays.toString(randomNumbers));
        return randomNumbers;
    }

    public static List<Integer> getRandomNumbersList(int total) {
        return IntStream.generate(
            () -> ThreadLocalRandom.current().nextInt(1, 100))
            .limit(total)
            .boxed()
            .toList();
    }
}
