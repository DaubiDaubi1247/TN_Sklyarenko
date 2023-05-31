package ru.alex.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class TreeNode<T> {
    private final T val;
    private List<TreeNode<T>> childrenList = new ArrayList<>();

}
