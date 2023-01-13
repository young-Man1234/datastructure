package me.stu.datastructure;

import me.stu.datastructure.node.Node;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    private static Node nd;

    @BeforeAll
    static void init(){
        nd = new Node();
        System.out.println("Node create");
    }

    @Test
    void test(){
        assertNotNull(nd);
        assertNull(nd.getNext());
    }
}