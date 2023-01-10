package me.stu.datastructure.btree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ExpressionTreeTest {
    private static ExpressionTree tree;

    @BeforeAll
    static void init(){
        tree = new ExpressionTree();
    }

    @Test
    void convToExp(){
        String[] exp = "( 1 + 2 * 4 ) - 1".split(" ");
        String[] strings = tree.convToRPNExp(exp);
        System.out.println(Arrays.toString(strings));

    }

}