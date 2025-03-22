package com.desabisc.ds.guide.scottbarrett.stack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StackMain {

  public static void main(String[] args) {
    //basicEg();
    //pushEg();
    popEg();
  }

  static void basicEg() {
    log.info("########## Basic Eg ##########");
    Stack myStack = new Stack(4);

    myStack.getTop();
    myStack.getHeight();

    myStack.printStack();
  }

  static void pushEg() {
    log.info("########## Push Eg ##########");
    Stack myStack = new Stack(2);
    myStack.push(1);
    myStack.printStack();
  }

  static void popEg() {
    log.info("########## Pop Eg ##########");
    Stack myStack = new Stack(7);
    myStack.push(23);
    myStack.push(3);
    myStack.push(11);

    myStack.pop();

    myStack.printStack();
  }
}
