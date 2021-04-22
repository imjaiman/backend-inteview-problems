/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahul.jaiman
 * @version $Id: LargestNode.java, v 0.1 2020-05-23 18:30 rahul.jaiman Exp $$
 */
public class LargestNode {
    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtil.giveMeBinaryTree();
        int[][] a = {{14, 16}};
        int[][] b = {{7, 13}, {16, 20}};
        largestValues(a, b);


    }

    public static int[][] largestValues(int[][] a, int[][] b) {

        int i = 0, j = 0;
        List<int[]> list = new ArrayList<>();
        while (i < a.length && j < b.length) {
            //checking the intersection with X and Y.
            int X = Math.max(a[i][0], b[j][0]);
            int Y = Math.min(a[i][1], b[j][1]);
            if (X <= Y) {
                list.add(new int[]{X, Y});
            }
            if (a[i][1] > b[j][1]) {
                j++;
            } else {
                i++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}