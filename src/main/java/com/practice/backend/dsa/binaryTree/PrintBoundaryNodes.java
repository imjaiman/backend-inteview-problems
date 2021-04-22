/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.dsa.binaryTree;



/*
            1
          2    3
        4  5 6   7



 */
public class PrintBoundaryNodes {
    static TreeNode root ;

    public static void printBoundaryNodes(TreeNode root){
        if(root == null) return;
        System.out.println(root.data);
        printLeftView(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRightView(root.right);

    }

    private static void printLeftView(TreeNode left) {
        if(left == null ) return;

        if(left.left !=null){
            System.out.println(left.data);
            printLeftView(left.left);
        }

        else if(left.right!= null){
            System.out.println(left.data);
            printLeftView(left.left);
        }


    }

    private static void printLeaves(TreeNode child) {
        if(child == null ) return ;
        printLeaves(child.left);

        if(child.left == null && child.right == null)
            System.out.println(child.data);

        printLeaves(child.right);


    }

    private static void printRightView(TreeNode right) {
        if(right == null) return;

        if(right.right!=null){
            System.out.println(right.data);
            printLeftView(right.right);
        }

        else if(right.left== null){
            System.out.println(right.data);
            printLeftView(right.right);
        }
    }



    public static void main(String[] args) {
        root = BinaryTreeUtil.giveMeBinaryTree();
        printBoundaryNodes(root);
    }
}