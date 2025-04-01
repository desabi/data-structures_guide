package com.desabisc.ds.guide.scottbarrett.heap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeapMain {
  public static void main(String[] args) {
    //insertEg();
    removeEg();
  }

  static void insertEg() {
    log.info("***** Insert Eg *****");
    Heap myHeap = new Heap();
    myHeap.insert(99);
    myHeap.insert(72);
    myHeap.insert(61);
    myHeap.insert(58);

    log.info("{}", myHeap.getHeap());

    myHeap.insert(100);
    log.info("{}", myHeap.getHeap());

    myHeap.insert(75);
    log.info("{}", myHeap.getHeap());
  }

  static void removeEg() {
    log.info("***** Remove Eg *****");
    Heap myHeap = new Heap();
    myHeap.insert(95);
    myHeap.insert(75);
    myHeap.insert(80);
    myHeap.insert(55);
    myHeap.insert(60);
    myHeap.insert(50);
    myHeap.insert(65);

    log.info("{}", myHeap.getHeap());

    myHeap.remove();
    log.info("{}", myHeap.getHeap());

    myHeap.remove();
    log.info("{}", myHeap.getHeap());
  }
}
