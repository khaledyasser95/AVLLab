package com.company;

/**
 * Created by Amr on 4/23/2017.
 */
//generic class to take any type data
public class AvlNode<type> {
    AvlNode<type> left, right;
    type data;
    int height;

    public AvlNode(type data) {
        this.data = data;
        left = right = null;
        height = 0;
    }

    public int getHeight() {
        return height;
    }
}
