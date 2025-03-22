package com.desabisc.ds.guide.scottbarrett.stack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stack {
  private Node top;
  private int height;

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public Stack(int value) {
    Node newNode = new Node(value);
    top = newNode;
    height = 1;
  }

  public void printStack() {
    Node temp  = top;
    while (temp != null) {
      log.info("{}", temp.value);
      temp = temp.next;
    }
  }

  public void getTop() {
    log.info("Top: {}", top.value);
  }

  public void getHeight() {
    log.info("Height: {}", height);
  }

  public void push(int value) {
    Node newNode = new Node(value);

    if (height == 0) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    height++;
  }

  public Node pop() {
    if (height == 0) {
      return null;
    }

    Node temp = top;
    top = top.next;
    temp.next = null;

    height--;
    return temp;
  }
}
