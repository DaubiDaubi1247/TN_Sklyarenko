package ru.alex.utils;

public class TreeHandler {

    public static <T> void preorderTraversal(TreeNode<T> root) {
        if (root == null)
            return;

        System.out.print(root.getVal() + " ");
        preorderTraversal(root.getLeft());
        preorderTraversal(root.getRight());
    }
}
