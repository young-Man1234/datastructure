package me.stu.datastructure.queue.sort;

import me.stu.datastructure.heap.Heap;
import me.stu.datastructure.sort.HeapSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void heapSortTest(){
        String[] testData = new String[6];

        testData[0] = "c";
        testData[1] = "d";
        testData[2] = "f";
        testData[3] = "a";
        testData[4] = "b";
        testData[5] = "z";

        HeapSort hs = new HeapSort(new Heap(testData.length));

        String[] res = hs.heapSort(testData);

        assertEquals("a", res[0]);
        assertEquals("b", res[1]);
        assertEquals("c", res[2]);
        assertEquals("d", res[3]);
        assertEquals("f", res[4]);
        assertEquals("z", res[5]);

    }

}