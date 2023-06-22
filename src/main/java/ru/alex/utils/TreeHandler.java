package ru.alex.utils;

public class TreeHandler {

    private final StringBuilder treeValues = new StringBuilder();

    public  <T> String postorderTraversal(TreeNode<T> root) {
        if (root == null)
            return "";

        if (root.getLeft() != null) {
            postorderTraversal(root.getLeft());
        }

        if (root.getRight() != null) {
            postorderTraversal(root.getRight());
        }

        treeValues.append(root.getVal()).append(" ");

        return treeValues.toString().trim();
    }
}
