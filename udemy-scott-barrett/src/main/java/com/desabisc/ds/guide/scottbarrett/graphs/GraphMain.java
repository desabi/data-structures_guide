package com.desabisc.ds.guide.scottbarrett.graphs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GraphMain {
  public static void main(String[] args) {
    //addVertexEg();
    //addEdgeEg();
    //removeEdgeEg();
    removeVertex();
  }

  static void addVertexEg() {
    log.info("***** Add Vertex Eg *****");
    Graph myGraph = new Graph();
    myGraph.addVertex("A");
    myGraph.printGraph();
  }

  static void addEdgeEg() {
    log.info("***** Add Edge Eg *****");
    Graph myGraph = new Graph();

    myGraph.addVertex("A");
    myGraph.addVertex("B");

    myGraph.addEdge("A", "B");

    myGraph.printGraph();
  }

  static void removeEdgeEg() {
    log.info("***** Remove Edge Eg *****");
    Graph myGraph = new Graph();

    myGraph.addVertex("A");
    myGraph.addVertex("B");
    myGraph.addVertex("C");

    myGraph.addEdge("A", "B");
    myGraph.addEdge("A", "C");
    myGraph.addEdge("B", "C");

    myGraph.removeEdge("A", "B");

    myGraph.printGraph();
  }

  static void removeVertex() {
    log.info("***** Remove Vertex Eg *****");
    Graph myGraph = new Graph();

    myGraph.addVertex("A");
    myGraph.addVertex("B");
    myGraph.addVertex("C");
    myGraph.addVertex("D");

    myGraph.addEdge("A", "B");
    myGraph.addEdge("A", "C");
    myGraph.addEdge("A", "D");
    myGraph.addEdge("B", "D");
    myGraph.addEdge("C", "D");

    myGraph.removeVertex("D");

    myGraph.printGraph();
  }
}
