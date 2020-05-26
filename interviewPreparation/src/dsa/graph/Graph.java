/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.graph;

import java.util.LinkedList;

/**
 * @author rahul.jaiman
 * @version $Id: Graph.java, v 0.1 2020-05-11 00:32 rahul.jaiman Exp $$
 */
public class Graph {
    int vertex;
    LinkedList<Integer> adjList[] = null;

    public Graph(int vertex) {
        this.vertex = vertex;
        adjList = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int des) {

        adjList[src].add(des);

    }

}