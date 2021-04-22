/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.dsa.binaryTree;

/**
 * @author rahul.jaiman
 * @version $Id: BinaryTreeNode.java, v 0.1 2020-05-06 12:05 rahul.jaiman Exp $$
 */
public class BinaryTreeNode {
    static TreeNode root;


    public static void sumTree(TreeNode root) {

        if(root == null){
            return ;
        }
        sumTreeUtil(root);

    }

    public static int sumTreeUtil(TreeNode root) {

        if(root == null){
            return 0;
        }
        int temp = root.data;

        root.data = sumTreeUtil(root.left) + sumTreeUtil(root.right);

        return temp+root.data;

    }

    public static void preOrder(TreeNode root){
        if(root== null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }

    public static void main(String args[]) {
        root = new TreeNode(10);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(-4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);
        sumTree(root);
        preOrder(root);

        char c = 'r';
        String s = "rahul";
            s = s+c;
    }
}