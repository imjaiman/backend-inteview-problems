/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package companies.sap.PopularCodingProblems;

import com.sun.tools.classfile.ConstantPool;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author rahul.jaiman
 * @version $Id: RateInMaze.java, v 0.1 2020-05-16 15:13 rahul.jaiman Exp $$
 */
public class RateInMaze {
    static int N;
    public static void main(String[] args) {

        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };


        N = maze.length;
        solveMaze(maze);

    }

    private static void solveMaze(int[][] maze) {
        int[][] sol = new int[N][N];

        if(!solveMazeUtil(maze,0,0,sol)){
            System.out.println("there is not solution for this");
            return;
        }
        printSolution(sol);

    }

    private static void printSolution(int[][] sol) {
        for(int i =0;i<N;i++){
            for (int j =0;j<N;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static boolean isSafe(int[][] maze, int i , int j){
        return  (i>=0 && i<N && j>=0 && j<N && maze[i][j]==1);
    }

    private static boolean solveMazeUtil(int[][] maze, int i, int j, int[][] sol) {

        if(i==N-1 && j==N-1 && maze[i][j]==1 ){
            sol[i][j]=1;
            return true;
        }
        if(isSafe(maze,i,j)){
            sol[i][j]=1;
            if(solveMazeUtil(maze,i+1,j,sol)){
                return true;
            }
            if(solveMazeUtil(maze,i,j+1,sol)){
                return true;
            }
            sol[i][j]=0;
            return false;

        }
        return false;
    }
}