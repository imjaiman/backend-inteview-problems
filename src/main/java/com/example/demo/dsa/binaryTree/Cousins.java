/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.dsa.binaryTree;

/**
 * @author rahul.jaiman
 * @version $Id: Cousins.java, v 0.1 2020-05-09 11:47 rahul.jaiman Exp $$
 */
class CousinNode{
    TreeNode parent;
    int level;
    public CousinNode(TreeNode parent, int level){
        this.parent = parent;
        this.level = level;
    }

}
public class Cousins {

    static TreeNode root ;

    public static boolean areCousins(TreeNode root, int x, int y){
        CousinNode cousin1= areCousinsUtil(root,null,x,0);
        CousinNode cousin2= areCousinsUtil(root,null,y,0);

        return cousin1.parent.data!=cousin2.parent.data && cousin1.level == cousin2.level;
    }

    public static CousinNode areCousinsUtil(TreeNode root, TreeNode parent, int x, int level){

        if(root == null) return null;
        if(root.data == x)
            return  new CousinNode(parent,level);
        CousinNode left = areCousinsUtil(root.left,parent,x,level+1);
        CousinNode right = areCousinsUtil(root.right, parent,x,level+1);

        return left==null?right:left;

    }


    public static void main(String args[]){
        root = new TreeNode(10);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(-4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);
    }
}