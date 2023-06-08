package ru.alex.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class TreeNode<T> {
    private TreeNode<T> left;
    private TreeNode<T> right;
    private final T value;

}
