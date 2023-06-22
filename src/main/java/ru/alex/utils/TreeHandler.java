package ru.alex.utils;

public class TreeHandler {

    private final StringBuilder treeValues = new StringBuilder();

    public  <T> String preorderTraversal(TreeNode<T> root) {
        if (root == null)
            return "";

        treeValues.append(root.getVal()).append(" ");

        preorderTraversal(root.getLeft());
        preorderTraversal(root.getRight());

        return treeValues.toString().trim();
    }
}
