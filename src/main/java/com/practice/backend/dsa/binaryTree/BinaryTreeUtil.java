/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.dsa.binaryTree;

/**
 * @author rahul.jaiman
 * @version $Id: BinaryTreeUtil.java, v 0.1 2020-05-15 19:01 rahul.jaiman Exp $$
 */
public class BinaryTreeUtil {

    static TreeNode root;

    public static TreeNode giveMeBinaryTree() {
        root = new TreeNode(10);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(-4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);
        return root;
    }
}