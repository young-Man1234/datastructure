package me.stu.datastructure.binarysearchtree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private BinarySearchTree bst;

    @BeforeEach
    void init(){
        bst = new BinarySearchTree();



    }

    @Test
    void insertTest(){
        bst.insertNodeData(4);
        bst.insertNodeData(2);
        bst.insertNodeData(5);

        bst.getNodeData();

    }

}