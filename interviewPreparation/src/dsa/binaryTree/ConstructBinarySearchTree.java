/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.binaryTree;

/**
 * @author rahul.jaiman
 * @version $Id: ConstructBinarySearchTree.java, v 0.1 2020-05-24 16:30 rahul.jaiman Exp $$
 */
public class ConstructBinarySearchTree {



    public static void main(String[] args) {
        bstFromPreorder(new int[]{8,5,1,7,10,12});
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        if(null == preorder || preorder.length == 0) return null;
        return bstFromPreorderUtil(preorder, 0, preorder.length);
    }

    private static TreeNode bstFromPreorderUtil(int[] preorder, int l,  int h) {

        TreeNode root = new TreeNode(preorder[l]);
        int split = findIndex(preorder,l,h);
        if(split == -1){
            return root;
        }
        root.left = bstFromPreorderUtil(preorder,l+1,split-1);
        root.right = bstFromPreorderUtil(preorder,split,h);
        return root;
    }

    private static int findIndex(int[] arr, int l, int h) {
        if(h-l<=1) return -1;
        int root = arr[l];
        for(int j = l+1 ; j <= h; j++){
            if(arr[j]>root){
                return j;
            }
        }
        return -1;
    }
}