package me.stu.datastructure.avlrebalance;

import me.stu.datastructure.binarysearchtree.BinarySearchTree;
import me.stu.datastructure.node.BtreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLRebalanceTest {


    @Test
    void test(){
        AVLRebalance a = new AVLRebalance();
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNodeData(4);
        bst.insertNodeData(2);
        bst.insertNodeData(3);
        bst.insertNodeData(6);
        bst.insertNodeData(5);
        bst.insertNodeData(7);
        bst.insertNodeData(8);
        bst.insertNodeData(9);

        int heightDiff = a.getHeightDiff(bst.getRoot());

        assertEquals(-2, heightDiff);
    }
    @Test
    void test2(){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertRebalanceNode(bst.getRoot(), 1);
        bst.insertRebalanceNode(bst.getRoot(), 2);
        bst.insertRebalanceNode(bst.getRoot(), 3);
        bst.insertRebalanceNode(bst.getRoot(), 4);

        bst.getNodeData();

    }
}