package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.alex.utils.TreeHandler;
import ru.alex.utils.TreeNode;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class TreeTraversalTest {

    public static final String EXPECTED_TEST_1 = "1 2 3 4 5 ";
    public static final String EXPECTED_TEST_2 = "";
    private static TreeNode<Integer> root;

    @BeforeAll
    public static void initTree() {
        var node4 = new TreeNode<>(4);

        var node5 = new TreeNode<>(5);

        var node2 = new TreeNode<>(2);
        node2.setChildrenList(Arrays.asList(node4, node5));

        TreeNode<Integer> node3 = new TreeNode<>(3);

        root = new TreeNode<>(1);
        root.setChildrenList(Arrays.asList(node2, node3));
    }

    @Test
    void preorderTraversal_CorrectTree_CorrectResult() {

        String result = TreeHandler.breadthFirstTraversal(root);

        Assertions.assertEquals(EXPECTED_TEST_1, result);
    }

    @Test
    void PreorderTraversal_EmptyTree() {

        String result = TreeHandler.breadthFirstTraversal(null);

        Assertions.assertEquals(EXPECTED_TEST_2, result);
    }
}
