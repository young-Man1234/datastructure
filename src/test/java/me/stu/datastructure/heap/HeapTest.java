package me.stu.datastructure.heap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    private static Heap h;

    @BeforeAll
    static void inti(){
        h = new Heap(10);
    }

    @Test
    void createHeapTest(){
        h.addData("나");
        h.addData("다");
        h.addData("마");
        h.addData("가");
        h.addData("라");
        h.addData("바");

        HeapElem heapElem = h.removeData();

        assertEquals("가", heapElem.getData());

        HeapElem heapElem2 = h.removeData();

        assertEquals("나", heapElem2.getData());

        HeapElem heapElem3 = h.removeData();

        assertEquals("다", heapElem3.getData());

    }


    @AfterAll
    static void destroy(){
        h = null;
    }

}