/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author rahul.jaiman
 * @version $Id: GraphTraversal.java, v 0.1 2020-05-11 10:06 rahul.jaiman Exp $$
 */
public class GraphTraversalBFS_DFS {


    //BFS traversal for graph
    public static void BFS(Graph g, int start) {

        if (g == null) return;
        boolean[] visited = new boolean[g.vertex];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(2);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int temp = queue.removeFirst();
            System.out.print(temp);
            Iterator it = g.adjList[temp].iterator();
            while (it.hasNext()) {
                int n = (int) it.next();
                if (!visited[n]) {
                    queue.addLast(n);
                    visited[n] = true;
                }
            }
        }
    }

    //DFS traversal for graph

    public static void DFS(Graph g, int start){
        if(g==null)  return;
        boolean[] visited = new boolean[g.vertex];
        Stack<Integer> stk = new Stack<>();
        stk.push(start);
        visited[start] = true;
        while(!stk.isEmpty()){

            int temp = stk.pop();
            System.out.print(temp);
            Iterator it = g.adjList[temp].iterator();
            while (it.hasNext()){
                int n = (int) it.next();
                if (!visited[n]){
                    visited[n] = true;
                    stk.push(n);
                }

            }

        }

    }

    public static void main(String args[]) {
        Graph g = GraphUtil.provideMeCyclicGraph();
        BFS(g, 2);
        DFS(g, 2);


    }
}