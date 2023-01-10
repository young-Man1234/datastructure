package me.stu.datastructure.btree;

import me.stu.datastructure.BtreeNode;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class BtreeTest {
    private static Btree tree;
    private static BtreeNode main;

    @BeforeAll
    static void init(){
        tree = new Btree();
        main = new BtreeNode(1);
    }

    @Test
    @DisplayName("단순 트리 생성 테스트")
    void btreeTest1(){
        BtreeNode nd2 = new BtreeNode(2);
        BtreeNode nd3 = new BtreeNode(3);
        BtreeNode nd4 = new BtreeNode(4);
        BtreeNode nd5 = new BtreeNode(5);

        tree.makeLeftSubTree(main, nd2);
        tree.makeRightSubTree(main, nd3);
        tree.makeLeftSubTree(nd2, nd4);


        assertEquals(2, main.getLeft().getData());
        assertEquals(3, main.getRight().getData());
        assertNotNull(nd2.getLeft());
        assertNull(nd2.getRight());

    }

    @Test
    @DisplayName("트리 순회 테스트")
    void inorderTraverseTest2(){
        System.out.println("=== 중위 순회 ===");
        tree.inorderTraverse(main);
        System.out.println("===============");
        
        System.out.println("=== 전위 순회 ===");
        tree.preOrderTraverse(main);
        System.out.println("===============");
        
        System.out.println("=== 후위 순회 ===");
        tree.postOrderTraverse(main);
        System.out.println("===============");

    }


    @AfterAll
    static void destroy(){
        tree = null;
    }

}