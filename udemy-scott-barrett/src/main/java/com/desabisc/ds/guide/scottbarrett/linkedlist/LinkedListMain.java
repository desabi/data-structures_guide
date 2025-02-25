package com.desabisc.ds.guide.scottbarrett.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedListMain {
  public static void main(String[] args) {
    appendEg();
    removeLastEg();
    prependEg();
    removeFirstEg();
    getEg();
    setEf();
    insertEg();
    removeEg();
    reverseEg();
  }

  static void appendEg() {
    log.info("********** append example **********");
    LinkedList myLinkedList = new LinkedList(1);
    myLinkedList.append(2);
    myLinkedList.printList();
  }

  static void removeLastEg() {
    log.info("********** remove last example **********");
    LinkedList myLinkedList = new LinkedList(1);
    myLinkedList.append(2);

    // (2) Items - Returns 2 Node
    log.info("{}", myLinkedList.removeLast().value);
    // (1) Items - Returns 1 Node
    log.info("{}", myLinkedList.removeLast().value);
    // (0) Items - Returns null
    log.info("{}", myLinkedList.removeLast());
  }

  static void prependEg() {
    log.info("********** prepend example **********");
    LinkedList myLinkedList = new LinkedList(2);
    myLinkedList.append(3);

    myLinkedList.prepend(1);

    myLinkedList.printList();
  }

  static void removeFirstEg() {
    log.info("********** remove first example **********");
    LinkedList myLinkedList = new LinkedList(2);
    myLinkedList.append(1);

    // (2) Items - Returns 2 Node
    log.info("{}", myLinkedList.removeFirst().value);
    // (1) Items - Returns 1 Node
    log.info("{}", myLinkedList.removeFirst().value);
    // (0) Items - Returns null
    log.info("{}", myLinkedList.removeFirst());
  }

  static void getEg() {
    log.info("********** get example **********");
    LinkedList myLinkedList = new LinkedList(0);
    myLinkedList.append(1);
    myLinkedList.append(2);
    myLinkedList.append(3);

    log.info("{}\n", myLinkedList.get(2).value);

    myLinkedList.printList();
  }

  static void setEf() {
    log.info("********** set example **********");
    LinkedList myLinkedList = new LinkedList(11);
    myLinkedList.append(3);
    myLinkedList.append(23);
    myLinkedList.append(7);

    myLinkedList.set(1, 4);

    myLinkedList.printList();
  }

  static void insertEg() {
    log.info("********** insert example **********");
    LinkedList myLinkedList = new LinkedList(0);
    myLinkedList.append(2);

    myLinkedList.insert(1, 1);

    myLinkedList.printList();
  }

  static void removeEg() {
    log.info("********** remove example **********");
    LinkedList myLinkedList = new LinkedList(11);
    myLinkedList.append(3);
    myLinkedList.append(23);
    myLinkedList.append(7);

    myLinkedList.remove(2);

    myLinkedList.printList();
  }

  static void reverseEg() {
    log.info("********** reverse example **********");
    LinkedList myLinkedList = new LinkedList(1);
    myLinkedList.append(2);
    myLinkedList.append(3);
    myLinkedList.append(4);

    myLinkedList.reverse();

    myLinkedList.printList();
  }
}
