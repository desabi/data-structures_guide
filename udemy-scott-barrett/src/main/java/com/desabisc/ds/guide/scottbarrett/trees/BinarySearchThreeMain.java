package com.desabisc.ds.guide.scottbarrett.trees;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearchThreeMain {
  public static void main(String[] args) {
    //constructorEg();
    //insertEg();
    containsEg();
  }

  static void constructorEg() {
    log.info("##### Constructor Eg #####");
    BinarySearchThree myBst = new BinarySearchThree();

    log.info("Root = {}", myBst.root);
  }

  static void insertEg() {
    log.info("##### Insert Eg #####");
    BinarySearchThree myBst = new BinarySearchThree();

    myBst.insert(47);
    myBst.insert(21);
    myBst.insert(76);
    myBst.insert(18);
    myBst.insert(52);
    myBst.insert(82);

    myBst.insert(27);

    log.info("{}", myBst.root.left.right.value);
  }

  static void containsEg() {
    log.info("##### Contains Eg #####");
    BinarySearchThree myBst = new BinarySearchThree();

    myBst.insert(47);
    myBst.insert(21);
    myBst.insert(76);
    myBst.insert(18);
    myBst.insert(27);
    myBst.insert(52);
    myBst.insert(82);

    log.info("{}", myBst.contains(27));
    log.info("{}", myBst.contains(17));
  }
}
