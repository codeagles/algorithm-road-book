package com.codeagles.tree;

import com.codeagles.model.TreeNode;

/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class LC226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        TreeNode temp =  root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;

    }
}
