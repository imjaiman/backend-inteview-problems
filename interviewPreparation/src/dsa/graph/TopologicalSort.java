/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.graph;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;

/**
 * @author rahul.jaiman
 * @version $Id: TopologicalSort.java, v 0.1 2020-05-20 20:55 rahul.jaiman Exp $$
 */
public class TopologicalSort {

    static int V;
    static List<List<Integer>> adj;
    static Set<Integer> set;
    static Stack<Integer> stk;


    public TopologicalSort(int V) {
        TopologicalSort.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }

    /*
       for this we maintain one set and one stack.
       while traversing as dfs, we add all the traversal values in set.
       once we reach at the point where there is no further node,
       we push into the stack.
       Note : see tushar roy for more info.
     */
    private static void topologicalSortUtil(int i) {
        if(!set.add(i)){
            return;
        }
        List<Integer> children = adj.get(i);
        for (Integer c : children) {
            topologicalSortUtil(c);
        }
        stk.push(i);
    }

    // Driver code
    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(9);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);
        graph.addEdge(3, 7);
        graph.addEdge(7, 6);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(6, 8);

        topologicalSort(graph);
        for (ListIterator<Integer> iterator = stk.listIterator(); iterator.hasNext(); )
        {
            Integer each = iterator.next();
            System.out.print(each+" ");
        }
    }
    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    public  static void topologicalSort(TopologicalSort g) {

        set = new HashSet<>();
        stk = new Stack<>();
        for (int i = 1; i <V; i++) {
            topologicalSortUtil(i);
        }
    }
}