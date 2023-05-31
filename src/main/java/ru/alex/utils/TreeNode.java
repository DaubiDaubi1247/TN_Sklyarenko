package ru.alex.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TreeNode <T> {
        private T val;
        private TreeNode<T> left;
        private TreeNode<T> right;

}
