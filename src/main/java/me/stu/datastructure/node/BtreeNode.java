package me.stu.datastructure.node;

public class BtreeNode {
    private int data;

    private BtreeNode left;

    private BtreeNode right;

    public BtreeNode(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public BtreeNode getLeft() {
        return left;
    }

    public void setLeft(BtreeNode left) {
        this.left = left;
    }

    public BtreeNode getRight() {
        return right;
    }

    public void setRight(BtreeNode right) {
        this.right = right;
    }
}
