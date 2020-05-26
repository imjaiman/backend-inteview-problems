/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.graph;

/**
 * @author rahul.jaiman
 * @version $Id: GraphUtil.java, v 0.1 2020-05-11 00:32 rahul.jaiman Exp $$
 */
public class GraphUtil {
    static Graph graph;

    public static Graph provideMeCyclicGraph() {
        graph = new Graph(6);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        return graph;
    }


    //if an edge contains -1 as destination it means there is no path
    public static Graph provideMeNonCyclicGraph() {
        graph = new Graph(5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 0);
        return graph;

    }

    public static Graph provideDataForTopologicalSort() {
        graph = new Graph(8);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);
        graph.addEdge(3, 7);
        graph.addEdge(7, 6);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(6, 8);
        return graph;

    }
}