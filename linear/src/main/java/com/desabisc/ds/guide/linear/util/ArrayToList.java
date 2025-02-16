package com.desabisc.ds.guide.linear.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

  public static void main(String[] args) {
    //conversionStrings();
    conversionsInt();
  }

  static void conversionStrings() {
    String[] arrayOfFruits = {"apple", "banana", "cherry"};

    // Arrays.asList() -> fixed size
    List<String> arraysAList = Arrays.asList(arrayOfFruits);
    System.out.println("arraysAList = " + arraysAList);

    // new ArrayList<>(Arrays.asList(array)) -> modifiable list
    List<String> newArrayList = new ArrayList<>(Arrays.asList(arrayOfFruits));
    newArrayList.add("orange");
    System.out.println("newArrayList = " + newArrayList);

    // Collections.addAll()
    List<String> listOfFruits = new ArrayList<>();
    Collections.addAll(listOfFruits, arrayOfFruits);
    System.out.println("listOfFruits = " + listOfFruits);

    // Streams
    List<String> listFruitsStreams = Arrays.stream(arrayOfFruits).toList();
    System.out.println("listFruitsStreams = " + listFruitsStreams);
  }

  static void conversionsInt() {
    int[] arrayOfNumbers = {59, 11, 8, 21, 64, 31, 53};
    // you need to convert the int[] array to an Integer[] array first.
    Integer[] boxedIntegersArray = Arrays.stream(arrayOfNumbers).boxed().toArray(Integer[]::new);

    // fixed size
    List<Integer> listOfIntegersA = Arrays.asList(boxedIntegersArray);
    System.out.println("listOfIntegersA = " + listOfIntegersA);

    // modifiable list
    List<Integer> listOfIntegersB = new ArrayList<>(Arrays.asList(boxedIntegersArray));
    System.out.println("listOfIntegersB = " + listOfIntegersB);

    // Collections.addAll()
    List<Integer> listOfIntegersC = new ArrayList<>();
    Collections.addAll(listOfIntegersC, boxedIntegersArray);
    System.out.println("listOfIntegersC = " + listOfIntegersC);

    // Streams: This is the most straightforward way to convert an int[] array to a List<Integer>.
    List<Integer> listOfIntegersD = Arrays.stream(arrayOfNumbers).boxed().toList();
    System.out.println("listOfIntegersD = " + listOfIntegersD);
  }

}
