package ru.alex.utils;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHandler {

    public static <T> String breadthFirstTraversal(TreeNode<T> root) {

        if (root == null) {
            return "";
        }

        var treeValues = new StringBuilder();

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();
            treeValues.append(current.getValue()).append(" ");

            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }

        return treeValues.toString();
    }
}
