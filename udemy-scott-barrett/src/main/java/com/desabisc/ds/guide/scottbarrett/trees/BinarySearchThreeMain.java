package com.desabisc.ds.guide.scottbarrett.trees;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearchThreeMain {
  public static void main(String[] args) {
    //constructorEg();
    //insertEg();
    //containsEg();
    //containsRecursiveEg();
    //insertRecursiveEg();
    //minValueEg();
    deleteNodeEg();
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

  static void containsRecursiveEg() {
    log.info("##### Contains Recursive Eg #####");
    BinarySearchThree myBst = new BinarySearchThree();

    myBst.insert(47);
    myBst.insert(21);
    myBst.insert(76);
    myBst.insert(18);
    myBst.insert(27);
    myBst.insert(52);
    myBst.insert(82);

    log.info("BST Contains 27: {}", myBst.rContains(27));
    log.info("BST Contains 17: {}", myBst.rContains(17));
  }

  static void insertRecursiveEg() {
    log.info("##### Insert Recursive Eg #####");
    BinarySearchThree myBst = new BinarySearchThree();

    myBst.rInsert(2);
    myBst.rInsert(1);
    myBst.rInsert(3);

    log.info("Root: {}", myBst.root.value);
    log.info("Root->Left: {}", myBst.root.left.value);
    log.info("Root->Right: {}", myBst.root.right.value);
  }

  static void minValueEg() {
    log.info("##### Min Value Eg #####");
    BinarySearchThree myBst = new BinarySearchThree();

    myBst.insert(47);
    myBst.insert(21);
    myBst.insert(76);
    myBst.insert(18);
    myBst.insert(27);
    myBst.insert(52);
    myBst.insert(82);

    log.info("Root, min value: {}", myBst.minValue(myBst.root));
    log.info("Right Node, min value: {}", myBst.minValue(myBst.root.right));
  }

  static void deleteNodeEg() {
    log.info("##### Delete Node Eg #####");
    BinarySearchThree myBst = new BinarySearchThree();

    myBst.rInsert(2);
    myBst.rInsert(1);
    myBst.rInsert(3);

    log.info("Root: {}", myBst.root.value);
    log.info("Root->Left: {}", myBst.root.left.value);
    log.info("Root->Right: {}", myBst.root.right.value);

    myBst.deleteNode(2);

    log.info("Root: {}", myBst.root.value);
    log.info("Root->Left: {}", myBst.root.left.value);
    log.info("Root->Right: {}", myBst.root.right);

  }
}
