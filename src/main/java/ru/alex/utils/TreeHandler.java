package ru.alex.utils;

public class TreeHandler {

    private static final StringBuilder treeValues = new StringBuilder();

    public static <T> String preorderTraversal(TreeNode<T> root) {
        if (root == null)
            return "";

        treeValues.append(root.getVal()).append(" ");
        root.getChildrenList().forEach(TreeHandler::preorderTraversal);

        return treeValues.toString();
    }
}
