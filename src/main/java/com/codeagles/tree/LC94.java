package com.codeagles.tree;

import com.codeagles.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 */
public class LC94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> seq = new ArrayList<Integer>();
        dfs(root, seq);
        return seq;
    }

    private void dfs(TreeNode root, List<Integer> seq) {
        if(root == null) {
            return;
        }
        dfs(root.left, seq);
        seq.add(root.val);
        dfs(root.right, seq);
    }
}
