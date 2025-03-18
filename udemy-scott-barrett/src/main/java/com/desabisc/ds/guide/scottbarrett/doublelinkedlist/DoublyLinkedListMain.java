package com.desabisc.ds.guide.scottbarrett.doublelinkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DoublyLinkedListMain {
  public static void main(String[] args) {
    //basicEg();
    //appendEg();
    //removeLastEg();
    //prependEg();
    //removeFirst();
    //getEg();
    //setEg();
    //insertEg();
    removeEg();
  }

  static void basicEg() {
    log.info("########## basic eg ##########");
    DoublyLinkedList myDll = new DoublyLinkedList(7);

    myDll.getHead();
    myDll.getTail();
    myDll.getLength();

    myDll.printList();
  }

  static void appendEg() {
    log.info("########## append eg ##########");
    DoublyLinkedList myDll = new DoublyLinkedList(1);
    myDll.append(2);
    myDll.printList();
  }

  static void removeLastEg() {
    log.info("########## remove last eg ##########");
    DoublyLinkedList myDll = new DoublyLinkedList(1);
    myDll.append(2);

    // (2) Items - Returns 2 Node
    log.info("{}", myDll.removeLast().value);

    // (1) Item - Returns 1 Node
    log.info("{}", myDll.removeLast().value);

    // (0) Items - Returns null
    log.info("{}", myDll.removeLast());
  }

  static void prependEg() {
    log.info("########## prepend eg ##########");
    DoublyLinkedList myDll = new DoublyLinkedList(2);
    myDll.append(3);
    myDll.prepend(1);
    myDll.printList();
  }

  static void removeFirst() {
    log.info("########## remove first eg ##########");
    DoublyLinkedList myDll = new DoublyLinkedList(2);
    myDll.append(1);

    // (2) Items - Returns 2 Node
    log.info("{}", myDll.removeFirst().value);

    // (1) Items - Returns 1 Node
    log.info("{}", myDll.removeFirst().value);

    // (0) Items - Returns null
    log.info("{}", myDll.removeFirst());

  }

  static void getEg() {
    log.info("########## get eg ##########");

    DoublyLinkedList myDll = new DoublyLinkedList(2);

    myDll.append(1);
    myDll.append(2);
    myDll.append(3);

    log.info("{}", myDll.get(1).value);
    log.info("{}", myDll.get(2).value + "\n");
    myDll.printList();
  }

  static void setEg() {
    log.info("########## set eg ##########");
    DoublyLinkedList myDll = new DoublyLinkedList(11);
    myDll.append(3);
    myDll.append(23);
    myDll.append(7);

    myDll.set(1, 4);

    myDll.printList();
  }

  static void insertEg() {
    log.info("########## insert eg ##########");

    DoublyLinkedList myDll = new DoublyLinkedList(1);
    myDll.append(3);

    myDll.insert(1, 2);

    myDll.printList();
  }

  static void removeEg() {
    log.info("########## remove eg ##########");
    DoublyLinkedList myDll = new DoublyLinkedList(0);
    myDll.append(1);
    myDll.append(2);

    myDll.remove(1);

    myDll.printList();
  }
}
