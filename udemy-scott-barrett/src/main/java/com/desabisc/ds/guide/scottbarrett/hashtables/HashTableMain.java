package com.desabisc.ds.guide.scottbarrett.hashtables;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HashTableMain {
  public static void main(String[] args) {
    //constructorEg();
    //setEg();
    //getEg();
    keysEg();
  }

  static void constructorEg() {
    log.info("********** Constructor Eg **********");
    HashTable myHashTable = new HashTable();
    myHashTable.printTable();
  }

  static void setEg() {
    log.info("********** Set Eg **********");
    HashTable myHashTable = new HashTable();
    myHashTable.set("nails", 100);
    myHashTable.set("tile", 50);
    myHashTable.set("lumber", 80);

    myHashTable.set("bolts", 200);
    myHashTable.set("screws", 140);

    myHashTable.printTable();
  }

  static void getEg() {
    log.info("********** Get Eg **********");
    HashTable myHashTable = new HashTable();

    myHashTable.set("nails", 100);
    myHashTable.set("tile", 50);
    myHashTable.set("lumber", 80);

    log.info("{}", myHashTable.get("lumber"));
    log.info("{}", myHashTable.get("bolts"));
  }

  static void keysEg() {
    log.info("********** Keys Eg **********");
    HashTable myHashTable = new HashTable();
    myHashTable.set("paint", 20);
    myHashTable.set("bolts", 40);
    myHashTable.set("nails", 100);
    myHashTable.set("tile", 50);
    myHashTable.set("lumber", 80);

    log.info("{}", myHashTable.keys());
  }
}
