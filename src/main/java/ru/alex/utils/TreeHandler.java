package ru.alex.utils;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHandler {

    public static <T> String breadthFirstTraversal(TreeNode<T> root) {

        var treeValues = new StringBuilder();

        if (root == null)
            return treeValues.toString();

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.poll();
            treeValues.append(node.getVal()).append(" ");

            if (node.getChildrenList() != null) {
                for (TreeNode<T> child : node.getChildrenList()) {
                    queue.offer(child);
                }
            }
        }

        return treeValues.toString();
    }
}
