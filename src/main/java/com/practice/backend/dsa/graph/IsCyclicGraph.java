/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.dsa.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author rahul.jaiman
 * for this we perform DFS, we maintain a stack, if we encounters a element that is already present
 * and in the stack then that is a cyclic graph otherwise not
 */
class IsCyclicGraph {

    static  int V;
    static  List<List<Integer>> adj;

    public  IsCyclicGraph(int V)
    {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }

    static Set<Integer> set  = new HashSet<>();


    /*
        in this approach, i will do DFS.
        I will traverse node one by one and putting in the set and visited boolean array.
        while traversing i got to know if the node is already present in the set, it means there is a cycle.
        else no cycle is present.
        while back tracking we will remove the nodes form the set.
        we are removing from the set because we have to do another dfs for the same staring node.
     */
    private static boolean isCyclicUtil(int i, boolean[] visited)
    {
        visited[i] = true;
        if(!set.add(i)) {
            return true;
        }
        if (visited[i])
            return false;
        List<Integer> children = adj.get(i);

        for (Integer c: children){
            if (isCyclicUtil(c,visited))
                return true;
            else{
                set.remove(c);
                visited[c] = false;
            }
        }
        return false;
    }

    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    private boolean isCyclic()
    {

        boolean visited[] = new boolean[4];
        for (int i = 0; i < V; i++) {
            set = new HashSet<>();
            if (isCyclicUtil(i,visited))
                return true;


        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        IsCyclicGraph graph = new IsCyclicGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);



        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                    + "contain cycle");
    }
}