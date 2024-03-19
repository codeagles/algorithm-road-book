package com.codeagles.tree;

import com.codeagles.model.TreeNode;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
* 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 */
public class LC102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<Pair<TreeNode, Integer>>();
        List<List<Integer>> seq = new ArrayList<List<Integer>>();
        if(root == null) {
            return seq;
        }
        q.add(new Pair<TreeNode, Integer>(root, 0));
        while(!q.isEmpty()) {
            TreeNode node =  q.peek().getKey();
            Integer depth = q.poll().getValue();
            if(seq.size() <= depth) {
                seq.add(new ArrayList());
            }
            seq.get(depth).add(node.val);
            if(node.left != null) q.add(new Pair<TreeNode, Integer>(node.left, depth+1));
            if(node.right != null) q.add(new Pair<TreeNode, Integer>(node.right, depth+1));
        }
        return seq;
    }
}
