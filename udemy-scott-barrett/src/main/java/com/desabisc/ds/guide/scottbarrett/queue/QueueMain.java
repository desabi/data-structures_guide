package com.desabisc.ds.guide.scottbarrett.queue;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QueueMain {
  public static void main(String[] args) {
    //basicEg();
    //enqueueEg();
    dequeueEg();
  }

  static void basicEg() {
    log.info("########## Basic Eg ##########");
    Queue myQueue = new Queue(7);

    myQueue.getFirst();
    myQueue.getLast();
    myQueue.getLength();

    myQueue.printQueue();
  }

  static void enqueueEg() {
    log.info("########## Enqueue Eg ##########");
    Queue myQueue = new Queue(1);

    myQueue.enqueue(2);

    myQueue.printQueue();
  }

  static void dequeueEg() {
    log.info("########## Dequeue Eg ##########");

    Queue myQueue = new Queue(2);
    myQueue.enqueue(1);

    // (2) Items - Returns 2 Node
    log.info("{}", myQueue.dequeue().value);

    // (1) Items - Returns 1 Node
    log.info("{}", myQueue.dequeue().value);

    // (0) Items - Returns null
    log.info("{}", myQueue.dequeue());
  }
}
