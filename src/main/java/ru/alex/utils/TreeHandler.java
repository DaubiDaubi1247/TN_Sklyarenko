package ru.alex.utils;

public class TreeHandler {

    private final StringBuilder treeValues = new StringBuilder();

    public  <T> String inorderTraversal(TreeNode<T> root) {
        if (root == null)
            return "";

        if (root.getLeft() != null) {
            inorderTraversal(root.getLeft());
        }

        treeValues.append(root.getVal()).append(" ");

        if (root.getRight() != null) {
            inorderTraversal(root.getRight());
        }

        return treeValues.toString().trim();
    }
}
