package com.codeagles.tree;

import com.codeagles.model.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个 n 叉树的根节点  root ，返回 其节点值的 前序遍历 。
 *
 * n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 */
public class LC589 {

    //方法一，递归
    List<Integer> seq = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        dfs(root);
        return seq;
    }
    void dfs(Node root) {
        if(root == null) return;
        seq.add(root.val);
        for(Node child : root.children) {
            dfs(child);
        }

    }

    //方法二，迭代
    public List<Integer> preorder2(Node root) {
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            seq.add(node.val);
            for(int i = node.children.size()-1; i >= 0 ; i--) {
                stack.push(node.children.get(i));

            }
        }
        return seq;

    }

}

