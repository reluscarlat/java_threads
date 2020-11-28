package com.resc;

public class Node {
    public Node left;
    public Node right;
    int value;

    public Node(int value) {
        this.value = value;
    }

    public Node find(int targetValue) {
        return find(this, targetValue);
    }

    private Node find(Node node, int targetValue) {
        if(node == null) return null;
        System.out.println(node.value);
        if(node.value == targetValue) return node;
        if(node.value > targetValue) {
            return find(node.left, targetValue);
        } else {
            return find(node.right, targetValue);
        }
    }
}
