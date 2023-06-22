package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.alex.utils.TreeHandler;
import ru.alex.utils.TreeNode;

/**
 * Unit test for simple App.
 */
public class TreeTraversalTest {

    public static final String EXPECTED_TEST_1 = "4 2 5 1 3";
    public static final String EXPECTED_TEST_2 = "";
    private static TreeNode<Integer> root;

    private static TreeHandler treeHandler;

    @BeforeEach
    public void initTreeHandler() {
        treeHandler = new TreeHandler();
    }

    @BeforeAll
    public static void initTree() {
        root = new TreeNode<>(1);
        root.setLeft(new TreeNode<>(2));
        root.setRight(new TreeNode<>(3));
        root.getLeft().setLeft(new TreeNode<>(4));
        root.getLeft().setRight(new TreeNode<>(5));
    }

    @Test
    void inorderTraversal_CorrectTree_CorrectResult() {

        String result = treeHandler.inorderTraversal(root);

        Assertions.assertEquals(EXPECTED_TEST_1, result);
    }

    @Test
    void inorderTraversal_EmptyTree() {

        String result = treeHandler.inorderTraversal(null);

        Assertions.assertEquals(EXPECTED_TEST_2, result);
    }
}
