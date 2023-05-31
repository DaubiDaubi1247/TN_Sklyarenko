package ru.alex.utils;

public class TreeHandler {

    private final StringBuilder treeValues = new StringBuilder();

    public  <T> String preorderTraversal(TreeNode<T> root) {
        if (root == null)
            return "";

        treeValues.append(root.getVal()).append(" ");
        root.getChildrenList().forEach(this::preorderTraversal);

        return treeValues.toString();
    }
}
