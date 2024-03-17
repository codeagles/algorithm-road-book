package com.codeagles.tree;

import com.codeagles.model.Node;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 *
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
 */
public class LC429 {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Pair<Node, Integer>> q = new LinkedList<Pair<Node, Integer>>();
        List<List<Integer>> seq = new ArrayList<List<Integer>>();
        if(root == null) return seq;
        q.add(new Pair<Node, Integer>(root, 0));
        while(!q.isEmpty()) {
            Node node = q.peek().getKey();
            Integer depth = q.poll().getValue();
            if(depth >= seq.size()) seq.add(new ArrayList<Integer>());
            seq.get(depth).add(node.val);
            for(Node child : node.children) {
                q.add(new Pair<Node, Integer>(child, depth+1));
            }

        }
        return seq;
    }

}

